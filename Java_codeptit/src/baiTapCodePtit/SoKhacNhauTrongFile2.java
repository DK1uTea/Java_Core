package baiTapCodePtit;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SoKhacNhauTrongFile2 {
    public static void main(String[] args) {
        try {
            DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));

            Map<Integer, Integer> mp = new TreeMap<>();

            while (true) {
                try {
                    int a = sc.readInt();
                    // if(mp.containsKey(a)){
                    //     mp.replace(a, mp.get(a)+1);
                    // }
                    // else{
                    //     mp.put(a, 1);
                    // }
                    mp.compute(a, (key, value) -> (value == null) ? 1 : value + 1);
                } catch (IOException e) {
                   break;
                }
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
