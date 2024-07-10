package baiTapCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachSinhVienTrongFile1 {
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(new File("SINHVIEN.in"));
            ArrayList<SinhVien> dssv = new ArrayList<>();
            int t = Integer.parseInt(sc.nextLine());
            while (t-- >0) {
                dssv.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
            }
            Collections.sort(dssv);
            for (SinhVien sinhVien : dssv) {
                System.out.println(sinhVien);
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
class SinhVien implements Comparable<SinhVien>{
    private String maSinhVien;
    private String hoTen;
    private String lop;
    private String email;
    
    public SinhVien(String maSinhVien, String hoTen, String lop, String email) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
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

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return maSinhVien + " " + chuanHoaHoTen(hoTen) + " " + lop + " " + email;
    }

    private String chuanHoaHoTen(String s) {
        s = s.trim().toLowerCase();
        String[] words = s.split("\\s+");
        String ans = "";
        for(int i = 0; i < words.length; i++){
            if(i != words.length-1){
                ans+= String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1) + " ";
            }
            else{
                 ans+= String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
            }
        }
        return ans;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSinhVien.compareTo(o.maSinhVien);
    }
    
    
}