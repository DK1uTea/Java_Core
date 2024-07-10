package baiTapCodePtit;

import java.util.Scanner;

public class TongPhanSo {
    private long tuSo;
    private long mauSo;
    public TongPhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
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

    public void tinhTongPhanSo(TongPhanSo A){
        long LCM = this.mauSo * A.mauSo / findGCD(this.mauSo, A.mauSo);
        this.tuSo *= LCM / this.mauSo;
        A.tuSo *= LCM / A.mauSo;
        this.mauSo = LCM;
        this.tuSo += A.tuSo;
        this.reduceFraction();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong(), b = sc.nextLong();
        TongPhanSo A = new TongPhanSo(a, b);
        a = sc.nextLong();
        b = sc.nextLong();
        TongPhanSo B = new TongPhanSo(a, b);
        A.tinhTongPhanSo(B);
        System.out.println(A.getTuSo() + "/" + A.getMauSo());
    }
}
