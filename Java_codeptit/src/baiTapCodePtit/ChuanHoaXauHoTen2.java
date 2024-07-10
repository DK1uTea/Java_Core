package baiTapCodePtit;

import java.util.Scanner;

public class ChuanHoaXauHoTen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- >0) {
            String s = sc.nextLine().trim().toLowerCase();
            String[] words = s.split("\\s+");
            for(int i = 1; i<words.length; i++){
                if(i!=words.length-1){
                    System.out.print(String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1) + " ");
                }
                else{
                    System.out.print(String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1) + ", ");
                }
            }
            System.out.print(words[0].toUpperCase());
            System.out.println();
        }
    }
}
