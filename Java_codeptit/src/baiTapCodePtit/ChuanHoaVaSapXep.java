package baiTapCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChuanHoaVaSapXep {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<HoVaTen> a = new ArrayList<>();
        while (sc.hasNextLine()) {
            a.add(new HoVaTen(sc.nextLine()));
        }
        Collections.sort(a);
        for (HoVaTen hoVaTen : a) {
            System.out.println(hoVaTen);
        }
    }
}
class HoVaTen implements Comparable<HoVaTen>{
    private String ho;
    private String tenDem;
    private String ten;
    
    public HoVaTen(String s) {
        s = s.trim().toLowerCase();
        String[] arr = s.split("\\s+");
        tenDem = "";
        for (int i = 1; i < arr.length - 1; ++i)
            tenDem += String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1) + " ";
        tenDem = tenDem.trim();
        ho = String.valueOf(arr[0].charAt(0)).toUpperCase() + arr[0].substring(1);
        ten = String.valueOf(arr[arr.length - 1].charAt(0)).toUpperCase() + arr[arr.length - 1].substring(1);
    }

    @Override
    public String toString() {
        return ho + " " + tenDem + " " + ten;
    }

    @Override
    public int compareTo(HoVaTen o) {
        if(!this.ten.equals(o.ten)){
            return this.ten.compareTo(o.ten);
        }
        if(!this.ho.equals(o.ho)){
            return this.ho.compareTo(o.ho);
        }
        return this.tenDem.compareTo(o.tenDem);
    }

    
    
}
