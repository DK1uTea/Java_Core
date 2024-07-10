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

public class DanhSachLuuTru {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("KHACH.in"));
        ArrayList<Khach> dslt = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- >0) {
            dslt.add(new Khach(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(dslt);
        for (Khach khach : dslt) {
            System.out.println(khach);
        }
    }
}
class Khach implements Comparable<Khach>{
    private static int maKhachHangCounter = 1;
    private String maKhachHang;
    private String hoTen;
    private String maPhong;
    private Date ngayDen;
    private Date ngayDi;
    private long soNgay;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Khach(String hoTen, String maPhong, String ngayDen, String ngayDi) throws ParseException {
        this.maKhachHang = String.format("KH%02d", maKhachHangCounter++);
        this.hoTen = hoTen;
        this.maPhong = maPhong;
        this.ngayDen = sdf.parse(ngayDen);
        this.ngayDi = sdf.parse(ngayDi);
        this.soNgay = ChronoUnit.DAYS.between(this.ngayDen.toInstant(), this.ngayDi.toInstant());
    }
    public static int getMaKhachHangCounter() {
        return maKhachHangCounter;
    }
    public static void setMaKhachHangCounter(int maKhachHangCounter) {
        Khach.maKhachHangCounter = maKhachHangCounter;
    }
    public String getMaKhachHang() {
        return maKhachHang;
    }
    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }
    public Date getNgayDen() {
        return ngayDen;
    }
    public void setNgayDen(Date ngayDen) {
        this.ngayDen = ngayDen;
    }
    public Date getNgayDi() {
        return ngayDi;
    }
    public void setNgayDi(Date ngayDi) {
        this.ngayDi = ngayDi;
    }
    public SimpleDateFormat getSdf() {
        return sdf;
    }
    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public long getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(long soNgay) {
        this.soNgay = soNgay;
    }

    @Override
    public String toString() {
        return maKhachHang + " " + hoTen + " " + maPhong + " " + soNgay;
    }

    @Override
    public int compareTo(Khach o) {
        return (int) (o.soNgay - this.soNgay);
    }
    
}
