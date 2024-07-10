package baiTapCodePtit;

import java.util.Scanner;

public class KhaiBaoLopSinhVien {
    private String maSinhVien;
    private String hoVaTen;
    private String lop;
    private String ngaySinh;
    private float diemGPA;
    public KhaiBaoLopSinhVien() {
        maSinhVien = "B20DCCN001";
        this.hoVaTen = "";
        this.lop = "";
        this.ngaySinh = "";
        this.diemGPA = 0;
    }
    public String getMaSinhVien() {
        return maSinhVien;
    }
    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }
    public String getHoVaTen() {
        return hoVaTen;
    }
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public String getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public float getDiemGPA() {
        return diemGPA;
    }
    public void setDiemGPA(float diemGPA) {
        this.diemGPA = diemGPA;
    }

    public String chuanHoaNgaySinh(){
        String[] a = this.ngaySinh.split("/");
        if(Integer.parseInt(a[0]) <10){
            a[0] = "0" + a[0];
        }
        if(Integer.parseInt(a[1]) <10){
            a[1] = "0" + a[1];
        }
        String ans = "";
        for(int i = 0; i<a.length; i++){
            if(i!= a.length-1){
                ans+= a[i] + "/";
            }
            else{
                ans+= a[i];
            }
        }
        return ans;
    }

    @Override
    public String toString() {
        String formattedPoint = String.format("%.2f", this.diemGPA); // Làm tròn đến 2 chữ số sau dấu phẩy
        return String.format("%s %s %s %s %s", maSinhVien, hoVaTen, lop, chuanHoaNgaySinh(), formattedPoint);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhaiBaoLopSinhVien sv = new KhaiBaoLopSinhVien();
        String s = sc.nextLine();
        sv.setHoVaTen(s);
        s = sc.nextLine();
        sv.setLop(s);
        s = sc.nextLine();
        sv.setNgaySinh(s);
        float x = sc.nextFloat();
        sv.setDiemGPA(x);
        System.out.println(sv);
    }
    
}

