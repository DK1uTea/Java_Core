package baiTapCodePtit;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.security.auth.Subject;

public class DanhSachMonThi implements Comparable<DanhSachMonThi>{
    private String maMon;
    private String tenMon;
    private String hinhThucThi;
    
    public DanhSachMonThi(String maMon, String tenMon, String hinhThucThi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThucThi = hinhThucThi;
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

    public String getHinhThucThi() {
        return hinhThucThi;
    }

    public void setHinhThucThi(String hinhThucThi) {
        this.hinhThucThi = hinhThucThi;
    }

    @Override
    public String toString() {
        return this.maMon + " " + this.tenMon + " " + this.hinhThucThi;
    }

    @Override
    public int compareTo(DanhSachMonThi o) {
        return this.maMon.compareTo(o.maMon);
    }

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DanhSachMonThi> danhSach = new ArrayList<>();
        while (t-- > 0) {
            danhSach.add(new DanhSachMonThi(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(danhSach);
        for (DanhSachMonThi monThi : danhSach) {
            System.out.println(monThi);
        }
    }
}
