package baiTapCodePtit;
import java.util.Scanner;
public class J02008 {
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            long lcm = 1;
            for(int i = 1; i<=n; i++){
                lcm = (lcm * i) / gcd(lcm, i);
            }
            System.out.println(lcm);
        }
    } 
}
