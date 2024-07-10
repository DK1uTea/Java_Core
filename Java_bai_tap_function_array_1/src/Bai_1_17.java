import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
public class Bai_1_17 {
    public static void createMatrix(int[][] a){
        Scanner sc = new Scanner (System.in);
        for(int i = 0; i < 8; i++){
            System.out.print("Enter the seven-day work hours of Staff " + (i+1) + ": ");
            for(int j = 0; j < 7; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[8][7];
        Bai_1_17.createMatrix(matrix);
        ArrayList<Pair<Integer, Integer>> employee = new ArrayList<>(); 
        for(int i = 0; i < 8; i++){
            int sum = 0;
            for(int j = 0; j < 7; j++){
                sum += matrix[i][j];
            }
            Pair<Integer, Integer> pair = new Pair<>(i+1, sum);
            employee.add(pair);
        }
        Collections.sort(employee, new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> pair1, Pair<Integer, Integer> pair2){
                return pair1.getValue().compareTo(pair2.getValue());
            }
        });
        for (Pair<Integer,Integer> pair : employee) {
            System.out.println("Staff " + pair.getKey() + " works: " + pair.getValue() + " hours");
        }
    }
}
