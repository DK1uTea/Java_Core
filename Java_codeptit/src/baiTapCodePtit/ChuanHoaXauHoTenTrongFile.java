package baiTapCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));

            while (sc.hasNextLine()) {
                String s = sc.nextLine().trim().toLowerCase();
                if(s.equals("end")){
                    break;
                }
                String[] words = s.split("\\s+");
                for (String string : words) {
                    System.out.print(String.valueOf(string.charAt(0)).toUpperCase() + string.substring(1) + " ");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
