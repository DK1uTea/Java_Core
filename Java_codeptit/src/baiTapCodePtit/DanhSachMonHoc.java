package baiTapCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachMonHoc {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("MONHOC.in"));
            ArrayList<MonHocJ07034> dsmh = new ArrayList<>();
            int t = Integer.parseInt(sc.nextLine());
            while (t-- >0) {
                dsmh.add(new MonHocJ07034(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
            }
            Collections.sort(dsmh);
            for (MonHocJ07034 monHoc : dsmh) {
                System.out.println(monHoc);
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
class MonHocJ07034 implements Comparable<MonHocJ07034>{
    private String maMonHoc;
    private String tenMonHoc;
    private int soTinChi;
    
    public MonHocJ07034(String maMonHoc, String tenMonHoc, int soTinChi) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    @Override
    public String toString() {
        return maMonHoc + " " + tenMonHoc + " " + soTinChi;
    }

    @Override
    public int compareTo(MonHocJ07034 o) {
        return this.tenMonHoc.compareTo(o.tenMonHoc);
    }

    
    
}