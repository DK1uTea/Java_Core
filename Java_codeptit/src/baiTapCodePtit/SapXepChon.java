package baiTapCodePtit;
import java.util.Scanner;

public class SapXepChon {
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
        for(int i =0; i<n-1; i++){
            int minPos = i;
            for(int j = i+1; j<n; j++){
                if(a[j] < a[minPos]){
                    minPos = j;
                }
            }
            int tmp = a[minPos];
            a[minPos] = a[i];
            a[i] = tmp;
            System.out.print("Buoc " + (i+1) + ": ");
            printArr(a);
        }
    }
}
