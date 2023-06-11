package logic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;


public class JPanels extends JPanel{
	
	
	//Alle Fenster bzw. JPanels
	private MyFrame myFrame;
	private JPanel menueTafel;
	private JPanel spielBrett;
	private JPanel spielEinstellungen;
	
	
	
	private ArrayList<Color> alleMöglichenFarben = new ArrayList<Color>();
	private ArrayList<Color> ausgewaehlteFarben;
	private ArrayList<Color> aktuellVerfuegbareFarben;
	private JButton startButton;
	private JComboBox<String> zeilenAuswahl;
	private JComboBox<String> spaltenAuswahl;
	private int farbenImSpiel;
	private String[] zeilenAnzahl = { "3", "4", "5", "6", "7", "8", "9", "10" };
	private String[] spaltenAnzahl = { "3", "4", "5", "6", "7", "8", "9", "10" };
	

	private String[] strat = { "1", "2", "3"};
	private String[] farben = {"1", "2","3","4","5","6","7","8","9"};
	private JComboBox<String> stratAuswahlListe;
	private JComboBox<String> farbenAnzahl;
	
	private int gewaehlteZeilenAnzahl;
	private int gewaehlteSpaltenAnzahl;
	private String gewaehlterBeginner;
	private int gewaehlteStrategie;
	private int gewaehlteFarbenanzahl;
	JPanel[][] spielbrettArray;

	
	public JPanels(MyFrame myFrame) {
		this.myFrame = myFrame;
		
		this.setLayout(new BorderLayout());
		
		
		
		/*
		 * Beide wichtigsten Panel. In menueTafel kommen die Menueeinstellungen, 
		 * in anzeigeTafel das Spielbrett
		 */
		menueTafel = new JPanel(new GridLayout(2,1));
		spielBrett = new JPanel();

		
		
		menueTafel.setPreferredSize(new Dimension(myFrame.getWidth()/4, myFrame.getHeight()));
		spielBrett.setPreferredSize(new Dimension(myFrame.getWidth()/4*3, myFrame.getHeight()));

		
		
		startButton = new JButton("Start");
		startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		startButton.setFocusPainted(false);
		
		
		
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
		zeilenAuswahl.setSelectedItem("6");
		zeilenAuswaehlen.add(zeilenAuswahl);
		
		
		
		//Panel, wo man die Spalte auswaehlt
		JPanel spalteAuswaehlen = new JPanel();
		JLabel spaltenanzahlAuswaehlen = new JLabel("Spaltenanzahl: ");
		Font g = zeilenanzahlAuswaehlen.getFont();
		spaltenanzahlAuswaehlen.setFont(g.deriveFont(g.getStyle() & ~Font.BOLD));
		spalteAuswaehlen.add(spaltenanzahlAuswaehlen);
		spaltenAuswahl = new JComboBox<String>(spaltenAnzahl);
		spaltenAuswahl.setSelectedItem("6");
		spalteAuswaehlen.add(spaltenAuswahl);
		

		
		//Panel, wo man die Zeile angezeigt wird
		JLabel zeilenUndSpaltenAnzeige = new JLabel("<html>Das Brett hat aktuell 10 Zeilen und 10 Spalten</html>", JLabel.CENTER);
		zeilenUndSpaltenAnzeige.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		
		
		
		konfiguration.add(zeilenAuswaehlen);
		konfiguration.add(spalteAuswaehlen);

		konfiguration.add(zeilenUndSpaltenAnzeige);


		konfiguration.setBorder(BorderFactory.createLineBorder(Color.black));
		

		
		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(startButton.getText().equals("Start")) {
					
					setup();				

				
				
			}	else {
					startButton.setText("Start");
					zeilenAuswahl.setEnabled(true);
					spaltenAuswahl.setEnabled(true);
					spielBrett.removeAll();
					spielBrett.repaint();
				
				
			} 
			}
		});
		


		
		spielEinstellungen = new JPanel();
		
		spielEinstellungen.setPreferredSize(new Dimension(myFrame.getWidth(), myFrame.getHeight()/4*3));
		
		spielEinstellungen.setLayout(new BoxLayout(spielEinstellungen, BoxLayout.Y_AXIS));
		
		JLabel ueberSchrift= new JLabel("<HTML><U>Spiel Einstellungen</U></HTML>", JLabel.CENTER);
		ueberSchrift.setAlignmentX(Component.CENTER_ALIGNMENT);
		JButton playButton = new JButton("Play");
		playButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		spielEinstellungen.add(ueberSchrift);
		spielEinstellungen.add(playButton);
		
		JLabel beginnerFrage = new JLabel("<html><u>Beginner auswählen</u></html>", JLabel.LEFT);
		Font f2 = beginnerFrage.getFont();
		beginnerFrage.setFont(f2.deriveFont(f2.getStyle() & ~Font.BOLD));
		spielEinstellungen.add(beginnerFrage);
		
		
		
		JLabel beginnerLabel = new JLabel("Es hat begonnen: " + "S2", JLabel.LEFT);
		Font f3 = beginnerLabel.getFont();
		beginnerLabel.setFont(f3.deriveFont(f3.getStyle() & ~Font.BOLD));
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
		k1.setFont(new Font("Arial",1,11));
		JLabel k2 = new JLabel("S2 Komponentengröße: " + "10");
		k2.setFont(new Font("Arial",1,11));
		komponentenPanel.add(k1);
		komponentenPanel.add(k2);


		
		
		spielEinstellungen.add(beginnerUndStrat);
		
		menueTafel.add(konfiguration, BorderLayout.NORTH);
		
		menueTafel.add(spielEinstellungen, BorderLayout.CENTER);
		
		
		
		this.add(spielBrett,BorderLayout.CENTER);
		this.add(menueTafel, BorderLayout.EAST);
		
		
		
		//Alle farben in der ArrayList hinzufuegen
		alleColorsAdden();
		
			
		
	}
	
	
	
	//Methode, um das Spielbrett mit den jeweiligen Werten zu erstellen
	
	public JPanel[][] spielBrettGenerieren() {
		
		int zeilen = gewaehlteZeilenAnzahl;
		int spalten = gewaehlteSpaltenAnzahl;
		
		spielbrettArray = new JPanel[zeilen][spalten];
		

		
		spielBrett.setLayout(new GridLayout(zeilen, spalten));
		
		Dimension dim = new Dimension(50,50);
		
		
		//Spielbrett Felder ausfuellen
		for(int i = 0; i < zeilen; i++) {
			for(int j = 0; j < spalten; j++) {
				
				JPanel feld = new JPanel();

				
				feld.setPreferredSize(dim);
				feld.setMinimumSize(dim);
				feld.setMaximumSize(dim);
				feld.setBorder(BorderFactory.createLineBorder(Color.black));
				
				spielbrettArray[i][j] = feld;
				
	
				
				int zeile = i;
				int spalte = j;
					
				
				spielBrett.add(feld);
				
				Color randomFarbe = randomFarbeWaehlen(aktuellVerfuegbareFarben.size(), spielbrettArray, i, j);
				feld.setBackground(randomFarbe);


				
				/*
				 * Jedem Feld die Koordinaten uebergeben, sodass man beim klicken genau weis, welches
				 * Feld man angeklickt hat
				 */
				
				feld.addMouseListener(new MouseAdapter() {
					
					public void mouseClicked(MouseEvent e) {
						
						Color aktuelleFarbe = spielbrettArray[zeile][spalte].getBackground();
												
						
					}
				});
				
				
			}
		}
		
			
		revalidate();
		repaint();
		

		return spielbrettArray;
		
	}
	
	
	
	/*
	 * Gibt eine random Farbe zurueck, mit der das jeweilige Feld dann befuellt wird, wobei jedes Feld eine
	 * andere Farbe hat als sein Nachbar
	 */
	public Color randomFarbeWaehlen(int bound, JPanel[][] spielBrett, int i, int j) {
				
		
		Random rand = new Random();

		
		//Alle nachbarFarben sammeln, um diese auszuschliesen fuer die neue farbe
		ArrayList<Color> nachbarFarben = new ArrayList<Color>();
		
		
		ArrayList<Color> ausgewaehlteFarbenTemporaer = new ArrayList<Color>(aktuellVerfuegbareFarben);
		
				
		Color nachbarFarbeOben = null;
		Color nachbarFarbeLinks = null;
				
				
		if(i == gewaehlteZeilenAnzahl-1 && j == 0) {
					
					
			Color farbeS2 = spielBrett[0][gewaehlteSpaltenAnzahl-1].getBackground();
			nachbarFarben.add(farbeS2);
					
			
			
			JPanel oberesFeld = spielBrett[i-1][j];
			nachbarFarbeOben = oberesFeld.getBackground();
			nachbarFarben.add(nachbarFarbeOben);
					
			ausgewaehlteFarbenTemporaer.removeAll(nachbarFarben);


						
			int x = rand.nextInt(ausgewaehlteFarbenTemporaer.size());
			return ausgewaehlteFarbenTemporaer.get(x);
					
					
				}
				
				
				//Farbe oberes Feld ueberpruefen
			if(i > 0) {
				JPanel oberesFeld = spielBrett[i-1][j];
				nachbarFarbeOben = oberesFeld.getBackground();
				nachbarFarben.add(nachbarFarbeOben);
				} 
				
				
				//Farbe linkes Feld ueberpruefen
				if(j > 0) {
					JPanel linkesFeld = spielBrett[i][j-1];
					nachbarFarbeLinks = linkesFeld.getBackground();
					nachbarFarben.add(nachbarFarbeLinks);
				}
				
				
					ausgewaehlteFarbenTemporaer.removeAll(nachbarFarben);

					
					
					
					//Neue random Farbe auswaehlen fuer das jeweilige Feld aus den noch uebrigen Farben
					int x = rand.nextInt(ausgewaehlteFarbenTemporaer.size());
					Color neueFarbe = ausgewaehlteFarbenTemporaer.get(x);
					
					
				
					return neueFarbe;
		
		
	}
	
	
	
	/*
	 * Mit dieser Methode picke ich mir x beliebige Farben aus dem volstaendigen Array alleColors raus, um diese dann
	 * als Farben zu benutzen. x haengt davon ab wie hoch die Farbenanzahl ist
	 */
	public void farbenUebernehmen(int farbenImSpiel) {

		Random rand = new Random();
		
		ArrayList<Color> temp = new ArrayList<Color>(alleMöglichenFarben);
		
		
		ausgewaehlteFarben = new ArrayList<Color>();
		
		
		
		/*
		 * Fehler gefunden: x kann auch zufaelligerweise 2 mal vorkommen, sodass bei ausgewaehlteFarben 2 Farben
		 * gleichzeitig vorkommen können!
		 */
		
		for(int i = 0; i < farbenImSpiel; i++) {
			int x = rand.nextInt(temp.size());
			ausgewaehlteFarben.add(temp.get(x));
			temp.remove(x);
		}
		
		
		
		

		aktuellVerfuegbareFarben = new ArrayList<Color>(ausgewaehlteFarben);
		for(int i = 0; i < aktuellVerfuegbareFarben.size(); i++) {
		}
		
		
	}
	
	
	
	
	
	public void alleColorsAdden() {
		alleMöglichenFarben.add(Color.black);
		alleMöglichenFarben.add(Color.blue);
		alleMöglichenFarben.add(Color.cyan);
		alleMöglichenFarben.add(Color.gray);
		alleMöglichenFarben.add(Color.green);
		alleMöglichenFarben.add(Color.magenta);
		alleMöglichenFarben.add(Color.orange);
		alleMöglichenFarben.add(Color.pink);
		alleMöglichenFarben.add(Color.red);

	}
	
	
	public void setup() {
		
		startButton.setText("Stop");
		//Zuerst alle Einstellungsmoeglichkeiten deaktivieren
		zeilenAuswahl.setEnabled(false);
		spaltenAuswahl.setEnabled(false);
		
		//Ausgewaehlte Werte uebertragen
		gewaehlteZeilenAnzahl = Integer.parseInt((String) zeilenAuswahl.getSelectedItem());
		gewaehlteSpaltenAnzahl = Integer.parseInt((String) spaltenAuswahl.getSelectedItem());
		farbenImSpiel = Integer.parseInt((String)farbenAnzahl.getSelectedItem());

		

		spielbrettArray = new JPanel[gewaehlteZeilenAnzahl][gewaehlteSpaltenAnzahl];

		
		farbenUebernehmen(farbenImSpiel);
		spielbrettArray = spielBrettGenerieren();
		
		
	}
	
	
	//Problem 3: Jede Farbe soll mindestens ein Mal vorkommen
	
	
	}


