package logic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Anzeigetafel extends JPanel{
	
	MyFrame myFrame;
	
	public Anzeigetafel(MyFrame myFrame) {		
		this.myFrame = myFrame;
		
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(this.getWidth()/3*2, this.getHeight()));
		
		
		
		this.setVisible(true);
		
		
	}

}
