package chapter18;

import java.io.File;
import java.util.Scanner;

public class DirectorySize {
    public static void main(String[] args) {
        // Yêu cầu người dùng nhập một thư mục hoặc một tập tin
        System.out.print("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();

        // Hiển thị kích thước
        System.out.println("Kích thước: " + getSize(new File(directory)) + " bytes");
    }

    public static long getSize(File file) {
        long size = 0; // Lưu trữ kích thước tổng của tất cả các tập tin

        if (file.isDirectory()) {
            File[] files = file.listFiles(); // Danh sách tất cả các tập tin và thư mục con
            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    size += getSize(files[i]); // Gọi đệ quy để tính kích thước
                }
            }
        } else { // Trường hợp cơ bản
            size += file.length();
        }

        return size;
    }
}

