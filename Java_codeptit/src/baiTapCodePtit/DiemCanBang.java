package baiTapCodePtit;
import java.util.Scanner;

public class DiemCanBang {
    public static int check(int[] a) {
        int n = a.length;
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            sum -= a[i];
            if (leftSum == sum) {
                return i + 1;
            }
            leftSum += a[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i =0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(check(arr));
        }
    }
}
