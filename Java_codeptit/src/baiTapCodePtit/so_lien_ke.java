package baiTapCodePtit;
import java.util.Scanner;

public class so_lien_ke {
    public static boolean check(String s){
        for(int i = 1; i<s.length(); i++){
            if(Math.abs(s.charAt(i) - s.charAt(i-1)) != 1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            if(check(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
