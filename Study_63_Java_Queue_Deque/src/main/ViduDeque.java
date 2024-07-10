package main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ViduDeque {
    public static void main(String[] args) {
        Deque<String> danhsachSV = new ArrayDeque<String>();

        danhsachSV.offer("TITV 1");
        danhsachSV.offer("Nguyen Van A");
        danhsachSV.offer("Nguyen van B");
        danhsachSV.offer("TITV 2");
        danhsachSV.offerLast("TITV 4");
        danhsachSV.offerFirst("TITV 0");

        while(true){
            String name = danhsachSV.poll();
            if(name == null){
                break;
            }
            System.out.println(name);
        }
    }
}
