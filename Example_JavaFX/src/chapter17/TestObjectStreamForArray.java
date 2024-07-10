package chapter17;

import java.io.*;

public class TestObjectStreamForArray {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] strings = {"John", "Susan", "Kim"};

        try (
            // Tạo một output stream để ghi dữ liệu vào tệp "array.dat"
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("array.dat", true));
        ) {
            // Ghi mảng vào output stream
            output.writeObject(numbers); // Ghi mảng số nguyên
            output.writeObject(strings); // Ghi mảng chuỗi
        }

        try (
            // Tạo một input stream để đọc dữ liệu từ tệp "array.dat"
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("array.dat"));
        ) {
            int[] newNumbers = (int[]) (input.readObject()); // Đọc mảng số nguyên
            String[] newStrings = (String[]) (input.readObject()); // Đọc mảng chuỗi

            // Hiển thị mảng số nguyên
            for (int i = 0; i < newNumbers.length; i++)
                System.out.print(newNumbers[i] + " ");
            System.out.println();

            // Hiển thị mảng chuỗi
            for (int i = 0; i < newStrings.length; i++)
                System.out.print(newStrings[i] + " ");
        }
    }
}

