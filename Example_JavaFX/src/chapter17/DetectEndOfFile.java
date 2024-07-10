package chapter17;

import java.io.*;

public class DetectEndOfFile {
    public static void main(String[] args) {
        try {
            // Tạo một DataOutputStream để ghi dữ liệu vào tệp "test.dat"
            try (DataOutputStream output = new DataOutputStream(new FileOutputStream("test.dat"))) {
                output.writeDouble(4.5);
                output.writeDouble(43.25);
                output.writeDouble(3.2);
            }

            // Tạo một DataInputStream để đọc dữ liệu từ tệp "test.dat"
            try (DataInputStream input = new DataInputStream(new FileInputStream("test.dat"))) {
                while (true) {
                    // Đọc và hiển thị giá trị kiểu double từ tệp
                    System.out.println(input.readDouble());
                }
            }
        } catch (EOFException ex) {
            // Bắt ngoại lệ EOFException khi đã đọc hết dữ liệu từ tệp
            System.out.println("All data were read");
        } catch (IOException ex) {
            // Bắt ngoại lệ IOException nếu có lỗi I/O khác
            ex.printStackTrace();
        }
    }
}
