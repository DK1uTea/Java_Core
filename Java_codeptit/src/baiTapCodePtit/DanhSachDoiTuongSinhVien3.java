package baiTapCodePtit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class DanhSachDoiTuongSinhVien3 {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        ArrayList<J05005> dssv = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- >0) {
            dssv.add(new J05005(sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(dssv);
        for (J05005 sv : dssv) {
            System.out.println(sv);
        }
    }
}
class J05005 implements Comparable<J05005>{
    private static int maSinhVienCounter = 1;
    private String maSinhVien;
    private String hoTen;
    private String lop;
    private Date ngaySinh;
    private float diemGPA;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public J05005(String hoTen, String lop, String ngaySinh, float diemGPA) throws ParseException{
        this.maSinhVien = String.format("B20DCCN%03d", maSinhVienCounter++);
        this.hoTen = chuanHoaHoTen(hoTen);
        this.lop = lop;
        this.ngaySinh = sdf.parse(ngaySinh);
        this.diemGPA = diemGPA;
    }

    public static int getMaSinhVienCounter() {
        return maSinhVienCounter;
    }

    public static void setMaSinhVienCounter(int maSinhVienCounter) {
        J05005.maSinhVienCounter = maSinhVienCounter;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemGPA() {
        return diemGPA;
    }

    public void setDiemGPA(float diemGPA) {
        this.diemGPA = diemGPA;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    @Override
    public String toString() {
        return maSinhVien + " " + hoTen + " " + lop + " " + sdf.format(ngaySinh) + " " + String.format("%.2f", diemGPA);
    }

    public String chuanHoaHoTen (String s){
        s = s.trim().toLowerCase();
        String[] words = s.split("\\s+");
        String stringFinal = "";
        for(int i = 0; i < words.length; i++){
            if(i != words.length-1){
                stringFinal += String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1) + " ";
            }
            else{
                stringFinal += String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
            }
        }
        return stringFinal;
    }

    @Override
    public int compareTo(J05005 o) {
        if(o.diemGPA > this.diemGPA){
            return 1;
        }
        else if(this.diemGPA > o.diemGPA){
            return -1;
        }
        else{
            return 0;
        }
    }
    
    
}
// 2
// ngUYen Van NaM
// D20DCCN01-B
// 2/12/1994
// 2.17
// Nguyen QuanG hAi
// D20DCCN02-B
// 1/9/1994
// 3.0