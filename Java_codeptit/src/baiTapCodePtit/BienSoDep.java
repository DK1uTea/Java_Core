package baiTapCodePtit;

import java.util.Scanner;

public class BienSoDep {
    public static boolean check1 (String s){
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i) <= s.charAt(i-1)){
                return false;
            }
        }
        return true;
    }

    public static boolean check2 (String s){
        char c = s.charAt(0);
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != c){
                return false;
            }
        }
        return true;
    }

    public static boolean check3 (String s){
        if(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4)){
            return true;
        }
        return false;
    }

    public static boolean check4 (String s){
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)!= '6' && s.charAt(i)!='8'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        while (t-- >0) {
            String s = sc.nextLine().trim().substring(5);
            s = s.substring(0, 3) + s.substring(4);
            if(check1(s) || check2(s) || check3(s) || check4(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
