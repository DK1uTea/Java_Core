package vidu;

import java.util.Scanner;

public class Main {
    private static long[] F = new long[100];
    public static void fibonacci (){
        F[0]=0;
        F[1]=1;
        F[2]=1;
        for(int i=3; i<F.length; i++){
            F[i]=F[i-1] + F[i-2];
        }
    }
    public static boolean isFibonacci (long x){
        for(int i=0; i<F.length; i++){
            if(F[i]==x){
                return true;
            }
        }   
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main.fibonacci();
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            if(Main.isFibonacci(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
