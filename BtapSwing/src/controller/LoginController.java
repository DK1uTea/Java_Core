package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.LoginView;

public class LoginController implements ActionListener{
    private LoginView loginView;
    
    public LoginController(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = loginView.getUsername();
        
        // Kiểm tra nếu trường Username không rỗng
        if (!username.isEmpty()) {
            // Hiển thị thông báo chào mừng với nội dung từ trường Username
            JOptionPane.showMessageDialog(loginView, "Welcome, " + username, "Welcome", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Hiển thị thông báo lỗi nếu trường Username rỗng
            JOptionPane.showMessageDialog(loginView, "Please enter a username", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
