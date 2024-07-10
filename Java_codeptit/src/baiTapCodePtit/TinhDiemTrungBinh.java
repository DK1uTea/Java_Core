package baiTapCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TinhDiemTrungBinh {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<BangDiem> dssv = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- >0) {
            dssv.add(new BangDiem(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(dssv);
        dssv.get(0).setRanking(1);
        int check = 1;
        for(int i = 1; i<dssv.size(); i++){
            if(dssv.get(i).diemTrungBinh() == dssv.get(i-1).diemTrungBinh()){
                dssv.get(i).setRanking(dssv.get(i-1).getRanking());
                check++;
            }
            else if(dssv.get(i).diemTrungBinh() < dssv.get(i-1).diemTrungBinh() && check > 1){
                dssv.get(i).setRanking(dssv.get(i-1).getRanking() + 2);
                check = 1;
            }
            else if(dssv.get(i).diemTrungBinh() < dssv.get(i-1).diemTrungBinh() && check == 1){
                dssv.get(i).setRanking(dssv.get(i-1).getRanking() + 1); 
                check = 1;
            }
        }
        for (BangDiem bangDiem : dssv) {
            System.out.println(bangDiem);
        }
    }
}
class BangDiem implements Comparable<BangDiem>{
    private static int maSinhVienCounter = 1;
    private String maSinhVien;
    private String hoTen;
    private int diemMon1;
    private int diemMon2;
    private int diemMon3;
    private int ranking;
    
    public BangDiem(String hoTen, int diemMon1, int diemMon2, int diemMon3) {
        this.maSinhVien = String.format("SV%02d", maSinhVienCounter++);
        this.hoTen = chuanHoaHoTen(hoTen);
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
    }

    public static int getMaSinhVienCounter() {
        return maSinhVienCounter;
    }

    public static void setMaSinhVienCounter(int maSinhVienCounter) {
        BangDiem.maSinhVienCounter = maSinhVienCounter;
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

    public int getDiemMon1() {
        return diemMon1;
    }

    public void setDiemMon1(int diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public int getDiemMon2() {
        return diemMon2;
    }

    public void setDiemMon2(int diemMon2) {
        this.diemMon2 = diemMon2;
    }

    public int getDiemMon3() {
        return diemMon3;
    }

    public void setDiemMon3(int diemMon3) {
        this.diemMon3 = diemMon3;
    }
    
    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
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

    public double diemTrungBinh(){
        return (double) (this.diemMon1*3 + this.diemMon2*3 + this.diemMon3*2) / 8;
    }

    @Override
    public int compareTo(BangDiem o) {
        if(o.diemTrungBinh() > this.diemTrungBinh()){
            return 1;
        }
        else if (o.diemTrungBinh() < this.diemTrungBinh()) {
            return -1;
        }
        else {
            return this.maSinhVien.compareTo(o.maSinhVien);
        }
    }

    @Override
    public String toString() {
       return String.format("%s %s %.2f %d", maSinhVien, hoTen, diemTrungBinh(), ranking);
    }

    
}