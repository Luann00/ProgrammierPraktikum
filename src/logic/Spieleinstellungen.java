package logic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Spieleinstellungen extends JPanel{
	
	MyFrame myFrame;
	String[] strat = { "1", "2", "3"};

	
	public Spieleinstellungen(MyFrame myFrame) {
		
	this.myFrame = myFrame;
		
	this.setPreferredSize(new Dimension(myFrame.getWidth(), myFrame.getHeight()/3*2));
	
	this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	
	JLabel ueberSchrift= new JLabel("<HTML><U>Spiel Einstellungen</U></HTML>", JLabel.CENTER);
	ueberSchrift.setAlignmentX(Component.CENTER_ALIGNMENT);
	JButton playButton = new JButton("Play");
	playButton.setAlignmentX(Component.CENTER_ALIGNMENT);
	this.add(ueberSchrift);
	this.add(playButton);
	
	this.add(new JLabel(" "));
	
	
	JPanel beginner = new JPanel();
	JLabel beginnerFrage = new JLabel("Wer soll beginnen:", JLabel.CENTER);
	beginnerFrage.setAlignmentX(Component.CENTER_ALIGNMENT);
	JRadioButton s1RadioButton = new JRadioButton("S1");
	JRadioButton s2RadioButton = new JRadioButton("S2");
	beginner.add(beginnerFrage);
	beginner.add(s1RadioButton);
	beginner.add(s2RadioButton);
	
	ButtonGroup bg = new ButtonGroup();
	bg.add(s1RadioButton);
	bg.add(s2RadioButton);
	
	

	
	
	this.add(beginner);

			

	
	
	
	
	
	
	
//	JPanel ueberSchrift = new JPanel();
//	ueberSchrift.setLayout(new BoxLayout(ueberSchrift, BoxLayout.Y_AXIS));
//	JLabel ueberSchrift1 = new JLabel("<HTML><U>Spiel Einstellungen</U></HTML>");
//	ueberSchrift1.setFont(new Font("Arial",1,13));
//	ueberSchrift.add(ueberSchrift1);	
//	JButton play = new JButton("Play");
//	ueberSchrift.add(play);
//	this.add(ueberSchrift, BorderLayout.NORTH);

	

	
	
	
	
//	JPanel beginnerWaehlen = new JPanel();
//	JLabel frageBeginner = new JLabel("Wer soll beginnen?");
//    frageBeginner.setFont(new Font("Arial",1,10));
//	beginnerWaehlen.add(frageBeginner);;
//	JRadioButton s1 = new JRadioButton("S1");
//	JRadioButton s2 = new JRadioButton("S2");
//	beginnerWaehlen.add(s1);
//	beginnerWaehlen.add(s2);
//	beginnerWaehlen.add(new JLabel("Es hat begonnen: S2"));
//	this.add(beginnerWaehlen);
//	
//	JPanel stratWaehlen = new JPanel();
//	JLabel frageStrat = new JLabel("Spielstrategie für S2 waehlen: ");
//	frageStrat.setFont(new Font("Arial",1,10));
//	stratWaehlen.add(frageStrat);
//	
//	
//	JComboBox<String>zeilenAuswahl = new JComboBox<String>(strat);
//	stratWaehlen.add(zeilenAuswahl);
//	
//	this.add(stratWaehlen);
//
//	
	this.setBorder(BorderFactory.createLineBorder(Color.black));
//

	this.setVisible(true);
		
		
		
		
	}

}
