package chapter18;

import java.util.Scanner;

public class ComputeFactorial {
    /** Main method */
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để đọc dữ liệu từ người dùng
        Scanner input = new Scanner(System.in);
        
        // Yêu cầu người dùng nhập một số nguyên không âm
        System.out.print("Enter a nonnegative integer: ");
        int n = input.nextInt();
        
        // Hiển thị giai thừa
        System.out.println("Factorial of " + n + " is " + factorial(n));
        
        // Đóng đối tượng Scanner sau khi sử dụng
        input.close();
    }

    /** Phương thức tính giai thừa cho số đã cho */
    public static long factorial(int n) {
        if (n == 0) {
            // Trường hợp cơ bản: giai thừa của 0 là 1
            return 1;
        } else {
            // Gọi đệ quy để tính giai thừa
            return n * factorial(n - 1);
        }
    }
}

