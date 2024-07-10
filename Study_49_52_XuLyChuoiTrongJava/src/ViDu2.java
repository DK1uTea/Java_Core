public class ViDu2 {
    public static void main(String[] args) {
        String s1 = "Xin chao co chu, Xin chao cac ban, xin chao!";
        String s2 = "Xin chao";
        String s3 = "Xin chao 123";
        char c1 = 'o';

        // Ham indexOf()
        System.out.println("Vi tri cua s2 trong s1: " + s1.indexOf(s2));
        System.out.println("Vi tri cua s3 trong s1: " + s1.indexOf(s3));

        // Su dung vi tri bat dau
        System.out.println("Vi tri cua s2 trong s1 tu vi tri 2: " + s1.indexOf(s2, 2));

        // Tim kiem char
        System.out.println("Vi tri cua c1 trong s1: " + s1.indexOf(c1));

        // Ham lastIndexof
        System.out.println("Vi tri cuoi cung cua s2 trong s1: " + s1.lastIndexOf(s2));
        System.out.println("Vi tri cuoi cung cua s3 trong s1: " + s1.lastIndexOf(s3));

        // tenFle = "Bai tap.pdf.lop12.xls";
        String tenFile = "Bai tap.xls.lop12.pdf";
        int index = tenFile.lastIndexOf(".");
        if(tenFile.indexOf("xls", index) > 0){
            System.out.println("File la excel ");
        }
        else if (tenFile.indexOf("pdf", index) > 0){
            System.out.println("File la pdf");
        }
    }
}
