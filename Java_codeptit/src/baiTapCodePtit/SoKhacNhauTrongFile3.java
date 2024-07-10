package baiTapCodePtit;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class SoKhacNhauTrongFile3 {
    public static void main(String[] args) {
        try {
            ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
            ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();
            Map<Integer, Integer> mp = new TreeMap<>();
            for (int integer : a) {
                mp.compute(integer, (key, value) -> (value == null) ? 1 : value + 1);
            }
                
            for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
