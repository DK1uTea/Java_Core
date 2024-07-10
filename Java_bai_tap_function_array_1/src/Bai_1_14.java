import java.util.Scanner;

public class Bai_1_14 {
    public static int maxArray(int[] a){
        int maxValue = a[0];
        for(int i = 1; i<a.length; i++){
            if(a[i]>maxValue){
                maxValue = a[i];
            }
        }
        return maxValue;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int maxValue = Bai_1_14.maxArray(arr);
        for (int i : arr) {
            i /= maxValue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
