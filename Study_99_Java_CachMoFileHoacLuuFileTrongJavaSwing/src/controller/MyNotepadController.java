package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFileChooser;

import view.MyNotepadView;

public class MyNotepadController implements ActionListener{
	MyNotepadView myNotepadView;
	
	
	public MyNotepadController(MyNotepadView myNotepadView) {
		this.myNotepadView = myNotepadView;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		JFileChooser fc = new JFileChooser();
		
		if(command.equals("OPEN")) {
			int returnVal = fc.showOpenDialog(this.myNotepadView);

	        if (returnVal == JFileChooser.APPROVE_OPTION) {
	            File file = fc.getSelectedFile();
	            String fileName = file.getName();
	            this.myNotepadView.model.setFileName(file.getAbsolutePath());
	            this.myNotepadView.lblNewLabel.setText(this.myNotepadView.model.getFileName());
	            if(fileName.endsWith(".txt")) {
	            	try {
	                    List<String> allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
	                    String result = "";
	                    for (String line : allText) {
	                        result += line;
	                        result +="\n";
	                    }
	                    this.myNotepadView.model.setContent(result);
	                    this.myNotepadView.textArea.setText(this.myNotepadView.model.getContent());
	                } catch (Exception e1) {
	                    // TODO: handle exception
	                    e1.printStackTrace();
	                }
	            }
	        } 
		}
		else if(command.equals("SAVE")){
			if(this.myNotepadView.model.getFileName().length() > 0) {
				save(this.myNotepadView.model.getFileName());
			}
			else {
				int returnVal = fc.showSaveDialog(this.myNotepadView);

		        if (returnVal == JFileChooser.APPROVE_OPTION) {
		        	File file = fc.getSelectedFile();
		        	save(file.getAbsolutePath());
		        } 
			}
		}
	}
	
	public void save(String fileName) {
		try {
			
			PrintWriter pw = new PrintWriter(fileName, "UTF-8");
			String data = this.myNotepadView.textArea.getText();
			pw.print(data);
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}
