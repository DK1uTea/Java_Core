package baiTapCodePtit;

import java.util.Scanner;

public class KhaiBaoLopNhanVien {
    private String maNhanVien;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKiHopDong;
    public KhaiBaoLopNhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue,
            String ngayKiHopDong) {
        this.maNhanVien = "00001";
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKiHopDong = ngayKiHopDong;
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
    public String getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh) {
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
    public String getNgayKiHopDong() {
        return ngayKiHopDong;
    }
    public void setNgayKiHopDong(String ngayKiHopDong) {
        this.ngayKiHopDong = ngayKiHopDong;
    }
    @Override
    public String toString() {
        return maNhanVien + " " + hoTen + " " + gioiTinh + " " + ngaySinh + " " + diaChi 
        + " " + maSoThue + " " + ngayKiHopDong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hoTen = sc.nextLine();
        String gioiTinh = sc.nextLine();
        String ngaySinh = sc.nextLine();
        String diaChi = sc.nextLine();
        String maSoThue = sc.nextLine();
        String ngayKiHopDong = sc.nextLine();

        KhaiBaoLopNhanVien nhanVien = new KhaiBaoLopNhanVien(hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKiHopDong);

        System.out.println(nhanVien);
    }
    
}

