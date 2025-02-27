package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MenuExampleView;

public class MenuExampleController implements ActionListener{
	private MenuExampleView menuExampleView;
	
	public MenuExampleController(MenuExampleView menuExampleView) {
		this.menuExampleView = menuExampleView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String button = e.getActionCommand();
		
		if(button.equals("Open")) {
			this.menuExampleView.setTextJLabel("Bạn đã kick JMenuItem Open");
		}
		else if(button.equals("Exit")) {
//			this.menuExampleView.setTextJLabel("Bạn đã kick JMenuItem Exit");
			System.exit(0);
		}
		else if(button.equals("Welcome")) {
			this.menuExampleView.setTextJLabel("Bạn đã kick JMenuItem Welcome");;
		}
		else if (button.equals("New")){
			this.menuExampleView.setTextJLabel("Bạn đã kick JMenuItem New");
		}
	}

}
