package baiTapCodePtit;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n+1][n+1];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                matrix[i][j] = sc.nextInt();                 
            }
        }
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i < n; i++) {
            arrayList.add(new ArrayList<Integer>());
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j] == 1){
                    arrayList.get(i).add(j);
                }
            }
        }
        for(int i = 0; i<arrayList.size(); i++){
            System.out.print("List(" + (i+1) + ") = ");
            for(int j = 0; j<arrayList.get(i).size(); j++){
                System.out.print((arrayList.get(i).get(j) + 1) + " ");
            }
            System.out.println();
        }
    }
}
