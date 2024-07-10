package baiTapCodePtit;

import java.util.Scanner;

public class DanhSachCanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                if(matrix[i][j] == 1){
                    System.out.println("(" + (i+1) + "," + (j+1) + ")" );
                }
            }
        }
    }
}
