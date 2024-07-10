package baiTapCodePtit;
import java.util.Scanner;

public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt();
            int i = (int) Math.sqrt(n);
            if(i*i == n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
