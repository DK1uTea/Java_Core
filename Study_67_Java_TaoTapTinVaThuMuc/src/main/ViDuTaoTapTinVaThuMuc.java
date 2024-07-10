package main;

import java.io.File;
import java.io.IOException;

public class ViDuTaoTapTinVaThuMuc {
    public static void main(String[] args) {
        // Lưu ý:
        // MS WIndows: \ => \\ |Ví dụ: C:\\Folder 1\\Folder 2\\File_Name.xxx
        // Linux, MacOS: /  |Ví dụ: /Folder 1/Folder 2/File_Name.xxx

        // Kiem tra thu muc hoac tap tin co ton tai hay khong?
        File folder1 = new File("D:\\Source_code\\Java_Project\\Study_67_Java_File_Folder");
        File folder2 = new File("D:\\Source_code\\Java_Project\\Study_68_Java_File_Folder");
        System.out.println("Kiem tra folder 1 co ton tai hay khong: " + folder1.exists());
        System.out.println("Kiem tra folder 2 co ton tai hay khong: " + folder2.exists());

        // Tao thu muc
        // Phuong thuc mkdir()
        File fd1 = new File("D:\\Source_code\\Java_Project\\Study_67_Java_File_Folder\\Directory_1");
        fd1.mkdir();

        // Phuong thuc mkdirs() => Tao nhieu thu muc cung mot luc
        File fd2 = new File("D:\\Source_code\\Java_Project\\Study_67_Java_File_Folder\\Directory_1\\Directory_2\\Directory_3");
        fd2.mkdirs();

        // Tao tap tin (co phan mo rong: .exe, .txt, .doc, .xls.....)
        File file1 = new File("D:\\Source_code\\Java_Project\\Study_67_Java_File_Folder\\Directory_1\\Vidu1.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            // Khong co quyen tao tap tin
            // O cung bi day
            // Duong dan sai
            e.printStackTrace();
        }
    }   
}
