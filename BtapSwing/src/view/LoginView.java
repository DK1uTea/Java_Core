package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.LoginController;

public class LoginView extends JFrame{
    private JTextField jTextField_userName;

    public LoginView(){
        init();
    }

    private void init() {
        this.setTitle("Login");
        this.setSize(400, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font textFieldFont = new Font("Arial", Font.PLAIN, 16);
        
        JLabel jLabel_userName = new JLabel("Username");
        jLabel_userName.setFont(textFieldFont);
        JLabel jLabel_passWord = new JLabel("Password");
        jLabel_passWord.setFont(textFieldFont);
        jTextField_userName = new JTextField(20);
        jTextField_userName.setFont(textFieldFont);
        JPasswordField jPasswordField_passWord = new JPasswordField(20);
        jPasswordField_passWord.setFont(textFieldFont);

        JPanel jPanel_Login = new JPanel();
        jPanel_Login.setLayout(new GridLayout(2, 2, 5, 2));
        jPanel_Login.add(jLabel_userName);
        jPanel_Login.add(jTextField_userName);
        jPanel_Login.add(jLabel_passWord);
        jPanel_Login.add(jPasswordField_passWord);

        Font buttonFont = new Font("Arial", Font.BOLD, 18);
        
        LoginController loginController = new LoginController(this);
        
        JButton jButton_Login = new JButton("Login");
        jButton_Login.setSize(150, 50);
        jButton_Login.setFont(buttonFont);
        jButton_Login.addActionListener(loginController);

        JPanel jPanel_bottom = new JPanel();
        jPanel_bottom.add(jButton_Login);
        
        this.setLayout(new BorderLayout(10, 10));
        this.add(jPanel_Login, BorderLayout.CENTER);
        this.add(jPanel_bottom, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public String getUsername(){
        return jTextField_userName.getText();
    }
}
