package baiTapCodePtit;

import java.util.ArrayList;
import java.util.Scanner;

public class BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            a.add(sc.nextInt());
        }
        if(a.size() == n && a.get(n-1) == n){
            System.out.println("Excellent!");
        }
        else{
            boolean[] check = new boolean[a.get(n-1) + 5];
            for (int i : a) {
                check[i] = true;
            }
            for(int i = 1; i<=a.get(n-1); i++){
                if(!check[i]){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
