package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ViDuDocDoiTuong {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Source_code\\Java_Project\\Study_74_Java_CachDocDoiTuongTuTapTin\\File.data");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            SinhVien st = (SinhVien) ois.readObject();
            System.out.println(st);
            ois.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
