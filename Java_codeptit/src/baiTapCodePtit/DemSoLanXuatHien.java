package baiTapCodePtit;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test = 1;
        while (t-- >0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            Map<Integer, Integer> mp = new LinkedHashMap<Integer, Integer>();
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
                if(mp.containsKey(arr[i])){
                    mp.put(arr[i], mp.get(arr[i]) + 1);
                }
                else{
                    mp.put(arr[i], 1);
                }
            }
            System.out.println("Test " + test + ": ");
            for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
                int element = entry.getKey();
                int count = entry.getValue();
                System.out.println(element + " xuat hien " + count + " lan ");
            }
            test++;
        }
    }
}
