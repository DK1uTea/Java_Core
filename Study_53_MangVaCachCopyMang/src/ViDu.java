import java.util.Arrays;

public class ViDu {
    public static void main(String[] args) {
        // Kieu du lieu nguyen thuy ?? khi thay doi du lieu thi du lieu ow ca 2 mang thay doi
        int[] mang1 = {1, 2, 3};

        // Copy mang
        int[] mang1_a = mang1;
        mang1_a[0] = 100;
        
        System.out.println("Mang 1: " + Arrays.toString(mang1));
        System.out.println("Mang1_a: " + Arrays.toString(mang1_a));

        // Dung ham clone()
        int[] mang1_b = mang1.clone();
        mang1_b[0] = 50;
        System.out.println("Mang1_b: " + Arrays.toString(mang1_b));

        // Dung ham system.arraycopy()
        int[] mang1_c = new int[mang1.length];
        System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
        mang1_c[0] = 90;
        System.out.println("Mang1_c: " + Arrays.toString(mang1_c));
    }
}
