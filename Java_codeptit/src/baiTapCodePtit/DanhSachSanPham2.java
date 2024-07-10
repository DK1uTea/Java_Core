package baiTapCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachSanPham2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("SANPHAM.in"));
            ArrayList<SanPham> dssp = new ArrayList<>();
            int t = Integer.parseInt(sc.nextLine());
            while (t-- > 0) {
                dssp.add(new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
            }
            Collections.sort(dssp);
            for (SanPham sanPham : dssp) {
                System.out.println(sanPham);
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
class SanPham implements Comparable<SanPham>{
    private String maSanPham;
    private String tenSanPham;
    private int giaBan;
    private int thoiHanBaoHanh;
    
    public SanPham(String maSanPham, String tenSanPham, int giaBan, int thoiHanBaoHanh) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.thoiHanBaoHanh = thoiHanBaoHanh;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getThoiHanBaoHanh() {
        return thoiHanBaoHanh;
    }

    public void setThoiHanBaoHanh(int thoiHanBaoHanh) {
        this.thoiHanBaoHanh = thoiHanBaoHanh;
    }

    @Override
    public String toString() {
        return maSanPham + " " + tenSanPham + " " + giaBan + " " + thoiHanBaoHanh;
    }

    @Override
    public int compareTo(SanPham o) {
        if(this.giaBan > o.giaBan){
            return -1;
        }
        else if(this.giaBan < o.giaBan){
            return 1;
        }
        else{
            return this.maSanPham.compareTo(o.maSanPham);
        }
    }

    
    
}
