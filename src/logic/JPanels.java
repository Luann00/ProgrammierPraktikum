package logic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
import java.util.Scanner;


public class JPanels extends JPanel{
	
	
	//Alle Fenster bzw. JPanels
	private MyFrame myFrame;
	private JPanel menueTafel;
	private JPanel spielBrett;
	private JPanel spielEinstellungen;
	private JPanel konfiguration;
	
	
	
	private ArrayList<Color> alleMöglichenFarben = new ArrayList<Color>();
	private ArrayList<Color> ausgewaehlteFarben;
	private ArrayList<Color> aktuellVerfuegbareFarben;
	private ArrayList<Color> benutzteFarben;
	
	
	
	private JButton startButton;
	private JComboBox<String> zeilenAuswahl;
	private JComboBox<String> spaltenAuswahl;
	private String[] zeilenAnzahl = { "3", "4", "5", "6", "7", "8", "9", "10" };
	private String[] spaltenAnzahl = { "3", "4", "5", "6", "7", "8", "9", "10" };
	

	private String[] strat = { "1", "2", "3"};
	private String[] farben = {"4","5","6","7","8","9"};
	private JComboBox<String> stratAuswahlListe;
	private JComboBox<String> farbenAnzahl;
	
	private int gewaehlteZeilenAnzahl;
	private int gewaehlteSpaltenAnzahl;
	private String gewaehlterBeginner;
	private int gewaehlteStrategie;
	private int farbenImSpiel;
	private int anzahlBenutzteFarben = 0;
	
	private ArrayList<JPanel> K1;
	private ArrayList<JPanel> K2;
	private Color s1Farbe;
	private Color s2Farbe;
	private int groeseK1;
	private int groeseK2;
	private int spielZuege;
	private boolean kVergroesert;
	private Color geklickteFarbe;
	private JLabel zeilenUndSpaltenAnzeige;
	
	
	
	private JPanel[][] spielbrettArray;
	private int[][] koordinaten;
	
	private JRadioButton s1RadioButton;
	private JRadioButton s2RadioButton;

	
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
		
		konfiguration = new JPanel();
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
		zeilenUndSpaltenAnzeige = new JLabel();
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
					zeilenUndSpaltenAnzeige.setText("");
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
		k1.setFont(new Font("Arial",1,11));
		JLabel k2 = new JLabel("S2 Komponentengröße: " + "10");
		k2.setFont(new Font("Arial",1,11));
		komponentenPanel.add(k1);
		komponentenPanel.add(k2);
		
		
		
		
		playButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(playButton.getText().equals("Play")) {
					
					playButton.setText("Pause");
					if(s2RadioButton.isSelected()) {
						gewaehlterBeginner = s2RadioButton.getText();
					} else {
						gewaehlterBeginner = s1RadioButton.getText();
					}
					
					beginnerLabel.setText("Es hat begonnen: " + gewaehlterBeginner);
					gewaehlteStrategie = Integer.parseInt((String) stratAuswahlListe.getSelectedItem());

					stratAnzeige.setText("Verfolgte Strategie PC: " + gewaehlteStrategie);
					
					
					
					setup1();


				
				
			}	else {
					playButton.setText("Play");
					beginnerLabel.setText("");
					stratAnzeige.setText("");
					
					
				
				
			} 
			}
		});


		
		
		spielEinstellungen.add(beginnerUndStrat);
		
		menueTafel.add(konfiguration, BorderLayout.NORTH);
		
		menueTafel.add(spielEinstellungen, BorderLayout.CENTER);
		
		
		
		this.add(spielBrett,BorderLayout.CENTER);
		this.add(menueTafel, BorderLayout.EAST);
		
		spielBrett.setBorder(new EmptyBorder(0, 0, 50, 0));

		
		
		
		//Alle farben in der ArrayList hinzufuegen
		alleColorsAdden();
		
			
		
	}
	
	
	
	//Methode, um das Spielbrett mit den jeweiligen Felder zu erstellen
	public JPanel[][] spielBrettGenerieren() {
		
		int zeilen = gewaehlteZeilenAnzahl;
		int spalten = gewaehlteSpaltenAnzahl;
		
		spielBrett.setLayout(new GridLayout(zeilen, spalten));

		
		spielbrettArray = new JPanel[zeilen][spalten];
		benutzteFarben = new ArrayList<Color>();
	
		
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
				if(!(benutzteFarben.contains(randomFarbe))) {
					benutzteFarben.add(randomFarbe);
				}
				
				
				
				feld.setBackground(randomFarbe);
				

				
				
				
				
			}
			
			
	
		}
		
		
		for(int i = 0; i < zeilen; i++) {
			for(int j = 0; j < spalten; j++) {
				
				int zeile = i;
				int spalte = j;
				
				spielbrettArray[i][j].addMouseListener(new MouseAdapter() {
					
					
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
	
	public String colorToString(Color color) {
		
		if(color.equals(color.black)) return "Schwarz";
		if(color.equals(color.blue)) return "Blau";
		if(color.equals(color.yellow)) return "Gelb";
		if(color.equals(color.green)) return "Gruen";
		if(color.equals(color.red)) return "Rot";
		if(color.equals(color.gray)) return "Grau";
		if(color.equals(color.magenta)) return "Magenta";
		if(color.equals(color.orange)) return "Orange";
		if(color.equals(color.cyan)) return "Hellblau";
		
		return "Andere Farbe";




		
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

		zeilenUndSpaltenAnzeige.setText("<html>Das Brett hat aktuell 10 Zeilen und 10 Spalten</html>");
		zeilenUndSpaltenAnzeige.setAlignmentX(Component.CENTER_ALIGNMENT);
		konfiguration.add(zeilenUndSpaltenAnzeige);

		

		spielbrettArray = new JPanel[gewaehlteZeilenAnzahl][gewaehlteSpaltenAnzahl];

		
		farbenUebernehmen(farbenImSpiel);
		
		spielbrettArray = spielBrettGenerieren();
		
		
		while(benutzteFarben.size() != farbenImSpiel) {
		spielBrett.removeAll();
		spielbrettArray = spielBrettGenerieren();

		
		}
		
		
	}
	
	
	public void setup1() {
		
		K1 = new ArrayList<JPanel>();
		K2 = new ArrayList<JPanel>();
		
		
		
		
		//Am Anfang haben beide Spieler je eine Komponente
		K1.add(spielbrettArray[gewaehlteZeilenAnzahl-1][0]);
		K2.add(spielbrettArray[0][gewaehlteSpaltenAnzahl-1]);
		
		groeseK1 = 1;
		groeseK2 = 1;
		
		s1Farbe = spielbrettArray[gewaehlteZeilenAnzahl-1][0].getBackground();
		s2Farbe = spielbrettArray[0][gewaehlteSpaltenAnzahl-1].getBackground();

		
		spielZuege = 0;
		kVergroesert = true;
		
		
		/*
		 * Als naechstes definieren: Zwei Methoden, wobei erste guckt, ob 4 zuege ohne vergroeserung
		 * geschehen ist. Zweite Methode: Pruefen, ob alle vorhandenen Felder die Farbe von S1 oder S2 haben
		 */
		
		boolean max = maximaleZuege(spielZuege, kVergroesert);
		boolean endKonf = alleFelderBesetzt(s1Farbe,s2Farbe);
		
		
		
//		while(max == false && endKonf == false) {
			
			for(int i = 0; i < gewaehlteZeilenAnzahl; i++) {
				
				for(int j = 0; j < gewaehlteSpaltenAnzahl; j++) {
					
					int zeile = i;
					int spalte = j;
					
					spielbrettArray[i][j].addMouseListener(new MouseAdapter() {
						
						public void mouseClicked(MouseEvent e) {
							
							
							//Farbe des geklickten Feldes der Komponente zuweisen
							geklickteFarbe = spielbrettArray[zeile][spalte].getBackground();
							
							if(!(geklickteFarbe.equals(s1Farbe))) {
								spielZuege++;
								s1Farbe = geklickteFarbe;
							}
							
							
							
							
						groeseK1 = komponenteAnpassen(K1, geklickteFarbe, groeseK1);
						System.out.println("Groese K1(geklikt): " + groeseK1);
//						System.out.println("Spielzug: " + spielZuege);

							


						}
					});
					
					
					
					

										
				}
				
//			}
				
			
		}
			
			
			//Tastatureingaben sollen ebenfalls erkannt werden, um die jeweilige Farbe zu waehlen
			spielBrett.grabFocus();
			spielBrett.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					
					alleMöglichenFarben.add(Color.red);

					switch(e.getKeyChar()) {
					
					case '1': 
						
						groeseK1 = komponenteAnpassen(K1, Color.black, groeseK1);
						
						if(!(Color.black.equals(s1Farbe))) {
							spielZuege++;
							s1Farbe = Color.black;
						}						
						break;
						
						
					case '2':
						groeseK1 = komponenteAnpassen(K1, Color.blue, groeseK1);
						
						if(!(Color.blue.equals(s1Farbe))) {
							spielZuege++;
							s1Farbe = Color.blue;
						}						
						break;
	              
		                
					
					
					case '3':
						groeseK1 = komponenteAnpassen(K1, Color.gray, groeseK1);
						
						if(!(Color.gray.equals(s1Farbe))) {
							spielZuege++;
							s1Farbe = Color.gray;
						}						
						break;
						
					case '4':
						groeseK1 = komponenteAnpassen(K1, Color.green, groeseK1);
						
						if(!(Color.green.equals(s1Farbe))) {
							spielZuege++;
							s1Farbe = Color.green;
						}						
						break;
						
					case '5':
						groeseK1 = komponenteAnpassen(K1, Color.magenta, groeseK1);
						
						if(!(Color.magenta.equals(s1Farbe))) {
							spielZuege++;
							s1Farbe = Color.magenta;
						}						
						break;
						
						
					case '6':
						groeseK1 = komponenteAnpassen(K1, Color.orange, groeseK1);
						
						if(!(Color.orange.equals(s1Farbe))) {
							spielZuege++;
							s1Farbe = Color.orange;
						}						
						break;
						
					case '7':
						groeseK1 = komponenteAnpassen(K1, Color.pink, groeseK1);
						
						if(!(Color.pink.equals(s1Farbe))) {
							spielZuege++;
							s1Farbe = Color.pink;
						}						
						break;
					
					case '8':
						groeseK1 = komponenteAnpassen(K1, Color.red, groeseK1);
						
						if(!(Color.red.equals(s1Farbe))) {
							spielZuege++;
							s1Farbe = Color.red;
						}						
						break;

	            }
	       
			}
				
			});
			
			
			
			
		

	}
	
	public int getGroeseK1() {
		return groeseK1;
	}



	public void setGroeseK1(int groeseK1) {
		this.groeseK1 = groeseK1;
	}



	public int getGroeseK2() {
		return groeseK2;
	}



	public void setGroeseK2(int groeseK2) {
		this.groeseK2 = groeseK2;
	}



	public boolean maximaleZuege(int x, boolean y) {
		
		if(x == 4 && y == false) {
			return true;
		}
		
		return false;
		
		
	}
	
	
	
	public boolean alleFelderBesetzt(Color s1, Color s2) {
		
		for(int i = 0; i < spielbrettArray.length; i++) {
			
			for(int j = 0; j < spielbrettArray[i].length; j++) {
				
				Color feldFarbe = spielbrettArray[i][j].getBackground();
				if(!(feldFarbe.equals(s1)) && !(feldFarbe.equals(s2)) ) {
					return false;
				}
				
			}
			
		}
		
		return true;
		
	}
	
	
	
	
	
	
	/*
	 * In dieser Methode ueberprueft man die Umgebung des jeweiligen Feldes und fuegt diese bei gleicher
	 * Farbe zur Komponente hinzu
	 */
	public void nachbarAufnehmen(ArrayList<JPanel> K,Color farbe, int zeile, int spalte) {
		
						
			
			if(zeile > 0) {
				Color obererNachbar = spielbrettArray[zeile-1][spalte].getBackground();
				if(obererNachbar.equals(farbe)) {
					
					if(K.contains(spielbrettArray[zeile-1][spalte])) {
					} else {
						K.add(spielbrettArray[zeile-1][spalte]);
					}
					
					
				}
					
				
			}
			
			if(zeile < gewaehlteZeilenAnzahl-1) {
				
				Color untererNachbar = spielbrettArray[zeile+1][spalte].getBackground();
				if(untererNachbar.equals(farbe)) {
					
					if(K.contains(spielbrettArray[zeile+1][spalte])) {
					} else {
						K.add(spielbrettArray[zeile+1][spalte]);

					}
							
				}
				
			}
			
			if(spalte > 0) {
				
				Color rechterNachbar = spielbrettArray[zeile][spalte-1].getBackground();
				if(rechterNachbar.equals(farbe)) {
					
					if(K.contains(spielbrettArray[zeile][spalte-1])) {
					} else {
						K.add(spielbrettArray[zeile][spalte-1]);

					}
					
				
			}
			
						
					
				
			}
			
			if(spalte < gewaehlteSpaltenAnzahl-1) {
				
				Color linkerNachbar = spielbrettArray[zeile][spalte+1].getBackground();
				if(linkerNachbar.equals(farbe)) {
					
					if(K.contains(spielbrettArray[zeile][spalte+1])) {
					} else {
						K.add(spielbrettArray[zeile][spalte+1]);

					}
					
				}
				
				
			}
			
			
		}
	
	
	public int komponenteAnpassen(ArrayList<JPanel> K, Color geklickteFarbe, int groeseK) {
		
		for(int i = 0; i < K.size(); i++) {
			K.get(i).setBackground(geklickteFarbe);
			int zeile = getZeile(spielbrettArray, K.get(i), gewaehlteZeilenAnzahl, gewaehlteSpaltenAnzahl);
			int spalte = getSpalte(spielbrettArray, K.get(i), gewaehlteZeilenAnzahl, gewaehlteSpaltenAnzahl);
			
			nachbarAufnehmen(K,geklickteFarbe, zeile, spalte);
		}
		groeseK = K.size();
		return groeseK;

		

		

	}
				
		
		
	
	
	
	
	//Aktuelle Zeile des Feldes wird zurueckgegeben
	public int getZeile(JPanel[][] brett, JPanel panel, int zeilen, int spalten) {
		
		for(int i = 0; i < zeilen; i++) {
			for(int j = 0; j < spalten; j++) {
				
				if(brett[i][j].equals(panel)) {
					return i;
				}
				
				
			}
		}
		
		return 0;
		
	}
	
	
	

	//Aktuelle Spalte des Feldes wird zurückgegeben
public int getSpalte(JPanel[][] brett, JPanel panel, int zeilen, int spalten) {
		
		for(int i = 0; i < zeilen; i++) {
			for(int j = 0; j < spalten; j++) {
				
				if(brett[i][j].equals(panel)) {
					return j;
				}
				
				
			}
		}
		
		return 0;
		
	}


	public void strat1() {
		
		
		
	}
	
	
	
	
	}


