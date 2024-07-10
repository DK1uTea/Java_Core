package baiTapCodePtit;
import java.util.Scanner;

public class So_khong_lien_ke {
    public static boolean check1 (String s){
        for (int i = 1; i<s.length(); i++){
            if(Math.abs(s.charAt(i)- s.charAt(i-1)) != 2){
                return false;
            }
        }
        return true;
    }

    public static boolean check2 (String s){
        int sum = 0;
        for(int i = 0; i< s.length(); i++){
            sum+= Character.getNumericValue(s.charAt(i));
        }
        if(sum % 10 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- >0) {
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
