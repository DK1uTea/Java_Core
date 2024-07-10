package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ViDu {
    public static void copyAll (File f1, File f2){
        try {
            // Copy ban than no
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(f1.isDirectory()){
            // Copy cac tap tin va thu muc con cu no
            File[] mangCon = f1.listFiles();
            for (File file : mangCon) {
                File file_new = new File(f2.getAbsoluteFile() + "\\" + file.getName());
                copyAll(file, file_new);
            }
        }
    }
    
    public static void main(String[] args) {
        File f0 = new File("D:\\Source_code\\Java_Project\\Study_70_Java_DoiTenDiChuyenVaCopyTapTin\\File_1.txt");
        File f1 = new File("D:\\Source_code\\Java_Project\\Study_70_Java_DoiTenDiChuyenVaCopyTapTin\\File_2.txt");
        File f2 = new File("D:\\Source_code\\Java_Project\\Study_70_Java_DoiTenDiChuyenVaCopyTapTin\\File_2xyz.txt");

        // 1. Thay doi ten tap tin hoac thu muc
        // Su dung File de thay doi ten
        // f0.renameTo(f1);

        // Su dung Files de thay doi ten 
        // try {
        //     Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        // 2. Di chuyen File
        // File f_2new = new File("D:\\Source_code\\Java_Project\\Study_70_Java_DoiTenDiChuyenVaCopyTapTin\\F0\\File_2xyz.txt");
        // try {
        //     Files.move(f2.toPath(), f_2new.toPath(), StandardCopyOption.REPLACE_EXISTING);
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        // File folder_1 = new File("D:\\Source_code\\Java_Project\\Study_70_Java_DoiTenDiChuyenVaCopyTapTin\\F1");
        // File folder_1new = new File("D:\\Source_code\\Java_Project\\Study_70_Java_DoiTenDiChuyenVaCopyTapTin\\F0\\F1");
        // try {
        //     Files.move(folder_1.toPath(), folder_1new.toPath(), StandardCopyOption.REPLACE_EXISTING);
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        // 3. Copy File
        File f_0 = new File("D:\\Source_code\\Java_Project\\Study_70_Java_DoiTenDiChuyenVaCopyTapTin\\F0");
        File f_0_copy = new File("D:\\Source_code\\Java_Project\\Study_70_Java_DoiTenDiChuyenVaCopyTapTin\\F0_copy");
        // try {
        //     Files.copy(f_0.toPath(), f_0_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        ViDu.copyAll(f_0, f_0_copy);
    }
}
