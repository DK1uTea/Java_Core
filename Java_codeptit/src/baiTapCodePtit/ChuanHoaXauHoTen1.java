package baiTapCodePtit;

import java.util.Scanner;

public class ChuanHoaXauHoTen1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- >0) {
            String s = sc.nextLine();
            s = s.trim().toLowerCase();
            String[] words = s.split("\\s+");
            for (String string : words) {
                System.out.print(String.valueOf(string.charAt(0)).toUpperCase() + string.substring(1) + " ");
            }
            System.out.println();
        }
    }
}
