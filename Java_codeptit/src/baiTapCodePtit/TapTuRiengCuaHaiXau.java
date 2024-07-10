package baiTapCodePtit;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s1 = sc.nextLine().trim();
            String s2 = sc.nextLine().trim();

            List<String> strings1 = Arrays.asList(s1.split("\\s+"));
            List<String> strings2 = Arrays.asList(s2.split("\\s+"));

            Set<String> set = new TreeSet<>();
            for (String string : strings1) {
                if(!strings2.contains(string)){
                    set.add(string);
                }
            }
            for (String string : set) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
