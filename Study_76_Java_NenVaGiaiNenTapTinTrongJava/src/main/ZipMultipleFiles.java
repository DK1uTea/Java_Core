package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipMultipleFiles {
    public static void main(String[] args) throws IOException{
        List<String> scrFiles = Arrays.asList("D:\\Source_code\\Java_Project\\Study_76_Java_NenVaGiaiNenTapTinTrongJava\\test1.txt", 
        "D:\\Source_code\\Java_Project\\Study_76_Java_NenVaGiaiNenTapTinTrongJava\\test2.txt");
        FileOutputStream fos = new FileOutputStream("D:\\Source_code\\Java_Project\\Study_76_Java_NenVaGiaiNenTapTinTrongJava\\multiCompressed.zip");
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        for (String srcFile : scrFiles) {
            File fileToZip = new File(srcFile);
            FileInputStream fis = new FileInputStream(fileToZip);
            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
            zipOut.putNextEntry(zipEntry);

            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >=0) {
                zipOut.write(bytes, 0, length);
            }
            fis.close();
        }
        zipOut.close();
        fos.close();
    }
}
