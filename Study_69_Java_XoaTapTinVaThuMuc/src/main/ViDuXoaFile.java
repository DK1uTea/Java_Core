package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViDuXoaFile {
    public static void xoaFile (File fx){
        if(fx.isFile()){
            // Xoa neu la tap tin
            System.out.println("Da xoa: " + fx.getAbsolutePath());
            fx.delete();
        }
        else if (fx.isDirectory()){
            // Lay cac file con
            File[] mangCon = fx.listFiles();
            for (File file : mangCon) {
                // Xoa cac file con
                xoaFile(file);
            }   
            // Xoa ban than thu muc sau khi da xoa file con 
            System.out.println("Da xoa: " + fx.getAbsolutePath());
            fx.delete();
        }
    }
    public static void main(String[] args) {
        // Su dung class File xoa tap tin hoac thu muc
        File f0 = new File("D:\\Source_code\\Java_Project\\Study_69_Java_XoaTapTinVaThuMuc\\F0");
        File f0_1 = new File("D:\\Source_code\\Java_Project\\Study_69_Java_XoaTapTinVaThuMuc\\F0_1");
        File f_vidu = new File("D:\\Source_code\\Java_Project\\Study_69_Java_XoaTapTinVaThuMuc\\ViDu.txt");

        // f0.deleteOnExit(); //=>  Thu muc chua noi dung ben trong khong xoa dc
        // f0_1.deleteOnExit();  // Xoa duoc vi la thu muc rong
        // f_vidu.deleteOnExit(); // Xoa dc vi la tap tin
        // System.out.println(f_vidu.delete());
        // System.out.println(f0_1.delete());

        // xoaFile(f0);

        // Su dung class Files de xoa tap tin hoac thu muc
        Path p0 = f0.toPath();
        Path p0_1 = f0_1.toPath();
        Path p_vidu = f_vidu.toPath();
        try {
            // Files.deleteIfExists(p0);
            Files.deleteIfExists(p0_1);
            Files.deleteIfExists(p_vidu);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
