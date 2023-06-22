package logic;

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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import testing.Testing;

import java.util.Scanner;

import javax.swing.*;
import java.awt.*;

public class JPanels extends JPanel {

	// Alle Fenster bzw. JPanels
	private MyFrame myFrame;
	private JPanel menueTafel;
	private JPanel spielBrett;
	private JPanel spielEinstellungen;
	private JPanel konfiguration;
	JPanel farbenAnzeige = new JPanel();

	private ArrayList<Color> alleMöglichenFarben = new ArrayList<Color>();
	private ArrayList<Color> ausgewaehlteFarben;
	private ArrayList<Color> aktuellVerfuegbareFarben;
	private int verfuegbareZahlenAnzahl;
	ArrayList<Color> aktuellVerfuegbareFarbenPC;

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

	public JPanel getSpielEinstellungen() {
		return spielEinstellungen;
	}

	public void setSpielEinstellungen(JPanel spielEinstellungen) {
		this.spielEinstellungen = spielEinstellungen;
	}

	public JPanel getKonfiguration() {
		return konfiguration;
	}

	public void setKonfiguration(JPanel konfiguration) {
		this.konfiguration = konfiguration;
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

	public JPanel getOrangePanel() {
		return orangePanel;
	}

	public void setOrangePanel(JPanel orangePanel) {
		this.orangePanel = orangePanel;
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

	public boolean iskVergroesert() {
		return kVergroesert;
	}

	public void setkVergroesert(boolean kVergroesert) {
		this.kVergroesert = kVergroesert;
	}

	public Color getGeklickteFarbe() {
		return geklickteFarbe;
	}

	public void setGeklickteFarbe(Color geklickteFarbe) {
		this.geklickteFarbe = geklickteFarbe;
	}

	public JLabel getZeilenUndSpaltenAnzeige() {
		return zeilenUndSpaltenAnzeige;
	}

	public void setZeilenUndSpaltenAnzeige(JLabel zeilenUndSpaltenAnzeige) {
		this.zeilenUndSpaltenAnzeige = zeilenUndSpaltenAnzeige;
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

	private String[] strat = { "1", "2", "3" };
	private String[] farben = { "4", "5", "6", "7", "8", "9" };
	private JComboBox<String> stratAuswahlListe;
	private JComboBox<String> farbenAnzahl;

	private int gewaehlteZeilenAnzahl;
	private int gewaehlteSpaltenAnzahl;
	private String gewaehlterBeginner;
	private int gewaehlteStrategie;
	private int farbenImSpiel;
//	private ArrayList<Color> waehlbareFarbenS1;

	private ArrayList<JPanel> K1;
	private ArrayList<JPanel> K2;
	private ArrayList<JPanel> K2Copy;
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
	private boolean kVergroesert;
	private Color geklickteFarbe;
	private JLabel zeilenUndSpaltenAnzeige;

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
		menueTafel.setLayout(new BoxLayout(menueTafel, BoxLayout.Y_AXIS));
		spielBrett = new JPanel();

		menueTafel.setPreferredSize(new Dimension(myFrame.getWidth() / 4, myFrame.getHeight()));
		spielBrett.setPreferredSize(new Dimension(myFrame.getWidth() / 4 * 3, myFrame.getHeight() / 8 * 7));

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

		playButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (playButton.getText().equals("Play")) {

					playButton.setText("Pause");
					if (s2RadioButton.isSelected()) {
						gewaehlterBeginner = s2RadioButton.getText();
					} else {
						gewaehlterBeginner = s1RadioButton.getText();
					}

					beginnerLabel.setText("Es hat begonnen: " + gewaehlterBeginner);
					gewaehlteStrategie = Integer.parseInt((String) stratAuswahlListe.getSelectedItem());

					stratAnzeige.setText("Verfolgte Strategie PC: " + gewaehlteStrategie);

					setup1();

				} else {
					playButton.setText("Play");
					beginnerLabel.setText("");
					stratAnzeige.setText("");

				}
			}
		});

		spielEinstellungen.add(beginnerUndStrat);

		menueTafel.add(konfiguration, BorderLayout.NORTH);

		menueTafel.add(spielEinstellungen, BorderLayout.CENTER);

		JPanel anzeige = new JPanel();
		anzeige.setLayout(new BorderLayout());
		anzeige.add(spielBrett, BorderLayout.CENTER);

		anzeige.add(farbenAnzeige, BorderLayout.SOUTH);

		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (startButton.getText().equals("Start")) {

					setup();
					farbenAnzeige.setLayout(new GridLayout(1, gewaehlteSpaltenAnzahl));
					s1Farbe = spielbrettArray[gewaehlteZeilenAnzahl - 1][0].getBackground();
					s2Farbe = spielbrettArray[0][gewaehlteSpaltenAnzahl - 1].getBackground();
					farbenAnzeigeInit(farbenAnzeige, s1Farbe, s2Farbe);

				} else {
					startButton.setText("Start");
					zeilenAuswahl.setEnabled(true);
					spaltenAuswahl.setEnabled(true);
					zeilenUndSpaltenAnzeige.setText("");
					spielBrett.removeAll();
					spielBrett.repaint();

					farbenAnzeige.removeAll();
					farbenAnzeige.revalidate();
					farbenAnzeige.repaint();

				}
			}
		});

		this.add(anzeige, BorderLayout.CENTER);
		this.add(menueTafel, BorderLayout.EAST);

		// Alle farben in der ArrayList hinzufuegen
		alleColorsAdden();
		
		

	}
	
	

	public void farbenAnzeigeInit(JPanel panel, Color s1, Color s2) {

		if (startButton.getText().equals("Stop")) {
			panel.setPreferredSize(new Dimension(getWidth(), getHeight() / 8));

			redPanel = new JPanel(new GridLayout(2, 1));
			blackPanel = new JPanel(new GridLayout(2, 1));
			bluePanel = new JPanel(new GridLayout(2, 1));
			cyanPanel = new JPanel(new GridLayout(2, 1));
			;
			grayPanel = new JPanel(new GridLayout(2, 1));
			greenPanel = new JPanel(new GridLayout(2, 1));
			brownPanel = new JPanel(new GridLayout(2, 1));
			orangePanel = new JPanel(new GridLayout(2, 1));
			pinkPanel = new JPanel(new GridLayout(2, 1));

			// Zuerst alle moeglichen Farben deklarieren
			Color brownColour = new Color(153, 102, 0);

			JLabel red = new JLabel("Red");
			redPanel.add(red);
			redPanel.add(new JLabel("9"));
			redPanel.setBorder(BorderFactory.createLineBorder(Color.black));

			JLabel black = new JLabel("Black");
			blackPanel.add(black);
			blackPanel.add(new JLabel("1"));
			blackPanel.setBorder(BorderFactory.createLineBorder(Color.black));

			JLabel blue = new JLabel("Blue");
			bluePanel.add(blue);
			bluePanel.add(new JLabel("2"));
			bluePanel.setBorder(BorderFactory.createLineBorder(Color.black));

			JLabel cyan = new JLabel("Cyan");
			cyanPanel.add(cyan);
			cyanPanel.add(new JLabel("3"));
			cyanPanel.setBorder(BorderFactory.createLineBorder(Color.black));

			JLabel gray = new JLabel("Gray");
			grayPanel.add(gray);
			grayPanel.add(new JLabel("4"));
			grayPanel.setBorder(BorderFactory.createLineBorder(Color.black));

			JLabel green = new JLabel("Green");
			greenPanel.add(green);
			greenPanel.add(new JLabel("5"));
			greenPanel.setBorder(BorderFactory.createLineBorder(Color.black));

			JLabel brown = new JLabel("Brown");
			brownPanel.add(brown);
			brownPanel.add(new JLabel("6"));
			brownPanel.setBorder(BorderFactory.createLineBorder(Color.black));

			JLabel orange = new JLabel("Orange");
			orangePanel.add(orange);
			orangePanel.add(new JLabel("7"));
			orangePanel.setBorder(BorderFactory.createLineBorder(Color.black));

			JLabel pink = new JLabel("Pink");
			pinkPanel.add(pink);
			pinkPanel.add(new JLabel("8"));
			pinkPanel.setBorder(BorderFactory.createLineBorder(Color.black));

			// Ersten Spielzug initialisieren

			if (farbenImSpiel == 4) {
				if ((s1.equals(Color.black) == false) && ((s2.equals(Color.black)) == false)) {
					panel.add(blackPanel);

				}
				if ((s1.equals(Color.blue) == false) && ((s2.equals(Color.blue)) == false)) {
					panel.add(bluePanel);

				}
				if ((s1.equals(Color.cyan) == false) && (s2.equals(Color.cyan)) == false) {
					panel.add(cyanPanel);

				}
				if ((s1.equals(Color.gray) == false) && (s2.equals(Color.gray)) == false) {
					panel.add(grayPanel);

				}

			}

			if (farbenImSpiel == 5) {

				if ((s1.equals(Color.black) == false) && ((s2.equals(Color.black)) == false)) {
					panel.add(blackPanel);

				}
				if ((s1.equals(Color.blue) == false) && ((s2.equals(Color.blue)) == false)) {
					panel.add(bluePanel);

				}
				if ((s1.equals(Color.cyan) == false) && (s2.equals(Color.cyan)) == false) {
					panel.add(cyanPanel);

				}
				if ((s1.equals(Color.gray) == false) && (s2.equals(Color.gray)) == false) {
					panel.add(grayPanel);

				}

				if ((s1.equals(Color.green) == false) && (s2.equals(Color.green)) == false) {
					panel.add(greenPanel);

				}
			}

			if (farbenImSpiel == 6) {
				if ((s1.equals(Color.black) == false) && ((s2.equals(Color.black)) == false)) {
					panel.add(blackPanel);

				}
				if ((s1.equals(Color.blue) == false) && ((s2.equals(Color.blue)) == false)) {
					panel.add(bluePanel);

				}
				if ((s1.equals(Color.cyan) == false) && (s2.equals(Color.cyan)) == false) {
					panel.add(cyanPanel);

				}
				if ((s1.equals(Color.gray) == false) && (s2.equals(Color.gray)) == false) {
					panel.add(grayPanel);

				}

				if ((s1.equals(Color.green) == false) && (s2.equals(Color.green)) == false) {
					panel.add(greenPanel);

				}
				if ((s1.equals(brownColour) == false) && (s2.equals(brownColour)) == false) {
					panel.add(brownPanel);

				}

			}

			if (farbenImSpiel == 7) {
				if ((s1.equals(Color.black) == false) && ((s2.equals(Color.black)) == false)) {
					panel.add(blackPanel);

				}
				if ((s1.equals(Color.blue) == false) && ((s2.equals(Color.blue)) == false)) {
					panel.add(bluePanel);

				}
				if ((s1.equals(Color.cyan) == false) && (s2.equals(Color.cyan)) == false) {
					panel.add(cyanPanel);

				}
				if ((s1.equals(Color.gray) == false) && (s2.equals(Color.gray)) == false) {
					panel.add(grayPanel);

				}

				if ((s1.equals(Color.green) == false) && (s2.equals(Color.green)) == false) {
					panel.add(greenPanel);

				}
				if ((s1.equals(brownColour) == false) && (s2.equals(brownColour)) == false) {
					panel.add(brownPanel);

				}

				if ((s1.equals(Color.orange) == false) && (s2.equals(Color.orange)) == false) {

					panel.add(orangePanel);

				}
			}

			if (farbenImSpiel == 8) {
				if ((s1.equals(Color.black) == false) && ((s2.equals(Color.black)) == false)) {
					panel.add(blackPanel);

				}
				if ((s1.equals(Color.blue) == false) && ((s2.equals(Color.blue)) == false)) {
					panel.add(bluePanel);

				}
				if ((s1.equals(Color.cyan) == false) && (s2.equals(Color.cyan)) == false) {
					panel.add(cyanPanel);

				}
				if ((s1.equals(Color.gray) == false) && (s2.equals(Color.gray)) == false) {
					panel.add(grayPanel);

				}

				if ((s1.equals(Color.green) == false) && (s2.equals(Color.green)) == false) {
					panel.add(greenPanel);

				}
				if ((s1.equals(brownColour) == false) && (s2.equals(brownColour)) == false) {
					panel.add(brownPanel);

				}

				if ((s1.equals(Color.orange) == false) && (s2.equals(Color.orange)) == false) {

					panel.add(orangePanel);

				}

				if ((s1.equals(Color.pink) == false) && (s2.equals(Color.pink)) == false) {

					panel.add(pinkPanel);

				}

			}

			if (farbenImSpiel == 9) {
				if ((s1.equals(Color.black) == false) && ((s2.equals(Color.black)) == false)) {
					panel.add(blackPanel);

				}
				if ((s1.equals(Color.blue) == false) && ((s2.equals(Color.blue)) == false)) {
					panel.add(bluePanel);

				}
				if ((s1.equals(Color.cyan) == false) && (s2.equals(Color.cyan)) == false) {
					panel.add(cyanPanel);

				}
				if ((s1.equals(Color.gray) == false) && (s2.equals(Color.gray)) == false) {
					panel.add(grayPanel);

				}

				if ((s1.equals(Color.green) == false) && (s2.equals(Color.green)) == false) {
					panel.add(greenPanel);

				}
				if ((s1.equals(brownColour) == false) && (s2.equals(brownColour)) == false) {
					panel.add(brownPanel);

				}

				if ((s1.equals(Color.orange) == false) && (s2.equals(Color.orange)) == false) {

					panel.add(orangePanel);

				}

				if ((s1.equals(Color.pink) == false) && (s2.equals(Color.pink)) == false) {

					panel.add(pinkPanel);

				}

				if ((s1.equals(Color.red) == false) && (s2.equals(Color.red)) == false) {

					panel.add(redPanel);

				}

			}

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
				
				Field feld1 = new Field(zeile,spalte,colorZahl);
				spielBrettArrayField[i][j] = feld1;



			}

		}

		revalidate();
		repaint();
		
		
		
		
		
		return spielbrettArray;

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
		
		if(neueFarbe.equals(Color.black)) {
			colorZahl = 1;
		} else if(neueFarbe.equals(Color.blue)) {
			colorZahl = 2;
		}else if(neueFarbe.equals(Color.cyan)) {
			colorZahl = 3;
		}else if(neueFarbe.equals(Color.gray)) {
			colorZahl = 4;
		}else if(neueFarbe.equals(Color.green)) {
			colorZahl = 5;
		}else if(neueFarbe.equals(brown)) {
			colorZahl = 6;
		}else if(neueFarbe.equals(Color.orange)) {
			colorZahl = 7;
		}else if(neueFarbe.equals(Color.pink)) {
			colorZahl = 8;
		}else if(neueFarbe.equals(Color.red)) {
			colorZahl = 9;
		}

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

	public String colorToString(Color color) {
		Color brown = new Color(153, 102, 0);
		if (color.equals(color.black))
			return "Schwarz";
		if (color.equals(color.blue))
			return "Blau";
		if (color.equals(color.yellow))
			return "Gelb";
		if (color.equals(color.green))
			return "Gruen";
		if (color.equals(color.red))
			return "Rot";
		if (color.equals(color.gray))
			return "Grau";
		if (color.equals(color.magenta))
			return "Magenta";
		if (color.equals(color.orange))
			return "Orange";
		if (color.equals(color.cyan))
			return "Hellblau";
		if (color.equals(brown))
			return "Braun";

		return "Andere Farbe";

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

		spielbrettArray = new JPanel[gewaehlteZeilenAnzahl][gewaehlteSpaltenAnzahl];

		farbenUebernehmen(farbenImSpiel);

		spielbrettArray = spielBrettGenerieren();

		while (benutzteFarben.size() != farbenImSpiel) {
			spielBrett.removeAll();
			spielbrettArray = spielBrettGenerieren();

		}

	}

	public void setup1() {

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
		kVergroesert = true;

		/*
		 * Als naechstes definieren: Zwei Methoden, wobei erste guckt, ob 4 zuege ohne
		 * vergroeserung geschehen ist. Zweite Methode: Pruefen, ob alle vorhandenen
		 * Felder die Farbe von S1 oder S2 haben
		 */

		boolean max = maximaleZuege(spielZuege, kVergroesert);
		boolean endKonf = alleFelderBesetzt();

		for (int i = 0; i < gewaehlteZeilenAnzahl; i++) {

			for (int j = 0; j < gewaehlteSpaltenAnzahl; j++) {

				int zeile = i;
				int spalte = j;

				spielbrettArray[i][j].addMouseListener(new MouseAdapter() {

					public void mouseClicked(MouseEvent e) {

						// Farbe des geklickten Feldes der Komponente zuweisen
						geklickteFarbe = spielbrettArray[zeile][spalte].getBackground();

						if (aktuellVerfuegbareFarben.contains(geklickteFarbe)) {
							spielZuege++;
							groeseK1 = komponenteAnpassen(K1, geklickteFarbe, groeseK1);

							s1FarbeDavor = s1Farbe;
							s1Farbe = geklickteFarbe;

							aktuellVerfuegbareFarben.add(removteFarbe);

							aktuellVerfuegbareFarben.remove(geklickteFarbe);
							removteFarbe = geklickteFarbe;

							anzeigeAktualisierenMouse(geklickteFarbe);
						}

					}
				});

			}
			
			
		}
		spielBrett.grabFocus();
		spielBrett.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent e) {

				if (e.getKeyChar() == '1') {
					if (Color.black.equals(s1Farbe) == false && Color.black.equals(s2Farbe) == false) {
						
						aktuellVerfuegbareFarben= farbenAktualisieren();

						if(aktuellVerfuegbareFarben.contains(Color.black) == true) {
							
						s1Farbe = Color.black;
							
						aktuellVerfuegbareFarben= farbenAktualisieren();


						spielZuege++;
						groeseK1 = komponenteAnpassen(K1, Color.black, groeseK1);

												
						anzeigeAktualisierenKey(farbenAnzeige, 1);
						
//						strategy1(spielbrettArray);


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

													
							anzeigeAktualisierenKey(farbenAnzeige, 2);
							
//							strategy1(spielbrettArray);



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

													
							anzeigeAktualisierenKey(farbenAnzeige, 3);
							
//							strategy1(spielbrettArray);




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

													
							anzeigeAktualisierenKey(farbenAnzeige, 4);
							
//							strategy1(spielbrettArray);


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

													
							anzeigeAktualisierenKey(farbenAnzeige, 5);
							
//							strategy1(spielbrettArray);



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

													
							anzeigeAktualisierenKey(farbenAnzeige, 6);
							
//							strategy1(spielbrettArray);



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

													
							
							anzeigeAktualisierenKey(farbenAnzeige, 7);
							
//							strategy1(spielbrettArray);



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

													
							anzeigeAktualisierenKey(farbenAnzeige, 8);
							
//							strategy1(spielbrettArray);



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

													
							anzeigeAktualisierenKey(farbenAnzeige, 9);
							
//							strategy1(spielbrettArray);

							

					}

				}
					
				}
								
				

				
				

			}

		});

	}
	
	
	public void strategy1(JPanel[][] board) {
		
		aktuellVerfuegbareFarben= farbenAktualisieren();
		
		ArrayList<Color> aktuellVerfuegbareFarbenCopy = new ArrayList<Color>(aktuellVerfuegbareFarben);
		
		
		int k1Black = groeseK2;
		int k1Blue = groeseK2;
		int k1Cyan = groeseK2;
		int k1Brown = groeseK2;
		int k1Gray = groeseK2;
		int k1Green = groeseK2;
		int k1Pink = groeseK2;
		int k1Yellow = groeseK2;
		int k1Red = groeseK2;

		
		int zeilen = gewaehlteZeilenAnzahl;
		int spalten = gewaehlteSpaltenAnzahl;
		
		
		
		//Copyattribute, mit denen ich den naechsten Zug simuliere
		K2Copy = new ArrayList<JPanel>(K2);
		s2FarbeCopy = s2Farbe;
		
		
		
		
		
		//Mit allen Farben das Board ausprobieren und gucken, welches die geringste vergroeserung gibt
		Color c = Color.black;
//		for(int i = 0; i < aktuellVerfuegbareFarben.size(); i++) {
//			c = aktuellVerfuegbareFarben.get(i);	
//		}
		
		
		
		
		
		/*
		 * Idee: Copy Board wie das aktuelle Board erschaffen und dort die spielzuege durchfuehren
		 */
		
		
		if(c.equals(Color.black)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(Color.black) == false && s2FarbeCopy.equals(Color.black) == false) {
				aktuellVerfuegbareFarbenCopy = farbenAktualisieren();
				if(aktuellVerfuegbareFarbenCopy.contains(Color.black) == true) {
					
					s2FarbeDavorCopy = s2FarbeCopy;
					s2FarbeCopy = Color.black;
					
					/*
					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
					 * zurueckgegeben
					 */
					
					aktuellVerfuegbareFarbenCopy = farbenAktualisieren();
//					spielZuege++;
					groeseK2Copy = komponenteAnpassen(K2Copy, Color.black, groeseK2Copy);
					
					
					k1Black = groeseK2Copy;
					
			}
			}
			
			/*
			 * Groese von Copy wieder zuruecksetzen. GroeseK2 wurde nt veraendert, weswegen diese als
			 * Backup dient
			 */
			groeseK2Copy = groeseK2;
			
			
		}
		
		
		if(c.equals(Color.blue)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(Color.blue) == false && s2FarbeCopy.equals(Color.blue) == false) {
				aktuellVerfuegbareFarbenCopy= farbenAktualisieren();
				if(aktuellVerfuegbareFarbenCopy.contains(Color.blue) == true) {
					
					s2FarbeDavorCopy = s2FarbeCopy;
					s2FarbeCopy = Color.blue;
					
					/*
					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
					 * zurueckgegeben
					 */
					
					aktuellVerfuegbareFarbenCopy = farbenAktualisieren();
					groeseK2Copy = komponenteAnpassen(K2Copy, Color.blue, groeseK2Copy);
					
					
					k1Blue = groeseK2Copy;
					
			}
			}
			
			/*
			 * Groese von Copy wieder zuruecksetzen. GroeseK2 wurde nt veraendert, weswegen diese als
			 * Backup dient
			 */
			groeseK2Copy = groeseK2;
			
		}
		
		
				
		
		
		//Eigentlicher Spielzug, bei der ich dann die jeweilige Farbe gemaes der Strategie zurueckgeben
//		spielZugs2(c);
		
		
		
		
		
		
		
	}
	
	public void spielZugs2(Color c) {
		
		aktuellVerfuegbareFarben= farbenAktualisieren();
		
			
		if(c.equals(Color.black)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(Color.black) == false && s2Farbe.equals(Color.black) == false) {
				aktuellVerfuegbareFarben= farbenAktualisieren();

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

											
					anzeigeAktualisierenKey(farbenAnzeige, 1);

			}
			}
		}
		
		if(c.equals(Color.blue)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(Color.blue) == false && s2Farbe.equals(Color.blue) == false) {
				aktuellVerfuegbareFarben= farbenAktualisieren();

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

											
					anzeigeAktualisierenKey(farbenAnzeige, 2);

			}
			}
		}
		
		if(c.equals(Color.cyan)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(Color.cyan) == false && s2Farbe.equals(Color.cyan) == false) {
				aktuellVerfuegbareFarben= farbenAktualisieren();

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

											
					anzeigeAktualisierenKey(farbenAnzeige, 3);

			}
			}
		}
		
		if(c.equals(Color.gray)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(Color.gray) == false && s2Farbe.equals(Color.gray) == false) {
				aktuellVerfuegbareFarben= farbenAktualisieren();

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

											
					anzeigeAktualisierenKey(farbenAnzeige, 4);

			}
			}
		}
		
		if(c.equals(Color.green)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(Color.green) == false && s2Farbe.equals(Color.green) == false) {
				aktuellVerfuegbareFarben= farbenAktualisieren();

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

											
					anzeigeAktualisierenKey(farbenAnzeige, 5);

			}
			}
		}
		
		Color brown = new Color(153,102,0);

		if(c.equals(brown)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(brown) == false && s2Farbe.equals(brown) == false) {
				aktuellVerfuegbareFarben= farbenAktualisieren();

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

											
					anzeigeAktualisierenKey(farbenAnzeige, 6);

			}
			}
		}
		
		if(c.equals(Color.orange)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(Color.orange) == false && s2Farbe.equals(Color.orange) == false) {
				aktuellVerfuegbareFarben= farbenAktualisieren();

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

											
					anzeigeAktualisierenKey(farbenAnzeige, 7);

			}
			}
		}
		
		if(c.equals(Color.pink)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(Color.pink) == false && s2Farbe.equals(Color.pink) == false) {
				aktuellVerfuegbareFarben= farbenAktualisieren();

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

											
					anzeigeAktualisierenKey(farbenAnzeige, 8);

			}
			}
		}
		
		if(c.equals(Color.red)) {
			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
			if(s1Farbe.equals(Color.red) == false && s2Farbe.equals(Color.red) == false) {
				aktuellVerfuegbareFarben= farbenAktualisieren();

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

											
					anzeigeAktualisierenKey(farbenAnzeige, 9);

			}
			}
		}
			
			
		
	}
	
	
	public void anzeigeAktualisierenMouse(Color color) {
		Color brown = new Color(153,102,0);
		
		if(color.equals(Color.black)) {
			farbenAnzeige.remove(blackPanel);
			farbenAnzeige.revalidate();
			farbenAnzeige.repaint();
		}
		if(color.equals(Color.blue)) {
			farbenAnzeige.remove(bluePanel);
			farbenAnzeige.revalidate();
			farbenAnzeige.repaint();
		}
		if(color.equals(Color.cyan)) {
			farbenAnzeige.remove(cyanPanel);
			farbenAnzeige.revalidate();
			farbenAnzeige.repaint();
		}
		
		if(color.equals(Color.gray)) {
			farbenAnzeige.remove(grayPanel);
			farbenAnzeige.revalidate();
			farbenAnzeige.repaint();
		}
		
		if(color.equals(Color.green)) {
			farbenAnzeige.remove(greenPanel);
			farbenAnzeige.revalidate();
			farbenAnzeige.repaint();
		}
		
		if(color.equals(brown)) {
			farbenAnzeige.remove(brownPanel);
			farbenAnzeige.revalidate();
			farbenAnzeige.repaint();
		}
		
		if(color.equals(Color.orange)) {
			farbenAnzeige.remove(orangePanel);
			farbenAnzeige.revalidate();
			farbenAnzeige.repaint();
		}
		
		if(color.equals(Color.pink)) {
			farbenAnzeige.remove(pinkPanel);
			farbenAnzeige.revalidate();
			farbenAnzeige.repaint();
		}
		if(color.equals(Color.red)) {
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

	public boolean maximaleZuege(int x, boolean y) {

		if (x == 4 && y == false) {
			return true;
		}

		return false;

	}
	
	public ArrayList<Color> farbenAktualisieren() {
		
		ArrayList<Color> alleFarbenImSpiel = new ArrayList<Color>();
		

		
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

	public void strat1() {

	}

}
