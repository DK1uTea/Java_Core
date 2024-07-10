import java.util.Arrays;
import java.util.Scanner;

public class Bai_1_16 {
    public static void createMatrix(int[][] a, int rows, int columns){
        Scanner sc = new Scanner (System.in);
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] a, int rows, int columns){
        System.out.println("The matrix: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] sumByColumn (int[][] a, int rows, int columns){
        int[] sumOfColumn = new int[columns];
        for(int j = 0; j < columns; j++){
            int sum = 0;
            for(int i = 0; i < rows; i++){
                sum+=a[i][j];
            }
            sumOfColumn[j] = sum;
        }
        return sumOfColumn;
    }

    public static int maxRow (int[][] a, int rows, int columns){
        int maxSum = 0;
        for(int i =0; i< rows; i++){
            int sum = 0; 
            for(int j = 0; j<columns; j++){
                sum+=a[i][j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static int indexMaxRow(int[][] a, int rows, int columns){
        int maxSum = 0;
        int maxIndex = -1;
        for(int i = 0; i< rows; i++){
            int sum = 0; 
            for(int j = 0; j<columns; j++){
                sum+=a[i][j];
            }
            if(sum > maxSum){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        Bai_1_16.createMatrix(matrix, rows, columns);
        Bai_1_16.printMatrix(matrix, rows, columns);
        int[] comlumnSum = Bai_1_16.sumByColumn(matrix, rows, columns);
        System.out.println("Sum of each column: " + Arrays.toString(comlumnSum));
        System.out.println("The max sum of row: " + Bai_1_16.maxRow(matrix, rows, columns));
        System.out.println("The index of row that have the max sum: " + Bai_1_16.indexMaxRow(matrix, rows, columns));
    }
}
