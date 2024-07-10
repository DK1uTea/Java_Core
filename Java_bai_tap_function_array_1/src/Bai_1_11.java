import java.util.Scanner;

public class Bai_1_11 {
    public static double maxArray(double[] a){
        double maxValue = a[0];
        for(int i = 1; i<a.length; i++){
            if(a[i]>maxValue){
                maxValue = a[i];
            }
        }
        return maxValue;
    }
    public static int indexOfLargestElement(double[] a){
        double value = maxArray(a);
        for(int i = a.length - 1; i>=0; i--){
            if(a[i] == value){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextDouble();
        }
        System.out.println(Bai_1_11.indexOfLargestElement(arr));
    }
}
