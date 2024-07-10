package baiTapCodePtit;

import java.math.BigInteger;
import java.text.ParseException;
import java.util.Scanner;

public class TongSoNguyenLon1 {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while (t-- >0) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            System.out.println(a.add(b));  
        }
    }
}
// 1
// 12
// 198111