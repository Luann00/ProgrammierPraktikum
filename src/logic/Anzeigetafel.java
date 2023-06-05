package logic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;


import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

public class Anzeigetafel extends JPanel{
	
	MyFrame myFrame;

	
	public Anzeigetafel(MyFrame myFrame) {		
		this.myFrame = myFrame;		
		this.setPreferredSize(new Dimension(myFrame.getWidth()/4*3, myFrame.getHeight()));
		this.setBackground(Color.BLACK);
		this.setVisible(true);
		
		
	}

}
