package thuchanh_1;

import java.util.Scanner;

public class TimHangNguyenToTrong1MaTran {
    public static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt = 1;
        while (t-- >0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n][m];
            for(int i = 0; i<n; i++){
                for(int j =0; j<m; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("Test " + cnt + ":");
            for(int i = 0; i<n; i++){
                boolean check = true;
                for(int j = 0; j<m; j++){
                    if(!checkPrime(matrix[i][j])){
                        check = false;
                        break;
                    }
                }
                if(check){
                    System.out.print(i + " ");
                }
            }
            cnt++;
            System.out.println();
        }
    }
}
