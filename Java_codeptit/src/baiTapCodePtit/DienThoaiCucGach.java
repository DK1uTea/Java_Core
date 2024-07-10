package baiTapCodePtit;

import java.util.ArrayList;
import java.util.Scanner;

public class DienThoaiCucGach {
    public static boolean checkThuanNghich(String s){
        int length = s.length();
        for(int i = 0; i<length/2; i++){
            if(s.charAt(i) != s.charAt(length - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tạo ArrayList chính để chứa các nhóm
        ArrayList<ArrayList<Character>> groups = new ArrayList<>();

        // Nhóm 2: ABC
        ArrayList<Character> group2 = new ArrayList<>();
        group2.add('A');
        group2.add('B');
        group2.add('C');
        groups.add(group2);

        // Nhóm 3: DEF
        ArrayList<Character> group3 = new ArrayList<>();
        group3.add('D');
        group3.add('E');
        group3.add('F');
        groups.add(group3);

        // Nhóm 4: GHI
        ArrayList<Character> group4 = new ArrayList<>();
        group4.add('G');
        group4.add('H');
        group4.add('I');
        groups.add(group4);

        // Nhóm 5: JKL
        ArrayList<Character> group5 = new ArrayList<>();
        group5.add('J');
        group5.add('K');
        group5.add('L');
        groups.add(group5);

        // Nhóm 6: MNO
        ArrayList<Character> group6 = new ArrayList<>();
        group6.add('M');
        group6.add('N');
        group6.add('O');
        groups.add(group6);

        // Nhóm 7: PQRS
        ArrayList<Character> group7 = new ArrayList<>();
        group7.add('P');
        group7.add('Q');
        group7.add('R');
        group7.add('S');
        groups.add(group7);

        // Nhóm 8: TUV
        ArrayList<Character> group8 = new ArrayList<>();
        group8.add('T');
        group8.add('U');
        group8.add('V');
        groups.add(group8);

        // Nhóm 9: WXYZ
        ArrayList<Character> group9 = new ArrayList<>();
        group9.add('W');
        group9.add('X');
        group9.add('Y');
        group9.add('Z');
        groups.add(group9);

        int t = Integer.parseInt(sc.next());

        while (t-- >0) {
            String s = sc.next().toUpperCase();
            String ans = "";
            for(int i = 0; i<s.length(); i++){
                for(int j = 0; j<groups.size(); j++){
                    if(groups.get(j).contains(s.charAt(i))){
                        ans+=(j+2);
                        break;
                    }
                }
            }
            if(checkThuanNghich(ans)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}
