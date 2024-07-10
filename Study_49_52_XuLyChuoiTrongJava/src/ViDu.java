public class ViDu {
    public static void main(String[] args) {
        String s1 = "titv.vn";
        String s2 = "TITV.VN";
        String s3 = "titv.vn";

        // Ham equals() => so sanh 2 chuoi giong nhau, co phan biet chu hoa, chu thuong
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3) );

        // Ham equalIgnoreCase () => so sacnh 2 chuoi giong nhau khong phan biet chu hoa, chu thuong
         System.out.println("s1 eualsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
        System.out.println("s1 equalsIgnorCase s3: " + s1.equalsIgnoreCase(s3) );

        // Ham compareTo() => so sanh >, <, =
        String sv1 = "Nguyen Van A";
        String sv2 = "Nguyen Van B";
        String sv3 = "Nguyen Van ";
        String sv4 = "Nguyen Van A";

        System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));
        System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
        System.out.println("sv1 compareTo sv4: " + sv1.compareTo(sv4));

        // Ham compareToIgnoreCase() => Tuong tu compareTo() nhung ko phan biet chu hoa chu thuong

        // Ham regionMatches() => so sanh mot doan
        String r1 = "TITV.vn";
        String r2 = "TV.v";
        boolean check = r1.regionMatches(2, r2, 0, 4);
        System.out.println(check);

        // Ham startsWith() => Ham kiem tra chuoi bat dau bang ....
        String sdt = "0839867525";
        System.out.println(sdt.startsWith("083"));
        System.out.println(sdt.startsWith("081"));

        // Ham endsWith() => Ham kiem tra chuoi ket thuc bang ....
        String tenFile1 = "I love you.JPG";
        String tenFile2 = "Hoc JAV.PDF";

        if (tenFile1.endsWith(".JPG")){
            System.out.println("File 1 la hinh anh!");
        }
        else if (tenFile1.endsWith(".PDF")){
            System.out.println("File 1 la file PDF!");
        }

        if(tenFile2.endsWith(".JPG")){
            System.out.println("File 2 la hinh anh!");
        }
        else if (tenFile2.endsWith(".PDF")){
            System.out.println("File 2 la PDF!");
        }
    }
}
