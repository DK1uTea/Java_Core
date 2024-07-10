package baiTapCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachTrungTuyen {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("THISINH.in"));
            ArrayList<ThiSinhJ07052> dsts = new ArrayList<>();
            int t = Integer.parseInt(sc.nextLine());
            while (t-- >0) {
                dsts.add(new ThiSinhJ07052(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
            }
            Collections.sort(dsts);
            int chiTieu = Integer.parseInt(sc.nextLine());
            if(chiTieu > dsts.size()){
                chiTieu = dsts.size();
            }
            double diemChuan = dsts.get(chiTieu - 1).tinhTongDiem();
            System.out.println(String.format("%.1f", diemChuan));
            for (ThiSinhJ07052 thiSinh : dsts) {
                if(thiSinh.tinhTongDiem() >= diemChuan){
                    thiSinh.setStatus("TRUNG TUYEN");
                }
                else{
                    thiSinh.setStatus("TRUOT");
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
class ThiSinhJ07052 implements Comparable<ThiSinhJ07052>{
    private String maThiSinh;
    private String hoTen;
    private double diemToan;
    private double diemLy;
    private double diemHoa;
    private String status;
    
    public ThiSinhJ07052(String maThiSinh, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.maThiSinh = maThiSinh;
        this.hoTen = chuanHoaHoTen(hoTen);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
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

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public double xetDiemUuTien (){
        String s = this.maThiSinh.substring(0, 3);
        if(s.equals("KV1")){
            return 0.5;
        }
        else if(s.equals("KV2")){
            return 1.0;
        }
        else if(s.equals("KV3")){
            return 2.5;
        }
        return 0;
    }

    public double tinhTongDiem (){
        return this.diemToan*2 + this.diemLy + this.diemHoa + xetDiemUuTien();
    }

    @Override
    public int compareTo(ThiSinhJ07052 o) {
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
        return maThiSinh + " " + hoTen + " " + (new DecimalFormat().format(xetDiemUuTien())) + " " + (new DecimalFormat().format(tinhTongDiem())) + " " + this.status;
    }
 
    
}