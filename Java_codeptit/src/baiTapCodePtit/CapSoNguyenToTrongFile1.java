package baiTapCodePtit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class CapSoNguyenToTrongFile1 {
    static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        if(n < 4){
            return true;
        }
        if(n % 2 == 0 || n % 3 == 0){
            return false;
        }
        int sqr = (int)Math.sqrt(n);
        for(int i = 5; i<=sqr; i+=6){
            if(n % i == 0 || n % (i+2) == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
            ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
            Set<Integer> se1 = new TreeSet<>((ArrayList) ois1.readObject());
            Set<Integer> se2 = new TreeSet<>((ArrayList) ois2.readObject());

            for (Integer integer : se1) {
                if(integer < 1000000 - integer && isPrime(integer) && se2.contains(1000000 - integer) && isPrime(1000000 - integer)){
                    System.out.println(integer + " " + (1000000 - integer));
                }
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
