package baiTapCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LietKeTuKhacNhau {
    public static void main(String[] args) throws IOException{
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
class WordSet {
    private Set<String> se = new TreeSet();

    public WordSet(String s){
        try {
            Scanner sc = new Scanner(new File(s));
            while (sc.hasNext()) {
                se.add(sc.next().toLowerCase());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (String string : se) {
            s+= string + "\n";
        }
        return s;
    }
    
}
