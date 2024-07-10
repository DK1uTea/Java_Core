import java.io.PrintWriter;

public class ViDuGhiText {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("D:\\Source_code\\Java_Project\\Study_71_Java_GhiDuLieuDangTextVaoTepTin\\file.txt", "UTF-8");
            pw.println("Xin chao, minh la Tuan");
            pw.print("Du lieu: ");
            pw.print(3.14);
            pw.print(' ');
            pw.print(" la so PI");
            pw.println();
            Student st = new Student("B21DCVT443", "Do Quang Tuan");
            pw.println(st);
            pw.println();
            pw.flush();
            pw.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
