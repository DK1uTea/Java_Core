package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.TimKiemListener;
import model.TimKiemModel;

public class TimKiemView extends JFrame{
    private TimKiemModel timKiemModel;
    private JTextField jTextField_tuKhoa;
    private JLabel jLabel_ketQua;
    private JTextArea jTextArea_vanBan;

    public TimKiemView() {
        this.timKiemModel = new TimKiemModel();
        init();
    }

    private void init() {
        this.setTitle("Tìm kiếm");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 40);

        // Center
        JLabel jLabel_vanBan = new JLabel("Văn bản");
        jLabel_vanBan.setFont(font);
        jTextArea_vanBan = new JTextArea(100, 100);
        jTextArea_vanBan.setFont(font);

        
        
        // Footer
        TimKiemListener tKiemListener = new TimKiemListener(this);

        JLabel jLabel_tuKhoa = new JLabel("Từ khóa");
        jLabel_tuKhoa.setFont(font);
        jTextField_tuKhoa = new JTextField();
        jTextField_tuKhoa.setFont(font);

        JButton jButton_thongKe = new JButton("Thống kê");
        jButton_thongKe.setFont(font);
        jButton_thongKe.addActionListener(tKiemListener);
        jButton_thongKe.setBackground(Color.BLUE);

        jLabel_ketQua = new JLabel();
        jLabel_ketQua.setBackground(Color.YELLOW);
        jLabel_ketQua.setFont(font);
        jLabel_ketQua.setOpaque(true);

        JPanel jPanel_footer = new JPanel();
        jPanel_footer.setLayout(new GridLayout(2, 2, 20, 20));
        jPanel_footer.add(jLabel_tuKhoa);
        jPanel_footer.add(jTextField_tuKhoa);
        jPanel_footer.add(jButton_thongKe);
        jPanel_footer.add(jLabel_ketQua);

        this.setLayout(new BorderLayout());
        this.add(jLabel_vanBan, BorderLayout.NORTH);
        this.add(jTextArea_vanBan, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);
        this.setVisible(true);
    }
    
    public void timKiem (){
        this.timKiemModel.setVanBan(jTextArea_vanBan.getText());
        this.timKiemModel.setTuKhoa(jTextField_tuKhoa.getText());
        this.timKiemModel.timKiem();
        this.jLabel_ketQua.setText(this.timKiemModel.getKetQua());
    }
}
