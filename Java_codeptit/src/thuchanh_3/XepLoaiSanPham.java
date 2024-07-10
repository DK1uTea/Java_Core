package thuchanh_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XepLoaiSanPham {
    private String maSanPham;
    private static int maSanPhamCounter = 1;
    private String tenSanPham;
    private String loai;
    private int soLuong;
    private int donGia;

    public XepLoaiSanPham() {
        this.maSanPham = this.loai + String.format("%03d",maSanPhamCounter);
        maSanPhamCounter++;
    }

    public static List<XepLoaiSanPham> readFromFile(String filePath){
        List<XepLoaiSanPham> sanPhamList = new ArrayList<>();

        try {
            File file = new File("D:\\Source_code\\Java_Project\\Java_codeptit\\src\\thuchanh_3\\sanpham.dat.txt");
            Scanner sc = new Scanner(file);
            int soLuongDoiTuong = Integer.parseInt(sc.nextLine());
            while (soLuongDoiTuong-- >0) {
                XepLoaiSanPham sanPham = new XepLoaiSanPham();
                sanPham.tenSanPham = sc.nextLine();
                sanPham.loai = sc.nextLine();

                String[] s = sc.nextLine().split(" ");
                sanPham.soLuong = Integer.parseInt(s[0]);
                sanPham.donGia = Integer.parseInt(s[1]+"000");

                sanPhamList.add(sanPham);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sanPhamList;
    }

    public int tinhThanhTien(){
        if(this.loai.equals("A")){
            return (this.soLuong*this.donGia*90)/100;
        }
        else if(this.loai.equals("B")){
            return (this.soLuong*this.donGia*95)/100;
        }
        else{
            return this.soLuong*this.donGia;
        }
    }

    public String xepLoai (){
        if(this.soLuong < 30){
            return "ngung ban";
        }
        else if(this.soLuong >= 30 && this.soLuong <=50){
            return "ban";
        }
        else{
            return "ban nhanh";
        }
    }

    
    @Override
    public String toString() {
        return this.maSanPham + " " + this.tenSanPham + " " + this.soLuong + " " + this.donGia + " " + tinhThanhTien() + " " + xepLoai();
    }

    public static void main(String[] args) throws Exception{
        List<XepLoaiSanPham> danhSach = readFromFile("D:\\Source_code\\Java_Project\\Java_codeptit\\src\\thuchanh_3\\sanpham.dat.txt");

        for (XepLoaiSanPham sanPham : danhSach) {
            System.out.println(sanPham);
        }

    }
}

