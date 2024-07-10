package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import controller.MenuExampleController;

public class MenuExampleView extends JFrame{
	private JLabel jLabel;

	public MenuExampleView() {
		this.setTitle("Menu Example");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		// Tao controller
		MenuExampleController menuExampleController = new MenuExampleController(this);
		
		// Tao thanh menu
		JMenuBar jMenuBar = new JMenuBar();
		// Tao 1 menu
		JMenu jMenu_file = new JMenu("File");
		// Tao cac menu con
		JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N);
		jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		jMenuItem_new.addActionListener(menuExampleController);
		JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
		jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		jMenuItem_open.addActionListener(menuExampleController);
		JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_X);
		jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK));
		jMenuItem_exit.addActionListener(menuExampleController);
		jMenu_file.add(jMenuItem_new);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_open);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_exit);
		
		// Tao 1 menu
		JMenu jMenu_help = new JMenu("Help");
		jMenu_help.setMnemonic(KeyEvent.VK_L);
		// Tao menu con
		JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
		jMenuItem_welcome.addActionListener(menuExampleController);
		jMenu_help.add(jMenuItem_welcome);
		
		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_help);
		
		// Them thanh menu vao chuong trinh
		this.setJMenuBar(jMenuBar);
		
		// Tao ToolBar (Thanh cong cu)
		JToolBar jToolBar = new JToolBar();
		JButton jButton_Undo = new JButton("Undo");
		jButton_Undo.setToolTipText("Nhấn vào đây để quay lại thao tác vừa rồi!");
		jButton_Undo.addActionListener(menuExampleController);
		JButton jButton_Redo = new JButton("Redo");
		jButton_Redo.setToolTipText("Nhấn vào đây để quay lại thao tác trước đó!");
		jButton_Redo.addActionListener(menuExampleController);
		JButton jButton_Copy = new JButton("Copy");
		jButton_Copy.setToolTipText("Nhấn vào đây để copy!");
		jButton_Copy.addActionListener(menuExampleController);
		JButton jButton_Cut = new JButton("Cut");
		jButton_Cut.setToolTipText("Nhấn vào đây để cut!");
		jButton_Cut.addActionListener(menuExampleController);
		JButton jButton_Paste = new JButton("Paste!");
		jButton_Paste.setToolTipText("Nhấn vào đây để paste!");
		jButton_Paste.addActionListener(menuExampleController);
		jToolBar.add(jButton_Undo);
		jToolBar.add(jButton_Redo);
		jToolBar.add(jButton_Copy);
		jToolBar.add(jButton_Cut);
		jToolBar.add(jButton_Paste);
		
		// Tao label hien thi
		Font font = new Font("Arial", Font.BOLD, 50);
		jLabel = new JLabel();
		
		
		this.setLayout(new BorderLayout());
		this.add(jToolBar, BorderLayout.NORTH);
		this.add(jLabel,BorderLayout.CENTER);
		this.setVisible(true);
	}
	public void setTextJLabel(String s) {
		this.jLabel.setText(s);
	}
}
