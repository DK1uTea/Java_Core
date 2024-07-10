package baiTapCodePtit;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MangDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int[] reverseArr = new int[n];
            for(int i = 0; i<n; i++){
                reverseArr[i] = arr[n-i-1];
            }
            if(Arrays.equals(reverseArr, arr)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
