import java.util.Scanner;

public class Bai_1_4 {
    public static Scanner sc = new Scanner(System.in);
    public static void createArray(int n, double[] a){
        for(int i=0; i<n; i++){
            a[i] = sc.nextDouble();
        }
    }
    public static void displayArray(double[] a){
        for (double i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static double sumArray(double[] a) {
        int sum = 0;
        for (double d : a) {
           sum+=d; 
        }
        return sum;
    }
    public static double maxArray(double[] a){
        double maxValue = a[0];
        for(int i = 1; i<a.length; i++){
            if(a[i]>maxValue){
                maxValue = a[i];
            }
        }
        return maxValue;
    }
    public static double minArray(double[] a){
        double minValue = a[0];
        for(int i = 1; i<a.length; i++){
            if(a[i]<minValue){
                minValue = a[i];
            }
        }
        return minValue;
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        double[] doubleArray = new double[n];
        Bai_1_4.createArray(n, doubleArray);
        Bai_1_4.displayArray(doubleArray);
        Double maxValue = Bai_1_4.maxArray(doubleArray);
        System.out.println(maxValue);
        Double minValue = Bai_1_4.minArray(doubleArray);
        System.out.println(minValue);
    }
}
