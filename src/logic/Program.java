package logic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Program extends JPanel{
	
	private MyFrame myFrame;
	
	private JPanel menueTafel;
	private JPanel spielEinstellungen;
	private JPanel konfiguration;
	private JPanel farbenAnzeige = new JPanel();
	
	private JPanel anzeige = new JPanel();


	

	

	
	
	public MyFrame getMyFrame() {
		return myFrame;
	}


	public void setMyFrame(MyFrame myFrame) {
		this.myFrame = myFrame;
	}

	private JButton startButton;
	private JComboBox<String> zeilenAuswahl;
	private JComboBox<String> spaltenAuswahl;
	private String[] zeilenAnzahl = { "3", "4", "5", "6", "7", "8", "9", "10" };
	private String[] spaltenAnzahl = { "3", "4", "5", "6", "7", "8", "9", "10" };

	private String[] strat = { "1", "2", "3" };
	private String[] farben = { "4", "5", "6", "7", "8", "9" };
	private JComboBox<String> stratAuswahlListe;
	private JComboBox<String> farbenAnzahl;
	private int[] alleMöglichenFarben = {1,2,3,4,5,6,7,8,9};
	private int[] ausgewaehlteFarben;

	private int gewaehlteZeilenAnzahl;
	private int gewaehlteSpaltenAnzahl;
	private String gewaehlterBeginner;
	private int gewaehlteStrategie;
	private int farbenImSpiel;
//	private ArrayList<Color> waehlbareFarbenS1;

	private ArrayList<JPanel> K1;
	private ArrayList<JPanel> K2;
	private ArrayList<JPanel> K2Copy;
	private int s1Farbe;
	private int s2Farbe;


	
	private JLabel zeilenUndSpaltenAnzeige;

	private Field[][] spielBrettArrayField;

	private JRadioButton s1RadioButton;
	private JRadioButton s2RadioButton;
	
	
	
	public Program(MyFrame myFrame) {
		
		this.myFrame = myFrame;

		this.setLayout(new BorderLayout());
		this.setMinimumSize(new Dimension(500, 500));

		/*
		 * Beide wichtigsten Panel. In menueTafel kommen die Menueeinstellungen, in
		 * anzeigeTafel das Spielbrett
		 */
		menueTafel = new JPanel();
		menueTafel.setLayout(new BoxLayout(menueTafel, BoxLayout.Y_AXIS));

		menueTafel.setPreferredSize(new Dimension(myFrame.getWidth() / 4, myFrame.getHeight()));

		startButton = new JButton("Start");
		startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		startButton.setFocusPainted(false);

		/*
		 * Menuetafel in 2 Teile teilen: Oberer Teil fuer die Konfiguration. Dort zuerst
		 * Titel hinzufuegen mit dem Button
		 */

		konfiguration = new JPanel();
		konfiguration.setPreferredSize(new Dimension(myFrame.getWidth(), myFrame.getHeight() / 4));

		/*
		 * Flow Layout fuer Konfiguration, um alle Auswahlmoeglichkeiten direkt
		 * nebeneinander anzeigen zu lassen
		 */

		konfiguration.setLayout(new BoxLayout(konfiguration, BoxLayout.Y_AXIS));
		JLabel ueberSchrift1 = new JLabel("<HTML><U>Spielbrett Einstellungen</U></HTML>", JLabel.CENTER);
		ueberSchrift1.setAlignmentX(Component.CENTER_ALIGNMENT);

		ueberSchrift1.setFont(new Font("Arial", 1, 12));

		konfiguration.add(ueberSchrift1);
		konfiguration.add(startButton);

		// Panel, wo man die Zeile auswaehlt

		JPanel zeilenAuswaehlen = new JPanel();
		JLabel zeilenanzahlAuswaehlen = new JLabel("Zeilenanzahl: ", JLabel.LEFT);
		Font f = zeilenanzahlAuswaehlen.getFont();
		zeilenanzahlAuswaehlen.setFont(f.deriveFont(f.getStyle() & ~Font.BOLD));
		zeilenAuswaehlen.add(zeilenanzahlAuswaehlen);
		zeilenAuswahl = new JComboBox<String>(zeilenAnzahl);
		zeilenAuswahl.setSelectedItem("6");
		zeilenAuswaehlen.add(zeilenAuswahl);

		// Panel, wo man die Spalte auswaehlt
		JPanel spalteAuswaehlen = new JPanel();
		JLabel spaltenanzahlAuswaehlen = new JLabel("Spaltenanzahl: ");
		Font g = zeilenanzahlAuswaehlen.getFont();
		spaltenanzahlAuswaehlen.setFont(g.deriveFont(g.getStyle() & ~Font.BOLD));
		spalteAuswaehlen.add(spaltenanzahlAuswaehlen);
		spaltenAuswahl = new JComboBox<String>(spaltenAnzahl);
		spaltenAuswahl.setSelectedItem("6");
		spalteAuswaehlen.add(spaltenAuswahl);

		// Panel, wo man die Zeile angezeigt wird
		zeilenUndSpaltenAnzeige = new JLabel();
		zeilenUndSpaltenAnzeige.setAlignmentX(Component.CENTER_ALIGNMENT);

		konfiguration.add(zeilenAuswaehlen);
		konfiguration.add(spalteAuswaehlen);

		konfiguration.add(zeilenUndSpaltenAnzeige);

		konfiguration.setBorder(BorderFactory.createLineBorder(Color.black));

		spielEinstellungen = new JPanel();

		spielEinstellungen.setPreferredSize(new Dimension(myFrame.getWidth(), myFrame.getHeight() / 4 * 3));

		spielEinstellungen.setLayout(new BoxLayout(spielEinstellungen, BoxLayout.Y_AXIS));

		JLabel ueberSchrift = new JLabel("<HTML><U>Spiel Einstellungen</U></HTML>", JLabel.CENTER);
		ueberSchrift.setAlignmentX(Component.CENTER_ALIGNMENT);
		JButton playButton = new JButton("Play");
		playButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		playButton.setFocusPainted(false);
		spielEinstellungen.add(ueberSchrift);
		spielEinstellungen.add(playButton);

		JLabel beginnerFrage = new JLabel("<html><u>Beginner auswählen</u></html>", JLabel.LEFT);
		Font f2 = beginnerFrage.getFont();
		beginnerFrage.setFont(f2.deriveFont(f2.getStyle() & ~Font.BOLD));
		spielEinstellungen.add(beginnerFrage);

		JPanel beginnerUndStrat = new JPanel();
		s1RadioButton = new JRadioButton("S1");
		s1RadioButton.setSelected(true);
		s2RadioButton = new JRadioButton("S2");
		beginnerUndStrat.add(beginnerFrage);
		beginnerUndStrat.add(s1RadioButton);
		beginnerUndStrat.add(s2RadioButton);

		ButtonGroup bg = new ButtonGroup();
		bg.add(s1RadioButton);
		bg.add(s2RadioButton);

		JLabel beginnerLabel = new JLabel();
		Font f3 = beginnerLabel.getFont();
		beginnerLabel.setFont(f3.deriveFont(f3.getStyle() & ~Font.BOLD));
		beginnerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

		beginnerUndStrat.add(beginnerLabel);

		JLabel strategieLabel = new JLabel("<html><u>Spielstrategie für S2</u></html>", JLabel.LEFT);
		Font f4 = beginnerFrage.getFont();
		strategieLabel.setFont(f4.deriveFont(f4.getStyle() & ~Font.BOLD));
		beginnerUndStrat.add(strategieLabel);

		JLabel stratFrage = new JLabel("Spielstrategie S2:", JLabel.LEFT);
		Font f1 = stratFrage.getFont();
		stratFrage.setFont(f1.deriveFont(f1.getStyle() & ~Font.BOLD));

		beginnerUndStrat.add(stratFrage);

		stratAuswahlListe = new JComboBox<String>(strat);
		beginnerUndStrat.add(stratAuswahlListe);
		JLabel stratAnzeige = new JLabel();
		Font f5 = stratFrage.getFont();
		stratAnzeige.setFont(f5.deriveFont(f5.getStyle() & ~Font.BOLD));
		stratAnzeige.setAlignmentX(Component.CENTER_ALIGNMENT);
		beginnerUndStrat.add(stratAnzeige);

		JPanel farbenPanel = new JPanel();
		farbenPanel.setLayout(new BoxLayout(farbenPanel, BoxLayout.Y_AXIS));
		JLabel farbEinst = new JLabel("<html><u>Farbeinstellungen</u></html>", JLabel.CENTER);
		farbEinst.setAlignmentX(Component.CENTER_ALIGNMENT);
		farbenPanel.add(farbEinst);
		JLabel farbenFrage = new JLabel("Farbenanzahl:", JLabel.LEFT);
		farbenFrage.setAlignmentX(Component.CENTER_ALIGNMENT);
		farbenPanel.add(farbenFrage);
		farbenAnzahl = new JComboBox<String>(farben);
		farbenAnzahl.setSelectedItem("5");
		farbenPanel.add(farbenAnzahl);

		beginnerUndStrat.add(farbenPanel);

		JPanel komponentenPanel = new JPanel();
		JLabel k1 = new JLabel("S1 Komponentengröße: " + "10");
		k1.setFont(new Font("Arial", 1, 11));
		JLabel k2 = new JLabel("S2 Komponentengröße: " + "10");
		k2.setFont(new Font("Arial", 1, 11));
		komponentenPanel.add(k1);
		komponentenPanel.add(k2);
		
		spielEinstellungen.add(beginnerUndStrat);

		menueTafel.add(konfiguration, BorderLayout.NORTH);

		menueTafel.add(spielEinstellungen, BorderLayout.CENTER);

		anzeige.setLayout(new BorderLayout());

		anzeige.add(farbenAnzeige, BorderLayout.SOUTH);
		
		this.add(anzeige, BorderLayout.CENTER);
		this.add(menueTafel, BorderLayout.EAST);
		
		
		
		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (startButton.getText().equals("Start")) {

					setup();
//					farbenAnzeige.setLayout(new GridLayout(1, gewaehlteSpaltenAnzahl));
//					s1Farbe = spielBrettArrayField[gewaehlteZeilenAnzahl - 1][0].getColor();;
//					s2Farbe = spielBrettArrayField[0][gewaehlteSpaltenAnzahl - 1].getColor();

				} else {
//					startButton.setText("Stop");
//					zeilenAuswahl.setEnabled(true);
//					spaltenAuswahl.setEnabled(true);
//					zeilenUndSpaltenAnzeige.setText("");
//					spielBrett.removeAll();
//					spielBrett.repaint();
//
//					farbenAnzeige.removeAll();
//					farbenAnzeige.revalidate();
//					farbenAnzeige.repaint();

				}
			}
		});

		
		
	}
	
	
	public void setup() {
		
		startButton.setText("Stop");
		// Zuerst alle Einstellungsmoeglichkeiten deaktivieren
		zeilenAuswahl.setEnabled(false);
		spaltenAuswahl.setEnabled(false);

		// Ausgewaehlte Werte uebertragen
		gewaehlteZeilenAnzahl = Integer.parseInt((String) zeilenAuswahl.getSelectedItem());
		gewaehlteSpaltenAnzahl = Integer.parseInt((String) spaltenAuswahl.getSelectedItem());
		farbenImSpiel = Integer.parseInt((String) farbenAnzahl.getSelectedItem());

		zeilenUndSpaltenAnzeige.setText("<html>Das Brett hat aktuell 10 Zeilen und 10 Spalten</html>");
		zeilenUndSpaltenAnzeige.setAlignmentX(Component.CENTER_ALIGNMENT);
		konfiguration.add(zeilenUndSpaltenAnzeige);
		
		
		//Spielbrett erstellen
		
		spielBrettArrayField = new Field[gewaehlteZeilenAnzahl][gewaehlteSpaltenAnzahl];
		
		farbenUebernehmen(farbenImSpiel);
		
		spielBrettArrayField = spielBrettGenerieren();
		

		
	}
	
	public Field[][] spielBrettGenerieren() {
		
		
		
	}
	
	
	//Je nach Farbenanzahl werden die Farben aufgenommen
	public void farbenUebernehmen(int farbenImSpiel) {

		ausgewaehlteFarben = new int[farbenImSpiel];

		for (int i = 0; i < farbenImSpiel; i++) {
			ausgewaehlteFarben[i] = alleMöglichenFarben[i];
		}

	}
	
//	public Field[][] spielBrettGenerieren() {
//		
//	}
	
	
	
	}
	
	


