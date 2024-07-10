package baiTapCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DangKyHinhThucGiangDay {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> dsmh = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- >0) {
            dsmh.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(dsmh);
        for (MonHoc monHoc : dsmh) {
            if(!monHoc.getHinhThucThucHanh().equals("Truc tiep")){
                System.out.println(monHoc);
            }
        }
    }
}
class MonHoc implements Comparable<MonHoc>{
    private String maMon;
    private String tenMon;
    private int soTinChi;
    private String hinhThucLyThuyet;
    private String hinhThucThucHanh;
    
    public MonHoc(String maMon, String tenMon, int soTinChi, String hinhThucLyThuyet, String hinhThucThucHanh) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
        this.hinhThucLyThuyet = hinhThucLyThuyet;
        this.hinhThucThucHanh = hinhThucThucHanh;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public String getHinhThucLyThuyet() {
        return hinhThucLyThuyet;
    }

    public void setHinhThucLyThuyet(String hinhThucLyThuyet) {
        this.hinhThucLyThuyet = hinhThucLyThuyet;
    }

    public String getHinhThucThucHanh() {
        return hinhThucThucHanh;
    }

    public void setHinhThucThucHanh(String hinhThucThucHanh) {
        this.hinhThucThucHanh = hinhThucThucHanh;
    }

    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + soTinChi + " " + hinhThucLyThuyet + " " + hinhThucThucHanh;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.maMon.compareTo(o.maMon);
    }

    
}