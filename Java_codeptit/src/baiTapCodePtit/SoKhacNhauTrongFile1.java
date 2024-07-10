package baiTapCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SoKhacNhauTrongFile1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));

            Map<Integer, Integer> mp = new TreeMap<>();

            while (sc.hasNext()) {
                int a = Integer.parseInt(sc.next());
                if(mp.containsKey(a)){
                    mp.replace(a, mp.get(a)+1);
                }
                else{
                    mp.put(a, 1);
                }
                //mp.compute(a, (key, value) -> (value == null) ? 1 : value + 1);
            }
            for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
