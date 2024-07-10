package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach = new ArrayList<>();

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }
    // 1. Them sinh vien vao danh sach
    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }
    // 2. In danh sach sinh vien ra man hinh
    public void inDanhSachSinhVien (){
        for (SinhVien sinhVien : danhSach) {
            System.out.println(sinhVien);
        }
    }
    // 3.Kiem tra danh sach rong hay khong
    public boolean kiemTraDanhSachRong(){
        return this.danhSach.isEmpty();
    }
    // 4. Lay so luong sinh vien trong danh sach
    public int laySoLuongSinhVien(){
        return this.danhSach.size();
    }
    // 5. Lam rong danh sach sinh vien
    public void lamRongDanhSach(){
        this.danhSach.clear();
    }
    // 6. Kiem tra sinh vien co ton tai hay khong, dua tren ma sinh vien
    public boolean kiemTraTonTai(SinhVien sv){
        return this.danhSach.contains(sv);
    }
    // 7. Xoa mot sinh vien ra khoi danh sach, dua tren ma sinh vien
    public boolean xoaSinhVien(SinhVien sv){
        return this.danhSach.remove(sv);
    } 
    // 8. Tim tat ca sinh vien theo ten duoc nhap tu ban phim
    public void timSinhVien(String name){
        for (SinhVien sinhVien : danhSach) {
           if(sinhVien.getHoVaTen().indexOf(name) >= 0){
            System.out.println(sinhVien);
           } 
        }
    }
    // 9. Xuat ra danh sach sinh vien co diem tu cao den thap
    public void sapXepSinhVienGiamDanTheoDiem (){
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2){
                if(sv1.getDiemTrungBinh()<sv2.getDiemTrungBinh()){
                    return 1;
                }
                else if(sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        });
    }
    // 10. Ghi xuong file
    public void ghiDuLieuXuongfile(File file){
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (SinhVien sinhVien : danhSach) {
                oos.writeObject(sinhVien);
            }
            oos.flush();
            oos.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    // 11. Doc du lieu tu file
    public void docDuLieuTuFile(File f) {
        try {
            InputStream is = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(is);
            SinhVien sv = null;
            while (true) {
                Object oj = ois.readObject();
                if(oj == null){
                    break;
                }
                if(oj != null){
                    sv = (SinhVien) oj;
                    this.danhSach.add(sv);
                }
            }
            ois.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
