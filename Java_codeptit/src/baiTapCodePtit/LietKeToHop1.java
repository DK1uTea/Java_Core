package baiTapCodePtit;

import java.util.Scanner;

public class LietKeToHop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int[] arr = new int[k];
        generateCombinations(n, k, arr, 1, 0);

        int totalCombinations = calculateTotalCombinations(n, k);
        System.out.println("Tong cong co " + totalCombinations + " to hop");
    }

    public static int calculateTotalCombinations(int n, int k) {
        if (k == 0) {
            return 1;
        }
        return (n * calculateTotalCombinations(n - 1, k - 1)) / k;
    }

    public static void generateCombinations(int n, int k, int[] arr, int start, int idx) {
        if (idx == k) {
            print(arr);
            return;
        }

        for (int i = start; i <= n; i++) {
            arr[idx] = i;
            generateCombinations(n, k, arr, i + 1, idx + 1);
        }
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
