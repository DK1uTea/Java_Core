package chapter17;

import java.io.*;

public class Copy {
    /**
     * Main method to copy a file.
     *@param args[0] for source file
     *@param args[1] for target file
     */
    public static void main(String[] args) throws IOException {
        // Kiểm tra việc sử dụng tham số dòng lệnh
        if (args.length != 2) {
            System.out.println("Usage: java Copy sourceFile targetFile");
            System.exit(1);
        }

        // Kiểm tra nếu tệp nguồn tồn tại
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        // Kiểm tra nếu tệp đích đã tồn tại
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target file " + args[1] + " already exists");
            System.exit(3);
        }

        try (
            // Tạo một input stream
            BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));

            // Tạo một output stream
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));
        ) {
            // Đọc một byte từ input và ghi nó vào output
            int byteRead, numberOfBytesCopied = 0;
            while ((byteRead = input.read()) != -1) {
                output.write((byte)byteRead);
                numberOfBytesCopied++;
            }

            // Hiển thị kích thước của tệp
            System.out.println(numberOfBytesCopied + " bytes copied");
        }
    }
}

