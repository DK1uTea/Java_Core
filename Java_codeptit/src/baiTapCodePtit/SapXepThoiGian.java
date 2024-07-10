package baiTapCodePtit;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

public class SapXepThoiGian implements Comparable<SapXepThoiGian>{
    private int gio;
    private int phut;
    private int giay;
    
    public SapXepThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    public int getPhut() {
        return phut;
    }

    public void setPhut(int phut) {
        this.phut = phut;
    }

    public int getGiay() {
        return giay;
    }

    public void setGiay(int giay) {
        this.giay = giay;
    }
    
    
    @Override
    public String toString() {
        return gio + " " + phut + " " + giay;
    }

    public int compareTo(SapXepThoiGian o) {
        if (this.gio > o.gio) {
            return 1;
        } else if (this.gio < o.gio) {
            return -1;
        } else {
            if (this.phut > o.phut) {
                return 1;
            } else if (this.phut < o.phut) {
                return -1;
            } else {
                if (this.giay > o.giay) {
                    return 1;
                } else if (this.giay < o.giay) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<SapXepThoiGian> danhSach = new ArrayList<SapXepThoiGian>();
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int gio = sc.nextInt();
            int phut = sc.nextInt();
            int giay = sc.nextInt();

            danhSach.add(new SapXepThoiGian(gio, phut, giay));
        }

        Collections.sort(danhSach);

        for (SapXepThoiGian sapXepThoiGian : danhSach) {
            System.out.println(sapXepThoiGian);
        }
    }
}
