package baiTapCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
import java.time.ZoneId;


public class XetTuyen {
    public static void main(String[] args) throws ParseException, FileNotFoundException{
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        while (t-- >0) {
            UngVien uv = new UngVien(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            System.out.println(uv);
        }
    }
}
class UngVien {
    private static int maUngVienCounter = 1;
    private String maUngVien;
    private String hoTen;
    private Date ngaySinh;
    private double diemLyThuyet;
    private double diemThucHanh;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public UngVien(String hoTen, String ngaySinh, double diemLyThuyet, double diemThucHanh) throws ParseException{
        this.maUngVien = String.format("PH%02d", maUngVienCounter++);
        this.hoTen = chuanHoaHoTen(hoTen);
        this.ngaySinh = sdf.parse(ngaySinh);
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }

    public static int getMaUngVienCounter() {
        return maUngVienCounter;
    }

    public static void setMaUngVienCounter(int maUngVienCounter) {
        UngVien.maUngVienCounter = maUngVienCounter;
    }

    public String getMaUngVien() {
        return maUngVien;
    }

    public void setMaUngVien(String maUngVien) {
        this.maUngVien = maUngVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemLyThuyet() {
        return diemLyThuyet;
    }

    public void setDiemLyThuyet(double diemLyThuyet) {
        this.diemLyThuyet = diemLyThuyet;
    }

    public double getDiemThucHanh() {
        return diemThucHanh;
    }

    public void setDiemThucHanh(double diemThucHanh) {
        this.diemThucHanh = diemThucHanh;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
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
    
    public double tinhDiemTrungBinh(){
        double diemTong = (this.diemLyThuyet + this.diemThucHanh)*0.5;
        if(this.diemLyThuyet >=8 && this.diemThucHanh >=8){
            diemTong += 1;
        }
        else if(this.diemLyThuyet >= 7.5 && this.diemThucHanh >= 7.5){
            diemTong += 0.5;
        }
        diemTong = Math.min(10, Math.round(diemTong));
        return diemTong;
    }

    public long tinhTuoi (){
        LocalDate ngaySinhLocalDate = this.ngaySinh.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    LocalDate ngayHienTai = LocalDate.now();
    return ChronoUnit.YEARS.between(ngaySinhLocalDate, ngayHienTai);
    }

    public String xepLoai(){
        if(tinhDiemTrungBinh() == 9 || tinhDiemTrungBinh() == 10){
            return "Xuat Sac";
        }
        else if(tinhDiemTrungBinh() == 8){
            return "Gioi";
        }
        else if (tinhDiemTrungBinh() == 7) {
            return "Kha";
        }
        else if (tinhDiemTrungBinh() == 5 || tinhDiemTrungBinh() == 6) {
            return "Trung Binh";
        }
        else {
            return "Truot";
        }
    }

    @Override
    public String toString() {
        return maUngVien + " " + hoTen + " " + (tinhTuoi()-2) + " " + String.format("%.0f", tinhDiemTrungBinh()) + " " + xepLoai();
    }

    
}

// 3
// Doan Thi Kim
// 13/03/1982
// 8
// 9.5
// dinh Thi NGOC HA
// 3/9/1996
// 6.5
// 8
//   tran thanh mai
// 12/9/2004
// 8
// 9