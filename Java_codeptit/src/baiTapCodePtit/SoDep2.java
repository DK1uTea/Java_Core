package baiTapCodePtit;
import java.util.Scanner;

public class SoDep2 {
    public static boolean check1(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        String s_new = stringBuilder.reverse().toString();
        if(s.equals(s_new)){
            return true;
        }
        return false;
    }

    public static boolean check2(String s){
        if(s.charAt(0) == '8' && s.charAt(s.length()-1)== '8'){
            return true;
        }
        return false;
       
    }
    public static boolean check3(String s){
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            sum+= Character.getNumericValue(s.charAt(i));
        }
        if(sum % 10 == 0){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String s = sc.nextLine();
            if(check1(s) && check2(s) && check3(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
