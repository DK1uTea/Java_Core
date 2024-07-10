package vidu;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "Xin chao cac ban, tui la Tuan";
        String[] a = s.split(" ");
        System.out.println(Arrays.toString(a));

        String[] b = s.split(",");
        System.out.println(Arrays.toString(b));

        String s2 = "Xin chao, minh la Tuan. Minh la lap trinh vien!";
        String[] c = s2.split("\\.|\\,");
        System.out.println(Arrays.toString(c));

        String s3 = "Do Quang Tuan";
        String[] d = s3.split(" ");
        System.out.println(Arrays.toString(d));
        System.out.println("Ten: " + d[d.length-1]);
    }
}
