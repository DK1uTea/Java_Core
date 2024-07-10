package baiTapCodePtit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class XepLoai {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<BangDiemJ07055> dssv = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- >0) {
            dssv.add(new BangDiemJ07055(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(dssv);
        for (BangDiemJ07055 sv : dssv) {
            if(sv.tinhDiemTongKet() >=8 ){
                sv.setXepHang("GIOI");
            }
            else if(sv.tinhDiemTongKet() >= 6.5 && sv.tinhDiemTongKet() < 8){
                sv.setXepHang("KHA");
            }
            else if (sv.tinhDiemTongKet() >=5 && sv.tinhDiemTongKet() < 6.5){
                sv.setXepHang("TRUNG BINH");
            }
            else if (sv.tinhDiemTongKet() < 5){
                sv.setXepHang("KEM");
            }
            System.out.println(sv);
        }
    }
}
class BangDiemJ07055 implements Comparable<BangDiemJ07055>{
    private static int maSinhVienCounter = 1;
    private String maSinhVien;
    private String hoTen;
    private int diemLuyenTap;
    private int diemThucHanh;
    private int diemThi;
    private String xepHang;
    
    public BangDiemJ07055(String hoTen, int diemLuyenTap, int diemThucHanh, int diemThi) {
        this.maSinhVien = String.format("SV%02d", maSinhVienCounter++);
        this.hoTen = chuanHoaHoTen(hoTen);
        this.diemLuyenTap = diemLuyenTap;
        this.diemThucHanh = diemThucHanh;
        this.diemThi = diemThi;
    }

    public static int getMaSinhVienCounter() {
        return maSinhVienCounter;
    }

    public static void setMaSinhVienCounter(int maSinhVienCounter) {
        BangDiemJ07055.maSinhVienCounter = maSinhVienCounter;
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

    public double getDiemLuyenTap() {
        return diemLuyenTap;
    }

    public void setDiemLuyenTap(int diemLuyenTap) {
        this.diemLuyenTap = diemLuyenTap;
    }

    public double getDiemThucHanh() {
        return diemThucHanh;
    }

    public void setDiemThucHanh(int diemThucHanh) {
        this.diemThucHanh = diemThucHanh;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(int diemThi) {
        this.diemThi = diemThi;
    }

    public String getXepHang() {
        return xepHang;
    }

    public void setXepHang(String xepHang) {
        this.xepHang = xepHang;
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

    public double tinhDiemTongKet(){
        return this.diemLuyenTap*0.25 + this.diemThucHanh*0.35 + this.diemThi*0.4;
    }

    @Override
    public String toString() {
        return maSinhVien + " " + hoTen + " " + String.format("%.2f", tinhDiemTongKet()) + " " + xepHang;
    }

    @Override
    public int compareTo(BangDiemJ07055 o) {
        if(this.tinhDiemTongKet() < o.tinhDiemTongKet()){
            return 1;
        }
        else if(this.tinhDiemTongKet() > o.tinhDiemTongKet()){
            return -1;
        }
        else{
            return 0;
        }
    }
    

}