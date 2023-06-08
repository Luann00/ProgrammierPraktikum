package logic;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.util.Random;
import javax.swing.JButton;

public class Anzeigetafel extends JPanel{
	
	private MyFrame myFrame;
	private Menuetafel menue;
	private JPanel spielBrett = new JPanel();
	private JPanel farbenAnzeige = new JPanel();
	private int[] colorZahl;
	private String[] alleColors = {"Hellblau", "Gelb", "Gruen", "Grau", "Lila", "Rot"};
	private String[] colorString;
	private JButton[][] chessBoardSquares;

	
	


	public MyFrame getMyFrame() {
		return myFrame;
	}


	public void setMyFrame(MyFrame myFrame) {
		this.myFrame = myFrame;
	}


	public Menuetafel getMenue() {
		return menue;
	}


	public void setMenue(Menuetafel menue) {
		this.menue = menue;
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


	public int[] getColorZahl() {
		return colorZahl;
	}


	public void setColorZahl(int[] colorZahl) {
		this.colorZahl = colorZahl;
	}


	public String[] getAlleColors() {
		return alleColors;
	}


	public void setAlleColors(String[] alleColors) {
		this.alleColors = alleColors;
	}


	public String[] getColorString() {
		return colorString;
	}


	public void setColorString(String[] colorString) {
		this.colorString = colorString;
	}


	public JButton[][] getChessBoardSquares() {
		return chessBoardSquares;
	}


	public void setChessBoardSquares(JButton[][] chessBoardSquares) {
		this.chessBoardSquares = chessBoardSquares;
	}


	public Anzeigetafel(MyFrame myFrame, Menuetafel menue) {
		this.myFrame = myFrame;
		this.menue = menue;
		
	    

        spielBrett.setBorder(new LineBorder(Color.BLACK));
        
        this.setBackground(Color.BLACK);

        
        this.setVisible(true);

		
	}
	
	
	public JButton[][] spielbrettGenerieren(int zeilen, int spalten, int farbenImSpiel) {
		
		
		//Farben als Zahl speichern
		colorZahl = new int[farbenImSpiel];
		for(int i = 0; i < farbenImSpiel; i++) {
			colorZahl[i] = i;
		}
		
		//Nur die Anzahl der Farben kommen in colorString, die der Nutzer ausgewaehlt hat
		for(int i = 0; i < colorZahl.length; i++) {
			colorString[i] = alleColors[i];
		}
		
		
		spielBrett.setLayout(new GridLayout(zeilen, spalten));
		
		chessBoardSquares = new JButton[zeilen][spalten];
		
		for(int i = 0; i < zeilen; i++) {
			for(int j = 0; j < chessBoardSquares[i].length; j++) {
				chessBoardSquares[i][j] = new JButton();
				chessBoardSquares[i][j].setBackground(Color.BLACK);
				
			}
		}
		
		return chessBoardSquares;
		
		
		
		
	}
	
	public int randomZahl(int farbenImSpiel) {
		
		Random rand = new Random();
		
		return rand.nextInt(1, farbenImSpiel+1);
		
	}

}
