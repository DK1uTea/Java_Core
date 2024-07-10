package baiTapCodePtit;


import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;


public class TinhTienPhong {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<KhachHang> dskh = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- >0) {
            dskh.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(dskh);
        for (KhachHang khachHang : dskh) {
            System.out.println(khachHang);
        }
    }
}
class KhachHang implements Comparable<KhachHang>{
    private static int maKhachHangCounter = 1;
    private String maKhachHang;
    private String tenKhachHang;
    private String soPhong;
    private Date ngayNhanPhong;
    private Date ngayTraPhong;
    private long tienDichVu;
    private long donGia;
    private long thanhTien;
    private long soNgay;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public KhachHang(String tenKhachHang, String soPhong, String ngayNhanPhong, String ngayTraPhong,
            long tienDichVu) throws ParseException{
        this.maKhachHang = String.format("KH%02d", maKhachHangCounter++);
        tenKhachHang = tenKhachHang.trim().toLowerCase();
        String[] s = tenKhachHang.split("\\s+");
        this.tenKhachHang = "";
        for (String string : s) {
            this.tenKhachHang += String.valueOf(string.charAt(0)).toUpperCase() + string.substring(1) + " ";
        }
        this.soPhong = soPhong;
        this.ngayNhanPhong = sdf.parse(ngayNhanPhong);
        this.ngayTraPhong = sdf.parse(ngayTraPhong);
        this.tienDichVu = tienDichVu;

        this.soNgay = ChronoUnit.DAYS.between(this.ngayNhanPhong.toInstant(), this.ngayTraPhong.toInstant()) + 1;
        if(soPhong.charAt(0) == '1'){
            this.donGia = 25;
        }
        else if (soPhong.charAt(0) == '2') {
            this.donGia = 34;
        }
        else if (soPhong.charAt(0) == '3') {
            this.donGia = 50;
        }
        else if (soPhong.charAt(0) == '4') {
            this.donGia = 80;
        }
        this.thanhTien = soNgay * donGia + tienDichVu;
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

    public static int getMaKhachHangCounter() {
        return maKhachHangCounter;
    }

    public static void setMaKhachHangCounter(int maKhachHangCounter) {
        KhachHang.maKhachHangCounter = maKhachHangCounter;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    public Date getNgayNhanPhong() {
        return ngayNhanPhong;
    }

    public void setNgayNhanPhong(Date ngayNhanPhong) {
        this.ngayNhanPhong = ngayNhanPhong;
    }

    public Date getNgayTraPhong() {
        return ngayTraPhong;
    }

    public void setNgayTraPhong(Date ngayTraPhong) {
        this.ngayTraPhong = ngayTraPhong;
    }

    public long getTienDichVu() {
        return tienDichVu;
    }

    public void setTienDichVu(long tienDichVu) {
        this.tienDichVu = tienDichVu;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public long getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(long thanhTien) {
        this.thanhTien = thanhTien;
    }

    public long getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(long soNgay) {
        this.soNgay = soNgay;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    @Override
    public String toString() {
        return maKhachHang + " " + tenKhachHang + " " + soPhong + " " + soNgay + " " + thanhTien;
    }

    @Override
    public int compareTo(KhachHang o) {
        return (int) (o.thanhTien - this.thanhTien);
    }

    
}