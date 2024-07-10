package chapter18;

import java.util.Scanner;

public class ComputeFactorialTailRecursion {
    /** Calculate the factorial of a specified number */
    public static long factorial(int n) {
        return factorial(n, 1); // Call the auxiliary method
    }

    /** Auxiliary tail-recursive method for factorial */
    private static long factorial(int n, int result) {
        if (n == 0)
            return result;
        else
            return factorial(n - 1, n * result); // Make a recursive call
    }
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a number: ");
    	int n = sc.nextInt();
    	System.out.print(factorial(n));
    }
}
