package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MyColorListener;
import model.MyColorModel;

public class MyColorView extends JFrame{
    private MyColorModel myColorModel;
    private JLabel jLabel;
    public MyColorView(){
        this.myColorModel = new MyColorModel();
        this.init();
    }

    private void init() {
        this.setTitle("My Color");
        this.setSize(1200, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font fontText = new Font("Arial", Font.BOLD, 100);
        jLabel = new JLabel("TEXT,...........");
        jLabel.setFont(fontText);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2, 3));

        Font font = new Font("Arial", Font.BOLD, 40);

        MyColorListener myColorListener = new MyColorListener(this);


        JButton jButton_text_red = new JButton("Red Text");
        jButton_text_red.setFont(font);
        jButton_text_red.setForeground(Color.RED);
        jButton_text_red.addActionListener(myColorListener);

        JButton jButton_text_yellow = new JButton("Yellow Text");
        jButton_text_yellow.setFont(font);
        jButton_text_yellow.setForeground(Color.YELLOW);
        jButton_text_yellow.addActionListener(myColorListener);

        JButton jButton_text_green = new JButton("Green Text");
        jButton_text_green.setFont(font);
        jButton_text_green.setForeground(Color.GREEN);
        jButton_text_green.addActionListener(myColorListener);

        JButton jButton_background_red = new JButton("Red Background");
        jButton_background_red.setFont(font);
        jButton_background_red.setBackground(Color.RED);
        jButton_background_red.setOpaque(true);
        jButton_background_red.addActionListener(myColorListener);

        JButton jButton_background_yellow = new JButton("Yellow Background");
        jButton_background_yellow.setFont(font);
        jButton_background_yellow.setBackground(Color.YELLOW);
        jButton_background_yellow.setOpaque(true);
        jButton_background_yellow.addActionListener(myColorListener);

        JButton jButton_background_green = new JButton("Green Background");
        jButton_background_green.setFont(font);
        jButton_background_green.setBackground(Color.GREEN);
        jButton_background_green.setOpaque(true);
        jButton_background_green.addActionListener(myColorListener);

        jPanel.add(jButton_text_red);
        jPanel.add(jButton_text_yellow);
        jPanel.add(jButton_text_green);
        jPanel.add(jButton_background_red);
        jPanel.add(jButton_background_yellow);
        jPanel.add(jButton_background_green);

        this.setLayout(new BorderLayout());
        this.add(jLabel, BorderLayout.NORTH);
        this.add(jPanel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public void changeTextColor(Color color) {
        this.jLabel.setForeground(color);
    }

    public void changeBackGroundColor(Color color){
        this.jLabel.setBackground(color);
        this.jLabel.setOpaque(true);
    }
}
