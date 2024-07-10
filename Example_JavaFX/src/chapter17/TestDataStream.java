package chapter17;

import java.io.*;

public class TestDataStream {
    public static void main(String[] args) throws IOException {
        try (
            // Tạo output stream để ghi vào tệp "temp.dat"
            DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
        ) {
            // Ghi điểm kiểm tra của học sinh vào tệp
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeUTF("Jim");
            output.writeDouble(185.5);
            output.writeUTF("George");
            output.writeDouble(105.25);
        }

        try (
            // Tạo input stream để đọc từ tệp "temp.dat"
            DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
        ) {
            // Đọc điểm kiểm tra của học sinh từ tệp và hiển thị ra màn hình
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
        }
    }
}

