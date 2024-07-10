package baiTapCodePtit;
import java.util.Scanner;

public class Uoc_so_chia_het_cho_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int cnt = 0;
            for(int i =2; i<Math.sqrt(2*n); i+=2){
                if(n % i ==0){
                    cnt++;
                }
            }
            cnt *= 2;
            double x = Math.sqrt(2*n);
            if((int)Math.sqrt(2*n) * (double)Math.sqrt(2*n) == 2 * n && n%x ==0 && x%2 ==0){
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
