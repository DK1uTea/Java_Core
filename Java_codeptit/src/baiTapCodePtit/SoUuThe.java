package baiTapCodePtit;

import java.util.Scanner;

public class SoUuThe {
    public static String check(String s){
        if(s.charAt(0) == '0'){
            return "INVALID";
        }
        int even = 0;
        for(int i = 0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                return "INVALID";
            }
            else{
                if(Integer.parseInt(String.valueOf(s.charAt(i))) % 2 == 0){
                    even++;
                }
            }
        }
        if((even > s.length()/2 && (s.length()) % 2 == 0) || (even < s.length()/2 && (s.length()) % 2 != 0 )){
            return "YES";
        }
        else{
            return "NO";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.next());
        while (t-- >0) {
            String s = sc.next();
            System.out.println(check(s));
        }
    }
}
