package viDu;


import java.util.Arrays;

public class Test {
    public static int[] reverse (int[] x){
        int[] rs = new int[x.length];
        int idx = 0;
        for(int i = x.length - 1; i>=0; i--){
            rs[idx] = x[i];
            idx++; 
        }
        return rs;
    }
    public static void main(String[] args) {
        int[] a = new int[] {1, 8, 2, 6, 4, 3, 7, 9};
        int[] b = new int[15];

        System.out.println("a: " + Arrays.toString(a));

        // Ham sap xep
        Arrays.sort(a);
        System.out.println("mang a sau khi sap xep: " + Arrays.toString(a));

        // Ham tim kiem
        System.out.println(Arrays.binarySearch(a, 4));
        System.out.println(Arrays.binarySearch(a, -1));

        // Ham dien gia tri
        Arrays.fill(b, 5);
        System.out.println("mang b: " + Arrays.toString(b));

        // Ham sap xep giam dan
        Arrays.sort(a);
        a = Test.reverse(a);
        System.out.println("a sau khi sap xep: " + Arrays.toString(a));
    }
}
