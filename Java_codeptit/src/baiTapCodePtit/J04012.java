package baiTapCodePtit;

import java.util.Scanner;

public class J04012 {
	private int maNhanVienCounter = 1;
	
	private String maNhanVien;
	private String hoVaTen;
	private int luongCoBan;
	private int soNgayCong;
	private String chucVu;
	public J04012(String hoVaTen, int luongCoBan, int soNgayCong, String chucVu) {
		maNhanVien = "NV" + String.format("%02d", maNhanVienCounter);
		maNhanVienCounter++;
		this.hoVaTen = hoVaTen;
		this.luongCoBan = luongCoBan;
		this.soNgayCong = soNgayCong;
		this.chucVu = chucVu;
	}
	public int getMaNhanVienCounter() {
		return maNhanVienCounter;
	}
	public void setMaNhanVienCounter(int maNhanVienCounter) {
		this.maNhanVienCounter = maNhanVienCounter;
	}
	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(int luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public int getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	
	public int tinhLuong() {
		return this.luongCoBan*this.soNgayCong;
	}
	
	public int tinhThuong() {
		if(this.soNgayCong >= 25) {
			return (tinhLuong()*20)/100;
		}
		else if(this.soNgayCong >= 22 && this.soNgayCong < 25) {
			return (tinhLuong()*10)/100;
		}
		else {
			return 0;
		}
	}
	
	public int tinhPhuCap () {
		if(this.chucVu.equals("GD")) {
			return 250000;
		}
		else if(this.chucVu.equals("PGD")) {
			return 200000;
		}
		else if(this.chucVu.equals("TP")) {
			return 180000;
		}
		else {
			return 150000;
		}
	}
	
	public int tinhThuNhap() {
		return tinhLuong() + tinhThuong() + tinhPhuCap();
	}
	@Override
	public String toString() {
		return maNhanVien + " " + hoVaTen + " " + tinhLuong() + " " + tinhThuong() + " " + tinhPhuCap() + " " + tinhThuNhap();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String hoVaTen = sc.nextLine();
		int luongCoBan = sc.nextInt();
		int soNgayCong = sc.nextInt();
		sc.nextLine();
		String chucVu = sc.nextLine();
		
		J04012 nhanVien = new J04012(hoVaTen, luongCoBan, soNgayCong, chucVu);
		System.out.println(nhanVien);
	}
	
}
