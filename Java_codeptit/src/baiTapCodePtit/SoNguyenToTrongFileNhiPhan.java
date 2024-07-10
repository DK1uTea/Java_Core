package baiTapCodePtit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SoNguyenToTrongFileNhiPhan {
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
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
            ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
            Set<Integer> se = new TreeSet<>();
            int[] f = new int[1000005];
            for (Integer integer : a) {
                if(isPrime(integer)){
                    if(f[integer] == 0){
                        se.add(integer);
                    }
                    f[integer]++;
                }
            }
            for (int i : se) {
                System.out.println(i + " " + f[i]);
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
