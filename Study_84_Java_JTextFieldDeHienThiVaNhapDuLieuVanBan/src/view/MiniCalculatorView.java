package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.MiniCalculatorListener;
import model.MiniCalculatorModel;

public class MiniCalculatorView extends JFrame{
    private MiniCalculatorModel miniCalculatorModel;
    private JTextField jTextField_firstValue;
    private JTextField jTextField_secondValue;
    private JTextField jTextField_answer;
    
    public MiniCalculatorView() {
        miniCalculatorModel = new MiniCalculatorModel();
        this.init();
    }

    private void init() {
        this.setTitle("Mini Calculator");
        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 40);

        JLabel jLabel_firstValue = new JLabel("1st Value");
        jLabel_firstValue.setFont(font);
        JLabel jLabel_secondValue = new JLabel("2nd Value");
        jLabel_secondValue.setFont(font);
        JLabel jLabel_answer = new JLabel("Answer");
        jLabel_answer.setFont(font);

        jTextField_firstValue = new JTextField(50);
        jTextField_firstValue.setFont(font);
        jTextField_secondValue = new JTextField(50);
        jTextField_secondValue.setFont(font);
        jTextField_answer = new JTextField(50);
        jTextField_answer.setFont(font);

        JPanel jPanelIO = new JPanel();
        jPanelIO.setLayout(new GridLayout(3, 2, 10, 10));
        jPanelIO.add(jLabel_firstValue);
        jPanelIO.add(jTextField_firstValue);
        jPanelIO.add(jLabel_secondValue);
        jPanelIO.add(jTextField_secondValue);
        jPanelIO.add(jLabel_answer);
        jPanelIO.add(jTextField_answer);

        
        MiniCalculatorListener miniCalculatorListener = new MiniCalculatorListener(this);
        JButton jButton_plus = new JButton("+");
        jButton_plus.setFont(font);
        jButton_plus.addActionListener(miniCalculatorListener);
        JButton jButton_minus = new JButton("-");
        jButton_minus.setFont(font);
        jButton_minus.addActionListener(miniCalculatorListener);
        JButton jButton_multiply = new JButton("*");
        jButton_multiply.setFont(font);
        jButton_multiply.addActionListener(miniCalculatorListener);
        JButton jButton_divide = new JButton("/");
        jButton_divide.setFont(font);
        jButton_divide.addActionListener(miniCalculatorListener);
        JButton jButton_pow = new JButton("^");
        jButton_pow.setFont(font);
        jButton_pow.addActionListener(miniCalculatorListener);
        JButton jButton_mod = new JButton("%");
        jButton_mod.setFont(font);
        jButton_mod.addActionListener(miniCalculatorListener);

        JPanel jPanel_Buttons = new JPanel();
        jPanel_Buttons.setLayout(new GridLayout(2, 3));
        jPanel_Buttons.add(jButton_plus);
        jPanel_Buttons.add(jButton_minus);
        jPanel_Buttons.add(jButton_multiply);
        jPanel_Buttons.add(jButton_divide);
        jPanel_Buttons.add(jButton_pow);
        jPanel_Buttons.add(jButton_mod);
        
        
        this.setLayout(new BorderLayout(10, 10));
        this.add(jPanelIO, BorderLayout.CENTER);
        this.add(jPanel_Buttons, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public void plus(){
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.plus();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void minus(){
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.minus();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void multiply(){
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.multiply();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void divide(){
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.divide();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void power(){
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.power();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void mod(){
       double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.mod();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }
    
}
