package thuchanh_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TaoTuyenXeBus implements Comparable<TaoTuyenXeBus>{
    
    private static int id = 1;

    private int maHieu;
    private String hoTen;
    private String ngayDi;
    private int soHieu;
    private int soLuotDiDuoc;
    private String kieuNgay;

    
    
    public TaoTuyenXeBus(String hoTen, String ngayDi, int soHieu, int soLuotDiDuoc, String kieuNgay) {
        this.maHieu = id++;
        this.hoTen = hoTen;
        this.ngayDi = ngayDi;
        this.soHieu = soHieu;
        this.soLuotDiDuoc = soLuotDiDuoc;
        this.kieuNgay = kieuNgay;
    }

    
    public int tinhDoanhThu(){
        int income = 0;
        if(this.soLuotDiDuoc <5){
            income = this.soLuotDiDuoc*800;
        }
        else if(this.soLuotDiDuoc>=5 && this.soLuotDiDuoc <=10){
            income = this.soLuotDiDuoc*780;
        }
        else if(this.soLuotDiDuoc >10){
            income = this.soLuotDiDuoc*750;
        }

        if(this.kieuNgay.equals("le")){
            income *= 1.2;
        }
        else if(this.kieuNgay.equals("nghi")){
            income *= 1.1;
        }
        return income;
    }

    
    @Override
    public String toString() {
        if(this.maHieu <10){
            return "HN" + this.soHieu + "0" + maHieu + " " + hoTen + " " + ngayDi + " " + soHieu + " " + soLuotDiDuoc 
            + " " + kieuNgay + " " + this.tinhDoanhThu();
        }
        return "HN" + this.soHieu + maHieu + " " + hoTen + " " + ngayDi + " " + soHieu + " " + soLuotDiDuoc 
        + " " + kieuNgay + " " + this.tinhDoanhThu();
    }

    public int getThang(){
        String[] a = this.ngayDi.split("/");
        return Integer.parseInt(a[1]);
    }

    public int compareTo(TaoTuyenXeBus x){
        if(this.tinhDoanhThu() < x.tinhDoanhThu()){
            return 1;
        }
        else if (this.tinhDoanhThu() > x.tinhDoanhThu()){
            return -1;
        }
        else {
            return x.soHieu - this.soHieu;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        ArrayList<TaoTuyenXeBus> taoTuyenXeBus = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String ngayDi = sc.nextLine();
            int soHieuTuyen = sc.nextInt();
            int soLuotDi = sc.nextInt();
            sc.nextLine();
            String kieuNgay = sc.nextLine();

            TaoTuyenXeBus xe = new TaoTuyenXeBus(hoTen, ngayDi, soHieuTuyen, soLuotDi, kieuNgay);
            taoTuyenXeBus.add(xe);
        }

        Collections.sort(taoTuyenXeBus);
        boolean d = true;
        for(TaoTuyenXeBus x: taoTuyenXeBus){
            System.out.println(x);
        }
    }


    public int getMaHieu() {
        return maHieu;
    }


    public void setMaHieu(int maHieu) {
        this.maHieu = maHieu;
    }


    public String getHoTen() {
        return hoTen;
    }


    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }


    public String getNgayDi() {
        return ngayDi;
    }


    public void setNgayDi(String ngayDi) {
        this.ngayDi = ngayDi;
    }


    public int getSoHieu() {
        return soHieu;
    }


    public void setSoHieu(int soHieu) {
        this.soHieu = soHieu;
    }


    public int getSoLuotDiDuoc() {
        return soLuotDiDuoc;
    }


    public void setSoLuotDiDuoc(int soLuotDiDuoc) {
        this.soLuotDiDuoc = soLuotDiDuoc;
    }


    public String getKieuNgay() {
        return kieuNgay;
    }


    public void setKieuNgay(String kieuNgay) {
        this.kieuNgay = kieuNgay;
    }



    public static int getId() {
        return id;
    }


    public static void setId(int id) {
        TaoTuyenXeBus.id = id;
    }
}


// 2
// To An An
// 12/09/2023
// 21
// 9
// thuong
// do trung tuan
// 01/10/2023
// 2
// 12
// le
// Vu thi Hoa
// 23/03/2023
// 10
// 10
// thuong
// 3