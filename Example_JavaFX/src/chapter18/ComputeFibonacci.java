package chapter18;

import java.util.Scanner;

public class ComputeFibonacci {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter an index to find a Fibonacci number
        System.out.print("Nhập một chỉ mục để tìm số Fibonacci: ");
        int index = input.nextInt();
        
        // Find and display the Fibonacci number
        System.out.println("Số Fibonacci tại chỉ mục " + index + " là " + fib(index));
        
        // Close the Scanner object after use
        input.close();
    }

    /** The method for finding the Fibonacci number */
    public static long fib(long index) {
        if (index == 0) {
            // Base case: Fibonacci number at index 0 is 0
            return 0;
        } else if (index == 1) {
            // Base case: Fibonacci number at index 1 is 1
            return 1;
        } else {
            // Reduction and recursive calls
            return fib(index - 1) + fib(index - 2);
        }
    }
}

