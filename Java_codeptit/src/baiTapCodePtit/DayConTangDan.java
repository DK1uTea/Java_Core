package baiTapCodePtit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DayConTangDan {
    static int n;
    static int[] a;
    static ArrayList<String> res = new ArrayList<>();
    static ArrayList<Integer> num = new ArrayList<>();
    
    static void Try (int i){
        if(num.size() > 1){
            String s = "";
            for(int j : num){
                s+= j + " ";
            }
            res.add(s);
        }
        for(int j = i; j < n; j++){
            if(num.isEmpty() || a[j] > num.get(num.size() - 1)){
                num.add(a[j]);
                Try(j+1);
                num.remove(num.size() - 1);
            }
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = Integer.parseInt(sc.nextLine());
        a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        Try(0);
        Collections.sort(res);
        for (String string : res) {
            System.out.println(string);
        }
    }
}
