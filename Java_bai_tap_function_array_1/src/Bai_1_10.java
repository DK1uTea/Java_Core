import java.util.Scanner;

public class Bai_1_10 {
    public static int average (int[] arr){
        int avg = 0;
        for(int i : arr){
            avg+=i;
        }
        return avg/arr.length;
    }
    public static double average (double[] arr){
        double avg = 0;
        for(double i : arr){
            avg+=i;
        }
        return avg/arr.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextDouble();
        }
        System.out.println(average(arr));
    }
}
