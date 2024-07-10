package baiTapCodePtit;

import java.util.Scanner;

public class MaTranNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][3];
        int cnt = 0;
        for(int i =0; i<n; i++){
            int odd = 0;
            for(int j = 0; j<3; j++){
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] == 1){
                    odd++;
                }
            }
            if(odd > 1){
                cnt++;
            }
        }
        System.out.println(cnt);   
    }
}
