package baiTapCodePtit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class SapXepDanhSachDoiTuongNhanVien {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        ArrayList<J05007> dsnv = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- >0) {
            dsnv.add(new J05007(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(dsnv);
        for (J05007 nv : dsnv) {
            System.out.println(nv);
        }
    }
}
class J05007 implements Comparable<J05007>{
    private static int maNhanVienCounter = 1;
    private String maNhanVien;
    private String hoTen;
    private String gioiTinh;
    private Date ngaySinh;
    private String diaChi;
    private String maSoThue;
    private Date ngayKyHopDong;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public J05007(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKyHopDong) throws ParseException{
        this.maNhanVien = String.format("%05d", maNhanVienCounter++);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = sdf.parse(ngaySinh);
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKyHopDong = sdf.parse(ngayKyHopDong);
    }
    public static int getMaNhanVienCounter() {
        return maNhanVienCounter;
    }
    public static void setMaNhanVienCounter(int maNhanVienCounter) {
        J05007.maNhanVienCounter = maNhanVienCounter;
    }
    public String getMaNhanVien() {
        return maNhanVien;
    }
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public Date getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getMaSoThue() {
        return maSoThue;
    }
    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }
    public Date getNgayKyHopDong() {
        return ngayKyHopDong;
    }
    public void setNgayKyHopDong(Date ngayKyHopDong) {
        this.ngayKyHopDong = ngayKyHopDong;
    }
    public SimpleDateFormat getSdf() {
        return sdf;
    }
    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }
    @Override
    public String toString() {
        return maNhanVien + " " + hoTen + " " + gioiTinh + " " + sdf.format(ngaySinh) + " " + diaChi + " " + maSoThue + " " + sdf.format(ngayKyHopDong);
    }
    @Override
    public int compareTo(J05007 o) {
        return this.ngaySinh.compareTo(o.ngaySinh);
    }

    
    
}

// 3
// Nguyen Van A
// Nam
// 22/10/1982
// Mo Lao-Ha Dong-Ha Noi
// 8333012345
// 31/12/2013
// Ly Thi B
// Nu
// 15/10/1988
// Mo Lao-Ha Dong-Ha Noi
// 8333012346
// 22/08/2011
// Hoang Thi C
// Nu
// 04/02/1981
// Mo Lao-Ha Dong-Ha Noi
// 8333012347
// 22/08/2011