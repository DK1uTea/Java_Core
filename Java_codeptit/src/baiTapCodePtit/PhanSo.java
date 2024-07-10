package baiTapCodePtit;

import java.util.Scanner;

public class PhanSo {
    private long tuSo;
    private long mauSo;
    
    
    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    
    public long findGCD(long a, long b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }

    public void reduceFraction(){
        long gcd = findGCD(this.tuSo, this.mauSo);
        this.tuSo /= gcd;
        this.mauSo /= gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tuSo = sc.nextLong();
        long mauSo = sc.nextLong();
        PhanSo ps = new PhanSo(tuSo, mauSo);
        ps.reduceFraction();
        System.out.println(ps.getTuSo() + "/" + ps.getMauSo());
    }


    public long getTuSo() {
        return tuSo;
    }


    public void setTuSo(long tuSo) {
        this.tuSo = tuSo;
    }


    public long getMauSo() {
        return mauSo;
    }


    public void setMauSo(long mauSo) {
        this.mauSo = mauSo;
    }

}
