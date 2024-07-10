import java.util.Scanner;

public class Bai_1_3 {
    public static Scanner sc = new Scanner(System.in);
    public static void createArray(int n, int[] a){
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
    }
    public static void displayArray(int[] a){
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void displayReverse (int[] a, int[] reverse){
        for(int i=0; i<reverse.length; i++){
            reverse[i] = a[a.length - i - 1];
        }
        for (int i : reverse) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] intArray = new int[n];
        int[] reverseArray = new int[n];
        Bai_1_3.createArray(n, intArray);
        Bai_1_3.displayArray(intArray);
        Bai_1_3.displayReverse(intArray, reverseArray);
    }
}
