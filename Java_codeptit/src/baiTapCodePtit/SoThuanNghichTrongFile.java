package baiTapCodePtit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SoThuanNghichTrongFile {
    static boolean check(int n){
        String s = Integer.toString(n);
        if (s.length() == 1 || s.length() % 2 == 0)
            return false;
        for (int i = 0; i <= s.length() / 2; ++i)
        {
            if (s.charAt(i) % 2 == 0)
                return false;
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) ois2.readObject();
        Set<Integer> se1 = new TreeSet<>(a);
        Set<Integer> se2 = new TreeSet<>(b);
        ArrayList<Integer> num = new ArrayList<>();
        for (Integer integer : se1) {
            if(se2.contains(integer) && check(integer)){
                num.add(integer);
            }
            if(num.size() == 10){
                break;
            }
        }
        for (Integer integer : num) {
            System.out.println(integer + " " + (Collections.frequency(a, integer) + Collections.frequency(b, integer)));
        }
    }
}
