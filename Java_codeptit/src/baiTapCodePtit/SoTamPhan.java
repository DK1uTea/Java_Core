package baiTapCodePtit;
import java.util.Scanner;

public class SoTamPhan {
    public static boolean check(String s){
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t= sc.nextInt();
        sc.nextLine();
        while (t-- >0) {
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
