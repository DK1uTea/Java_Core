package baiTapCodePtit;

import java.math.BigInteger;
import java.util.Scanner;

public class BoiSoChungNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while (t-- >0) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            System.out.println(a.multiply(b).divide(a.gcd(b)));
        }
    }
}
