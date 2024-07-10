package baiTapCodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachMatHang {
    private static int maMatHangCounter = 1;
    private String maMatHang;
    private String tenMatHang;
    private String donViTinh;
    private int giaMua;
    private int giaBan;
    
    public DanhSachMatHang(String tenMatHang, String donViTinh, int giaMua, int giaBan) {
        this.maMatHang = "MH" + String.format("%03d", maMatHangCounter);
        maMatHangCounter++;
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public static int getMaMatHangCounter() {
        return maMatHangCounter;
    }

    public static void setMaMatHangCounter(int maMatHangCounter) {
        DanhSachMatHang.maMatHangCounter = maMatHangCounter;
    }

    public String getMaMatHang() {
        return maMatHang;
    }

    public void setMaMatHang(String maMatHang) {
        this.maMatHang = maMatHang;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(int giaMua) {
        this.giaMua = giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int tinhLoiNhuan(){
        return this.giaBan - this.giaMua;
    }

    
    @Override
    public String toString() {
        return maMatHang + " " + tenMatHang + " " + donViTinh + " " + giaMua + " " + giaBan + " " + tinhLoiNhuan();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<DanhSachMatHang> dsmh = new ArrayList<>();

        while (n-- >0) {
            String tenMatHang = sc.nextLine();
            String donViTinh = sc.nextLine();
            int giaMua = sc.nextInt();
            int giaBan = sc.nextInt();
            sc.nextLine();
            DanhSachMatHang matHang = new DanhSachMatHang(tenMatHang, donViTinh, giaMua, giaBan);
            dsmh.add(matHang);
        }

        if (!dsmh.isEmpty()) {
            Collections.sort(dsmh, new Comparator<DanhSachMatHang>() {
                @Override
                public int compare(DanhSachMatHang mh1, DanhSachMatHang mh2) {
                    return mh2.tinhLoiNhuan() - mh1.tinhLoiNhuan();
                }
            });

            for (DanhSachMatHang danhSachMatHang : dsmh) {
                System.out.println(danhSachMatHang);
            }
        } else {
            System.out.println("Danh sách mặt hàng trống.");
        }
    }
}
