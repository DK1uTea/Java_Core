package thuchanh_1;

import java.util.Scanner;

public class Giangvien {
    private String maGiangVien;
    private String name;
    private long luongCoBan;
    private String heSo;

    public Giangvien() {
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        String maGiangVien = sc.nextLine();
        this.maGiangVien = maGiangVien;
        String name = sc.nextLine();
        this.name = name;
        Long luongCoBan = sc.nextLong();
        this.luongCoBan = luongCoBan;
        sc.nextLine();
        String heSo = sc.next();
        this.heSo = heSo;        
    }
    

    public void out(){
        long thuNhap = this.luongCoBan * 250000;
        if(heSo.equals("A")){
            thuNhap*=1.5;
        }
        else if(heSo.equals("B")){
            thuNhap*=1.2;
        }
        System.out.println(maGiangVien + " " +  name + " " + heSo + " " + thuNhap);
    }

    public static void main(String[] args) {
        Giangvien gv = new Giangvien();
        gv.input();
        gv.out();
    }


    public String getMaGiangVien() {
        return maGiangVien;
    }


    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public long getLuongCoBan() {
        return luongCoBan;
    }


    public void setLuongCoBan(long luongCoBan) {
        this.luongCoBan = luongCoBan;
    }


    public String getHeSo() {
        return heSo;
    }


    public void setHeSo(String heSo) {
        this.heSo = heSo;
    }
}
