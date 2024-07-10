import javax.swing.JFrame;

public class ViDu {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        // Gan ten
        jf.setTitle("Vi Du JFrame");
        // Gan kich co
        jf.setSize(600, 400);
        
        // while (true) {
        //     System.out.println("Chương trình đang chạy");
        // }
        // Gan vi tri hien thi
        jf.setLocation(300, 300);

        // Thoat ra khoi chuong trinh khi dong cua so JFrame
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Cho phep hien thi
        jf.setVisible(true);
    }
}
