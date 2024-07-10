package test;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.QLSVView;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getLookAndFeel());
			new QLSVView();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
