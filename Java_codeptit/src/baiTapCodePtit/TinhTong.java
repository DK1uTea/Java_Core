package baiTapCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            long sum = 0;
            String s;
            while (sc.hasNext()) {
                s = sc.next();
                try {
                    sum+= Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
