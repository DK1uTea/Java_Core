package baiTapCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DanhSachSinhVienTrongFile2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("SV.in"));
            int t = Integer.parseInt(sc.nextLine());
            while (t-- >0) {
                SinhVienJ07010 sv = new SinhVienJ07010(sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
                System.out.println(sv);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class SinhVienJ07010{
    private static int maSinhVienCounter = 1;
    private String maSinhVien;
    private String hoVaTen;
    private String tenLop;
    private String ngaySinh;
    private float diemGPA;
    
    public SinhVienJ07010(String hoVaTen, String tenLop, String ngaySinh, float diemGPA) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.maSinhVien = "B20DCCN" + String.format("%03d", maSinhVienCounter++);
            this.hoVaTen = hoVaTen;
            this.tenLop = tenLop;
            this.ngaySinh = dateFormat.format(dateFormat.parse(ngaySinh));
            this.diemGPA = diemGPA;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static int getMaSinhVienCounter() {
        return maSinhVienCounter;
    }

    public static void setMaSinhVienCounter(int maSinhVienCounter) {
        SinhVienJ07010.maSinhVienCounter = maSinhVienCounter;
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

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public float getDiemGPA() {
        return diemGPA;
    }

    public void setDiemGPA(float diemGPA) {
        this.diemGPA = diemGPA;
    }

    @Override
    public String toString() {
        return maSinhVien + " " + hoVaTen + " " + tenLop + " " + ngaySinh + " " + String.format("%.2f", diemGPA);
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    
    
}