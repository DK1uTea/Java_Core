package baiTapCodePtit;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HopCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        Set<Integer> se = new HashSet();
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
            se.add(a[i]);
        }
        for(int j = 0; j<m; j++){
            b[j] = sc.nextInt();
            se.add(b[j]);
        }
        for (Integer integer : se) {
            System.out.print(integer + " ");
        }
    }
}
