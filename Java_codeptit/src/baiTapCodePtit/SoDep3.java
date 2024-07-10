package baiTapCodePtit;

import java.util.Scanner;

public class SoDep3 {
    public static boolean check1(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        String s_new = stringBuilder.reverse().toString();
        if(s.equals(s_new)){
            return true;
        }
        return false;
    }

    public static boolean isPrime(int num){
        if(num <2){
            return false;
        }
        for(int i = 2; i< Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean check2 (String s){
        for (int i = 0; i<s.length(); i++){
            if(!isPrime(Character.getNumericValue(s.charAt(i)))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String s = sc.nextLine();
            if(check1(s) && check2(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
