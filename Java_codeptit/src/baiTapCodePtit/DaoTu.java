package baiTapCodePtit;

import java.util.Scanner;

public class DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] tmp = s.split(" ");
            for (String string : tmp) {
                StringBuffer stringBuffer = new StringBuffer(string);
                string = stringBuffer.reverse().toString();
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
