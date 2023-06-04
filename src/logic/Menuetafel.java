package logic;

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
	private Spieleinstellungen spielEinstellungen;
	String[] zeilenAnzahl = { "3", "4", "5", "6", "7", "8", "9", "10" };
	String[] spaltenAnzahl = { "3", "4", "5", "6", "7", "8", "9", "10" };



	
	public Menuetafel(MyFrame myFrame) {
		
		this.myFrame = myFrame;
		
		//Layout der Menuetafel				
		this.setPreferredSize(new Dimension(myFrame.getWidth()/3, myFrame.getHeight()));
		
		this.setLayout(new BorderLayout());


		
		startButton = new JButton("Start");
		startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		startButton.setFocusPainted(false);
		
		
		
		/*
		 * Menuetafel in 2 Teile teilen: Oberer Teil fuer die Konfiguration. Dort zuerst
		 * Titel hinzufuegen mit dem Button
		 */
		
		JPanel konfiguration = new JPanel();
		konfiguration.setPreferredSize(new Dimension(myFrame.getWidth(), myFrame.getHeight()/3));
		
		
		
		/*
		 * Flow Layout fuer Konfiguration, um alle Auswahlmoeglichkeiten direkt 
		 * nebeneinander anzeigen zu lassen
		 */
		
		konfiguration.setLayout(new BoxLayout(konfiguration, BoxLayout.Y_AXIS));
		JLabel ueberSchrift1 = new JLabel("<HTML><U>Spielbrett Einstellungen</U></HTML>", JLabel.CENTER);
		ueberSchrift1.setAlignmentX(Component.CENTER_ALIGNMENT);

		ueberSchrift1.setFont(new Font("Arial",1,13));

		konfiguration.add(ueberSchrift1);



		
		
		
		

		konfiguration.add(startButton);
		
		
		
		
		//Panel, wo man die Zeile auswaehlt

		JPanel zeilenAuswaehlen = new JPanel();
		JLabel zeilenanzahlAuswaehlen = new JLabel("Zeilenanzahl auswählen: ", JLabel.LEFT);
		Font f = zeilenanzahlAuswaehlen.getFont();
		zeilenanzahlAuswaehlen.setFont(f.deriveFont(f.getStyle() & ~Font.BOLD));
		zeilenAuswaehlen.add(zeilenanzahlAuswaehlen);
		zeilenAuswahl = new JComboBox<String>(zeilenAnzahl);
		zeilenAuswaehlen.add(zeilenAuswahl);
		
		
		
		//Panel, wo man die Spalte auswaehlt
		JPanel spalteAuswaehlen = new JPanel();
		JLabel spaltenanzahlAuswaehlen = new JLabel("Spaltenanzahl auswählen: ");
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


		




		spielEinstellungen = new Spieleinstellungen(myFrame);
		
		

		
		
		

		
		this.add(konfiguration, BorderLayout.NORTH);
		
		this.add(spielEinstellungen, BorderLayout.CENTER);
		
		
		
		
		
		
		
//		this.addComponentListener(new ComponentAdapter() {
//			public void componentResized(ComponentEvent component) {
//				
//				Component mase = (Component) component.getSource();
//				
//				int width = myFrame.getWidth();
//				int height = myFrame.getHeight();
//				
//				konfiguration.setPreferredSize(new Dimension(myFrame.getWidth(), myFrame.getHeight()/3));
//				spielEinstellungen.setPreferredSize(new Dimension(myFrame.getWidth(), (myFrame.getHeight()/3)*2));
//				System.out.println(myFrame.getHeight());
//				
//				
//			}
//		});
		
		
		
		this.setVisible(true);
		
	}
	
	
	
	

	
	
	public void spielbrettGenerieren(int zeilen, int spalten, int farbenImSpiel) {
		
		
		//Farben als Zahl speichern
		int[] color = new int[9];
		
		for(int i = 0; i < color.length; i++) {
			color[i] = i;
		}
		
		
	}

}
