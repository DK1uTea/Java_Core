package baiTapCodePtit;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

public class DocFileVanBan {
    public static void main(String[] args) {
        File file = new File("DATA.in");
        try {
            List<String> allText = Files.readAllLines(file.toPath());
            for (String string : allText) {
                System.out.println(string);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
