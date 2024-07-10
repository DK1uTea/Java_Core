package baiTapCodePtit;
import java.util.Scanner;

public class SapXepNoiBot {
    public static void print (int[] a, int n){
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i< n-1; i++){
            boolean swap = false;
            for(int j = 0; j<n-i-1; j++){
                if(a[j] > a[j+1]){
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                    swap = true;
                }
            }
            if(swap == false){
                break;
            }
            System.out.print("Buoc " + (i+1) + ": ");
            print(a, n);
        }
    }
}
