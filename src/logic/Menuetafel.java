package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Menuetafel extends JPanel{
	
	private MyFrame myFrame;
	private JButton startButton;
	private JComboBox<String> zeilenAuswahl;
	private JComboBox<String> spaltenAuswahl;
	private int farbenImSpiel;
	private String[] zeilenAnzahl = { "3", "4", "5", "6", "7", "8", "9", "10" };
	private String[] spaltenAnzahl = { "3", "4", "5", "6", "7", "8", "9", "10" };



	
	public Menuetafel(MyFrame myFrame) {
		
		this.myFrame = myFrame;
		
		//Layout der Menuetafel				
		this.setPreferredSize(new Dimension(myFrame.getWidth()/4, myFrame.getHeight()));
		
		this.setLayout(new GridLayout(2,1));

		
		startButton = new JButton("Start");
		startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		startButton.setFocusPainted(false);
		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		
		
		
		/*
		 * Menuetafel in 2 Teile teilen: Oberer Teil fuer die Konfiguration. Dort zuerst
		 * Titel hinzufuegen mit dem Button
		 */
		
		JPanel konfiguration = new JPanel();
		konfiguration.setPreferredSize(new Dimension(myFrame.getWidth(), myFrame.getHeight()/4));
		
		
		
		/*
		 * Flow Layout fuer Konfiguration, um alle Auswahlmoeglichkeiten direkt 
		 * nebeneinander anzeigen zu lassen
		 */
		
		konfiguration.setLayout(new BoxLayout(konfiguration, BoxLayout.Y_AXIS));
		JLabel ueberSchrift1 = new JLabel("<HTML><U>Spielbrett Einstellungen</U></HTML>", JLabel.CENTER);
		ueberSchrift1.setAlignmentX(Component.CENTER_ALIGNMENT);

		ueberSchrift1.setFont(new Font("Arial",1,12));

		konfiguration.add(ueberSchrift1);
		
		

		konfiguration.add(startButton);
		
		
		
		
		//Panel, wo man die Zeile auswaehlt

		JPanel zeilenAuswaehlen = new JPanel();
		JLabel zeilenanzahlAuswaehlen = new JLabel("Zeilenanzahl: ", JLabel.LEFT);
		Font f = zeilenanzahlAuswaehlen.getFont();
		zeilenanzahlAuswaehlen.setFont(f.deriveFont(f.getStyle() & ~Font.BOLD));
		zeilenAuswaehlen.add(zeilenanzahlAuswaehlen);
		zeilenAuswahl = new JComboBox<String>(zeilenAnzahl);
		zeilenAuswaehlen.add(zeilenAuswahl);
		
		
		
		//Panel, wo man die Spalte auswaehlt
		JPanel spalteAuswaehlen = new JPanel();
		JLabel spaltenanzahlAuswaehlen = new JLabel("Spaltenanzahl: ");
		Font g = zeilenanzahlAuswaehlen.getFont();
		spaltenanzahlAuswaehlen.setFont(g.deriveFont(g.getStyle() & ~Font.BOLD));
		spalteAuswaehlen.add(spaltenanzahlAuswaehlen);
		spaltenAuswahl = new JComboBox<String>(spaltenAnzahl);
		spalteAuswaehlen.add(spaltenAuswahl);
		

		
		//Panel, wo man die Zeile angezeigt wird
		JLabel zeilenUndSpaltenAnzeige = new JLabel("<html>Das Brett hat aktuell 10 Zeilen und 10 Spalten</html>", JLabel.CENTER);
		zeilenUndSpaltenAnzeige.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		
	


		
		konfiguration.add(zeilenAuswaehlen);
		konfiguration.add(spalteAuswaehlen);

		konfiguration.add(zeilenUndSpaltenAnzeige);


		konfiguration.setBorder(BorderFactory.createLineBorder(Color.black));


		




		
		

		
		
		

		
		this.add(konfiguration, BorderLayout.NORTH);
		
		
		
		
		
		
		
		
		this.setVisible(true);
		
	}
	
	
	


	public MyFrame getMyFrame() {
		return myFrame;
	}







	public void setMyFrame(MyFrame myFrame) {
		this.myFrame = myFrame;
	}







	public JButton getStartButton() {
		return startButton;
	}







	public void setStartButton(JButton startButton) {
		this.startButton = startButton;
	}







	public JComboBox<String> getZeilenAuswahl() {
		return zeilenAuswahl;
	}







	public void setZeilenAuswahl(JComboBox<String> zeilenAuswahl) {
		this.zeilenAuswahl = zeilenAuswahl;
	}







	public JComboBox<String> getSpaltenAuswahl() {
		return spaltenAuswahl;
	}







	public void setSpaltenAuswahl(JComboBox<String> spaltenAuswahl) {
		this.spaltenAuswahl = spaltenAuswahl;
	}













	public int getFarbenImSpiel() {
		return farbenImSpiel;
	}







	public void setFarbenImSpiel(int farbenImSpiel) {
		this.farbenImSpiel = farbenImSpiel;
	}







	public String[] getZeilenAnzahl() {
		return zeilenAnzahl;
	}







	public void setZeilenAnzahl(String[] zeilenAnzahl) {
		this.zeilenAnzahl = zeilenAnzahl;
	}







	public String[] getSpaltenAnzahl() {
		return spaltenAnzahl;
	}







	public void setSpaltenAnzahl(String[] spaltenAnzahl) {
		this.spaltenAnzahl = spaltenAnzahl;
	}

}
