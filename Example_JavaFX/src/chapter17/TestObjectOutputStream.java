package chapter17;

import java.io.*;

public class TestObjectOutputStream {
    public static void main(String[] args) throws IOException {
        try (
            // Tạo một output stream để ghi dữ liệu vào tệp "object.dat"
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));
        ) {
            // Ghi dữ liệu vào tệp
            output.writeUTF("John"); // Ghi một chuỗi "John"
            output.writeDouble(85.5); // Ghi một giá trị kiểu double (85.5)
            output.writeObject(new java.util.Date()); // Ghi một đối tượng java.util.Date
        }
    }
}

