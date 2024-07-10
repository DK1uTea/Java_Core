package baiTapCodePtit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LoaiBoSoNguyen {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s;
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNextLine()) {
            s = sc.next();
            try {
                Integer.parseInt(s);
            } catch (Exception e) {
                a.add(s);
            }
        }
        Collections.sort(a);
        for (String string : a) {
            System.out.print(string + " ");
        }
    }
}
