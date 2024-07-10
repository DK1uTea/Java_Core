package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.MyNotepadController;
import model.MyNotepadModel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyNotepadView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public MyNotepadModel model;
	public JLabel lblNewLabel;
	public JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyNotepadView frame = new MyNotepadView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyNotepadView() {
		this.model = new MyNotepadModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
		
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 50));
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 11, 81, 28);
		panel.add(lblNewLabel);
		
		ActionListener action = new MyNotepadController(this);
		
		JButton btnOpen = new JButton("OPEN");
		btnOpen.addActionListener(action);
		btnOpen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOpen.setBounds(301, 11, 89, 23);
		panel.add(btnOpen);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(action);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSave.setBounds(412, 11, 89, 23);
		panel.add(btnSave);
		
		this.setVisible(true);
	}
}
