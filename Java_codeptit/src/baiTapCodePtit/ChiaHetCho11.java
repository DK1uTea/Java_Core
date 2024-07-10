package baiTapCodePtit;


import java.util.Scanner;

public class ChiaHetCho11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while (t-- >0) {
            String s = sc.next();
            long evenSum = 0;
            long oddSum = 0;
            for(int i = 0; i<s.length(); i++){
                if( i % 2 == 0){
                    oddSum+= Character.getNumericValue(s.charAt(i));
                }
                else{
                    evenSum+= Character.getNumericValue(s.charAt(i));
                }
            }
            if((oddSum - evenSum) % 11 ==0){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
