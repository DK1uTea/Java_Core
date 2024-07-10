import java.util.Arrays;
import java.util.Scanner;

public class Bai_1_8 {
    public static void SieveOfEratosthenes(int n){
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println("All the prime numbers up to " + n + ": ");
        for(int i = 2; i<=n; i++){
            if(isPrime[i]){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Bai_1_8.SieveOfEratosthenes(n);
    }
}
