package baiTapCodePtit;
import java.util.Arrays;
import java.util.Scanner;

public class SapXepChen {
    public static void Arrange(int[] a, int n){
        System.out.println("Buoc 0: " + a[0]);
        for(int i = 1; i<n; i++){
            int x = a[i], pos = i-1;
            while (pos >=0 && x<a[pos]) {
                a[pos + 1] = a[pos];
                pos--;
            }
            a[pos + 1] = x;
            System.out.print("Buoc " + i + ": ");
            for(int j = 0; j<=i; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Arrange(a, n);
    }
}
