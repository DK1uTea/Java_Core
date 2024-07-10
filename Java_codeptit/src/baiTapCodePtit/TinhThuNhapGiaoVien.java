package baiTapCodePtit;

import java.util.Scanner;

public class TinhThuNhapGiaoVien {
    private String maNgach;
    private String hoTen;
    private String luongCoBan;

    public TinhThuNhapGiaoVien(String maNgach, String hoTen, String luongCoBan) {
        this.maNgach = maNgach;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }
    public String getMaNgach() {
        return maNgach;
    }
    public void setMaNgach(String maNgach) {
        this.maNgach = maNgach;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getLuongCoBan() {
        return luongCoBan;
    }
    public void setLuongCoBan(String luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    @Override
    public String toString() {
        return maNgach + " " + hoTen + " " + getBacLuong() + " " + getPhuCap() + " " + tinhThuNhap();
    }

    public int tinhThuNhap(){
        String bacLuong_tmp = this.maNgach.substring(2, this.maNgach.length());
        int bacLuong = Integer.parseInt(bacLuong_tmp);
        String chucVu = this.maNgach.substring(0, 2);
        int thuNhap = bacLuong * Integer.parseInt(this.luongCoBan);
        if(chucVu.contentEquals("HT")){
            thuNhap+=2000000;
        }
        else if(chucVu.contentEquals("HP")){
            thuNhap+=900000;
        }
        else if(chucVu.contentEquals("GV")){
            thuNhap+=500000;
        }
        return thuNhap;
    }

    public int getBacLuong(){
        String bacLuong_tmp = this.maNgach.substring(2, this.maNgach.length());
        int bacLuong = Integer.parseInt(bacLuong_tmp);
        return bacLuong;
    }

    public int getPhuCap(){
        String chucVu = this.maNgach.substring(0, 2);
        if(chucVu.contentEquals("HT")){
            return 2000000;
        }
        else if(chucVu.contentEquals("HP")){
            return 900000;
        }
        else{
            return 500000;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String maNgach = sc.nextLine();
        String hoTen = sc.nextLine();
        String luongCoBan = sc.nextLine();

        TinhThuNhapGiaoVien gv = new TinhThuNhapGiaoVien(maNgach, hoTen, luongCoBan);
        System.out.println(gv);
    }
}

