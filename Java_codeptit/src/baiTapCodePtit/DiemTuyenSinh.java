package baiTapCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DiemTuyenSinh {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("THISINH.in"));
            ArrayList<ThiSinhJ07057> dsts = new ArrayList<>();
            int t = Integer.parseInt(sc.nextLine());
            while (t-- >0) {
                dsts.add(new ThiSinhJ07057(sc.nextLine(), Float.parseFloat(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine())));
            }
            Collections.sort(dsts);
            for (ThiSinhJ07057 thiSinh : dsts) {
                if(thiSinh.tinhTongDiem() >= 20.5){
                    thiSinh.setTrangThai("Do");
                }
                else{
                    thiSinh.setTrangThai("Truot");
                }
                System.out.println(thiSinh);
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
class ThiSinhJ07057 implements Comparable<ThiSinhJ07057>{
    private static int maThiSinhCounter = 1;
    private String maThiSinh;
    private String hoTen;
    private float tongDiem;
    private String danToc;
    private int khuVuc;
    private String trangThai;
    
    public ThiSinhJ07057(String hoTen, float tongDiem, String danToc, int khuVuc) {
        this.maThiSinh = "TS" + String.format("%02d", maThiSinhCounter++);
        this.hoTen = chuanHoaHoTen(hoTen);
        this.tongDiem = tongDiem;
        this.danToc = danToc;
        this.khuVuc = khuVuc;
    }

    public static int getMaThiSinhCounter() {
        return maThiSinhCounter;
    }

    public static void setMaThiSinhCounter(int maThiSinhCounter) {
        ThiSinhJ07057.maThiSinhCounter = maThiSinhCounter;
    }

    public String getMaThiSinh() {
        return maThiSinh;
    }

    public void setMaThiSinh(String maThiSinh) {
        this.maThiSinh = maThiSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getTongDiem() {
        return tongDiem;
    }

    public void setTongDiem(float tongDiem) {
        this.tongDiem = tongDiem;
    }

    public String getDanToc() {
        return danToc;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public int getKhuVuc() {
        return khuVuc;
    }

    public void setKhuVuc(int khuVuc) {
        this.khuVuc = khuVuc;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
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

    public float tinhTongDiem(){
        if(this.khuVuc == 1){
            return (float) (this.tongDiem + 1.5);
        }
        else if (this.khuVuc == 2) {
            return this.tongDiem + 1;
        }
        if(!this.danToc.equals("Kinh")){
            return (float) (this.tongDiem + 1.5);
        }
        return this.tongDiem;
    }

    @Override
    public int compareTo(ThiSinhJ07057 o) {
        if(this.tinhTongDiem() < o.tinhTongDiem()){
            return 1;
        }
        else if(this.tinhTongDiem() > o.tinhTongDiem()){
            return -1;
        }
        else{
            return this.maThiSinh.compareTo(o.maThiSinh);
        }
    }

    @Override
    public String toString() {
        return maThiSinh + " " + hoTen + " " + String.format("%.1f", tinhTongDiem()) + " " + trangThai;
    }

    
}