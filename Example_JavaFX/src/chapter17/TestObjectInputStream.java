package chapter17;

import java.io.*;

public class TestObjectInputStream {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        try (
            // Tạo một input stream để đọc dữ liệu từ tệp "object.dat"
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"));
        ) {
            // Đọc một chuỗi, giá trị kiểu double và một đối tượng từ tệp
            String name = input.readUTF(); // Đọc chuỗi
            double score = input.readDouble(); // Đọc giá trị kiểu double
            java.util.Date date = (java.util.Date) input.readObject(); // Đọc đối tượng java.util.Date

            // Hiển thị dữ liệu đọc được ra màn hình
            System.out.println(name + " " + score + " " + date);
        }
    }
}

