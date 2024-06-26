package logic;

//Name Luan Zekiri
//Matrikelnummer 7379949

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
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
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import testing.Testing;

import javax.swing.*;
import java.awt.*;

public class JPanels extends JPanel {

	// Alle Fenster bzw. JPanels
	private MyFrame myFrame;
	private JPanel menueTafel;
	private JPanel spielBrett;
	private JPanel farbenAnzeige = new JPanel();

	public int getVerfuegbareZahlenAnzahl() {
		return verfuegbareZahlenAnzahl;
	}

	public void setVerfuegbareZahlenAnzahl(int verfuegbareZahlenAnzahl) {
		this.verfuegbareZahlenAnzahl = verfuegbareZahlenAnzahl;
	}

	public ArrayList<Color> getAktuellVerfuegbareFarbenPC() {
		return aktuellVerfuegbareFarbenPC;
	}

	public void setAktuellVerfuegbareFarbenPC(ArrayList<Color> aktuellVerfuegbareFarbenPC) {
		this.aktuellVerfuegbareFarbenPC = aktuellVerfuegbareFarbenPC;
	}

	public boolean isMax() {
		return max;
	}

	public void setMax(boolean max) {
		this.max = max;
	}

	public boolean isEndKonf() {
		return endKonf;
	}

	public void setEndKonf(boolean endKonf) {
		this.endKonf = endKonf;
	}

	public JButton getPlayButton() {
		return playButton;
	}

	public void setPlayButton(JButton playButton) {
		this.playButton = playButton;
	}

	public boolean isErstesMalGedrueckt() {
		return erstesMalGedrueckt;
	}

	public void setErstesMalGedrueckt(boolean erstesMalGedrueckt) {
		this.erstesMalGedrueckt = erstesMalGedrueckt;
	}

	public int getColorZahl() {
		return colorZahl;
	}

	public void setColorZahl(int colorZahl) {
		this.colorZahl = colorZahl;
	}

	public JPanel getOrangePanel() {
		return orangePanel;
	}

	public void setOrangePanel(JPanel orangePanel) {
		this.orangePanel = orangePanel;
	}

	public JPanel getFarbenPanel() {
		return farbenPanel;
	}

	public void setFarbenPanel(JPanel farbenPanel) {
		this.farbenPanel = farbenPanel;
	}

	public int getSpielZugS2OhneVergroeserung() {
		return spielZugS2OhneVergroeserung;
	}

	public void setSpielZugS2OhneVergroeserung(int spielZugS2OhneVergroeserung) {
		this.spielZugS2OhneVergroeserung = spielZugS2OhneVergroeserung;
	}

	public JLabel getK1Info() {
		return K1Info;
	}

	public void setK1Info(JLabel k1Info) {
		K1Info = k1Info;
	}

	public JLabel getK2Info() {
		return K2Info;
	}

	public void setK2Info(JLabel k2Info) {
		K2Info = k2Info;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public Timer getTimer() {
		return timer;
	}

	public void setTimer(Timer timer) {
		this.timer = timer;
	}

	public JLabel getTimerLabel() {
		return timerLabel;
	}

	public void setTimerLabel(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	public ArrayList<JPanel> getK2Copy() {
		return K2Copy;
	}

	public void setK2Copy(ArrayList<JPanel> k2Copy) {
		K2Copy = k2Copy;
	}

	public ArrayList<JPanel> getK1Copy() {
		return K1Copy;
	}

	public void setK1Copy(ArrayList<JPanel> k1Copy) {
		K1Copy = k1Copy;
	}

	public Color getS2FarbeCopy() {
		return s2FarbeCopy;
	}

	public void setS2FarbeCopy(Color s2FarbeCopy) {
		this.s2FarbeCopy = s2FarbeCopy;
	}

	public Color getS2FarbeDavorCopy() {
		return s2FarbeDavorCopy;
	}

	public void setS2FarbeDavorCopy(Color s2FarbeDavorCopy) {
		this.s2FarbeDavorCopy = s2FarbeDavorCopy;
	}

	public int getGroeseK2Copy() {
		return groeseK2Copy;
	}

	public void setGroeseK2Copy(int groeseK2Copy) {
		this.groeseK2Copy = groeseK2Copy;
	}

	public boolean isK1Vergroesert() {
		return k1Vergroesert;
	}

	public void setK1Vergroesert(boolean k1Vergroesert) {
		this.k1Vergroesert = k1Vergroesert;
	}

	public boolean isK2Vergroesert() {
		return k2Vergroesert;
	}

	public void setK2Vergroesert(boolean k2Vergroesert) {
		this.k2Vergroesert = k2Vergroesert;
	}

	public JPanel getZeilenUndSpaltenAnzeige() {
		return zeilenUndSpaltenAnzeige;
	}

	public void setZeilenUndSpaltenAnzeige(JPanel zeilenUndSpaltenAnzeige) {
		this.zeilenUndSpaltenAnzeige = zeilenUndSpaltenAnzeige;
	}

	public JLabel getRows() {
		return rows;
	}

	public void setRows(JLabel rows) {
		this.rows = rows;
	}

	public JLabel getCols() {
		return cols;
	}

	public void setCols(JLabel cols) {
		this.cols = cols;
	}

	public boolean isS1Dran() {
		return s1Dran;
	}

	public void setS1Dran(boolean s1Dran) {
		this.s1Dran = s1Dran;
	}

	public boolean isS2Dran() {
		return s2Dran;
	}

	public void setS2Dran(boolean s2Dran) {
		this.s2Dran = s2Dran;
	}

	public JPanel[][] getSpielbrettArrayCopy() {
		return spielbrettArrayCopy;
	}

	public void setSpielbrettArrayCopy(JPanel[][] spielbrettArrayCopy) {
		this.spielbrettArrayCopy = spielbrettArrayCopy;
	}

	public Field[][] getSpielBrettArrayField() {
		return spielBrettArrayField;
	}

	public void setSpielBrettArrayField(Field[][] spielBrettArrayField) {
		this.spielBrettArrayField = spielBrettArrayField;
	}

	private ArrayList<Color> alleMöglichenFarben = new ArrayList<Color>();
	private ArrayList<Color> ausgewaehlteFarben;
	private ArrayList<Color> aktuellVerfuegbareFarben;
	private int verfuegbareZahlenAnzahl;
	private ArrayList<Color> aktuellVerfuegbareFarbenPC;
	
	private boolean max;
	private boolean endKonf;
	private JButton playButton;
	
	private boolean erstesMalGedrueckt = true;
	
	

	private ArrayList<Color> benutzteFarben;
	private Color removteFarbe;
	private int colorZahl;

	private JPanel blackPanel;
	private JPanel bluePanel;
	private JPanel cyanPanel;
	private JPanel grayPanel;
	private JPanel greenPanel;
	private JPanel brownPanel;
	private JPanel orangePanel;
	private JPanel pinkPanel;
	private JPanel redPanel;
	private JPanel farbenPanel;

	
	private int spielZugS2OhneVergroeserung = 0;

	
	private JLabel K1Info = new JLabel();
	private JLabel K2Info = new JLabel();



	public MyFrame getMyFrame() {
		return myFrame;
	}

	public void setMyFrame(MyFrame myFrame) {
		this.myFrame = myFrame;
	}

	public JPanel getMenueTafel() {
		return menueTafel;
	}

	public void setMenueTafel(JPanel menueTafel) {
		this.menueTafel = menueTafel;
	}

	public JPanel getSpielBrett() {
		return spielBrett;
	}

	public void setSpielBrett(JPanel spielBrett) {
		this.spielBrett = spielBrett;
	}


	public JPanel getFarbenAnzeige() {
		return farbenAnzeige;
	}

	public void setFarbenAnzeige(JPanel farbenAnzeige) {
		this.farbenAnzeige = farbenAnzeige;
	}

	public ArrayList<Color> getAlleMöglichenFarben() {
		return alleMöglichenFarben;
	}

	public void setAlleMöglichenFarben(ArrayList<Color> alleMöglichenFarben) {
		this.alleMöglichenFarben = alleMöglichenFarben;
	}

	public ArrayList<Color> getAusgewaehlteFarben() {
		return ausgewaehlteFarben;
	}

	public void setAusgewaehlteFarben(ArrayList<Color> ausgewaehlteFarben) {
		this.ausgewaehlteFarben = ausgewaehlteFarben;
	}

	public ArrayList<Color> getAktuellVerfuegbareFarben() {
		return aktuellVerfuegbareFarben;
	}

	public void setAktuellVerfuegbareFarben(ArrayList<Color> aktuellVerfuegbareFarben) {
		this.aktuellVerfuegbareFarben = aktuellVerfuegbareFarben;
	}

	public ArrayList<Color> getBenutzteFarben() {
		return benutzteFarben;
	}

	public void setBenutzteFarben(ArrayList<Color> benutzteFarben) {
		this.benutzteFarben = benutzteFarben;
	}

	public Color getRemovteFarbe() {
		return removteFarbe;
	}

	public void setRemovteFarbe(Color removteFarbe) {
		this.removteFarbe = removteFarbe;
	}

	public JPanel getBlackPanel() {
		return blackPanel;
	}

	public void setBlackPanel(JPanel blackPanel) {
		this.blackPanel = blackPanel;
	}

	public JPanel getBluePanel() {
		return bluePanel;
	}

	public void setBluePanel(JPanel bluePanel) {
		this.bluePanel = bluePanel;
	}

	public JPanel getCyanPanel() {
		return cyanPanel;
	}

	public void setCyanPanel(JPanel cyanPanel) {
		this.cyanPanel = cyanPanel;
	}

	public JPanel getGrayPanel() {
		return grayPanel;
	}

	public void setGrayPanel(JPanel grayPanel) {
		this.grayPanel = grayPanel;
	}

	public JPanel getGreenPanel() {
		return greenPanel;
	}

	public void setGreenPanel(JPanel greenPanel) {
		this.greenPanel = greenPanel;
	}

	public JPanel getBrownPanel() {
		return brownPanel;
	}

	public void setBrownPanel(JPanel brownPanel) {
		this.brownPanel = brownPanel;
	}


	public JPanel getPinkPanel() {
		return pinkPanel;
	}

	public void setPinkPanel(JPanel pinkPanel) {
		this.pinkPanel = pinkPanel;
	}

	public JPanel getRedPanel() {
		return redPanel;
	}

	public void setRedPanel(JPanel redPanel) {
		this.redPanel = redPanel;
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

	public String[] getStrat() {
		return strat;
	}

	public void setStrat(String[] strat) {
		this.strat = strat;
	}

	public String[] getFarben() {
		return farben;
	}

	public void setFarben(String[] farben) {
		this.farben = farben;
	}

	public JComboBox<String> getStratAuswahlListe() {
		return stratAuswahlListe;
	}

	public void setStratAuswahlListe(JComboBox<String> stratAuswahlListe) {
		this.stratAuswahlListe = stratAuswahlListe;
	}

	public JComboBox<String> getFarbenAnzahl() {
		return farbenAnzahl;
	}

	public void setFarbenAnzahl(JComboBox<String> farbenAnzahl) {
		this.farbenAnzahl = farbenAnzahl;
	}

	public int getGewaehlteZeilenAnzahl() {
		return gewaehlteZeilenAnzahl;
	}

	public void setGewaehlteZeilenAnzahl(int gewaehlteZeilenAnzahl) {
		this.gewaehlteZeilenAnzahl = gewaehlteZeilenAnzahl;
	}

	public int getGewaehlteSpaltenAnzahl() {
		return gewaehlteSpaltenAnzahl;
	}

	public void setGewaehlteSpaltenAnzahl(int gewaehlteSpaltenAnzahl) {
		this.gewaehlteSpaltenAnzahl = gewaehlteSpaltenAnzahl;
	}

	public String getGewaehlterBeginner() {
		return gewaehlterBeginner;
	}

	public void setGewaehlterBeginner(String gewaehlterBeginner) {
		this.gewaehlterBeginner = gewaehlterBeginner;
	}

	public int getGewaehlteStrategie() {
		return gewaehlteStrategie;
	}

	public void setGewaehlteStrategie(int gewaehlteStrategie) {
		this.gewaehlteStrategie = gewaehlteStrategie;
	}

	public int getFarbenImSpiel() {
		return farbenImSpiel;
	}

	public void setFarbenImSpiel(int farbenImSpiel) {
		this.farbenImSpiel = farbenImSpiel;
	}

	public ArrayList<JPanel> getK1() {
		return K1;
	}

	public void setK1(ArrayList<JPanel> k1) {
		K1 = k1;
	}

	public ArrayList<JPanel> getK2() {
		return K2;
	}

	public void setK2(ArrayList<JPanel> k2) {
		K2 = k2;
	}

	public Color getS1Farbe() {
		return s1Farbe;
	}

	public void setS1Farbe(Color s1Farbe) {
		this.s1Farbe = s1Farbe;
	}

	public Color getS2Farbe() {
		return s2Farbe;
	}

	public void setS2Farbe(Color s2Farbe) {
		this.s2Farbe = s2Farbe;
	}

	public Color getS1FarbeDavor() {
		return s1FarbeDavor;
	}

	public void setS1FarbeDavor(Color s1FarbeDavor) {
		this.s1FarbeDavor = s1FarbeDavor;
	}

	public Color getS2FarbeDavor() {
		return s2FarbeDavor;
	}

	public void setS2FarbeDavor(Color s2FarbeDavor) {
		this.s2FarbeDavor = s2FarbeDavor;
	}

	public int getSpielZuege() {
		return spielZuege;
	}

	public void setSpielZuege(int spielZuege) {
		this.spielZuege = spielZuege;
	}

	public Color getGeklickteFarbe() {
		return geklickteFarbe;
	}

	public void setGeklickteFarbe(Color geklickteFarbe) {
		this.geklickteFarbe = geklickteFarbe;
	}

	

	public JPanel[][] getSpielbrettArray() {
		return spielbrettArray;
	}

	public void setSpielbrettArray(JPanel[][] spielbrettArray) {
		this.spielbrettArray = spielbrettArray;
	}

	public int[][] getKoordinaten() {
		return koordinaten;
	}

	public void setKoordinaten(int[][] koordinaten) {
		this.koordinaten = koordinaten;
	}

	public JRadioButton getS1RadioButton() {
		return s1RadioButton;
	}

	public void setS1RadioButton(JRadioButton s1RadioButton) {
		this.s1RadioButton = s1RadioButton;
	}

	public JRadioButton getS2RadioButton() {
		return s2RadioButton;
	}

	public void setS2RadioButton(JRadioButton s2RadioButton) {
		this.s2RadioButton = s2RadioButton;
	}

	private JButton startButton;
	private JComboBox<String> zeilenAuswahl;
	private JComboBox<String> spaltenAuswahl;
	private String[] zeilenAnzahl = { "3", "4", "5", "6", "7", "8", "9", "10" };
	private String[] spaltenAnzahl = { "3", "4", "5", "6", "7", "8", "9", "10" };
	private int hours;
	private int minutes;
	private int seconds;
	private Timer timer;
	private JLabel timerLabel;
	

	private String[] strat = { "1", "2", "3" };
	private String[] farben = { "4", "5", "6", "7", "8", "9" };
	private JComboBox<String> stratAuswahlListe;
	private JComboBox<String> farbenAnzahl;

	private int gewaehlteZeilenAnzahl;
	private int gewaehlteSpaltenAnzahl;
	private String gewaehlterBeginner;
	private int gewaehlteStrategie;
	private int farbenImSpiel;

	
	private ArrayList<JPanel> K1;
	private ArrayList<JPanel> K2;
	private ArrayList<JPanel> K2Copy;
	private ArrayList<JPanel> K1Copy;
	private Color s1Farbe;
	private Color s2Farbe;
	private Color s2FarbeCopy;
	private Color s1FarbeDavor;
	private Color s2FarbeDavor;
	private Color s2FarbeDavorCopy;


	private int groeseK1;
	private int groeseK2;
	private int groeseK2Copy;
	private int spielZuege;
	private boolean k1Vergroesert;
	private boolean k2Vergroesert;
	private Color geklickteFarbe;
	private JPanel zeilenUndSpaltenAnzeige;
	private JLabel rows;
	private JLabel cols;
	
	private boolean s1Dran;
	private boolean s2Dran;

	private JPanel[][] spielbrettArray;
	private JPanel[][] spielbrettArrayCopy;
	private Field[][] spielBrettArrayField;
	private int[][] koordinaten;

	private JRadioButton s1RadioButton;
	private JRadioButton s2RadioButton;

	public JPanels(MyFrame myFrame) {
		this.myFrame = myFrame;

		this.setLayout(new BorderLayout());
		this.setMinimumSize(new Dimension(500, 500));

		/*
		 * Beide wichtigsten Panel. In menueTafel kommen die Menueeinstellungen, in
		 * anzeigeTafel das Spielbrett
		 */
		menueTafel = new JPanel();
		menueTafel.setLayout(new GridLayout(8,1));
		spielBrett = new JPanel();

		menueTafel.setPreferredSize(new Dimension(myFrame.getWidth() / 3, myFrame.getHeight()));
		spielBrett.setPreferredSize(new Dimension(myFrame.getWidth() / 3 * 2, myFrame.getHeight() / 8 * 7));

		startButton = new JButton("Start");
		startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		startButton.setFocusPainted(false);

		/*
		 * Menuetafel in 2 Teile teilen: Oberer Teil fuer die Konfiguration. Dort zuerst
		 * Titel hinzufuegen mit dem Button
		 */


		/*
		 * Flow Layout fuer Konfiguration, um alle Auswahlmoeglichkeiten direkt
		 * nebeneinander anzeigen zu lassen
		 */
		
		JPanel buttons = new JPanel();
		buttons.setBorder(new TitledBorder("Spielbrett erstellen"));
		
		
		playButton = new JButton("Play");
		playButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		playButton.setFocusPainted(false);


		buttons.add(startButton);
		buttons.add(playButton);


		menueTafel.add(buttons);
		
		
		//JPanel fuer die Zeilen und Spaltenauswahl
		JPanel brettGroese = new JPanel();
		brettGroese.setBorder(new TitledBorder("Spielbrettgroese waehlen"));
		JLabel zeilenanzahlAuswaehlen = new JLabel("Zeilen ", JLabel.LEFT);
		Font f = zeilenanzahlAuswaehlen.getFont();
		zeilenanzahlAuswaehlen.setFont(f.deriveFont(f.getStyle() & ~Font.BOLD));
		brettGroese.add(zeilenanzahlAuswaehlen);
		zeilenAuswahl = new JComboBox<String>(zeilenAnzahl);
		zeilenAuswahl.setSelectedItem("6");
		brettGroese.add(zeilenAuswahl);
		JLabel spaltenanzahlAuswaehlen = new JLabel("Spalten: ");
		Font g = zeilenanzahlAuswaehlen.getFont();
		spaltenanzahlAuswaehlen.setFont(g.deriveFont(g.getStyle() & ~Font.BOLD));
		brettGroese.add(spaltenanzahlAuswaehlen);
		spaltenAuswahl = new JComboBox<String>(spaltenAnzahl);
		spaltenAuswahl.setSelectedItem("6");
		brettGroese.add(spaltenAuswahl);

		menueTafel.add(brettGroese);

		

		
		

		
		//JPanel fuer den Beginner mit den radioButtons
		JPanel beginnerFrage = new JPanel();
		beginnerFrage.setBorder(new TitledBorder("Beginner waehlen"));
		s1RadioButton = new JRadioButton("S1");
		s1RadioButton.setSelected(true);
		s2RadioButton = new JRadioButton("S2");
		beginnerFrage.add(s1RadioButton);
		beginnerFrage.add(s2RadioButton);

		ButtonGroup bg = new ButtonGroup();
		bg.add(s1RadioButton);
		bg.add(s2RadioButton);
		
		menueTafel.add(beginnerFrage);


		
		
		//JPanel fuer Auswahl der Farben
		JPanel farbenPanel = new JPanel();
		farbenPanel.setBorder(new TitledBorder("Farbenanzahl waehlen"));
		JLabel farbenFrage = new JLabel("Farbenanzahl:", JLabel.LEFT);
		Font f1 = farbenFrage.getFont();
		farbenFrage.setFont(f1.deriveFont(f1.getStyle() & ~Font.BOLD));
		farbenFrage.setAlignmentX(Component.CENTER_ALIGNMENT);
		farbenPanel.add(farbenFrage);
		farbenAnzahl = new JComboBox<String>(farben);
		farbenAnzahl.setSelectedItem("5");
		farbenPanel.add(farbenAnzahl);

		menueTafel.add(farbenPanel);
		
		
		
		//JPanel fuer Auswahl der Strategien
		JPanel strategiePanel = new JPanel();
		strategiePanel.setBorder(new TitledBorder("Strategie fuer PC waehlen"));
		JLabel strategieLabel = new JLabel("Strategie PC: ", JLabel.LEFT);
		Font f2 = strategieLabel.getFont();
		strategieLabel.setFont(f1.deriveFont(f2.getStyle() & ~Font.BOLD));
		strategieLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		strategiePanel.add(strategieLabel);
		stratAuswahlListe = new JComboBox<String>(strat);
		stratAuswahlListe.setSelectedItem("1");
		strategiePanel.add(stratAuswahlListe);
		
		
		menueTafel.add(strategiePanel);

		
		hours = 0;
		minutes = 0;
		seconds = 0;
		




		playButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				boolean playClicked = true;

				
				//Wenn Play zum ersten Mal gedrueckt wird
				if (playButton.getText().equals("Play") && erstesMalGedrueckt) {

					playButton.setText("Pause"); 
					if (s2RadioButton.isSelected()) {
						gewaehlterBeginner = s2RadioButton.getText();
						s2Dran = true;
						s1Dran = false;
					} else {
						gewaehlterBeginner = s1RadioButton.getText();
						s2Dran = false;
						s1Dran = true;
					}
					gewaehlteStrategie = Integer.parseInt((String) stratAuswahlListe.getSelectedItem());
					
					
					//Alle Einstellungen ausgrauen
					zeilenAuswahl.setEnabled(false);
					spaltenAuswahl.setEnabled(false);
					s1RadioButton.setEnabled(false);
					s2RadioButton.setEnabled(false);
					farbenAnzahl.setEnabled(false);
					stratAuswahlListe.setEnabled(false);



					startTimer();					
					infoKAendern();
					
					
					
					erstesMalGedrueckt = false;
					
										
					play1();
					
				}else if(playButton.getText().equals("Play") && erstesMalGedrueckt == false) {
					playButton.setText("Pause");
					startTimer();
					play1();
					infoKAendern();

					
						
					}  else if(playButton.getText().equals("Pause")){
						playButton.setText("Play");
						startTimer();


				}
			}
		});



		JPanel anzeige = new JPanel();
		anzeige.setLayout(new BorderLayout());
		anzeige.add(spielBrett, BorderLayout.CENTER);

		anzeige.add(farbenAnzeige, BorderLayout.SOUTH);

		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (startButton.getText().equals("Start")) {

					setup();
					farbenAnzeige.setLayout(new BorderLayout());
					s1Farbe = spielbrettArray[gewaehlteZeilenAnzahl - 1][0].getBackground();
					s2Farbe = spielbrettArray[0][gewaehlteSpaltenAnzahl - 1].getBackground();
					farbenAnzeigeInit(farbenAnzeige, s1Farbe, s2Farbe);
					
										
				} else {
					startButton.setText("Start");
					spielBrett.removeAll();
					spielBrett.repaint();
					
					zeilenAuswahl.setEnabled(true);
					spaltenAuswahl.setEnabled(true);
					s1RadioButton.setEnabled(true);
					s2RadioButton.setEnabled(true);
					farbenAnzahl.setEnabled(true);
					stratAuswahlListe.setEnabled(true);					


					farbenAnzeige.removeAll();
					farbenAnzeige.revalidate();
					farbenAnzeige.repaint();
					
					seconds = 0;
					minutes = 0;
					hours = 0;
					
					timerToZero();
					
					K1Info.setText("");
					K2Info.setText("");

					
					
					String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
					timerLabel.setText(time);
										

				}
			}
		});
		
		JPanel timer = new JPanel();
		timerLabel = new JLabel("0:00:00", SwingConstants.CENTER);
        timerLabel.setFont(new Font("Arial", Font.BOLD, 15));
        timer.add(new JLabel("Timer: "));
        timer.add(timerLabel);
        
		
		
		//JPanel fuer den Timer
		JPanel spieldauer = new JPanel();
		spieldauer.setBorder(new TitledBorder("Spieldauer"));
		spieldauer.add(timer);
		menueTafel.add(spieldauer);
		
		
		
		JPanel bedienungsanleitung = new JPanel();
		bedienungsanleitung.setBorder(new TitledBorder("Bedienungsanleitung"));
		JButton bedienung = new JButton("Bedienungsanleitung");
		bedienung.setBackground(Color.YELLOW);
		bedienung.setFocusPainted(false);
		bedienungsanleitung.add(bedienung);
		menueTafel.add(bedienungsanleitung);
		
		
		
		bedienung.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				Bedienungsanleitung bd = new Bedienungsanleitung();
			}
		});
		
		
		JPanel groese = new JPanel();
		groese.setBorder(new TitledBorder("Groese der Komponenten"));
		groese.setLayout(new BoxLayout(groese,BoxLayout.Y_AXIS));
		K1Info = new JLabel();
		K2Info = new JLabel();
		Font f3 = K1Info.getFont();
		K1Info.setFont(f3.deriveFont(f3.getStyle() & ~Font.BOLD));
		Font f4 = K2Info.getFont();
		K2Info.setFont(f4.deriveFont(f4.getStyle() & ~Font.BOLD));


		groese.add(K1Info);
		groese.add(K2Info);
		menueTafel.add(groese);

		this.add(anzeige, BorderLayout.CENTER);
		this.add(menueTafel, BorderLayout.EAST);

		// Alle farben in der ArrayList hinzufuegen
		alleColorsAdden();
		
		

	}
	
	
	
	public void infoKAendern() {

		K1Info.setText("Groese von S1: " + Integer.toString(groeseK1));
		K2Info.setText("Groese von S2: " + Integer.toString(groeseK2));
	}
	
	
	public boolean startKlar() {
		
		//Test, ob jedes Feld eine andere Farbe hat
				for(int i = 0; i < spielBrettArrayField.length; i++) {
					
					for(int j = 0; j < spielBrettArrayField[i].length; j++) {
						
						int farbe = spielBrettArrayField[i][j].getColor();
						
						if(i < spielBrettArrayField.length-1) {
							if(farbe == spielBrettArrayField[i+1][j].getColor()) {
								return false;
							}
						}
						
						if(j < spielBrettArrayField[i].length-1) {
							
							if(farbe==spielBrettArrayField[i][j+1].getColor()) {
								return false;
							}
							
						}

					}
					
				}
				
				
				ArrayList<Integer> alleFarben = new ArrayList<Integer>();
				
				for(int i = 0; i < spielBrettArrayField.length; i++) {
					
					
					for(int j = 0; j < spielBrettArrayField[i].length; j++) {
						
						if((alleFarben.contains(spielBrettArrayField[i][j].getColor()) == false)) {
							alleFarben.add(spielBrettArrayField[i][j].getColor());
						}
						
					}
				}
				//Gucken, ob alle 6 farben im Spiel sind
				if(alleFarben.size() != 6) {
					return false;
				}
						
				
				//Pruefen, ob untes linkeres Feld eine nanderen Wert hat als unteres rechtes Feld
				if(spielBrettArrayField[spielBrettArrayField.length-1][0].getColor() == spielBrettArrayField[0][spielBrettArrayField[0].length-1].getColor()) {
					return false;
				}
				
				return true;
		
	}
	
	

	public void farbenAnzeigeInit(JPanel panel, Color s1, Color s2) {

		if (startButton.getText().equals("Stop")) {
			panel.setPreferredSize(new Dimension(getWidth(), getHeight() / 8));

			redPanel = new JPanel(new GridBagLayout());
			blackPanel = new JPanel(new GridBagLayout());
			bluePanel = new JPanel(new GridBagLayout());
			cyanPanel = new JPanel(new GridBagLayout());
			grayPanel = new JPanel(new GridBagLayout());
			greenPanel = new JPanel(new GridBagLayout());
			brownPanel = new JPanel(new GridBagLayout());
			orangePanel = new JPanel(new GridBagLayout());
			pinkPanel = new JPanel(new GridBagLayout());
			
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.gridx= 0;
			gbc.gridy = 0;
			gbc.fill = GridBagConstraints.BOTH;
			
			JPanel Leer = new JPanel();
			panel.setLayout(new BorderLayout());
			panel.add(Leer,BorderLayout.NORTH);
			
			farbenPanel = new JPanel();
			farbenPanel.setLayout(new GridLayout());
			panel.add(farbenPanel);
			
			farbenPanel.setLayout(new GridLayout(1, gewaehlteSpaltenAnzahl));



			// Zuerst alle moeglichen Farben deklarieren
			Color brownColour = new Color(153, 102, 0);

			JLabel red = new JLabel("9");
			red.setHorizontalAlignment(JLabel.CENTER);
			red.setForeground(Color.WHITE);
			red.setFont(new Font("Arial", Font.PLAIN, 16));
			redPanel.add(red);
			redPanel.setBackground(Color.red);
			redPanel.setBorder(BorderFactory.createLineBorder(Color.black));
			
			

			JLabel black = new JLabel("1");
			black.setHorizontalAlignment(JLabel.CENTER);
			black.setForeground(Color.WHITE);
			black.setFont(new Font("Arial", Font.PLAIN, 16));
			blackPanel.add(black);
			blackPanel.setBorder(BorderFactory.createLineBorder(Color.black));
			blackPanel.setBackground(Color.BLACK);


			JLabel blue = new JLabel("2");
			blue.setHorizontalAlignment(JLabel.CENTER);
			blue.setForeground(Color.WHITE);
			blue.setFont(new Font("Arial", Font.PLAIN, 16));
			bluePanel.add(blue);
			bluePanel.setBorder(BorderFactory.createLineBorder(Color.black));
			bluePanel.setBackground(Color.BLUE);

			
			JLabel cyan = new JLabel("3");
			cyan.setHorizontalAlignment(JLabel.CENTER);
			cyan.setForeground(Color.WHITE);
			cyan.setFont(new Font("Arial", Font.PLAIN, 16));
			cyanPanel.add(cyan);
			cyanPanel.setBorder(BorderFactory.createLineBorder(Color.black));
			cyanPanel.setBackground(Color.CYAN);

			
			JLabel gray = new JLabel("4");
			gray.setHorizontalAlignment(JLabel.CENTER);
			gray.setForeground(Color.WHITE);
			gray.setFont(new Font("Arial", Font.PLAIN, 16));
			grayPanel.add(gray);
			grayPanel.setBorder(BorderFactory.createLineBorder(Color.black));
			grayPanel.setBackground(Color.GRAY);
			
			
			
			JLabel green = new JLabel("5");
			green.setHorizontalAlignment(JLabel.CENTER);
			green.setForeground(Color.WHITE);
			green.setFont(new Font("Arial", Font.PLAIN, 16));
			greenPanel.add(green);
			greenPanel.setBorder(BorderFactory.createLineBorder(Color.black));
			greenPanel.setBackground(Color.green);
			

			JLabel brown = new JLabel("6");
			brown.setHorizontalAlignment(JLabel.CENTER);
			brown.setForeground(Color.WHITE);
			brown.setFont(new Font("Arial", Font.PLAIN, 16));
			brownPanel.add(brown);
			brownPanel.setBorder(BorderFactory.createLineBorder(Color.black));
			brownPanel.setBackground(brownColour);
			

			JLabel orange = new JLabel("7");
			orange.setHorizontalAlignment(JLabel.CENTER);
			orange.setForeground(Color.WHITE);
			orange.setFont(new Font("Arial", Font.PLAIN, 16));
			orangePanel.add(orange);
			orangePanel.setBorder(BorderFactory.createLineBorder(Color.black));
			orangePanel.setBackground(Color.orange);
			
			

			JLabel pink = new JLabel("8");
			pink.setHorizontalAlignment(JLabel.CENTER);
			pink.setForeground(Color.WHITE);
			pink.setFont(new Font("Arial", Font.PLAIN, 16));
			pinkPanel.add(pink);
			pinkPanel.setBorder(BorderFactory.createLineBorder(Color.black));
			pinkPanel.setBackground(Color.pink);
			
			
			
			
			//Funktion, dass wenn man unten di farbe anklickt, die Komponente die Farbe auch annimmt. Fuer jedes Panel einzeln
			
			blackPanel.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {
					
					
					int groeseK1Davor = groeseK1;
					Color farbe = Color.black;


					if(s1Dran && (max == false && endKonf == false)) {


					if (aktuellVerfuegbareFarben.contains(farbe)) {
						spielZuege++;
						groeseK1 = komponenteAnpassen(K1, farbe, groeseK1);

						s1FarbeDavor = s1Farbe;
						s1Farbe = farbe;
						


						aktuellVerfuegbareFarben.add(removteFarbe);

						aktuellVerfuegbareFarben.remove(farbe);
						removteFarbe = farbe;

						anzeigeAktualisierenMouse(farbe);
						
						if(groeseK1 > groeseK1Davor) {
							spielZugS2OhneVergroeserung=0;
						} else {
							spielZugS2OhneVergroeserung++;
						}
						
						s1Dran = false;
						s2Dran = true;
						
						infoKAendern();

					

						max = maximaleZuege();
						endKonf = alleFelderBesetzt();
						
					
						
						if(max == true || endKonf == true) {
							if(timer != null && timer.isRunning()) {
								timer.stop();
							}
							spielZugS2OhneVergroeserung = 0;
							if(max) {
								Endfenster unentscheden = new Endfenster("Test",3);
							} else {
								if(K1.size() > K2.size()) {
									Endfenster unentscheden = new Endfenster("S1",1);
								} else if(K1.size() < K2.size()) {
									Endfenster unentscheden = new Endfenster("S2",1);

								} else {
									Endfenster unentscheden = new Endfenster("Test",2);

								}
								
							}
							spielEnde();
							return;
						}
						
						Timer timer = new Timer(1000, new ActionListener() {
							  @Override
							  public void actionPerformed(ActionEvent arg0) {
									Color c = null;

								  switch(gewaehlteStrategie) {
									
									case 1:
										c = strategy1(spielbrettArray);
										spielZugs2(c);


										break;
										
									case 2:
										c = strategy2(spielbrettArray);
										spielZugs2(c);


										break;
									
									case 3:
										c = strategy3(spielbrettArray);
										spielZugs2(c);
										break;
						
									}							
								  }
							});
							timer.setRepeats(false);
							timer.start(); 
							
						
					}
					
					}
											
					

				}
				
			});
			
			
			bluePanel.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {
					
					
					int groeseK1Davor = groeseK1;
					Color farbe = Color.blue;


					if(s1Dran && (max == false && endKonf == false)) {


					if (aktuellVerfuegbareFarben.contains(farbe)) {
						spielZuege++;
						groeseK1 = komponenteAnpassen(K1, farbe, groeseK1);

						s1FarbeDavor = s1Farbe;
						s1Farbe = farbe;
						


						aktuellVerfuegbareFarben.add(removteFarbe);

						aktuellVerfuegbareFarben.remove(farbe);
						removteFarbe = farbe;

						anzeigeAktualisierenMouse(farbe);
						
						if(groeseK1 > groeseK1Davor) {
							spielZugS2OhneVergroeserung=0;
						} else {
							spielZugS2OhneVergroeserung++;
						}
						
						s1Dran = false;
						s2Dran = true;
						
						infoKAendern();

					

						max = maximaleZuege();
						endKonf = alleFelderBesetzt();
						
					
						
						if(max == true || endKonf == true) {
							if(timer != null && timer.isRunning()) {
								timer.stop();
							}
							spielZugS2OhneVergroeserung = 0;
							if(max) {
								Endfenster unentscheden = new Endfenster("Test",3);
							} else {
								if(K1.size() > K2.size()) {
									Endfenster unentscheden = new Endfenster("S1",1);
								} else if(K1.size() < K2.size()) {
									Endfenster unentscheden = new Endfenster("S2",1);

								} else {
									Endfenster unentscheden = new Endfenster("Test",2);

								}
								
							}
							spielEnde();
							return;
						}
						
						Timer timer = new Timer(1000, new ActionListener() {
							  @Override
							  public void actionPerformed(ActionEvent arg0) {
									Color c = null;

								  switch(gewaehlteStrategie) {
									
									case 1:
										c = strategy1(spielbrettArray);
										spielZugs2(c);


										break;
										
									case 2:
										c = strategy2(spielbrettArray);
										spielZugs2(c);


										break;
									
									case 3:
										c = strategy3(spielbrettArray);
										spielZugs2(c);
										break;
						
									}							
								  }
							});
							timer.setRepeats(false);;
							timer.start();
							
						
					}
					
					}
											
					

				}
				
			});
		
			
			
			cyanPanel.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {
					
					
					int groeseK1Davor = groeseK1;
					Color farbe = Color.cyan;


					if(s1Dran && (max == false && endKonf == false)) {


					if (aktuellVerfuegbareFarben.contains(farbe)) {
						spielZuege++;
						groeseK1 = komponenteAnpassen(K1, farbe, groeseK1);

						s1FarbeDavor = s1Farbe;
						s1Farbe = farbe;
						
						aktuellVerfuegbareFarben.add(removteFarbe);

						aktuellVerfuegbareFarben.remove(farbe);
						removteFarbe = farbe;

						anzeigeAktualisierenMouse(farbe);
						
						if(groeseK1 > groeseK1Davor) {
							spielZugS2OhneVergroeserung=0;
						} else {
							spielZugS2OhneVergroeserung++;
						}
						
						s1Dran = false;
						s2Dran = true;
						
						infoKAendern();

					

						max = maximaleZuege();
						endKonf = alleFelderBesetzt();
						
					
						
						if(max == true || endKonf == true) {
							if(timer != null && timer.isRunning()) {
								timer.stop();
							}
							spielZugS2OhneVergroeserung = 0;
							if(max) {
								Endfenster unentscheden = new Endfenster("Test",3);
							} else {
								if(K1.size() > K2.size()) {
									Endfenster unentscheden = new Endfenster("S1",1);
								} else if(K1.size() < K2.size()) {
									Endfenster unentscheden = new Endfenster("S2",1);

								} else {
									Endfenster unentscheden = new Endfenster("Test",2);

								}
								
							}
							spielEnde();
							return;
						}
						
						Timer timer = new Timer(1000, new ActionListener() {
							  @Override
							  public void actionPerformed(ActionEvent arg0) {
									Color c = null;

								  switch(gewaehlteStrategie) {
									
									case 1:
										c = strategy1(spielbrettArray);
										spielZugs2(c);


										break;
										
									case 2:
										c = strategy2(spielbrettArray);
										spielZugs2(c);


										break;
									
									case 3:
										c = strategy3(spielbrettArray);
										spielZugs2(c);
										break;
						
									}							
								  }
							});
							timer.setRepeats(false);
							timer.start(); 
							
						
					}
					
					}
											
					

				}
				
			});
			
			
			grayPanel.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {
					
					
					int groeseK1Davor = groeseK1;
					Color farbe = Color.gray;


					if(s1Dran && (max == false && endKonf == false)) {


					if (aktuellVerfuegbareFarben.contains(farbe)) {
						spielZuege++;
						groeseK1 = komponenteAnpassen(K1, farbe, groeseK1);

						s1FarbeDavor = s1Farbe;
						s1Farbe = farbe;
						


						aktuellVerfuegbareFarben.add(removteFarbe);

						aktuellVerfuegbareFarben.remove(farbe);
						removteFarbe = farbe;

						anzeigeAktualisierenMouse(farbe);
						
						if(groeseK1 > groeseK1Davor) {
							spielZugS2OhneVergroeserung=0;
						} else {
							spielZugS2OhneVergroeserung++;
						}
						
						s1Dran = false;
						s2Dran = true;
						
						infoKAendern();

					

						max = maximaleZuege();
						endKonf = alleFelderBesetzt();
						
					
						
						if(max == true || endKonf == true) {
							if(timer != null && timer.isRunning()) {
								timer.stop();
							}
							spielZugS2OhneVergroeserung = 0;
							if(max) {
								Endfenster unentscheden = new Endfenster("Test",3);
							} else {
								if(K1.size() > K2.size()) {
									Endfenster unentscheden = new Endfenster("S1",1);
								} else if(K1.size() < K2.size()) {
									Endfenster unentscheden = new Endfenster("S2",1);

								} else {
									Endfenster unentscheden = new Endfenster("Test",2);

								}
								
							}
							spielEnde();
							return;
						}
						
						Timer timer = new Timer(1000, new ActionListener() {
							  @Override
							  public void actionPerformed(ActionEvent arg0) {
									Color c = null;

								  switch(gewaehlteStrategie) {
									
									case 1:
										c = strategy1(spielbrettArray);
										spielZugs2(c);


										break;
										
									case 2:
										c = strategy2(spielbrettArray);
										spielZugs2(c);


										break;
									
									case 3:
										c = strategy3(spielbrettArray);
										spielZugs2(c);
										break;
						
									}							
								  }
							});
							timer.setRepeats(false);
							timer.start(); 
							
						
					}
					
					}
											
					

				}
				
			});
			
			
			greenPanel.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {
					
					
					int groeseK1Davor = groeseK1;
					Color farbe = Color.green;


					if(s1Dran && (max == false && endKonf == false)) {


					if (aktuellVerfuegbareFarben.contains(farbe)) {
						spielZuege++;
						groeseK1 = komponenteAnpassen(K1, farbe, groeseK1);

						s1FarbeDavor = s1Farbe;
						s1Farbe = farbe;
						


						aktuellVerfuegbareFarben.add(removteFarbe);

						aktuellVerfuegbareFarben.remove(farbe);
						removteFarbe = farbe;

						anzeigeAktualisierenMouse(farbe);
						
						if(groeseK1 > groeseK1Davor) {
							spielZugS2OhneVergroeserung=0;
						} else {
							spielZugS2OhneVergroeserung++;
						}
						
						s1Dran = false;
						s2Dran = true;
						
						infoKAendern();

					

						max = maximaleZuege();
						endKonf = alleFelderBesetzt();
						
					
						
						if(max == true || endKonf == true) {
							if(timer != null && timer.isRunning()) {
								timer.stop();
							}
							spielZugS2OhneVergroeserung = 0;
							if(max) {
								Endfenster unentscheden = new Endfenster("Test",3);
							} else {
								if(K1.size() > K2.size()) {
									Endfenster unentscheden = new Endfenster("S1",1);
								} else if(K1.size() < K2.size()) {
									Endfenster unentscheden = new Endfenster("S2",1);

								} else {
									Endfenster unentscheden = new Endfenster("Test",2);

								}
								
							}
							spielEnde();
							return;
						}
						
						Timer timer = new Timer(1000, new ActionListener() {
							  @Override
							  public void actionPerformed(ActionEvent arg0) {
									Color c = null;

								  switch(gewaehlteStrategie) {
									
									case 1:
										c = strategy1(spielbrettArray);
										spielZugs2(c);


										break;
										
									case 2:
										c = strategy2(spielbrettArray);
										spielZugs2(c);


										break;
									
									case 3:
										c = strategy3(spielbrettArray);
										spielZugs2(c);
										break;
						
									}							
								  }
							});
							timer.setRepeats(false);
							timer.start();
							
						
					}
					
					}
											
					

				}
				
			});
			
			
			brownPanel.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {
					
					
					int groeseK1Davor = groeseK1;
					Color farbe = brownColour;


					if(s1Dran && (max == false && endKonf == false)) {


					if (aktuellVerfuegbareFarben.contains(farbe)) {
						spielZuege++;
						groeseK1 = komponenteAnpassen(K1, farbe, groeseK1);

						s1FarbeDavor = s1Farbe;
						s1Farbe = farbe;
						


						aktuellVerfuegbareFarben.add(removteFarbe);

						aktuellVerfuegbareFarben.remove(farbe);
						removteFarbe = farbe;

						anzeigeAktualisierenMouse(farbe);
						
						if(groeseK1 > groeseK1Davor) {
							spielZugS2OhneVergroeserung=0;
						} else {
							spielZugS2OhneVergroeserung++;
						}
						
						s1Dran = false;
						s2Dran = true;
						
						infoKAendern();

					

						max = maximaleZuege();
						endKonf = alleFelderBesetzt();
						
					
						
						if(max == true || endKonf == true) {
							if(timer != null && timer.isRunning()) {
								timer.stop();
							}
							spielZugS2OhneVergroeserung = 0;
							if(max) {
								Endfenster unentscheden = new Endfenster("Test",3);
							} else {
								if(K1.size() > K2.size()) {
									Endfenster unentscheden = new Endfenster("S1",1);
								} else if(K1.size() < K2.size()) {
									Endfenster unentscheden = new Endfenster("S2",1);

								} else {
									Endfenster unentscheden = new Endfenster("Test",2);

								}
								
							}
							spielEnde();
							return;
						}
						
						Timer timer = new Timer(1000, new ActionListener() {
							  @Override
							  public void actionPerformed(ActionEvent arg0) {
									Color c = null;

								  switch(gewaehlteStrategie) {
									
									case 1:
										c = strategy1(spielbrettArray);
										spielZugs2(c);


										break;
										
									case 2:
										c = strategy2(spielbrettArray);
										spielZugs2(c);


										break;
									
									case 3:
										c = strategy3(spielbrettArray);
										spielZugs2(c);
										break;
						
									}							
								  }
							});
							timer.setRepeats(false);
							timer.start(); 
							
						
					}
					
					}
											
					

				}
				
			});
			
			
			orangePanel.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {
					
					
					int groeseK1Davor = groeseK1;
					Color farbe = Color.orange;


					if(s1Dran && (max == false && endKonf == false)) {


					if (aktuellVerfuegbareFarben.contains(farbe)) {
						spielZuege++;
						groeseK1 = komponenteAnpassen(K1, farbe, groeseK1);

						s1FarbeDavor = s1Farbe;
						s1Farbe = farbe;
						


						aktuellVerfuegbareFarben.add(removteFarbe);

						aktuellVerfuegbareFarben.remove(farbe);
						removteFarbe = farbe;

						anzeigeAktualisierenMouse(farbe);
						
						if(groeseK1 > groeseK1Davor) {
							spielZugS2OhneVergroeserung=0;
						} else {
							spielZugS2OhneVergroeserung++;
						}
						
						s1Dran = false;
						s2Dran = true;
						
						infoKAendern();

					

						max = maximaleZuege();
						endKonf = alleFelderBesetzt();
						
					
						
						if(max == true || endKonf == true) {
							if(timer != null && timer.isRunning()) {
								timer.stop();
							}
							spielZugS2OhneVergroeserung = 0;
							if(max) {
								Endfenster unentscheden = new Endfenster("Test",3);
							} else {
								if(K1.size() > K2.size()) {
									Endfenster unentscheden = new Endfenster("S1",1);
								} else if(K1.size() < K2.size()) {
									Endfenster unentscheden = new Endfenster("S2",1);

								} else {
									Endfenster unentscheden = new Endfenster("Test",2);

								}
								
							}
							spielEnde();
							return;
						}
						
						Timer timer = new Timer(1000, new ActionListener() {
							  @Override
							  public void actionPerformed(ActionEvent arg0) {
									Color c = null;

								  switch(gewaehlteStrategie) {
									
									case 1:
										c = strategy1(spielbrettArray);
										spielZugs2(c);


										break;
										
									case 2:
										c = strategy2(spielbrettArray);
										spielZugs2(c);


										break;
									
									case 3:
										c = strategy3(spielbrettArray);
										spielZugs2(c);
										break;
						
									}							
								  }
							});
							timer.setRepeats(false);
							timer.start();
							
						
					}
					
					}
											
					

				}
				
			});
			
			
			pinkPanel.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {
					
					
					int groeseK1Davor = groeseK1;
					Color farbe = Color.pink;


					if(s1Dran && (max == false && endKonf == false)) {


					if (aktuellVerfuegbareFarben.contains(farbe)) {
						spielZuege++;
						groeseK1 = komponenteAnpassen(K1, farbe, groeseK1);

						s1FarbeDavor = s1Farbe;
						s1Farbe = farbe;
						


						aktuellVerfuegbareFarben.add(removteFarbe);

						aktuellVerfuegbareFarben.remove(farbe);
						removteFarbe = farbe;

						anzeigeAktualisierenMouse(farbe);
						
						if(groeseK1 > groeseK1Davor) {
							spielZugS2OhneVergroeserung=0;
						} else {
							spielZugS2OhneVergroeserung++;
						}
						
						s1Dran = false;
						s2Dran = true;
						
						infoKAendern();

					

						max = maximaleZuege();
						endKonf = alleFelderBesetzt();
						
					
						
						if(max == true || endKonf == true) {
							if(timer != null && timer.isRunning()) {
								timer.stop();
							}
							spielZugS2OhneVergroeserung = 0;
							if(max) {
								Endfenster unentscheden = new Endfenster("Test",3);
							} else {
								if(K1.size() > K2.size()) {
									Endfenster unentscheden = new Endfenster("S1",1);
								} else if(K1.size() < K2.size()) {
									Endfenster unentscheden = new Endfenster("S2",1);

								} else {
									Endfenster unentscheden = new Endfenster("Test",2);

								}
								
							}
							spielEnde();
							return;
						}
						
						Timer timer = new Timer(1000, new ActionListener() {
							  @Override
							  public void actionPerformed(ActionEvent arg0) {
									Color c = null;

								  switch(gewaehlteStrategie) {
									
									case 1:
										c = strategy1(spielbrettArray);
										spielZugs2(c);


										break;
										
									case 2:
										c = strategy2(spielbrettArray);
										spielZugs2(c);


										break;
									
									case 3:
										c = strategy3(spielbrettArray);
										spielZugs2(c);
										break;
						
									}							
								  }
							});
							timer.setRepeats(false);
							timer.start(); 
							
						
					}
					
					}
											
					

				}
				
			});
			
			redPanel.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {
					
					
					int groeseK1Davor = groeseK1;
					Color farbe = Color.red;


					if(s1Dran && (max == false && endKonf == false)) {


					if (aktuellVerfuegbareFarben.contains(farbe)) {
						spielZuege++;
						groeseK1 = komponenteAnpassen(K1, farbe, groeseK1);

						s1FarbeDavor = s1Farbe;
						s1Farbe = farbe;
						


						aktuellVerfuegbareFarben.add(removteFarbe);

						aktuellVerfuegbareFarben.remove(farbe);
						removteFarbe = farbe;

						anzeigeAktualisierenMouse(farbe);
						
						if(groeseK1 > groeseK1Davor) {
							spielZugS2OhneVergroeserung=0;
						} else {
							spielZugS2OhneVergroeserung++;
						}
						
						s1Dran = false;
						s2Dran = true;
						
						infoKAendern();

					

						max = maximaleZuege();
						endKonf = alleFelderBesetzt();
						
					
						
						if(max == true || endKonf == true) {
							if(timer != null && timer.isRunning()) {
								timer.stop();
							}
							spielZugS2OhneVergroeserung = 0;
							if(max) {
								Endfenster unentscheden = new Endfenster("Test",3);
							} else {
								if(K1.size() > K2.size()) {
									Endfenster unentscheden = new Endfenster("S1",1);
								} else if(K1.size() < K2.size()) {
									Endfenster unentscheden = new Endfenster("S2",1);

								} else {
									Endfenster unentscheden = new Endfenster("Test",2);

								}
								
							}
							spielEnde();
							return;
						}
						
						Timer timer = new Timer(1000, new ActionListener() {
							  @Override
							  public void actionPerformed(ActionEvent arg0) {
									Color c = null;

								  switch(gewaehlteStrategie) {
									
									case 1:
										c = strategy1(spielbrettArray);
										spielZugs2(c);


										break;
										
									case 2:
										c = strategy2(spielbrettArray);
										spielZugs2(c);


										break;
									
									case 3:
										c = strategy3(spielbrettArray);
										spielZugs2(c);
										break;
						
									}							
								  }
							});
							timer.setRepeats(false);
							timer.start();
							
						
					}
					
					}
											
					

				}
				
			});
			
			
			
			

			// Ersten Spielzug initialisieren

			if (farbenImSpiel == 4) {
				if ((s1.equals(Color.black) == false) && ((s2.equals(Color.black)) == false)) {
					farbenPanel.add(blackPanel);

				}
				if ((s1.equals(Color.blue) == false) && ((s2.equals(Color.blue)) == false)) {
					farbenPanel.add(bluePanel);

				}
				if ((s1.equals(Color.cyan) == false) && (s2.equals(Color.cyan)) == false) {
					farbenPanel.add(cyanPanel);

				}
				if ((s1.equals(Color.gray) == false) && (s2.equals(Color.gray)) == false) {
					farbenPanel.add(grayPanel);

				}

			}

			if (farbenImSpiel == 5) {

				if ((s1.equals(Color.black) == false) && ((s2.equals(Color.black)) == false)) {
					farbenPanel.add(blackPanel);

				}
				if ((s1.equals(Color.blue) == false) && ((s2.equals(Color.blue)) == false)) {
					farbenPanel.add(bluePanel);

				}
				if ((s1.equals(Color.cyan) == false) && (s2.equals(Color.cyan)) == false) {
					farbenPanel.add(cyanPanel);

				}
				if ((s1.equals(Color.gray) == false) && (s2.equals(Color.gray)) == false) {
					farbenPanel.add(grayPanel);

				}

				if ((s1.equals(Color.green) == false) && (s2.equals(Color.green)) == false) {
					farbenPanel.add(greenPanel);

				}
			}

			if (farbenImSpiel == 6) {
				if ((s1.equals(Color.black) == false) && ((s2.equals(Color.black)) == false)) {
					farbenPanel.add(blackPanel);

				}
				if ((s1.equals(Color.blue) == false) && ((s2.equals(Color.blue)) == false)) {
					farbenPanel.add(bluePanel);

				}
				if ((s1.equals(Color.cyan) == false) && (s2.equals(Color.cyan)) == false) {
					farbenPanel.add(cyanPanel);

				}
				if ((s1.equals(Color.gray) == false) && (s2.equals(Color.gray)) == false) {
					farbenPanel.add(grayPanel);

				}

				if ((s1.equals(Color.green) == false) && (s2.equals(Color.green)) == false) {
					farbenPanel.add(greenPanel);

				}
				if ((s1.equals(brownColour) == false) && (s2.equals(brownColour)) == false) {
					farbenPanel.add(brownPanel);

				}

			}

			if (farbenImSpiel == 7) {
				if ((s1.equals(Color.black) == false) && ((s2.equals(Color.black)) == false)) {
					farbenPanel.add(blackPanel);

				}
				if ((s1.equals(Color.blue) == false) && ((s2.equals(Color.blue)) == false)) {
					farbenPanel.add(bluePanel);

				}
				if ((s1.equals(Color.cyan) == false) && (s2.equals(Color.cyan)) == false) {
					farbenPanel.add(cyanPanel);

				}
				if ((s1.equals(Color.gray) == false) && (s2.equals(Color.gray)) == false) {
					farbenPanel.add(grayPanel);

				}

				if ((s1.equals(Color.green) == false) && (s2.equals(Color.green)) == false) {
					farbenPanel.add(greenPanel);

				}
				if ((s1.equals(brownColour) == false) && (s2.equals(brownColour)) == false) {
					farbenPanel.add(brownPanel);

				}

				if ((s1.equals(Color.orange) == false) && (s2.equals(Color.orange)) == false) {

					farbenPanel.add(orangePanel);

				}
			}

			if (farbenImSpiel == 8) {
				if ((s1.equals(Color.black) == false) && ((s2.equals(Color.black)) == false)) {
					farbenPanel.add(blackPanel);

				}
				if ((s1.equals(Color.blue) == false) && ((s2.equals(Color.blue)) == false)) {
					farbenPanel.add(bluePanel);

				}
				if ((s1.equals(Color.cyan) == false) && (s2.equals(Color.cyan)) == false) {
					farbenPanel.add(cyanPanel);

				}
				if ((s1.equals(Color.gray) == false) && (s2.equals(Color.gray)) == false) {
					farbenPanel.add(grayPanel);

				}

				if ((s1.equals(Color.green) == false) && (s2.equals(Color.green)) == false) {
					farbenPanel.add(greenPanel);

				}
				if ((s1.equals(brownColour) == false) && (s2.equals(brownColour)) == false) {
					farbenPanel.add(brownPanel);

				}

				if ((s1.equals(Color.orange) == false) && (s2.equals(Color.orange)) == false) {

					farbenPanel.add(orangePanel);

				}

				if ((s1.equals(Color.pink) == false) && (s2.equals(Color.pink)) == false) {

					farbenPanel.add(pinkPanel);

				}

			}

			if (farbenImSpiel == 9) {
				if ((s1.equals(Color.black) == false) && ((s2.equals(Color.black)) == false)) {
					farbenPanel.add(blackPanel);

				}
				if ((s1.equals(Color.blue) == false) && ((s2.equals(Color.blue)) == false)) {
					farbenPanel.add(bluePanel);

				}
				if ((s1.equals(Color.cyan) == false) && (s2.equals(Color.cyan)) == false) {
					farbenPanel.add(cyanPanel);

				}
				if ((s1.equals(Color.gray) == false) && (s2.equals(Color.gray)) == false) {
					farbenPanel.add(grayPanel);

				}

				if ((s1.equals(Color.green) == false) && (s2.equals(Color.green)) == false) {
					farbenPanel.add(greenPanel);

				}
				if ((s1.equals(brownColour) == false) && (s2.equals(brownColour)) == false) {
					farbenPanel.add(brownPanel);

				}

				if ((s1.equals(Color.orange) == false) && (s2.equals(Color.orange)) == false) {

					farbenPanel.add(orangePanel);

				}

				if ((s1.equals(Color.pink) == false) && (s2.equals(Color.pink)) == false) {

					farbenPanel.add(pinkPanel);

				}

				if ((s1.equals(Color.red) == false) && (s2.equals(Color.red)) == false) {

					farbenPanel.add(redPanel);

				}

			}

		}

	}
	
	
	public void startTimer() {
		
		
		if(timer != null && timer.isRunning()) {
			timer.stop();
			return;
		}
		
		
		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Sekunden jedes Mal erhoehen, bei 60 dann Sekunden auf 0 und minute auf 1
				seconds++;
				if(seconds == 60) {
					minutes++;
					seconds = 0;
				}
				
				//Analog wie bei Sekunden
				if(minutes == 60) {
					hours++;
					minutes = 0;
				}
				
				String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
				timerLabel.setText(time);
				
				
			}
		});
		timer.start();
		
	}
	
	public void timerToZero() {
		
		if(timer != null && timer.isRunning()) {
			timer.stop();
			seconds = 0;
			minutes = 0;
			hours = 0;

			String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
			timerLabel.setText(time);
			return;
		}
		
		
	}

	// Methode, um das Spielbrett mit den jeweiligen Felder zu erstellen
	public JPanel[][] spielBrettGenerieren() {

		int zeilen = gewaehlteZeilenAnzahl;
		int spalten = gewaehlteSpaltenAnzahl;

		spielBrett.setLayout(new GridLayout(zeilen, spalten));
		spielbrettArray = new JPanel[zeilen][spalten];
		spielBrettArrayField = new Field[zeilen][spalten];
		spielbrettArrayCopy = new JPanel[zeilen][spalten];		
		benutzteFarben = new ArrayList<Color>();


		// Spielbrett Felder ausfuellen
		for (int i = 0; i < zeilen; i++) {
			for (int j = 0; j < spalten; j++) {

				JPanel feld = new JPanel();

				
				feld.setBorder(BorderFactory.createLineBorder(Color.black));

				spielbrettArray[i][j] = feld;
				spielbrettArrayCopy[i][j] = feld;

				int zeile = i;
				int spalte = j;

				spielBrett.add(feld);

				Color randomFarbe = randomFarbeWaehlen(ausgewaehlteFarben.size(), spielbrettArray, i, j);
				if (!(benutzteFarben.contains(randomFarbe))) {
					benutzteFarben.add(randomFarbe);
				}

				feld.setBackground(randomFarbe);
				
				colorZahl = zahlFarbeWaehlen(randomFarbe);
				
				Field feld1 = new Field(zeile,spalte,colorZahl);
				spielBrettArrayField[zeile][spalte] = feld1;




			}

		}

		revalidate();
		repaint();
		
		
		return spielbrettArray;

	}
	
	
	
	
	
	
	
	public int zahlFarbeWaehlen(Color c) {
		
		Color brown = new Color(153, 102, 0);

		
		if(c.equals(Color.black)) {
			return 1;
		}
		if(c.equals(Color.blue)) {
			return 2;
		}
		if(c.equals(Color.cyan)) {
			return 3;
		}
		if(c.equals(Color.gray)) {
			return 4;
		}
		if(c.equals(Color.green)) {
			return 5;
		}
		if(c.equals(brown)) {
			return 6;
		}
		if(c.equals(Color.orange)) {
			return 7;
		}
		if(c.equals(Color.pink)) {
			return 8;
		}
		if(c.equals(Color.red)) {
			return 9;
		}
		
		return 0;
		
		
		
	}
	
	

	/*
	 * Gibt eine random Farbe zurueck, mit der das jeweilige Feld dann befuellt
	 * wird, wobei jedes Feld eine andere Farbe hat als sein Nachbar
	 */
	public Color randomFarbeWaehlen(int bound, JPanel[][] spielBrett, int i, int j) {

		Random rand = new Random();
		

		// Alle nachbarFarben sammeln, um diese auszuschliesen fuer die neue farbe
		ArrayList<Color> nachbarFarben = new ArrayList<Color>();

		ArrayList<Color> ausgewaehlteFarbenTemporaer = new ArrayList<Color>(ausgewaehlteFarben);
		Color brown = new Color(153, 102, 0);

		Color nachbarFarbeOben = null;
		Color nachbarFarbeLinks = null;

		if (i == gewaehlteZeilenAnzahl - 1 && j == 0) {

			Color farbeS2 = spielBrett[0][gewaehlteSpaltenAnzahl - 1].getBackground();
			nachbarFarben.add(farbeS2);

			JPanel oberesFeld = spielBrett[i - 1][j];
			nachbarFarbeOben = oberesFeld.getBackground();
			nachbarFarben.add(nachbarFarbeOben);

			ausgewaehlteFarbenTemporaer.removeAll(nachbarFarben);

			int x = rand.nextInt(ausgewaehlteFarbenTemporaer.size());
			
			
			return ausgewaehlteFarbenTemporaer.get(x);

		}

		// Farbe oberes Feld ueberpruefen
		if (i > 0) {
			JPanel oberesFeld = spielBrett[i - 1][j];
			nachbarFarbeOben = oberesFeld.getBackground();
			nachbarFarben.add(nachbarFarbeOben);
		}

		// Farbe linkes Feld ueberpruefen
		if (j > 0) {
			JPanel linkesFeld = spielBrett[i][j - 1];
			nachbarFarbeLinks = linkesFeld.getBackground();
			nachbarFarben.add(nachbarFarbeLinks);
		}

		ausgewaehlteFarbenTemporaer.removeAll(nachbarFarben);

		// Neue random Farbe auswaehlen fuer das jeweilige Feld aus den noch uebrigen
		// Farben
		int x = rand.nextInt(ausgewaehlteFarbenTemporaer.size());
		Color neueFarbe = ausgewaehlteFarbenTemporaer.get(x);
		

		return neueFarbe;

	}

	/*
	 * Mit dieser Methode picke ich mir x beliebige Farben aus dem volstaendigen
	 * Array alleColors raus, um diese dann als Farben zu benutzen. x haengt davon
	 * ab wie hoch die Farbenanzahl ist
	 */
	public void farbenUebernehmen(int farbenImSpiel) {

		ArrayList<Color> temp = new ArrayList<Color>(alleMöglichenFarben);

		ausgewaehlteFarben = new ArrayList<Color>();

		for (int i = 0; i < farbenImSpiel; i++) {
			ausgewaehlteFarben.add(temp.get(i));
		}
		
		
		aktuellVerfuegbareFarben = new ArrayList(ausgewaehlteFarben);
		verfuegbareZahlenAnzahl = farbenImSpiel;
		

	}
	

	public void alleColorsAdden() {
		Color brown = new Color(153, 102, 0);
		alleMöglichenFarben.add(Color.black);
		alleMöglichenFarben.add(Color.blue);
		alleMöglichenFarben.add(Color.cyan);
		alleMöglichenFarben.add(Color.gray);
		alleMöglichenFarben.add(Color.green);
		alleMöglichenFarben.add(brown);
		alleMöglichenFarben.add(Color.orange);
		alleMöglichenFarben.add(Color.pink);
		alleMöglichenFarben.add(Color.red);

	}


	public void setup() {

		startButton.setText("Stop");

		// Ausgewaehlte Werte uebertragen
		gewaehlteZeilenAnzahl = Integer.parseInt((String) zeilenAuswahl.getSelectedItem());
		gewaehlteSpaltenAnzahl = Integer.parseInt((String) spaltenAuswahl.getSelectedItem());
		farbenImSpiel = Integer.parseInt((String) farbenAnzahl.getSelectedItem());
		
		
		spielbrettArray = new JPanel[gewaehlteZeilenAnzahl][gewaehlteSpaltenAnzahl];

		farbenUebernehmen(farbenImSpiel);

		spielbrettArray = spielBrettGenerieren();
		

		while (benutzteFarben.size() != farbenImSpiel) {
			spielBrett.removeAll();
			spielbrettArray = spielBrettGenerieren();

		}
			
		
		
		// Groese der beiden Komponenten
		K1 = new ArrayList<JPanel>();
		K2 = new ArrayList<JPanel>();

		// Am Anfang haben beide Spieler je eine Komponente
		K1.add(spielbrettArray[gewaehlteZeilenAnzahl - 1][0]);
		K2.add(spielbrettArray[0][gewaehlteSpaltenAnzahl - 1]);

		groeseK1 = 1;
		groeseK2 = 1;

		s1Farbe = spielbrettArray[gewaehlteZeilenAnzahl - 1][0].getBackground();
		s2Farbe = spielbrettArray[0][gewaehlteSpaltenAnzahl - 1].getBackground();

		aktuellVerfuegbareFarben.remove(s1Farbe);
		removteFarbe = s1Farbe;
		aktuellVerfuegbareFarben.remove(s2Farbe);

		spielZuege = 0;
		
		max = maximaleZuege();
		endKonf = alleFelderBesetzt();
		
		spielZugS2OhneVergroeserung = 0;
		erstesMalGedrueckt = true;
		
	}
	
	
	
	public void play1() {
		
		
		if(s2Dran && (max == false && endKonf == false)) {
			
			Timer timer = new Timer(1000, new ActionListener() {
				  @Override
				  public void actionPerformed(ActionEvent arg0) {
						Color c = null;

					  switch(gewaehlteStrategie) {
						
						case 1:
							c = strategy1(spielbrettArray);
							spielZugs2(c);


							break;
							
						case 2:
							c = strategy2(spielbrettArray);
							spielZugs2(c);


							break;
						
						case 3:
							c = strategy3(spielbrettArray);
							spielZugs2(c);
							break;
			
						}							
					  }
				});
				timer.setRepeats(false);
				timer.start();
				s1Dran = true;
				s2Dran = false;
			
		}
		

			for (int i = 0; i < gewaehlteZeilenAnzahl; i++) {

				for (int j = 0; j < gewaehlteSpaltenAnzahl; j++) {

					int zeile = i;
					int spalte = j;

					spielbrettArray[i][j].addMouseListener(new MouseAdapter() {

						public void mouseClicked(MouseEvent e) {
							
							
							int groeseK1Davor = groeseK1;


							// Farbe des geklickten Feldes der Komponente zuweisen
							geklickteFarbe = spielbrettArray[zeile][spalte].getBackground();
							if(s1Dran && (max == false && endKonf == false)) {


							if (aktuellVerfuegbareFarben.contains(geklickteFarbe)) {
								spielZuege++;
								groeseK1 = komponenteAnpassen(K1, geklickteFarbe, groeseK1);

								s1FarbeDavor = s1Farbe;
								s1Farbe = geklickteFarbe;
								


								aktuellVerfuegbareFarben.add(removteFarbe);

								aktuellVerfuegbareFarben.remove(geklickteFarbe);
								removteFarbe = geklickteFarbe;

								anzeigeAktualisierenMouse(geklickteFarbe);
								
								if(groeseK1 > groeseK1Davor) {
									spielZugS2OhneVergroeserung=0;
								} else {
									spielZugS2OhneVergroeserung++;
								}
								
								s1Dran = false;
								s2Dran = true;
								
								infoKAendern();

							

								max = maximaleZuege();
								endKonf = alleFelderBesetzt();
								
							
								
								if(max == true || endKonf == true) {
									
									if(timer != null && timer.isRunning()) {
										timer.stop();
									}
									
									spielZugS2OhneVergroeserung = 0;
									if(max) {
										Endfenster unentscheden = new Endfenster("Test",3);
									} else {
										if(K1.size() > K2.size()) {
											Endfenster unentscheden = new Endfenster("S1",1);
										} else if(K1.size() < K2.size()) {
											Endfenster unentscheden = new Endfenster("S2",1);

										} else {
											Endfenster unentscheden = new Endfenster("Test",2);

										}
										
									}
									spielEnde();
									return;
								}
								
								Timer timer = new Timer(1000, new ActionListener() {
									  @Override
									  public void actionPerformed(ActionEvent arg0) {
											Color c = null;

										  switch(gewaehlteStrategie) {
											
											case 1:
												c = strategy1(spielbrettArray);
												spielZugs2(c);


												break;
												
											case 2:
												c = strategy2(spielbrettArray);
												spielZugs2(c);


												break;
											
											case 3:
												c = strategy3(spielbrettArray);
												spielZugs2(c);
												break;
								
											}							
										  }
									});
									timer.setRepeats(false);
									timer.start(); 
									
								
							}
							
							}
													
							

						}
					});

				}
					
			
				
				
				
			}
			
			spielBrett.grabFocus();
			spielBrett.addKeyListener(new KeyAdapter() {

				public void keyPressed(KeyEvent e) {
					int groeseK1Davor = groeseK1;
					if(s1Dran && (max == false && endKonf == false)) {
					
						
					if (e.getKeyChar() == '1') {
						if (Color.black.equals(s1Farbe) == false && Color.black.equals(s2Farbe) == false) {
							
							aktuellVerfuegbareFarben= farbenAktualisieren();

							if(aktuellVerfuegbareFarben.contains(Color.black) == true) {
								
							s1Farbe = Color.black;
								
							aktuellVerfuegbareFarben= farbenAktualisieren();


							spielZuege++;
							groeseK1 = komponenteAnpassen(K1, Color.black, groeseK1);
							
							anzeigeAktualisierenKey(farbenPanel, 1);
							
							if(groeseK1 > groeseK1Davor) {
								spielZugS2OhneVergroeserung=0;
							} else {
								spielZugS2OhneVergroeserung++;
							}
							

							max = maximaleZuege();
							endKonf = alleFelderBesetzt();
							
							s1Dran = false;
							s2Dran = true;
							
							infoKAendern();
							
							if(max == true || endKonf == true) {
								
								if(timer != null && timer.isRunning()) {
									timer.stop();
								}
								spielZugS2OhneVergroeserung = 0;
								if(max) {
									Endfenster unentscheden = new Endfenster("Test",3);
								} else {
									if(K1.size() > K2.size()) {
										Endfenster unentscheden = new Endfenster("S1",1);
									} else if(K1.size() < K2.size()) {
										Endfenster unentscheden = new Endfenster("S2",1);

									} else {
										Endfenster unentscheden = new Endfenster("Test",2);

									}
									
								}
								spielEnde();
								return;
							}
					
							

							Timer timer = new Timer(1000, new ActionListener() {
								  @Override
								  public void actionPerformed(ActionEvent arg0) {
										Color c = null;

									  switch(gewaehlteStrategie) {
										
										case 1:
											c = strategy1(spielbrettArray);
											spielZugs2(c);


											break;
											
										case 2:
											c = strategy2(spielbrettArray);
											spielZugs2(c);


											break;
										
										case 3:
											c = strategy3(spielbrettArray);
											spielZugs2(c);
											break;
							
										}
									  
									  s1Dran = true;
									  s2Dran = false;
									  }
								});
								timer.setRepeats(false); 
								timer.start();
						}
					}
						
						
					}

					if (e.getKeyChar() == '2') {
						if (Color.blue.equals(s1Farbe) == false && Color.blue.equals(s2Farbe) == false) {
							aktuellVerfuegbareFarben= farbenAktualisieren();

							if(aktuellVerfuegbareFarben.contains(Color.blue) == true) {
								
								s1Farbe = Color.blue;
									
								aktuellVerfuegbareFarben= farbenAktualisieren();



								spielZuege++;
								groeseK1 = komponenteAnpassen(K1, Color.blue, groeseK1);
								
								anzeigeAktualisierenKey(farbenPanel, 2);
								
								if(groeseK1 > groeseK1Davor) {
									spielZugS2OhneVergroeserung=0;
								} else {
									spielZugS2OhneVergroeserung++;
								}
								
								max = maximaleZuege();
								endKonf = alleFelderBesetzt();
								
								s1Dran = false;
								s2Dran = true;
								
								infoKAendern();

								
								if(max == true || endKonf == true) {
									
									if(timer != null && timer.isRunning()) {
										timer.stop();
									}
									spielZugS2OhneVergroeserung = 0;
									if(max) {
										Endfenster unentscheden = new Endfenster("Test",3);
									} else {
										if(K1.size() > K2.size()) {
											Endfenster unentscheden = new Endfenster("S1",1);
										} else if(K1.size() < K2.size()) {
											Endfenster unentscheden = new Endfenster("S2",1);

										} else {
											Endfenster unentscheden = new Endfenster("Test",2);

										}
										
									}
									spielEnde();
									return;
								}
														
								Timer timer = new Timer(1000, new ActionListener() {
									  @Override
									  public void actionPerformed(ActionEvent arg0) {
											Color c = null;

										  switch(gewaehlteStrategie) {
											
											case 1:
												c = strategy1(spielbrettArray);
												spielZugs2(c);



												break;
												
											case 2:
												c = strategy2(spielbrettArray);
												spielZugs2(c);
												
												break;
											
											case 3:
												c = strategy3(spielbrettArray);
												spielZugs2(c);
												break;
								
											}
										  
										  s1Dran = true;
										  s2Dran = false;
										  
										  }
									});
									timer.setRepeats(false); 
									timer.start();


						}
					}
					}

					if (e.getKeyChar() == '3') {

						if (Color.cyan.equals(s1Farbe) == false && Color.cyan.equals(s2Farbe) == false) {
							aktuellVerfuegbareFarben= farbenAktualisieren();

							if(aktuellVerfuegbareFarben.contains(Color.cyan) == true) {

								s1Farbe = Color.cyan;
									
								aktuellVerfuegbareFarben= farbenAktualisieren();


								spielZuege++;
								groeseK1 = komponenteAnpassen(K1, Color.cyan, groeseK1);
								
								anzeigeAktualisierenKey(farbenPanel, 3);
								
								if(groeseK1 > groeseK1Davor) {
									spielZugS2OhneVergroeserung=0;
								} else {
									spielZugS2OhneVergroeserung++;
								}
								
								s1Dran = false;
								s2Dran = true;

								infoKAendern();

								max = maximaleZuege();
								endKonf = alleFelderBesetzt();
								
								if(max == true || endKonf == true) {
									
									if(timer != null && timer.isRunning()) {
										timer.stop();
									}
									spielZugS2OhneVergroeserung = 0;
									if(max) {
										Endfenster unentscheden = new Endfenster("Test",3);
									} else {
										if(K1.size() > K2.size()) {
											Endfenster unentscheden = new Endfenster("S1",1);
										} else if(K1.size() < K2.size()) {
											Endfenster unentscheden = new Endfenster("S2",1);

										} else {
											Endfenster unentscheden = new Endfenster("Test",2);

										}
										
									}
									spielEnde();
									return;
								}
								
								

								Timer timer = new Timer(1000, new ActionListener() {
									  @Override
									  public void actionPerformed(ActionEvent arg0) {
											Color c = null;

										  switch(gewaehlteStrategie) {
											
											case 1:
												c = strategy1(spielbrettArray);
												spielZugs2(c);



												break;
												
											case 2:
												c = strategy2(spielbrettArray);
												spielZugs2(c);

												break;
											
											case 3:
												c = strategy3(spielbrettArray);
												spielZugs2(c);
												break;
								
											}		
										  s1Dran = true;
											s2Dran =false;
										  }
									});
									timer.setRepeats(false);
									timer.start(); 


						}
					}
						
					}

					if (e.getKeyChar() == '4') {
						if (Color.gray.equals(s1Farbe) == false && Color.gray.equals(s2Farbe) == false) {
							aktuellVerfuegbareFarben= farbenAktualisieren();

							if(aktuellVerfuegbareFarben.contains(Color.gray) == true) {

								s1Farbe = Color.gray;
									
								aktuellVerfuegbareFarben= farbenAktualisieren();


								spielZuege++;
								groeseK1 = komponenteAnpassen(K1, Color.gray, groeseK1);
								
								anzeigeAktualisierenKey(farbenPanel, 4);
								

								if(groeseK1 > groeseK1Davor) {
									spielZugS2OhneVergroeserung=0;
								} else {
									spielZugS2OhneVergroeserung++;
								}
								
								max = maximaleZuege();
								endKonf = alleFelderBesetzt();
								
								s1Dran = false;
								s2Dran = true;
								
								
								infoKAendern();

								if(max == true || endKonf == true) {
									spielZugS2OhneVergroeserung = 0;
									
									if(timer != null && timer.isRunning()) {
										timer.stop();
									}
									if(max) {
										Endfenster unentscheden = new Endfenster("Test",3);
									} else {
										if(K1.size() > K2.size()) {
											Endfenster unentscheden = new Endfenster("S1",1);
										} else if(K1.size() < K2.size()) {
											Endfenster unentscheden = new Endfenster("S2",1);

										} else {
											Endfenster unentscheden = new Endfenster("Test",2);

										}
										
									}
									spielEnde();
									return;
								}
								
								
								Timer timer = new Timer(1000, new ActionListener() {
									  @Override
									  public void actionPerformed(ActionEvent arg0) {
											Color c = null;

										  switch(gewaehlteStrategie) {
											
											case 1:
												c = strategy1(spielbrettArray);
												spielZugs2(c);



												break;
												
											case 2:
												c = strategy2(spielbrettArray);
												spielZugs2(c);


												break;
											
											case 3:
												c = strategy3(spielbrettArray);
												spielZugs2(c);
												break;
								
											}		
										  s1Dran = true;
											s2Dran = false;
										  }
									});
									timer.setRepeats(false); 
									timer.start();


						}

					}
						
					}

					if (e.getKeyChar() == '5' && farbenImSpiel >= 5) {

						if (Color.green.equals(s1Farbe) == false && Color.green.equals(s2Farbe) == false) {
							aktuellVerfuegbareFarben= farbenAktualisieren();

							if(aktuellVerfuegbareFarben.contains(Color.green) == true) {

								s1Farbe = Color.green;
									
								aktuellVerfuegbareFarben= farbenAktualisieren();


								spielZuege++;
								groeseK1 = komponenteAnpassen(K1, Color.green, groeseK1);
								anzeigeAktualisierenKey(farbenPanel, 5);
								
								if(groeseK1 > groeseK1Davor) {
									spielZugS2OhneVergroeserung=0;
								} else {
									spielZugS2OhneVergroeserung++;
								}
								
								s1Dran = false;
								s2Dran = true;

								max = maximaleZuege();
								endKonf = alleFelderBesetzt();
								
								infoKAendern();

								
								if(max == true || endKonf == true) {
									spielZugS2OhneVergroeserung = 0;
									
									if(timer != null && timer.isRunning()) {
										timer.stop();
									}
									if(max) {
										Endfenster unentscheden = new Endfenster("Test",3);
									} else {
										if(K1.size() > K2.size()) {
											Endfenster unentscheden = new Endfenster("S1",1);
										} else if(K1.size() < K2.size()) {
											Endfenster unentscheden = new Endfenster("S2",1);

										} else {
											Endfenster unentscheden = new Endfenster("Test",2);

										}
										
									}
									spielEnde();
									return;
								}
								
								

								Timer timer = new Timer(1000, new ActionListener() {
									  @Override
									  public void actionPerformed(ActionEvent arg0) {
											Color c = null;

										  switch(gewaehlteStrategie) {
											
											case 1:
												c = strategy1(spielbrettArray);
												spielZugs2(c);


												break;
												
											case 2:
												c = strategy2(spielbrettArray);
												spielZugs2(c);
												

												break;
											
											case 3:
												c = strategy3(spielbrettArray);
												spielZugs2(c);
												break;
								
											}				
										  s1Dran = true;
											s2Dran = false;
										  }
									});
									timer.setRepeats(false); 
									timer.start(); 
						}
					}
						
					}

					if (e.getKeyChar() == '6' && farbenImSpiel >= 6) {

						Color brown = new Color(153, 102, 0);
						aktuellVerfuegbareFarben= farbenAktualisieren();

						if (brown.equals(s1Farbe) == false && brown.equals(s2Farbe) == false) {
							
							if(aktuellVerfuegbareFarben.contains(brown) == true) {
								s1Farbe = brown;
									
								aktuellVerfuegbareFarben= farbenAktualisieren();


								spielZuege++;
								groeseK1 = komponenteAnpassen(K1, brown, groeseK1);
								anzeigeAktualisierenKey(farbenPanel, 6);
								
								
								if(groeseK1 > groeseK1Davor) {
									spielZugS2OhneVergroeserung=0;
								} else {
									spielZugS2OhneVergroeserung++;
								}
								
								max = maximaleZuege();
								endKonf = alleFelderBesetzt();
								
								infoKAendern();

								
								s1Dran = false;
								s2Dran = true;
								
								if(max == true || endKonf == true) {
									spielZugS2OhneVergroeserung = 0;
									
									if(timer != null && timer.isRunning()) {
										timer.stop();
									}
									if(max) {
										Endfenster unentscheden = new Endfenster("Test",3);
									} else {
										if(K1.size() > K2.size()) {
											Endfenster unentscheden = new Endfenster("S1",1);
										} else if(K1.size() < K2.size()) {
											Endfenster unentscheden = new Endfenster("S2",1);

										} else {
											Endfenster unentscheden = new Endfenster("Test",2);

										}
										
									}
									spielEnde();
									return;
								}
								

								Timer timer = new Timer(1000, new ActionListener() {
									  @Override
									  public void actionPerformed(ActionEvent arg0) {
											Color c = null;

										  switch(gewaehlteStrategie) {
											
											case 1:
												c = strategy1(spielbrettArray);
												spielZugs2(c);


												break;
												
											case 2:
												c = strategy2(spielbrettArray);
												spielZugs2(c);


												break;
											
											case 3:
												c = strategy3(spielbrettArray);
												spielZugs2(c);
												break;
								
											}		
										  s1Dran = true;
											s2Dran = false;
										  }
									});
									timer.setRepeats(false);
									timer.start(); 



						}

					}
						
					}

					if (e.getKeyChar() == '7' && farbenImSpiel >= 7) {

						if (Color.orange.equals(s1Farbe) == false && Color.orange.equals(s2Farbe) == false) {
							aktuellVerfuegbareFarben= farbenAktualisieren();

							if(aktuellVerfuegbareFarben.contains(Color.orange) == true) {

								s1Farbe = Color.orange;
									
								aktuellVerfuegbareFarben= farbenAktualisieren();


								spielZuege++;
								groeseK1 = komponenteAnpassen(K1, Color.orange, groeseK1);

								anzeigeAktualisierenKey(farbenPanel, 7);
								
								
								if(groeseK1 > groeseK1Davor) {
									spielZugS2OhneVergroeserung=0;
								} else {
									spielZugS2OhneVergroeserung++;
								}
								

								s1Dran = false;
								s2Dran = true;
								
								max = maximaleZuege();
								endKonf = alleFelderBesetzt();
								
								infoKAendern();

								
								
								if(max == true || endKonf == true) {
									spielZugS2OhneVergroeserung = 0;
									
									if(timer != null && timer.isRunning()) {
										timer.stop();
									}
									if(max) {
										Endfenster unentscheden = new Endfenster("Test",3);
									} else {
										if(K1.size() > K2.size()) {
											Endfenster unentscheden = new Endfenster("S1",1);
										} else if(K1.size() < K2.size()) {
											Endfenster unentscheden = new Endfenster("S2",1);

										} else {
											Endfenster unentscheden = new Endfenster("Test",2);

										}
										
									}
									spielEnde();
									return;
								}
								
								

								Timer timer = new Timer(1000, new ActionListener() {
									  @Override
									  public void actionPerformed(ActionEvent arg0) {
											Color c = null;

										  switch(gewaehlteStrategie) {
											
											case 1:
												c = strategy1(spielbrettArray);
												spielZugs2(c);

												break;
												
											case 2:
												c = strategy2(spielbrettArray);
												spielZugs2(c);


												break;
											
											case 3:
												c = strategy3(spielbrettArray);
												spielZugs2(c);
												break;
								
											}	
										  s1Dran = true;
										  s2Dran = false;
										  }
									});
									timer.setRepeats(false);
									timer.start(); 

						}

					}
						
					}

					if (e.getKeyChar() == '8' && farbenImSpiel >= 8) {

						if (Color.pink.equals(s1Farbe) == false && Color.pink.equals(s2Farbe) == false) {
							aktuellVerfuegbareFarben= farbenAktualisieren();

							if(aktuellVerfuegbareFarben.contains(Color.pink) == true) {

								s1Farbe = Color.pink;
									
								aktuellVerfuegbareFarben= farbenAktualisieren();


								spielZuege++;
								groeseK1 = komponenteAnpassen(K1, Color.pink, groeseK1);

								
								if(groeseK1 > groeseK1Davor) {
									spielZugS2OhneVergroeserung=0;
								} else {
									spielZugS2OhneVergroeserung++;
								}
								

								max = maximaleZuege();
								endKonf = alleFelderBesetzt();
								s1Dran = false;
								s2Dran = true;
								
								infoKAendern();

								anzeigeAktualisierenKey(farbenPanel, 8);

								if(max == true || endKonf == true) {
									if(timer != null && timer.isRunning()) {
										timer.stop();
									}
									spielZugS2OhneVergroeserung = 0;
									if(max) {
										Endfenster unentscheden = new Endfenster("Test",3);
									} else {
										if(K1.size() > K2.size()) {
											Endfenster unentscheden = new Endfenster("S1",1);
										} else if(K1.size() < K2.size()) {
											Endfenster unentscheden = new Endfenster("S2",1);

										} else {
											Endfenster unentscheden = new Endfenster("Test",2);

										}
										
									}
									spielEnde();
									return;
								}
														
								
								Timer timer = new Timer(1000, new ActionListener() {
									  @Override
									  public void actionPerformed(ActionEvent arg0) {
											Color c = null;

										  switch(gewaehlteStrategie) {
											
											case 1:
												c = strategy1(spielbrettArray);
												spielZugs2(c);

												break;
												
											case 2:
												c = strategy2(spielbrettArray);
												spielZugs2(c);

												break;
											
											case 3:
												c = strategy3(spielbrettArray);
												spielZugs2(c);
												break;
								
											}			
										  
										  s1Dran = true;
										  s2Dran = false;
										 
										  }
									});
									timer.setRepeats(false);
									timer.start();


						}

					}
						
					}

					if (e.getKeyChar() == '9' && farbenImSpiel == 9) {

						if (Color.red.equals(s1Farbe) == false && Color.red.equals(s2Farbe) == false) {
							aktuellVerfuegbareFarben= farbenAktualisieren();

							if(aktuellVerfuegbareFarben.contains(Color.red) == true) {

								s1Farbe = Color.red;
									
								aktuellVerfuegbareFarben= farbenAktualisieren();


								spielZuege++;
								groeseK1 = komponenteAnpassen(K1, Color.red, groeseK1);

										
								if(groeseK1 > groeseK1Davor) {
									spielZugS2OhneVergroeserung=0;
								} else {
									spielZugS2OhneVergroeserung++;
								}
								

								max = maximaleZuege();
								endKonf = alleFelderBesetzt();
								
								s1Dran = false;
								s2Dran = true;
								
								infoKAendern();
								anzeigeAktualisierenKey(farbenPanel, 9);

								
								if(max == true || endKonf == true) {
									
									if(timer != null && timer.isRunning()) {
										timer.stop();
									}
									spielZugS2OhneVergroeserung = 0;
									if(max) {
										Endfenster unentscheden = new Endfenster("Test",3);
									} else {
										if(K1.size() > K2.size()) {
											Endfenster unentscheden = new Endfenster("S1",1);
										} else if(K1.size() < K2.size()) {
											Endfenster unentscheden = new Endfenster("S2",1);

										} else {
											Endfenster unentscheden = new Endfenster("Test",2);

										}
										
									}
									spielEnde();
									return;
								}
								
								
								
								if(groeseK1 > groeseK1Davor) {
									
									spielZugS2OhneVergroeserung = 0;
								} else {
									spielZugS2OhneVergroeserung++;
								}
								
								
								max = maximaleZuege();
								endKonf = alleFelderBesetzt();
								

								Timer timer = new Timer(1000, new ActionListener() {
									  @Override
									  public void actionPerformed(ActionEvent arg0) {
										  Color c = null;

										  switch(gewaehlteStrategie) {
											
											case 1:
												c = strategy1(spielbrettArray);
												spielZugs2(c);
												
												break;
												
											case 2:
												c = strategy2(spielbrettArray);
												spielZugs2(c);


												break;
											
											case 3:
												c = strategy3(spielbrettArray);
												spielZugs2(c);

												break;
								
											}	
										  
										  s1Dran = true;
										  s2Dran = false;

										  }

									});
									timer.setRepeats(false);
									timer.start(); 

						}

					}
						
				}
					
						
				
			}
					
					
					
				}
							

			});

		
		
		

	}
	
	
	public void spielEnde() {
		
		startButton.setText("Start");
		spielBrett.removeAll();
		spielBrett.repaint();
		
		seconds = 0;
		minutes = 0;
		hours = 0;
		
		String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
		timerLabel.setText(time);
		
		zeilenAuswahl.setEnabled(true);
		spaltenAuswahl.setEnabled(true);
		s1RadioButton.setEnabled(true);
		s2RadioButton.setEnabled(true);
		farbenAnzahl.setEnabled(true);
		stratAuswahlListe.setEnabled(true);

		
		playButton.setText("Play");
		
		timerToZero();


		farbenAnzeige.removeAll();
		farbenAnzeige.revalidate();
		farbenAnzeige.repaint();
		
		farbenAnzeige.removeAll();
		farbenAnzeige.revalidate();
		farbenAnzeige.repaint();
		
		seconds = 0;
		minutes = 0;
		hours = 0;
		
		startButton.setText("Start");
		
		
		
		K1Info.setText("");
		K2Info.setText("");

				
		
		//Komponentengroese anpassen bzw. zuruecksetzen
		
		
	}
	
		
	
	
	
	public Color strategy2(JPanel[][] board) {
		
		
		aktuellVerfuegbareFarben= farbenAktualisieren();
		
		
		
		int k1Black = groeseK2;
		int k1Blue = groeseK2;
		int k1Cyan = groeseK2;
		int k1Brown = groeseK2;
		int k1Gray = groeseK2;
		int k1Green = groeseK2;
		int k1Pink = groeseK2;
		int k1Yellow = groeseK2;
		int k1Red = groeseK2;

		
		//Copyattribute, mit denen ich den naechsten Zug simuliere
		K2Copy = new ArrayList<JPanel>(K2);
		s2FarbeCopy = s2Farbe;
		
			
			
		Color col = farbeWaehlens2(k1Black, k1Blue, k1Cyan, k1Gray, k1Green, k1Brown,k1Yellow,k1Pink,k1Red);
				
		
		return col;
		
	}
		
		
	
	
	
	public Color strategy1(JPanel[][] board) {
		
		aktuellVerfuegbareFarben= farbenAktualisieren();
		
		
		
		int k1Black = groeseK2;
		int k1Blue = groeseK2;
		int k1Cyan = groeseK2;
		int k1Brown = groeseK2;
		int k1Gray = groeseK2;
		int k1Green = groeseK2;
		int k1Pink = groeseK2;
		int k1Yellow = groeseK2;
		int k1Red = groeseK2;

		
		
		
		//Copyattribute, mit denen ich den naechsten Zug simuliere
		K2Copy = new ArrayList<JPanel>(K2);
		s2FarbeCopy = s2Farbe;
		
		
		
			
			
		Color col = farbeWaehlens1(k1Black, k1Blue, k1Cyan, k1Gray, k1Green, k1Brown,k1Yellow,k1Pink,k1Red);
		
		
		
		return col;
		
		
		
		
	}
	
	
public Color strategy3(JPanel[][] board) {
		
		aktuellVerfuegbareFarben= farbenAktualisieren();
				
		
		int k1Black = groeseK2;
		int k1Blue = groeseK2;
		int k1Cyan = groeseK2;
		int k1Brown = groeseK2;
		int k1Gray = groeseK2;
		int k1Green = groeseK2;
		int k1Pink = groeseK2;
		int k1Yellow = groeseK2;
		int k1Red = groeseK2;

				
		
		
		//Copyattribute, mit denen ich den naechsten Zug simuliere
		K1Copy = new ArrayList<JPanel>(K1);
		
		
		
			
			
		Color col = farbeWaehlens3(k1Black, k1Blue, k1Cyan, k1Gray, k1Green, k1Brown,k1Yellow,k1Pink,k1Red);
		
		
		return col;
				
		
		
	}
	
	
	
	
	
	public Color farbeWaehlens1(int k1, int k2, int k3, int k4, int k5, int k6, int k7, int k8, int k9) {
		
		
		ArrayList<Element> elemente = new ArrayList<Element>();
		Color brown = new Color(153,102,0);

						
			if(aktuellVerfuegbareFarben.contains(Color.black)) {
				k1 = komponentenZuwachs(K2Copy, Color.black, groeseK2);
				Element black = new Element(Color.black,k1, 1);
				elemente.add(black);
				K2Copy = new ArrayList<>(K2);

			}
			

			if(aktuellVerfuegbareFarben.contains(Color.blue)) {
				k2 = komponentenZuwachs(K2Copy, Color.blue, groeseK2);
				Element blue = new Element(Color.blue,k2, 2);
				elemente.add(blue);
				K2Copy = new ArrayList<>(K2);



			}if(aktuellVerfuegbareFarben.contains(Color.cyan)) {
				k3 = komponentenZuwachs(K2Copy, Color.cyan, groeseK2);
				Element cyan = new Element(Color.cyan,k3,3);
				elemente.add(cyan);
				K2Copy = new ArrayList<>(K2);


			}if(aktuellVerfuegbareFarben.contains(Color.gray)) {
				k4 = komponentenZuwachs(K2Copy, Color.gray, groeseK2);
				Element gray = new Element(Color.gray,k4,4);
				elemente.add(gray);
				K2Copy = new ArrayList<>(K2);


			}if(aktuellVerfuegbareFarben.contains(Color.green)) {
				k5 = komponentenZuwachs(K2Copy, Color.green, groeseK2);
				Element green = new Element(Color.green,k5,5);
				elemente.add(green);
				K2Copy = new ArrayList<>(K2);


			}if(aktuellVerfuegbareFarben.contains(brown)) {
				k6 = komponentenZuwachs(K2Copy, brown, groeseK2);
				Element brown1 = new Element(brown,k6,6);
				elemente.add(brown1);
				K2Copy = new ArrayList<>(K2);


			}if(aktuellVerfuegbareFarben.contains(Color.orange)) {
				k7 = komponentenZuwachs(K2Copy, Color.orange, groeseK2);
				Element orange = new Element(Color.orange,k7,7);
				elemente.add(orange);
				K2Copy = new ArrayList<>(K2);


			}if(aktuellVerfuegbareFarben.contains(Color.pink)) {
				k8 = komponentenZuwachs(K2Copy, Color.pink, groeseK2);
				Element pink = new Element(Color.pink,k8,8);
				elemente.add(pink);
				K2Copy = new ArrayList<>(K2);


			}if(aktuellVerfuegbareFarben.contains(Color.red)) {
				k9 = komponentenZuwachs(K2Copy, Color.red, groeseK2);
				Element red = new Element(Color.red,k9,9);
				elemente.add(red);
				K2Copy = new ArrayList<>(K2);

			}
			
			
			Element c = elemente.get(0);
			for(int i = 1; i < elemente.size(); i++) {
				
				if(elemente.get(i).getGroese() < c.getGroese()) {
					c = elemente.get(i);
				}
				
			}
			
			return c.getCol();
			
		
	}
	
	
public Color farbeWaehlens2(int k1, int k2, int k3, int k4, int k5, int k6, int k7, int k8, int k9) {
		
		
		ArrayList<Element> elemente = new ArrayList<Element>();
		Color brown = new Color(153,102,0);

						
			if(aktuellVerfuegbareFarben.contains(Color.black)) {
				k1 = komponentenZuwachs(K2Copy, Color.black, groeseK2);
				Element black = new Element(Color.black,k1, 1);
				elemente.add(black);
				K2Copy = new ArrayList<>(K2);

			}
			

			if(aktuellVerfuegbareFarben.contains(Color.blue)) {
				k2 = komponentenZuwachs(K2Copy, Color.blue, groeseK2);
				Element blue = new Element(Color.blue,k2, 2);
				elemente.add(blue);
				K2Copy = new ArrayList<>(K2);



			}if(aktuellVerfuegbareFarben.contains(Color.cyan)) {
				k3 = komponentenZuwachs(K2Copy, Color.cyan, groeseK2);
				Element cyan = new Element(Color.cyan,k3,3);
				elemente.add(cyan);
				K2Copy = new ArrayList<>(K2);


			}if(aktuellVerfuegbareFarben.contains(Color.gray)) {
				k4 = komponentenZuwachs(K2Copy, Color.gray, groeseK2);
				Element gray = new Element(Color.gray,k4,4);
				elemente.add(gray);
				K2Copy = new ArrayList<>(K2);


			}if(aktuellVerfuegbareFarben.contains(Color.green)) {
				k5 = komponentenZuwachs(K2Copy, Color.green, groeseK2);
				Element green = new Element(Color.green,k5,5);
				elemente.add(green);
				K2Copy = new ArrayList<>(K2);


			}if(aktuellVerfuegbareFarben.contains(brown)) {
				k6 = komponentenZuwachs(K2Copy, brown, groeseK2);
				Element brown1 = new Element(brown,k6,6);
				elemente.add(brown1);
				K2Copy = new ArrayList<>(K2);


			}if(aktuellVerfuegbareFarben.contains(Color.orange)) {
				k7 = komponentenZuwachs(K2Copy, Color.orange, groeseK2);
				Element orange = new Element(Color.orange,k7,7);
				elemente.add(orange);
				K2Copy = new ArrayList<>(K2);


			}if(aktuellVerfuegbareFarben.contains(Color.pink)) {
				k8 = komponentenZuwachs(K2Copy, Color.pink, groeseK2);
				Element pink = new Element(Color.pink,k8,8);
				elemente.add(pink);
				K2Copy = new ArrayList<>(K2);


			}if(aktuellVerfuegbareFarben.contains(Color.red)) {
				k9 = komponentenZuwachs(K2Copy, Color.red, groeseK2);
				Element red = new Element(Color.red,k9,9);
				elemente.add(red);
				K2Copy = new ArrayList<>(K2);

			}
			
			
			//Nun groeste Farbe auswaehlen
			Element c = elemente.get(0);
			for(int i = 1; i < elemente.size(); i++) {
				
				if(elemente.get(i).getGroese() > c.getGroese()) {
					c = elemente.get(i);
				}
				
				
			}
			
			return c.getCol();
			 
		
		
	}


public Color farbeWaehlens3(int k1, int k2, int k3, int k4, int k5, int k6, int k7, int k8, int k9) {
	
	
	
	ArrayList<Element> elemente = new ArrayList<Element>();
	Color brown = new Color(153,102,0);

					
		if(aktuellVerfuegbareFarben.contains(Color.black)) {
			k1 = komponentenZuwachs(K1Copy, Color.black, groeseK1);
			Element black = new Element(Color.black,k1, 1);
			elemente.add(black);
			K1Copy = new ArrayList<>(K1);

		}
		

		if(aktuellVerfuegbareFarben.contains(Color.blue)) {
			k2 = komponentenZuwachs(K1Copy, Color.blue, groeseK1);
			Element blue = new Element(Color.blue,k2, 2);
			elemente.add(blue);
			K1Copy = new ArrayList<>(K1);



		}if(aktuellVerfuegbareFarben.contains(Color.cyan)) {
			k3 = komponentenZuwachs(K1Copy, Color.cyan, groeseK1);
			Element cyan = new Element(Color.cyan,k3,3);
			elemente.add(cyan);
			K1Copy = new ArrayList<>(K1);


		}if(aktuellVerfuegbareFarben.contains(Color.gray)) {
			k4 = komponentenZuwachs(K1Copy, Color.gray, groeseK1);
			Element gray = new Element(Color.gray,k4,4);
			elemente.add(gray);
			K1Copy = new ArrayList<>(K1);


		}if(aktuellVerfuegbareFarben.contains(Color.green)) {
			k5 = komponentenZuwachs(K1Copy, Color.green, groeseK1);
			Element green = new Element(Color.green,k5,5);
			elemente.add(green);
			K1Copy = new ArrayList<>(K1);


		}if(aktuellVerfuegbareFarben.contains(brown)) {
			k6 = komponentenZuwachs(K1Copy, brown, groeseK1);
			Element brown1 = new Element(brown,k6,6);
			elemente.add(brown1);
			K1Copy = new ArrayList<>(K1);


		}if(aktuellVerfuegbareFarben.contains(Color.orange)) {
			k7 = komponentenZuwachs(K1Copy, Color.orange, groeseK1);
			Element orange = new Element(Color.orange,k7,7);
			elemente.add(orange);
			K1Copy = new ArrayList<>(K1);


		}if(aktuellVerfuegbareFarben.contains(Color.pink)) {
			k8 = komponentenZuwachs(K1Copy, Color.pink, groeseK1);
			Element pink = new Element(Color.pink,k8,8);
			elemente.add(pink);
			K1Copy = new ArrayList<>(K1);


		}if(aktuellVerfuegbareFarben.contains(Color.red)) {
			k9 = komponentenZuwachs(K1Copy, Color.red, groeseK1);
			Element red = new Element(Color.red,k9,9);
			elemente.add(red);
			K1Copy = new ArrayList<>(K1);

		}
		
		
		//Nun groeste Farbe auswaehlen
		Element c = elemente.get(0);
		for(int i = 1; i < elemente.size(); i++) {
			
			if(elemente.get(i).getGroese() > c.getGroese()) {
				c = elemente.get(i);
			}
			
			
		}
		
		return c.getCol();
		
	
	
	
	
}

	
	
	public int komponentenZuwachs(ArrayList<JPanel> K, Color c, int groeseK) {
		
		for (int i = 0; i < K.size(); i++) {
			int zeile = getZeile(spielbrettArray, K.get(i), gewaehlteZeilenAnzahl, gewaehlteSpaltenAnzahl);
			int spalte = getSpalte(spielbrettArray, K.get(i), gewaehlteZeilenAnzahl, gewaehlteSpaltenAnzahl);
			nachbarAufnehmen(K, c, zeile, spalte);
		}
		
		
		groeseK = K.size();
		return groeseK;
		
	}
	
	public void spielZugs2(Color c) {
		
		aktuellVerfuegbareFarben= farbenAktualisieren();
				
		int k2Davor = groeseK2;
		
		
		if(c.equals(Color.black)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(Color.black) == false && s2Farbe.equals(Color.black) == false) {

				if(aktuellVerfuegbareFarben.contains(Color.black) == true) {
					
					s2FarbeDavor = s2Farbe;
					s2Farbe = Color.black;
					
					/*
					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
					 * zurueckgegeben
					 */
					
					aktuellVerfuegbareFarben= farbenAktualisieren();


					spielZuege++;
					groeseK2 = komponenteAnpassen(K2, Color.black, groeseK2);						
					anzeigeAktualisierenKey(farbenPanel, 1);
					
					if(groeseK2 > k2Davor) {
						spielZugS2OhneVergroeserung=0;
					} else {
						spielZugS2OhneVergroeserung++;
					}
					

					max = maximaleZuege();
					endKonf = alleFelderBesetzt();
					
					infoKAendern();

					
					if(max == true || endKonf == true) {
						spielZugS2OhneVergroeserung = 0;
						if(timer != null && timer.isRunning()) {
							timer.stop();
						}
						if(max) {
							Endfenster unentscheden = new Endfenster("Test",3);
						} else {
							if(K1.size() > K2.size()) {
								Endfenster unentscheden = new Endfenster("S1",1);
							} else if(K1.size() < K2.size()) {
								Endfenster unentscheden = new Endfenster("S2",1);

							} else {
								Endfenster unentscheden = new Endfenster("Test",2);

							}
							
						}
						spielEnde();
						return;
					}
					
					
				
					

			}
			}
		}
		
		if(c.equals(Color.blue)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(Color.blue) == false && s2Farbe.equals(Color.blue) == false) {

				if(aktuellVerfuegbareFarben.contains(Color.blue) == true) {
					
					s2FarbeDavor = s2Farbe;
					s2Farbe = Color.blue;
					
					/*
					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
					 * zurueckgegeben
					 */
					
					aktuellVerfuegbareFarben= farbenAktualisieren();


					spielZuege++;
					groeseK2 = komponenteAnpassen(K2, Color.blue, groeseK2);

											
					anzeigeAktualisierenKey(farbenPanel, 2);
					
					if(groeseK2 > k2Davor) {
						spielZugS2OhneVergroeserung=0;
					} else {
						spielZugS2OhneVergroeserung++;
					}
					

					max = maximaleZuege();
					endKonf = alleFelderBesetzt();
					
					infoKAendern();

					
					if(max == true || endKonf == true) {
						if(timer != null && timer.isRunning()) {
							timer.stop();
						}
						spielZugS2OhneVergroeserung = 0;
						if(max) {
							Endfenster unentscheden = new Endfenster("Test",3);
						} else {
							if(K1.size() > K2.size()) {
								Endfenster unentscheden = new Endfenster("S1",1);
							} else if(K1.size() < K2.size()) {
								Endfenster unentscheden = new Endfenster("S2",1);

							} else {
								Endfenster unentscheden = new Endfenster("Test",2);

							}
							
						}
						spielEnde();
						return;
					}

			}
			}
		}
		
		if(c.equals(Color.cyan)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(Color.cyan) == false && s2Farbe.equals(Color.cyan) == false) {

				if(aktuellVerfuegbareFarben.contains(Color.cyan) == true) {
					
					s2FarbeDavor = s2Farbe;
					s2Farbe = Color.cyan;
					
					/*
					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
					 * zurueckgegeben
					 */
					
					aktuellVerfuegbareFarben= farbenAktualisieren();


					spielZuege++;
					groeseK2 = komponenteAnpassen(K2, Color.cyan, groeseK2);

											
					anzeigeAktualisierenKey(farbenPanel, 3);
					
					if(groeseK2 > k2Davor) {
						spielZugS2OhneVergroeserung=0;
					} else {
						spielZugS2OhneVergroeserung++;
					}
					

					max = maximaleZuege();
					endKonf = alleFelderBesetzt();
					
					infoKAendern();

					
					if(max == true || endKonf == true) {
						if(timer != null && timer.isRunning()) {
							timer.stop();
						}
						spielZugS2OhneVergroeserung = 0;
						if(max) {
							Endfenster unentscheden = new Endfenster("Test",3);
						} else {
							if(K1.size() > K2.size()) {
								Endfenster unentscheden = new Endfenster("S1",1);
							} else if(K1.size() < K2.size()) {
								Endfenster unentscheden = new Endfenster("S2",1);

							} else {
								Endfenster unentscheden = new Endfenster("Test",2);

							}
							
						}
						spielEnde();
						return;
					}
					

			}
			}
		}
		
		if(c.equals(Color.gray)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(Color.gray) == false && s2Farbe.equals(Color.gray) == false) {

				if(aktuellVerfuegbareFarben.contains(Color.gray) == true) {
					
					s2FarbeDavor = s2Farbe;
					s2Farbe = Color.gray;
					
					/*
					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
					 * zurueckgegeben
					 */
					
					aktuellVerfuegbareFarben= farbenAktualisieren();


					spielZuege++;
					groeseK2 = komponenteAnpassen(K2, Color.gray, groeseK2);

											
					anzeigeAktualisierenKey(farbenPanel, 4);
					
					if(groeseK2 > k2Davor) {
						spielZugS2OhneVergroeserung=0;
					} else {
						spielZugS2OhneVergroeserung++;
					}
					

					max = maximaleZuege();
					endKonf = alleFelderBesetzt();
					
					infoKAendern();

					if(max == true || endKonf == true) {
						if(timer != null && timer.isRunning()) {
							timer.stop();
						}
						spielZugS2OhneVergroeserung = 0;
						if(max) {
							Endfenster unentscheden = new Endfenster("Test",3);
						} else {
							if(K1.size() > K2.size()) {
								Endfenster unentscheden = new Endfenster("S1",1);
							} else if(K1.size() < K2.size()) {
								Endfenster unentscheden = new Endfenster("S2",1);

							} else {
								Endfenster unentscheden = new Endfenster("Test",2);

							}
							
						}
						spielEnde();
						return;
					}
					

			}
			}
		}
		
		if(c.equals(Color.green)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(Color.green) == false && s2Farbe.equals(Color.green) == false) {

				if(aktuellVerfuegbareFarben.contains(Color.green) == true) {
					
					s2FarbeDavor = s2Farbe;
					s2Farbe = Color.green;
					
					/*
					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
					 * zurueckgegeben
					 */
					
					aktuellVerfuegbareFarben= farbenAktualisieren();


					spielZuege++;
					groeseK2 = komponenteAnpassen(K2, Color.green, groeseK2);

											
					anzeigeAktualisierenKey(farbenPanel, 5);
					
					if(groeseK2 > k2Davor) {
						spielZugS2OhneVergroeserung=0;
					} else {
						spielZugS2OhneVergroeserung++;
					}
					

					max = maximaleZuege();
					endKonf = alleFelderBesetzt();
					
					infoKAendern();

					
					if(max == true || endKonf == true) {
						if(timer != null && timer.isRunning()) {
							timer.stop();
						}
						spielZugS2OhneVergroeserung = 0;
						if(max) {
							Endfenster unentscheden = new Endfenster("Test",3);
						} else {
							if(K1.size() > K2.size()) {
								Endfenster unentscheden = new Endfenster("S1",1);
							} else if(K1.size() < K2.size()) {
								Endfenster unentscheden = new Endfenster("S2",1);

							} else {
								Endfenster unentscheden = new Endfenster("Test",2);

							}
							
						}
						spielEnde();
						return;
					}
					

			}
			}
		}
		
		Color brown = new Color(153,102,0);

		if(c.equals(brown)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(brown) == false && s2Farbe.equals(brown) == false) {

				if(aktuellVerfuegbareFarben.contains(brown) == true) {
					
					s2FarbeDavor = s2Farbe;
					s2Farbe = brown;
					
					/*
					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
					 * zurueckgegeben
					 */
					
					aktuellVerfuegbareFarben= farbenAktualisieren();


					spielZuege++;
					groeseK2 = komponenteAnpassen(K2, brown, groeseK2);

											
					anzeigeAktualisierenKey(farbenPanel, 6);
					
					if(groeseK2 > k2Davor) {
						spielZugS2OhneVergroeserung=0;
					} else {
						spielZugS2OhneVergroeserung++;
					}
					

					max = maximaleZuege();
					endKonf = alleFelderBesetzt();
					
					infoKAendern();

					if(max == true || endKonf == true) {
						if(timer != null && timer.isRunning()) {
							timer.stop();
						}
						spielZugS2OhneVergroeserung = 0;
						if(max) {
							Endfenster unentscheden = new Endfenster("Test",3);
						} else {
							if(K1.size() > K2.size()) {
								Endfenster unentscheden = new Endfenster("S1",1);
							} else if(K1.size() < K2.size()) {
								Endfenster unentscheden = new Endfenster("S2",1);

							} else {
								Endfenster unentscheden = new Endfenster("Test",2);

							}
							
						}
						spielEnde();
						return;
					}
					

			}
			}
		}
		
		if(c.equals(Color.orange)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(Color.orange) == false && s2Farbe.equals(Color.orange) == false) {

				if(aktuellVerfuegbareFarben.contains(Color.orange) == true) {
					
					s2FarbeDavor = s2Farbe;
					s2Farbe = Color.orange;
					
					/*
					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
					 * zurueckgegeben
					 */
					
					aktuellVerfuegbareFarben= farbenAktualisieren();


					spielZuege++;
					groeseK2 = komponenteAnpassen(K2, Color.orange, groeseK2);

											
					anzeigeAktualisierenKey(farbenPanel, 7);
					
					if(groeseK2 > k2Davor) {
						spielZugS2OhneVergroeserung=0;
					} else {
						spielZugS2OhneVergroeserung++;
					}
					

					max = maximaleZuege();
					endKonf = alleFelderBesetzt();
					
					infoKAendern();

					
					if(max == true || endKonf == true) {
						if(timer != null && timer.isRunning()) {
							timer.stop();
						}
						spielZugS2OhneVergroeserung = 0;
						if(max) {
							Endfenster unentscheden = new Endfenster("Test",3);
						} else {
							if(K1.size() > K2.size()) {
								Endfenster unentscheden = new Endfenster("S1",1);
							} else if(K1.size() < K2.size()) {
								Endfenster unentscheden = new Endfenster("S2",1);

							} else {
								Endfenster unentscheden = new Endfenster("Test",2);

							}
							
						}
						spielEnde();
						return;
					}

			}
			}
		}
		
		if(c.equals(Color.pink)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(Color.pink) == false && s2Farbe.equals(Color.pink) == false) {

				if(aktuellVerfuegbareFarben.contains(Color.pink) == true) {
					
					s2FarbeDavor = s2Farbe;
					s2Farbe = Color.pink;
					
					/*
					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
					 * zurueckgegeben
					 */
					
					aktuellVerfuegbareFarben= farbenAktualisieren();


					spielZuege++;
					groeseK2 = komponenteAnpassen(K2, Color.pink, groeseK2);

											
					anzeigeAktualisierenKey(farbenPanel, 8);
					
					if(groeseK2 > k2Davor) {
						spielZugS2OhneVergroeserung=0;
					} else {
						spielZugS2OhneVergroeserung++;
					}
					

					max = maximaleZuege();
					endKonf = alleFelderBesetzt();
					
					infoKAendern();

					
					if(max == true || endKonf == true) {
						if(timer != null && timer.isRunning()) {
							timer.stop();
						}
						spielZugS2OhneVergroeserung = 0;
						if(max) {
							Endfenster unentscheden = new Endfenster("Test",3);
						} else {
							if(K1.size() > K2.size()) {
								Endfenster unentscheden = new Endfenster("S1",1);
							} else if(K1.size() < K2.size()) {
								Endfenster unentscheden = new Endfenster("S2",1);

							} else {
								Endfenster unentscheden = new Endfenster("Test",2);

							}
							
						}
						spielEnde();
						return;
					}
					

			}
			}
		}
		
		if(c.equals(Color.red)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(Color.red) == false && s2Farbe.equals(Color.red) == false) {

				if(aktuellVerfuegbareFarben.contains(Color.red) == true) {
					
					s2FarbeDavor = s2Farbe;
					s2Farbe = Color.red;
					
					/*
					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
					 * zurueckgegeben
					 */
					
					aktuellVerfuegbareFarben= farbenAktualisieren();


					spielZuege++;
					groeseK2 = komponenteAnpassen(K2, Color.red, groeseK2);

											
					anzeigeAktualisierenKey(farbenPanel, 9);
					
					if(groeseK2 > k2Davor) {
						spielZugS2OhneVergroeserung=0;
					} else {
						spielZugS2OhneVergroeserung++;
					}
					

					max = maximaleZuege();
					endKonf = alleFelderBesetzt();
					
					infoKAendern();

					
					if(max == true || endKonf == true) {
						if(timer != null && timer.isRunning()) {
							timer.stop();
						}
						spielZugS2OhneVergroeserung = 0;
						if(max) {
							Endfenster unentscheden = new Endfenster("Test",3);
						} else {
							if(K1.size() > K2.size()) {
								Endfenster unentscheden = new Endfenster("S1",1);
							} else if(K1.size() < K2.size()) {
								Endfenster unentscheden = new Endfenster("S2",1);

							} else {
								Endfenster unentscheden = new Endfenster("Test",2);

							}
							
						}
						spielEnde();
						return;
					}

			}
			}
		}
		
		s2Dran = false;
		s1Dran = true;
				
			
		
	}
	
	
	public void anzeigeAktualisierenMouse(Color color) {
		Color brown = new Color(153,102,0);
		
		if(color.equals(Color.black)) {
			farbenPanel.remove(blackPanel);
			farbenPanel.revalidate();
			farbenPanel.repaint();
		}
		if(color.equals(Color.blue)) {
			farbenPanel.remove(bluePanel);
			farbenPanel.revalidate();
			farbenPanel.repaint();
		}
		if(color.equals(Color.cyan)) {
			farbenPanel.remove(cyanPanel);
			farbenPanel.revalidate();
			farbenPanel.repaint();
		}
		
		if(color.equals(Color.gray)) {
			farbenPanel.remove(grayPanel);
			farbenPanel.revalidate();
			farbenPanel.repaint();
		}
		
		if(color.equals(Color.green)) {
			farbenPanel.remove(greenPanel);
			farbenPanel.revalidate();
			farbenPanel.repaint();
		}
		
		if(color.equals(brown)) {
			farbenPanel.remove(brownPanel);
			farbenPanel.revalidate();
			farbenPanel.repaint();
		}
		
		if(color.equals(Color.orange)) {
			farbenPanel.remove(orangePanel);
			farbenPanel.revalidate();
			farbenPanel.repaint();
		}
		
		if(color.equals(Color.pink)) {
			farbenPanel.remove(pinkPanel);
			farbenPanel.revalidate();
			farbenPanel.repaint();
		}
		if(color.equals(Color.red)) {
			farbenPanel.remove(redPanel);
			farbenPanel.revalidate();
			farbenPanel.repaint();
		}
		
		ArrayList<Color> alleFarben = farbenAktualisieren();

		

		
		for(int i = 0; i < aktuellVerfuegbareFarben.size(); i++) {
			Color col = aktuellVerfuegbareFarben.get(i);
			if(col.equals(Color.blue) && alleFarben.contains(Color.blue)) {
				farbenPanel.add(bluePanel);
			}
			
			if(col.equals(Color.black) && alleFarben.contains(Color.black)) {
				farbenPanel.add(blackPanel);
			}
			if(col.equals(Color.cyan) && alleFarben.contains(Color.cyan)) {
				farbenPanel.add(cyanPanel);
			}
				if(col.equals(Color.pink) && alleFarben.contains(Color.pink)) {
					farbenPanel.add(pinkPanel);
				
				}
				if(col.equals(Color.green) && alleFarben.contains(Color.green)) {
					farbenPanel.add(greenPanel);
				
				}
				if(col.equals(Color.orange) && alleFarben.contains(Color.orange)) {
					farbenPanel.add(orangePanel);
				
				}
				if(col.equals(brown) && alleFarben.contains(brown)) {
					farbenPanel.add(brownPanel);
				
				
				
				}
				if(col.equals(Color.red) && alleFarben.contains(Color.red)) {
					farbenPanel.add(redPanel);
			}
				if(col.equals(Color.gray) && alleFarben.contains(Color.gray)) {
					farbenPanel.add(grayPanel);
			}
				

		}
				
		
		
	}
	
	public void anzeigeAktualisierenKey(JPanel farbenAnzeige, int x) {
		
		Color brown = new Color(153, 102, 0);

		
		if(x == 1) {
			farbenAnzeige.remove(blackPanel);
			farbenAnzeige.revalidate();
			farbenAnzeige.repaint();
		}
		if(x == 2) {
			farbenAnzeige.remove(bluePanel);
			farbenAnzeige.revalidate();
			farbenAnzeige.repaint();
		}
		if(x == 3) {
			farbenAnzeige.remove(cyanPanel);
			farbenAnzeige.revalidate();
			farbenAnzeige.repaint();
		}if(x == 4) {
			farbenAnzeige.remove(grayPanel);
			farbenAnzeige.revalidate();
			farbenAnzeige.repaint();
		}if(x == 5) {
			farbenAnzeige.remove(greenPanel);
			farbenAnzeige.revalidate();
			farbenAnzeige.repaint();
		}if(x == 6) {
			farbenAnzeige.remove(brownPanel);
			farbenAnzeige.revalidate();
			farbenAnzeige.repaint();
		}if(x == 7) {
			farbenAnzeige.remove(orangePanel);
			farbenAnzeige.revalidate();
			farbenAnzeige.repaint();
		}if(x == 8) {
			farbenAnzeige.remove(pinkPanel);
			farbenAnzeige.revalidate();
			farbenAnzeige.repaint();
		}
		if(x == 9) {
			farbenAnzeige.remove(redPanel);
			farbenAnzeige.revalidate();
			farbenAnzeige.repaint();
		}
		
		ArrayList<Color> alleFarben = farbenAktualisieren();

		
		for(int i = 0; i < aktuellVerfuegbareFarben.size(); i++) {
			Color col = aktuellVerfuegbareFarben.get(i);
			if(col.equals(Color.blue) && alleFarben.contains(Color.blue)) {
				farbenAnzeige.add(bluePanel);
			}
			
			if(col.equals(Color.black) && alleFarben.contains(Color.black)) {
				farbenAnzeige.add(blackPanel);
			}
			if(col.equals(Color.cyan) && alleFarben.contains(Color.cyan)) {
				farbenAnzeige.add(cyanPanel);
			}
				if(col.equals(Color.pink) && alleFarben.contains(Color.pink)) {
				farbenAnzeige.add(pinkPanel);
				
				}
				if(col.equals(Color.green) && alleFarben.contains(Color.green)) {
				farbenAnzeige.add(greenPanel);
				
				}
				if(col.equals(Color.orange) && alleFarben.contains(Color.orange)) {
				farbenAnzeige.add(orangePanel);
				
				}
				if(col.equals(brown) && alleFarben.contains(brown)) {
				farbenAnzeige.add(brownPanel);
				
				
				
				}
				if(col.equals(Color.red) && alleFarben.contains(Color.red)) {
				farbenAnzeige.add(redPanel);
			}
				if(col.equals(Color.gray) && alleFarben.contains(Color.gray)) {
				farbenAnzeige.add(grayPanel);
			}
				

		}
				
				
		
		
		
		
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

	public boolean maximaleZuege() {

		if (spielZugS2OhneVergroeserung == 4) {
			return true;
		}

		return false;

	}
	
	public ArrayList<Color> farbenAktualisieren() {
		
		ArrayList<Color> alleFarbenImSpiel = new ArrayList<Color>();
		
		for(int i = 0; i < ausgewaehlteFarben.size(); i++) {
			
			if(ausgewaehlteFarben.get(i).equals(s1Farbe) || ausgewaehlteFarben.get(i).equals(s2Farbe)) {
				continue;
			} else {
				alleFarbenImSpiel.add(ausgewaehlteFarben.get(i));
			}
			
		}
		

		
		for(int i = 0; i < spielbrettArray.length; i++) {
			for(int j = 0; j < spielbrettArray[i].length; j++) {
				
				if(alleFarbenImSpiel.contains(spielbrettArray[i][j].getBackground()) == false) {
					if(spielbrettArray[i][j].getBackground().equals(s1Farbe) || spielbrettArray[i][j].getBackground().equals(s2Farbe)) {
						continue;
					}
					alleFarbenImSpiel.add(spielbrettArray[i][j].getBackground());
				}
				
			}
		}
		
		
		return alleFarbenImSpiel;
		
	}
	
	
	
	

	public boolean alleFelderBesetzt() {

		int felderAnzahl = gewaehlteZeilenAnzahl * gewaehlteSpaltenAnzahl;

		if (felderAnzahl - K1.size() - K2.size() == 0) {
			return true;
		} else {
			return false;

		}

	}
	
	

	/*
	 * In dieser Methode ueberprueft man die Umgebung des jeweiligen Feldes und
	 * fuegt diese bei gleicher Farbe zur Komponente hinzu
	 */
	public void nachbarAufnehmen(ArrayList<JPanel> K, Color farbe, int zeile, int spalte) {

		if (zeile > 0) {
			Color obererNachbar = spielbrettArray[zeile - 1][spalte].getBackground();
			if (obererNachbar.equals(farbe)) {

				if (K.contains(spielbrettArray[zeile - 1][spalte])) {
					
				} else {
					K.add(spielbrettArray[zeile - 1][spalte]);
				}

			}

		}

		if (zeile < gewaehlteZeilenAnzahl - 1) {

			Color untererNachbar = spielbrettArray[zeile + 1][spalte].getBackground();
			if (untererNachbar.equals(farbe)) {

				if (K.contains(spielbrettArray[zeile + 1][spalte])) {
				} else {
					K.add(spielbrettArray[zeile + 1][spalte]);

				}

			}

		}

		if (spalte > 0) {

			Color rechterNachbar = spielbrettArray[zeile][spalte - 1].getBackground();
			if (rechterNachbar.equals(farbe)) {

				if (K.contains(spielbrettArray[zeile][spalte - 1])) {
				} else {
					K.add(spielbrettArray[zeile][spalte - 1]);

				}

			}

		}

		if (spalte < gewaehlteSpaltenAnzahl - 1) {

			Color linkerNachbar = spielbrettArray[zeile][spalte + 1].getBackground();
			if (linkerNachbar.equals(farbe)) {

				if (K.contains(spielbrettArray[zeile][spalte + 1])) {
				} else {
					K.add(spielbrettArray[zeile][spalte + 1]);

				}

			}

		}

	}

	
	public int komponenteAnpassen(ArrayList<JPanel> K, Color geklickteFarbe, int groeseK) {
		
		Color brown = new Color(153, 102, 0);

		int farbe = 1;
		
		if(geklickteFarbe.equals(Color.black)) {
			farbe = 1;
		} else if(geklickteFarbe.equals(Color.blue)) {
			farbe = 2;
		}
		else if(geklickteFarbe.equals(Color.cyan)) {
			farbe = 3;
		}else if(geklickteFarbe.equals(Color.gray)) {
			farbe = 4;
		}else if(geklickteFarbe.equals(Color.green)) {
			farbe = 5;
		}else if(geklickteFarbe.equals(brown)) {
			farbe = 6;
		}else if(geklickteFarbe.equals(Color.orange)) {
			farbe = 7;
		}else if(geklickteFarbe.equals(Color.pink)) {
			farbe = 8;
		}else if(geklickteFarbe.equals(Color.red)) {
			farbe = 9;
		}

		for (int i = 0; i < K.size(); i++) {
			K.get(i).setBackground(geklickteFarbe);
			int zeile = getZeile(spielbrettArray, K.get(i), gewaehlteZeilenAnzahl, gewaehlteSpaltenAnzahl);
			int spalte = getSpalte(spielbrettArray, K.get(i), gewaehlteZeilenAnzahl, gewaehlteSpaltenAnzahl);

			spielBrettArrayField[zeile][spalte].setColor(farbe);
			nachbarAufnehmen(K, geklickteFarbe, zeile, spalte);
		}
		groeseK = K.size();
		return groeseK;

	}
	
	
	

	// Aktuelle Zeile des Feldes wird zurueckgegeben
	public int getZeile(JPanel[][] brett, JPanel panel, int zeilen, int spalten) {

		for (int i = 0; i < zeilen; i++) {
			for (int j = 0; j < spalten; j++) {

				if (brett[i][j].equals(panel)) {
					return i;
				}

			}
		}

		return 0;

	}

	// Aktuelle Spalte des Feldes wird zurückgegeben
	public int getSpalte(JPanel[][] brett, JPanel panel, int zeilen, int spalten) {

		for (int i = 0; i < zeilen; i++) {
			for (int j = 0; j < spalten; j++) {

				if (brett[i][j].equals(panel)) {
					return j;
				}

			}
		}

		return 0;

	}

	

}
