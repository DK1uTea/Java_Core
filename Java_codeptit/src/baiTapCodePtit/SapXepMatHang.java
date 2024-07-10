package baiTapCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SapXepMatHang {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("MATHANG.in"));
            ArrayList<MatHang> dsmh = new ArrayList<>();
            int t = Integer.parseInt(sc.nextLine());
            while (t-- >0) {
                dsmh.add(new MatHang(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
            }
            Collections.sort(dsmh);
            for (MatHang matHang : dsmh) {
                System.out.println(matHang);
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
class MatHang implements Comparable<MatHang>{
    private static int maMatHangCounter = 1;
    private String maHang;
    private String tenHang;
    private String nhomHang;
    private float giaMua;
    private float giaBan;
    
    public MatHang(String tenHang, String nhomHang, float giaMua, float giaBan) {
        this.maHang = "MH" + String.format("%02d", maMatHangCounter++);
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public static int getMaMatHangCounter() {
        return maMatHangCounter;
    }

    public static void setMaMatHangCounter(int maMatHangCounter) {
        MatHang.maMatHangCounter = maMatHangCounter;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getNhomHang() {
        return nhomHang;
    }

    public void setNhomHang(String nhomHang) {
        this.nhomHang = nhomHang;
    }

    public float getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(float giaMua) {
        this.giaMua = giaMua;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public float tinhLoiNhuan() {
        return this.giaBan - this.giaMua;
    }

    @Override
    public String toString() {
        return maHang + " " + tenHang + " " + nhomHang + " " + String.format("%.2f", tinhLoiNhuan());
    }

    @Override
    public int compareTo(MatHang o) {
        if(this.tinhLoiNhuan() < o.tinhLoiNhuan()){
            return 1;
        }
        else if(this.tinhLoiNhuan() > o.tinhLoiNhuan()) {
            return -1;
        }
        else{
            return 0;
        }
    }
    
    
}