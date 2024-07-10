package main;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RutThamTrungThuong_TreeSet {
    Set<String> thungPhieuDuThuong = new TreeSet<String>();
    
    public RutThamTrungThuong_TreeSet() {
    }

    public boolean themPhieu(String giaTri){
        return this.thungPhieuDuThuong.add(giaTri);
    }

    public boolean xoaPhieu(String giaTri){
        return this.thungPhieuDuThuong.remove(giaTri);
    }

    public boolean kiemTraPhieuTonTai(String giaTri){
        return this.thungPhieuDuThuong.contains(giaTri);
    }

    public void xoaTatCaPhieuDuThuong (){
        this.thungPhieuDuThuong.clear();
    }

    public int laySoLuong (){
        return this.thungPhieuDuThuong.size();
    }

    public String rutMotPhieu(){
        String ketQua = "";
        Random rd = new Random();
        int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
        ketQua = (String)this.thungPhieuDuThuong.toArray()[viTri];
        return ketQua;
    }

    public void inTatCa (){
        for (String giaTri : this.thungPhieuDuThuong) {
            System.out.println(giaTri);
        }
    }
}
