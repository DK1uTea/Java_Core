package baiTapCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachDoanhNghiep {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DN.in"));
            ArrayList<DoanhNghiep> dsdn = new ArrayList<>();
            int t = Integer.parseInt(sc.nextLine());
            while (t-- > 0) {
                dsdn.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
            }
            Collections.sort(dsdn);
            for (DoanhNghiep doanhNghiep : dsdn) {
                System.out.println(doanhNghiep);
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
class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String maDoanhNghiep;
    private String tenDoanhNghiep;
    private int soSinhVienCoTheNhan;
    
    public DoanhNghiep(String maDoanhNghiep, String tenDoanhNghiep, int soSinhVienCoTheNhan) {
        this.maDoanhNghiep = maDoanhNghiep;
        this.tenDoanhNghiep = tenDoanhNghiep;
        this.soSinhVienCoTheNhan = soSinhVienCoTheNhan;
    }

    public String getMaDoanhNghiep() {
        return maDoanhNghiep;
    }

    public void setMaDoanhNghiep(String maDoanhNghiep) {
        this.maDoanhNghiep = maDoanhNghiep;
    }

    public String getTenDoanhNghiep() {
        return tenDoanhNghiep;
    }

    public void setTenDoanhNghiep(String tenDoanhNghiep) {
        this.tenDoanhNghiep = tenDoanhNghiep;
    }

    public int getSoSinhVienCoTheNhan() {
        return soSinhVienCoTheNhan;
    }

    public void setSoSinhVienCoTheNhan(int soSinhVienCoTheNhan) {
        this.soSinhVienCoTheNhan = soSinhVienCoTheNhan;
    }

    @Override
    public String toString() {
        return maDoanhNghiep + " " + tenDoanhNghiep + " " + soSinhVienCoTheNhan;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        return this.maDoanhNghiep.compareTo(o.maDoanhNghiep);
    }

    
}