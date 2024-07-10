package baiTapCodePtit;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class BaiToanTuyenSinh {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        ThiSinh ts = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        if(ts.tinhTongDiem() + ts.xetDiemUuTien() >= 24){
            ts.setStatus("TRUNG TUYEN");
        }
        else{
            ts.setStatus("TRUOT");
        }
        System.out.println(ts);
    }
}
class ThiSinh {
    private String maThiSinh;
    private String hoTen;
    private double diemToan;
    private double diemLy;
    private double diemHoa;
    private String status;
    
    public ThiSinh(String maThiSinh, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.maThiSinh = maThiSinh;
        this.hoTen = hoTen;
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
        return this.diemToan*2 + this.diemLy + this.diemHoa;
    }

    @Override
    public String toString() {
        return maThiSinh + " " + hoTen + " " + (new DecimalFormat().format(xetDiemUuTien())) + " " + (new DecimalFormat().format(tinhTongDiem())) + " " + this.status;
    }
 
    
}

// KV2B123
// Ly Thi Thu Ha
// 8
// 6.5
// 7