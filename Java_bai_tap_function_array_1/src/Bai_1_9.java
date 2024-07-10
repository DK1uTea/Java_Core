import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bai_1_9 {
    public static void main(String[] args) {
        int n = 200;
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        while(n-- >0){
            Random rd = new Random();
            int x = rd.nextInt(10);
            mp.put(x, mp.getOrDefault(x, 0)+1);           
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }
    }
}
