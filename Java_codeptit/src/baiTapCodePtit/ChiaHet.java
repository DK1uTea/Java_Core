package baiTapCodePtit;

import java.math.BigInteger;
import java.util.Scanner;

public class ChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger();
            if(a.mod(b).intValue() == 0 || b.mod(a).intValue() == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
