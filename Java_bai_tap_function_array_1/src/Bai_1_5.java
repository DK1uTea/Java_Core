import java.util.ArrayList;
import java.util.Scanner;

public class Bai_1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArray = new int[50];
        int average = 0;
        for(int i = 0; i<50; i++){
            intArray[i] = sc.nextInt();
            average += intArray[i];
        }
        ArrayList<Integer> greaterAverage = new ArrayList<>();
        average /=50;
        for (int i: intArray) {
            if(i > average){
                greaterAverage.add(i);
            }
        }
        System.out.print("The numbers greater the average: ");
        for (Integer integer : greaterAverage) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
