package thuchanh_3;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MonHoc implements Comparable<MonHoc>{
    private String maMon, tenMon;
    private int soTinChi;
    private int kyHoc;
    
    public MonHoc(String line) {
        String[] s = line.split(",");
        this.maMon = s[0];
        this.tenMon = s[1];
        this.soTinChi = Integer.parseInt(s[2]);
        this.kyHoc = Integer.parseInt(s[3]);
    }

    public int compareTo (MonHoc o){
        if(this.kyHoc == o.kyHoc){
            return this.tenMon.compareTo(o.tenMon);
        }
        return this.kyHoc - o.kyHoc;
    }

    @Override
    public String toString() {
        return this.maMon + " " + this.tenMon + " " + this.soTinChi + " " + this.kyHoc;
    }
}
public class DanhSachMonHoc {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner (new File("monhoc.dat"));
        ArrayList<MonHoc> danhSach = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            MonHoc monHoc = new MonHoc(line);
            danhSach.add(monHoc);
        }
        Collections.sort(danhSach);

        for(MonHoc monHoc : danhSach){
            System.out.println(monHoc);
        }
    }
}
