import java.util.Scanner;

public class Bai_1_1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name, age and salary:");
        // String input for name
        String name = myObj.nextLine();
        // Numerical input for age (int) and salary double
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();
        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
