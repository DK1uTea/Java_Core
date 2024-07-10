package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_GridLayout extends JFrame {
    public ViDu_GridLayout(){
        this.setTitle("ViDu_GridLayout");
        this.setSize(600, 400);
        // Can giua cua so chuong trinh
        this.setLocationRelativeTo(null);
        this.setVisible(true);

         // Set Layout
        GridLayout gridLayout = new GridLayout();
        GridLayout gridLayout_2 = new GridLayout(4, 4);
        GridLayout gridLayout_3 = new GridLayout(4, 4, 25, 25);
        // this.setLayout(gridLayout);
        // this.setLayout(gridLayout_1);
        this.setLayout(gridLayout_3);


        for (int i = 0; i<16; i++){
            JButton jButton = new JButton(i+"");
            this.add(jButton);
        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ViDu_GridLayout();
    }
}
