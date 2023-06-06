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
	private String[] farben = {"4", "5", "6","7","8","9"};
	private JComboBox<String> stratAuswahlListe;
	private JComboBox<String> farbenAnzahl;


	
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
	
	JLabel beginnerFrage = new JLabel("<html><u>Beginner auswählen</u></html>", JLabel.LEFT);
	Font f = beginnerFrage.getFont();
	beginnerFrage.setFont(f.deriveFont(f.getStyle() & ~Font.BOLD));
	this.add(beginnerFrage);
	
	
	
	JLabel beginnerLabel = new JLabel("Es hat begonnen: " + "S2", JLabel.LEFT);
	Font f2 = beginnerLabel.getFont();
	beginnerLabel.setFont(f2.deriveFont(f2.getStyle() & ~Font.BOLD));
	beginnerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	
	JPanel beginnerUndStrat = new JPanel();
	JRadioButton s1RadioButton = new JRadioButton("S1");
	JRadioButton s2RadioButton = new JRadioButton("S2");
	beginnerUndStrat.add(beginnerFrage);
	beginnerUndStrat.add(s1RadioButton);
	beginnerUndStrat.add(s2RadioButton);
	
	ButtonGroup bg = new ButtonGroup();
	bg.add(s1RadioButton);
	bg.add(s2RadioButton);
	
	beginnerUndStrat.add(beginnerLabel);

	
	
	
	JLabel strategieLabel = new JLabel("<html><u>Spielstrategie für S2</u></html>", JLabel.LEFT);
	Font f4 = beginnerFrage.getFont();
	strategieLabel.setFont(f4.deriveFont(f4.getStyle() & ~Font.BOLD));
	beginnerUndStrat.add(strategieLabel);
	
	
	JLabel stratFrage = new JLabel("Spielstrategie S2:", JLabel.LEFT);
	Font f1 = stratFrage.getFont();
	stratFrage.setFont(f1.deriveFont(f1.getStyle() & ~Font.BOLD));
	
	
	beginnerUndStrat.add(stratFrage);
	
	int verfolgteStrat = 3;
	stratAuswahlListe = new JComboBox<String>(strat);
	beginnerUndStrat.add(stratAuswahlListe);
	JLabel stratAnzeige = new JLabel("Verfolgte Strategie PC: " + verfolgteStrat, JLabel.CENTER);
	Font f3 = stratFrage.getFont();
	stratAnzeige.setFont(f3.deriveFont(f3.getStyle() & ~Font.BOLD));
	stratAnzeige.setAlignmentX(Component.CENTER_ALIGNMENT);
	beginnerUndStrat.add(stratAnzeige);
	
	

	JPanel farbenPanel = new JPanel();
	JLabel farbEinst = new JLabel("<html><u>Farbeinstellungen</u></html>");
	farbenPanel.add(farbEinst);
	JLabel farbenFrage = new JLabel("Farbenanzahl wählen:");
	farbenPanel.add(farbenFrage);
	farbenFrage.setFont(new Font("Arial",1,10));
	farbenAnzahl = new JComboBox<String>(farben);
	farbenPanel.add(farbenAnzahl);
	
	
	

	beginnerUndStrat.add(farbenPanel);
	
	
	
	this.add(beginnerUndStrat);
	this.add(farbenPanel);
	
	

	

	this.setVisible(true);
		
		
		
		
	}

}
