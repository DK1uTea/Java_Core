import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Nhap vao chuoi s: ");
        s = sc.nextLine();
        System.out.println("-----------------");

        // Ham length() => Lay do dai chuoi
        System.out.println("Do dai chuoi s la: " + s.length());
        int doDai = s.length();

        // Ham charAt() => lay ra ky tu tai vi tri'
        for(int i=0; i<doDai; i++){
            System.out.println("Vi tri' " + i + " la: " + s.charAt(i));
        }
        
        // Ham getChars(vi ti bat dau, vi tri ket thuc, mang lu du lieu, vi tri bat dau lu cua mang);
        char[] arrrayChar = new char[100];
        s.getChars(0, 11, arrrayChar, 0);
        for(int i=0; i<arrrayChar.length; i++){
            System.out.println("Gia tri mang tai vi tri: " + i + " la: " + arrrayChar[i]);
        }

        // Ham getBytes() => co 3 cach, lay ra gia tri ascii cua cac ky tu thanh 1 mang
        byte[] arrayBytes = s.getBytes();
        for(byte b : arrayBytes){
            System.out.println(b);
        }
    }
}
