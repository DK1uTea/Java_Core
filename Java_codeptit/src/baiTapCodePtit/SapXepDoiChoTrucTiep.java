package baiTapCodePtit;
import java.util.Scanner;

public class SapXepDoiChoTrucTiep {
    public static void printArr (int[] a){
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
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(a[i] > a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            System.out.print("Buoc " + (i+1) + ": ");
            printArr(a);
        }
    }
}
