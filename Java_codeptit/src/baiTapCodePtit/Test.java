package baiTapCodePtit;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static String solve (String x){
        String ans = "";
        boolean leadingZero = true;
        for(int i=0; i<x.length(); i++){
            if(x.charAt(i) != '0' && x.charAt(i) != '1' && x.charAt(i) != '8' && x.charAt(i) != '9'){
                return "INVALID";
            }
            else{
                if(x.charAt(i) == '0' || x.charAt(i) == '8' || x.charAt(i) == '9' ){
                    if(!leadingZero){
                        ans+='0';
                    }
                }
                else if(x.charAt(i) == '1'){
                    ans+='1';
                    leadingZero = false;
                }
            }
        }
        if(ans.equals("")){
            return "INVALID";
        }
        else{
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            System.out.println(Test.solve(s));
        }
    }
}
