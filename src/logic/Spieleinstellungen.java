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
	
	private MyFrame myFrame;
	private String[] strat = { "1", "2", "3"};
	private JComboBox<String> stratAuswahlListe;

	
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
	
	
	JLabel beginnerFrage = new JLabel("Wer soll beginnen?", JLabel.LEFT);
	Font f = beginnerFrage.getFont();
	beginnerFrage.setFont(f.deriveFont(f.getStyle() & ~Font.BOLD));
	this.add(beginnerFrage);
	
	
	
	JPanel beginnerUndStrat = new JPanel();
	JRadioButton s1RadioButton = new JRadioButton("S1");
	JRadioButton s2RadioButton = new JRadioButton("S2");
	beginnerUndStrat.add(beginnerFrage);
	beginnerUndStrat.add(s1RadioButton);
	beginnerUndStrat.add(s2RadioButton);
	
	ButtonGroup bg = new ButtonGroup();
	bg.add(s1RadioButton);
	bg.add(s2RadioButton);
	
	
	JLabel stratFrage = new JLabel("Spielstrategie S2:", JLabel.LEFT);
	Font f1 = stratFrage.getFont();
	stratFrage.setFont(f1.deriveFont(f1.getStyle() & ~Font.BOLD));
	
	beginnerUndStrat.add(stratFrage);
	
	stratAuswahlListe = new JComboBox<String>(strat);
	beginnerUndStrat.add(stratAuswahlListe);
	JLabel stratAnzeige = new JLabel("Das Brett hat aktuell 10 Zeilen und 10 Spalten");
	Font f2 = stratFrage.getFont();
	stratAnzeige.setFont(f1.deriveFont(f2.getStyle() & ~Font.BOLD));
	

	
	
	this.add(beginnerUndStrat);
	
	this.add(Box.createVerticalGlue());
	this.add(stratAnzeige);

	
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
