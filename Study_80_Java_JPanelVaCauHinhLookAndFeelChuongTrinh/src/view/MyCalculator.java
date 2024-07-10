package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

public class MyCalculator extends JFrame{
    public MyCalculator (){
        this.setTitle("My Calculator");

        this.setSize(300, 300);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField jTextField = new JTextField(50);
        JPanel jPanel_head = new JPanel();
        jPanel_head.setLayout(new BorderLayout());
        jPanel_head.add(jTextField, BorderLayout.CENTER);


        JButton jbButton_0 = new JButton("0");
        JButton jbButton_1 = new JButton("1");
        JButton jbButton_2 = new JButton("2");
        JButton jbButton_3 = new JButton("3");
        JButton jbButton_4 = new JButton("4");
        JButton jbButton_5 = new JButton("5");
        JButton jbButton_6 = new JButton("6");
        JButton jbButton_7 = new JButton("7");
        JButton jbButton_8 = new JButton("8");
        JButton jbButton_9 = new JButton("9");
        JButton jbButton_cong = new JButton("+");
        JButton jbButton_tru = new JButton("-");
        JButton jbButton_nhan = new JButton("*");
        JButton jbButton_chia = new JButton("/");
        JButton jbButton_bang = new JButton("=");

        JPanel jPanel_buttons = new JPanel();
        jPanel_buttons.setLayout(new GridLayout(5, 3));
        jPanel_buttons.add(jbButton_0);
        jPanel_buttons.add(jbButton_1);
        jPanel_buttons.add(jbButton_2);
        jPanel_buttons.add(jbButton_3);
        jPanel_buttons.add(jbButton_4);
        jPanel_buttons.add(jbButton_5);
        jPanel_buttons.add(jbButton_6);
        jPanel_buttons.add(jbButton_7);
        jPanel_buttons.add(jbButton_8);
        jPanel_buttons.add(jbButton_9);
        jPanel_buttons.add(jbButton_cong);
        jPanel_buttons.add(jbButton_tru);
        jPanel_buttons.add(jbButton_nhan);
        jPanel_buttons.add(jbButton_chia);
        jPanel_buttons.add(jbButton_bang);


        this.setLayout(new BorderLayout());
        this.add(jPanel_head, BorderLayout.NORTH);
        this.add(jPanel_buttons, BorderLayout.CENTER);

        
        this.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            // UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MyCalculator();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
