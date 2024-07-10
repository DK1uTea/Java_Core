package baiTapCodePtit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DanhSachDoiTuongSinhVien1 {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- >0) {
            J05003 sv = new J05003(sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
            System.out.println(sv);
        }
    }
}
class J05003{
    private static int maSinhVienCounter = 1;
    private String maSinhVien;
    private String hoTen;
    private String lop;
    private Date ngaySinh;
    private float diemGPA;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public J05003(String hoTen, String lop, String ngaySinh, float diemGPA) throws ParseException{
        this.maSinhVien = String.format("B20DCCN%03d", maSinhVienCounter++);
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = sdf.parse(ngaySinh);
        this.diemGPA = diemGPA;
    }

    public static int getMaSinhVienCounter() {
        return maSinhVienCounter;
    }

    public static void setMaSinhVienCounter(int maSinhVienCounter) {
        J05003.maSinhVienCounter = maSinhVienCounter;
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

    

    

}

// 1
// Nguyen Van An
// D20CQCN01-B
// 2/12/2002
// 3.19