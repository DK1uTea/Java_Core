package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

public class MainView extends JFrame{
	private JMenu menu, subMenu;
	private JMenuItem i1, i2, i3, i4, i5;
	private JMenuBar mBar = new JMenuBar();
	private JButton jButton;
	private JLabel jLabel;
	
	public MainView() {
		this.setTitle("TITV");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		// Set Icon => JFrame
		URL urlIconCoding = MainView.class.getResource("icon_coding.png");
		Image img = Toolkit.getDefaultToolkit().createImage(urlIconCoding);
		this.setIconImage(img);
		
		// JMenuBar
		menu = new JMenu("Menu");
		subMenu = new JMenu("Sub Menu");
		i1 = new JMenuItem("New");
		i1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_new.png"))));
		i2 = new JMenuItem("Save");
		i2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_save.png"))));
		i3 = new JMenuItem("Save As");
		i3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_save_as.png"))));
		i4 = new JMenuItem("Exit");
		i4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_exit.png"))));
		i5 = new JMenuItem("Test");
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		subMenu.add(i4);
		subMenu.add(i5);
		menu.add(subMenu);
		mBar.add(menu);
		
		// JLabel
		jLabel = new JLabel();
		jLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("asus.jpg"))));
		
		// JButton
		jButton = new JButton("TEST BUTTON");
		jButton.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_coding.png"))));
		Font font = new Font("Arial", Font.BOLD, 50);
		jButton.setSize(50, 50);
		jButton.setFont(font);
		
		this.setJMenuBar(mBar);
		this.add(jLabel, BorderLayout.CENTER);
		this.add(jButton, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MainView();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
