import java.util.Scanner;


public class Bai_1_2 {
    public static void createArray(int n, char[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mang: ");
        for(int i=0; i<n; i++){
            a[i] = sc.next().charAt(0);
        }
    }
    public static void displayArray(char[] a){
        System.out.println("Mang ki tu la: ");
        for (char c : a) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public static int countLetters(char[] a){
        int count = 0;
        for (char c : a) {
            if(Character.isLetter(c)){
                count++;
            }
        }
        return count;
    }
    public static void displayCount(int count){
        System.out.println("So chu cai la: ");
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n: ");
        int n = sc.nextInt();
        sc.nextLine();
        char[] charArray = new char[n];
        Bai_1_2.createArray(n, charArray);
        Bai_1_2.displayArray(charArray);
        int count = Bai_1_2.countLetters(charArray);
        Bai_1_2.displayCount(count);
    }
}
