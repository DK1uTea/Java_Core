package baiTapCodePtit;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        Set<Character> set = new TreeSet<>();
        for(int i = 0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        System.out.println(set.size());
    }
}
