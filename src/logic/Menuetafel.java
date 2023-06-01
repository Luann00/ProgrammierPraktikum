package logic;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import java.awt.*;
import javax.swing.*;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Menuetafel extends JPanel{
	
	private MyFrame myFrame;
	private JButton startButton;
	private JButton startButton2;
	private String[] auswahl = {"3","4","5","6","7","8","9","10"};

	
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

		konfiguration.add(new JLabel("Spielbrett Einstellungen"));
		konfiguration.add(new JLabel(" "));


		
		
		
		

		konfiguration.add(startButton);
		
		
		konfiguration.add(new JLabel(" "));

		
		//Panel, wo man die Zeile auswaehlt

		JPanel zeilenAuswaehlen = new JPanel();
		zeilenAuswaehlen.setLayout(new BoxLayout(zeilenAuswaehlen, BoxLayout.Y_AXIS));
		JLabel zeilenWaehlen = new JLabel("Zeile für das Brett auswählen");
		zeilenAuswaehlen.add(zeilenWaehlen);
		zeilenAuswaehlen.add(new JRadioButton("5"));

		
		
		//Panel, wo man die Spalte auswaehlt
		JPanel spalteAuswaehlen = new JPanel();
		spalteAuswaehlen.setLayout(new BoxLayout(spalteAuswaehlen, BoxLayout.Y_AXIS));
		JLabel spalteWaehlen = new JLabel("Spalte für das Brett auswählen");
		spalteAuswaehlen.add(spalteWaehlen);
		spalteAuswaehlen.add(new JRadioButton("5"));

		

		
		//Panel, wo man die Zeile angezeigt wird
		JPanel zeileUndSpalteAnzeigen = new JPanel();
		zeileUndSpalteAnzeigen.setLayout(new FlowLayout());
		JLabel anzeige = new JLabel();
		anzeige.setText("<html><body>Das Brett hat aktuell<br>10 Zeilen und 10 Spalten</body></html>");
		zeileUndSpalteAnzeigen.add(anzeige);
		
		
		konfiguration.add(zeilenAuswaehlen);
		konfiguration.add(spalteAuswaehlen);

		konfiguration.add(zeileUndSpalteAnzeigen);

		

		




		
		
		JPanel spielEinstellungen = new JPanel();
		spielEinstellungen.setPreferredSize(new Dimension(myFrame.getWidth(), myFrame.getHeight()/3*2));
		spielEinstellungen.setBackground(Color.BLACK);
		
		this.add(konfiguration, BorderLayout.NORTH);
		
		this.add(spielEinstellungen, BorderLayout.SOUTH);
		
		
		
		/*
		 * Responsitivitaet einbauen, sodass die Komponenten und deren Anordnung auch nach resizen des
		 * Fensters die gleiche Anordnung haben
		 */
		
		this.addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent component) {
				
				Component mase = (Component) component.getSource();
				
				int width = mase.getWidth();
				int height = mase.getHeight();
				
				konfiguration.setPreferredSize(new Dimension(width, height/3));
				spielEinstellungen.setPreferredSize(new Dimension(width, height/3*2));

				
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
