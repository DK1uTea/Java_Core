public class ViDu3 {
    public static void main(String[] args) {
        String s1 = "TITV";
        String s2 = ".vn";
        String s3 = s1 + s2;

        // Ham concat() => noi chuoi
        String s4 = s1.concat(s2);
        System.out.println("s3 la: " + s3);
        System.out.println("s4 la: " + s4);

        // Ham replaceAll() => thay the
        String s5 = "Tuan.vn";
        String s6 = s5.replaceAll("Tuan", "PTIT");
        System.out.println("s6 la: " + s6);

        // Ham toLowerCase (), toUpperCase()
        String s7 = s3.toLowerCase();
        String s8 = s3.toUpperCase();
        System.out.println("s7 la: " + s7);
        System.out.println("s8 la: " + s8);

        // Ham trim() => xoa khonag trang du thua o dau chuoi
        String s9 = "     Xin chao con co vo cua bo'     ";
        System.out.println(s9.trim());
        
        // Ham subString() => cat chuoi con
        String s10 = "Xin chao cac ban, minh la TITV";
        String s11 = s10.substring(10);
        String s12 = s10.substring(10, 15);
        System.out.println("s11 la: " + s11);
        System.out.println("s12 la: " + s12);
    }
}
