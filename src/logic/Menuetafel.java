package logic;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Menuetafel extends JPanel{
	
	private MyFrame myFrame;
	private JButton startButton;
	private JButton startButton2;
	private JComboBox<String> zeilenAuswahl;
	private JComboBox<String> spaltenAuswahl;
	String[] zeilenAnzahl = { "3", "4", "5", "6", "7", "8", "9", "10" };
	String[] spaltenAnzahl = { "3", "4", "5", "6", "7", "8", "9", "10" };



	
	public Menuetafel(MyFrame myFrame) {
		
		this.myFrame = myFrame;
		this.setPreferredSize(new Dimension(myFrame.getWidth()/3, myFrame.getHeight()));
		
		//Layout der Menuetafel
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		
		
		startButton = new JButton("Start");
		startButton.setFocusPainted(false);
		
		
		
		/*
		 * Menuetafel in 2 Teile teilen: Oberer Teil fuer die Konfiguration. Dort zuerst
		 * Titel hinzufuegen mit dem Button
		 */
		
		JPanel konfiguration = new JPanel();
		konfiguration.setPreferredSize(new Dimension(myFrame.getWidth(), myFrame.getHeight()/3));
//		konfiguration.setBackground(Color.GREEN);
		
		
		
		/*
		 * Flow Layout fuer Konfiguration, um alle Auswahlmoeglichkeiten direkt 
		 * nebeneinander anzeigen zu lassen
		 */
		
		konfiguration.setLayout(new BoxLayout(konfiguration, BoxLayout.Y_AXIS));

		konfiguration.add(new JLabel("<HTML><U>Spielbrett Einstellungen</U></HTML>"));


		
		
		
		

		konfiguration.add(startButton);
		
		
		konfiguration.add(new JLabel(" "));

		
		//Panel, wo man die Zeile auswaehlt

		JPanel zeilenAuswaehlen = new JPanel();
		zeilenAuswaehlen.setLayout(new BoxLayout(zeilenAuswaehlen, BoxLayout.Y_AXIS));
		JLabel zeilenanzahlAuswaehlen = new JLabel("Zeilenanzahl auswählen: ");
		Font f = zeilenanzahlAuswaehlen.getFont();
		zeilenanzahlAuswaehlen.setFont(f.deriveFont(f.getStyle() & ~Font.BOLD));
		zeilenAuswaehlen.add(zeilenanzahlAuswaehlen);
		zeilenAuswahl = new JComboBox<String>(zeilenAnzahl);
		zeilenAuswaehlen.add(zeilenAuswahl);
		
		
		
		//Panel, wo man die Spalte auswaehlt
		JPanel spalteAuswaehlen = new JPanel();
		spalteAuswaehlen.setLayout(new BoxLayout(spalteAuswaehlen, BoxLayout.Y_AXIS));
		JLabel spaltenanzahlAuswaehlen = new JLabel("Spaltenanzahl auswählen: ");
		Font g = zeilenanzahlAuswaehlen.getFont();
		spaltenanzahlAuswaehlen.setFont(g.deriveFont(g.getStyle() & ~Font.BOLD));
		spalteAuswaehlen.add(spaltenanzahlAuswaehlen);
		spaltenAuswahl = new JComboBox<String>(spaltenAnzahl);
		spalteAuswaehlen.add(spaltenAuswahl);
		

		
		//Panel, wo man die Zeile angezeigt wird
		JPanel zeileUndSpalteAnzeigen = new JPanel();
		zeileUndSpalteAnzeigen.setLayout(new FlowLayout());
		JLabel anzeige = new JLabel();
		anzeige.setText("<html><body>Das Brett hat aktuell<br>10 Zeilen und 10 Spalten</body></html>");
		zeileUndSpalteAnzeigen.add(anzeige);
		
		
		konfiguration.add(zeilenAuswaehlen);
		konfiguration.add(spalteAuswaehlen);

		konfiguration.add(zeileUndSpalteAnzeigen);

		konfiguration.setBorder(BorderFactory.createLineBorder(Color.black));


		




		
		
		JPanel spielEinstellungen = new JPanel();
		spielEinstellungen.setPreferredSize(new Dimension(myFrame.getWidth(), myFrame.getHeight()/3*2));
		spielEinstellungen.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		JPanel ueberSchrift = new JPanel();
		ueberSchrift.setLayout(new GridLayout(1,2));
		ueberSchrift.add(new JLabel("<HTML><U>Spielen</U></HTML>"));
		ueberSchrift.add(new JLabel(" "));
		ueberSchrift.add(new JLabel("0:00"));
		
		
		spielEinstellungen.add(ueberSchrift);
		
		


		
		
		
		
		
		
		this.add(konfiguration);
		
		this.add(spielEinstellungen);
		
		
		
		
		
		this.addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent component) {
				
				Component mase = (Component) component.getSource();
				
				int width = myFrame.getWidth();
				int height = myFrame.getHeight();
				
				konfiguration.setPreferredSize(new Dimension(myFrame.getWidth(), myFrame.getHeight()/3));
				spielEinstellungen.setPreferredSize(new Dimension(myFrame.getWidth(), (myFrame.getHeight()/3)*2));
				System.out.println(myFrame.getHeight());
				
				
			}
		});
		
		
		
		
		this.setVisible(true);
		
	}
	
	
	public JLabel textKreiren(String s) {
		return new JLabel(s);
	}
	
	
	public void spielbrettGenerieren(int zeilen, int spalten, int farbenImSpiel) {
		
		
		//Farben als Zahl speichern
		int[] color = new int[9];
		
		for(int i = 0; i < color.length; i++) {
			color[i] = i;
		}
		
		
	}

}
