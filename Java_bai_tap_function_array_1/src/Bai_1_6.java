import java.util.Scanner;

public class Bai_1_6 {
    public static void sort (int[] a){
        for(int i=0; i<a.length-1; i++){
            for(int j= i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    int tmp = a[i];
                    a[i] = a[j];  
                    a[j] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Bai_1_6.sort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
