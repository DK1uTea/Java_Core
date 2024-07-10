import java.util.ArrayList;
import java.util.Scanner;

public class Bai_1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = 0;
        int odd =0, even =0;
        do{
            n = sc.nextInt();
            if(n == 0) break;
            if(n % 2 == 1){
                odd++;
            }
            else{
                even++;
            }
        }while(n != 0);
        System.out.println("odd: " + odd);
        System.out.println("even: " + even);
    }
}
