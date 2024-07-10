import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai_1_13 { 
    private String nameStudent;
    private double averagePoint;

    public Bai_1_13(String nameStudent, double averagePoint) {
        this.nameStudent = nameStudent;
        this.averagePoint = averagePoint;
    }
    
    @Override
    public String toString() {
        return "[nameStudent=" + nameStudent + ", averagePoint=" + averagePoint + "]";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Bai_1_13> arr = new ArrayList<>();
        while(n-- >0){
            String name = sc.next();
            double point = sc.nextDouble();
            arr.add(new Bai_1_13(name, point));
        }
        Collections.sort(arr, new Comparator<Bai_1_13>() {
            @Override
            public int compare (Bai_1_13 sv1, Bai_1_13 sv2){
                return Double.compare(sv2.averagePoint, sv1.averagePoint);
            }
        });
        for (Bai_1_13 bai_1_13 : arr) {
            System.out.println(bai_1_13);
        }
    }
}
