package baiTapCodePtit;

import java.util.Scanner;

public class HinhSao {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] a = new int[n+1];
        for(int i = 1; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            a[x]++;
            a[y]++;
        }
        for(int i = 1; i < n; i++){
            if(a[i] != 1 && a[i] != n-1){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
