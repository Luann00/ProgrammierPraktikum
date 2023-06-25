package testing;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;

import logic.Element;

/*
 * Siehe Hinweise auf dem Aufgabenblatt. 
 */

import logic.Field;
import logic.JPanels;
import logic.MyFrame;

public class Testing {

	private Field[][] board;
	private int groeseK1;
	private int groeseK2;
	private int s1Farbe;
	private int s2Farbe;
	private int s1FarbeCopy;
	private int s2FarbeCopy;
	private ArrayList<Integer> aktuellVerfuegbareFarben;
	
	
	
	
	
	//Das hier sind die jeweiligen Felder der Kompnente von S1 bzw. S2
	private ArrayList<Field> K1;
	public ArrayList<Field> getK1() {
		return K1;
	}





	public void setK1(ArrayList<Field> k1) {
		K1 = k1;
	}

	private ArrayList<Field> K2;
	private ArrayList<Field> K2Copy;
	private ArrayList<Field> K1Copy;


	public Testing(Field[][] initBoard) {
		this.board = initBoard;
		init();
		spielbrett();

		
	}
	
	public void spielbrett() {
		
		

	}
	
	
	public ArrayList<Integer> getAktuellVerfuegbareFarben() {
		return aktuellVerfuegbareFarben;
	}





	public void setAktuellVerfuegbareFarben(ArrayList<Integer> aktuellVerfuegbareFarben) {
		this.aktuellVerfuegbareFarben = aktuellVerfuegbareFarben;
	}





	public void init() {
		K1 = new ArrayList<Field>();
		K2 = new ArrayList<Field>();
		
		s1Farbe = board[board.length-1][0].getColor();
		s2Farbe = board[0][board[0].length-1].getColor();
		
		K1.add(board[board.length-1][0]);
		K2.add(board[0][board[0].length-1]);
		
		groeseK1 = 1;
		groeseK2 = 1;
		
		

	}
	
	
	
	

	public boolean isStartklar() {		
		
		//Test, ob jedes Feld eine andere Farbe hat
		for(int i = 0; i < board.length; i++) {
			
			for(int j = 0; j < board[i].length; j++) {
				
				int farbe = board[i][j].getColor();
				
				if(i < board.length-1) {
					if(farbe == board[i+1][j].getColor()) {
						return false;
					}
				}
				
				if(j < board[i].length-1) {
					
					if(farbe==board[i][j+1].getColor()) {
						return false;
					}
					
				}

			}
			
		}
		
		
		ArrayList<Integer> alleFarben = new ArrayList<Integer>();
		
		for(int i = 0; i < board.length; i++) {
			
			
			for(int j = 0; j < board[i].length; j++) {
				
				if((alleFarben.contains(board[i][j].getColor()) == false)) {
					alleFarben.add(board[i][j].getColor());
				}
				
			}
		}
		//Gucken, ob alle 6 farben im Spiel sind
		if(alleFarben.size() != 6) {
			return false;
		}
				
		
		//Pruefen, ob untes linkeres Feld eine nanderen Wert hat als unteres rechtes Feld
		if(board[board.length-1][0].getColor() == board[0][board[0].length-1].getColor()) {
			return false;
		}
		
		return true;
		
		

	}
	
	
	/*
	 * Gucken, ob ich diese Methode hier in der Klasse testing implementieren kann
	 * Durch diese Methode: Komponentengroese wird zuruecgegeben
	 */
//	public void getGroese() {
//		jPanel = zugriffMyFrame(JPanels j);
//		System.out.println(jPanel.getGroeseK1());
//	}
	
	

	public boolean isEndConfig() {
		
		
		

		
		

		return false;
	}
	
	
	

	
	public int testStrategy01() {
		
		
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
		K2Copy = new ArrayList<Field>(K2);
		s2FarbeCopy = s2Farbe;
		
		K1Berechnen();
		
		
			
			
		int col = farbeWaehlens1(k1Black, k1Blue, k1Cyan, k1Gray, k1Green, k1Brown,k1Yellow,k1Pink,k1Red);
		
		
		return col;

	}
	
	
public ArrayList<Integer> farbenAktualisieren() {
		
		ArrayList<Integer> alleFarbenImSpiel = new ArrayList<Integer>();
		
		

		

		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				
				if(alleFarbenImSpiel.contains(board[i][j].getColor()) == false) {
					if(board[i][j].getColor() == s1Farbe || board[i][j].getColor() == s2Farbe) {
						continue;
					}
					alleFarbenImSpiel.add(board[i][j].getColor());
				}
				
			}
		}
		
		
		return alleFarbenImSpiel;
		
	}


public int farbeWaehlens1(int k1, int k2, int k3, int k4, int k5, int k6, int k7, int k8, int k9) {
	
	ArrayList<Element> elemente = new ArrayList<Element>();
	Color brown = new Color(153,102,0);
	aktuellVerfuegbareFarben= farbenAktualisieren();

					
		if(aktuellVerfuegbareFarben.contains(1)) {
			k1 = komponentenZuwachs(K2Copy, 1, groeseK2);
			Element black = new Element(Color.black,k1, 1);
			elemente.add(black);
			K2Copy = new ArrayList<>(K2);

		}
		

		if(aktuellVerfuegbareFarben.contains(2)) {
			k2 = komponentenZuwachs(K2Copy, 2, groeseK2);
			Element blue = new Element(Color.blue,k2, 2);
			elemente.add(blue);
			K2Copy = new ArrayList<>(K2);



		}if(aktuellVerfuegbareFarben.contains(3)) {
			k3 = komponentenZuwachs(K2Copy, 3, groeseK2);
			Element cyan = new Element(Color.cyan,k3,3);
			elemente.add(cyan);
			K2Copy = new ArrayList<>(K2);


		}if(aktuellVerfuegbareFarben.contains(4)) {
			k4 = komponentenZuwachs(K2Copy, 4, groeseK2);
			Element gray = new Element(Color.gray,k4,4);
			elemente.add(gray);
			K2Copy = new ArrayList<>(K2);


		}if(aktuellVerfuegbareFarben.contains(5)) {
			k5 = komponentenZuwachs(K2Copy, 5, groeseK2);
			Element green = new Element(Color.green,k5,5);
			elemente.add(green);
			K2Copy = new ArrayList<>(K2);


		}if(aktuellVerfuegbareFarben.contains(6)) {
			k6 = komponentenZuwachs(K2Copy, 6, groeseK2);
			Element brown1 = new Element(brown,k6,6);
			elemente.add(brown1);
			K2Copy = new ArrayList<>(K2);


		}if(aktuellVerfuegbareFarben.contains(7)) {
			k7 = komponentenZuwachs(K2Copy, 7, groeseK2);
			Element orange = new Element(Color.orange,k7,7);
			elemente.add(orange);
			K2Copy = new ArrayList<>(K2);


		}if(aktuellVerfuegbareFarben.contains(8)) {
			k8 = komponentenZuwachs(K2Copy, 8, groeseK2);
			Element pink = new Element(Color.pink,k8,8);
			elemente.add(pink);
			K2Copy = new ArrayList<>(K2);


		}if(aktuellVerfuegbareFarben.contains(9)) {
			k9 = komponentenZuwachs(K2Copy, 9, groeseK2);
			Element red = new Element(Color.red,k9,9);
			elemente.add(red);
			K2Copy = new ArrayList<>(K2);

		}
		
		
		if(aktuellVerfuegbareFarben.size() > 0) {
		Element c = elemente.get(0);
		for(int i = 1; i < elemente.size(); i++) {
			
			if(elemente.get(i).getGroese() < c.getGroese()) {
				c = elemente.get(i);
			}
			
			
		}
		return c.getName();
		
		} else {
			return 0;
		}	
	
	
}


public int komponentenZuwachs(ArrayList<Field> K, int c, int groeseK) {
	
	for (int i = 0; i < K.size(); i++) {
		nachbarAufnehmen(K, c, K.get(i).getRow(), K.get(i).getCol());
	}
	
	
	groeseK = K.size();
	return groeseK;
	
}


public void nachbarAufnehmen(ArrayList<Field> K, int farbe, int zeile, int spalte) {

	if (zeile > 0) {
		int obererNachbar = board[zeile - 1][spalte].getColor();
		if (obererNachbar == farbe) {

			if (K.contains(board[zeile - 1][spalte])) {
				
			} else {
				K.add(board[zeile - 1][spalte]);
			}

		}

	}

	if (zeile < board.length - 1) {

		int untererNachbar = board[zeile + 1][spalte].getColor();
		if (untererNachbar == farbe) {

			if (K.contains(board[zeile + 1][spalte])) {
			} else {
				K.add(board[zeile + 1][spalte]);

			}

		}

	}

	if (spalte > 0) {

		int rechterNachbar = board[zeile][spalte - 1].getColor();
		if (rechterNachbar == farbe) {

			if (K.contains(board[zeile][spalte - 1])) {
			} else {
				K.add(board[zeile][spalte - 1]);

			}

		}

	}

	if (spalte < board[0].length - 1) {

		int linkerNachbar = board[zeile][spalte + 1].getColor();
		if (linkerNachbar == farbe) {

			if (K.contains(board[zeile][spalte + 1])) {
			} else {
				K.add(board[zeile][spalte + 1]);

			}

		}

	}

}



public void K1Berechnen() {
	
	
	
	int c = board[board.length-1][0].getColor();
	
	for (int i = 0; i < K1.size(); i++) {
		nachbarAufnehmen(K1, c, K1.get(i).getRow(), K1.get(i).getCol());
	}
	
	
	
	
}
	
	
	
	public int testStrategy02() {
		
		
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
		K2Copy = new ArrayList<Field>(K2);
		s2FarbeCopy = s2Farbe;
		
			
			
		int col = farbeWaehlens2(k1Black, k1Blue, k1Cyan, k1Gray, k1Green, k1Brown,k1Yellow,k1Pink,k1Red);
		
		
		return col;

	}
	
public int farbeWaehlens2(int k1, int k2, int k3, int k4, int k5, int k6, int k7, int k8, int k9) {
		
		
	ArrayList<Element> elemente = new ArrayList<Element>();
	Color brown = new Color(153,102,0);

	aktuellVerfuegbareFarben= farbenAktualisieren();
	

					
		if(aktuellVerfuegbareFarben.contains(1)) {
			k1 = komponentenZuwachs(K2Copy, 1, groeseK2);
			Element black = new Element(Color.black,k1, 1);
			elemente.add(black);
			K2Copy = new ArrayList<>(K2);

		}
		

		if(aktuellVerfuegbareFarben.contains(2)) {
			k2 = komponentenZuwachs(K2Copy, 2, groeseK2);
			Element blue = new Element(Color.blue,k2, 2);
			elemente.add(blue);
			K2Copy = new ArrayList<>(K2);



		}if(aktuellVerfuegbareFarben.contains(3)) {
			k3 = komponentenZuwachs(K2Copy, 3, groeseK2);
			Element cyan = new Element(Color.cyan,k3,3);
			elemente.add(cyan);
			K2Copy = new ArrayList<>(K2);


		}if(aktuellVerfuegbareFarben.contains(4)) {
			k4 = komponentenZuwachs(K2Copy, 4, groeseK2);
			Element gray = new Element(Color.gray,k4,4);
			elemente.add(gray);
			K2Copy = new ArrayList<>(K2);


		}if(aktuellVerfuegbareFarben.contains(5)) {
			k5 = komponentenZuwachs(K2Copy, 5, groeseK2);
			Element green = new Element(Color.green,k5,5);
			elemente.add(green);
			K2Copy = new ArrayList<>(K2);


		}if(aktuellVerfuegbareFarben.contains(6)) {
			k6 = komponentenZuwachs(K2Copy, 6, groeseK2);
			Element brown1 = new Element(brown,k6,6);
			elemente.add(brown1);
			K2Copy = new ArrayList<>(K2);


		}if(aktuellVerfuegbareFarben.contains(7)) {
			k7 = komponentenZuwachs(K2Copy, 7, groeseK2);
			Element orange = new Element(Color.orange,k7,7);
			elemente.add(orange);
			K2Copy = new ArrayList<>(K2);


		}if(aktuellVerfuegbareFarben.contains(8)) {
			k8 = komponentenZuwachs(K2Copy, 8, groeseK2);
			Element pink = new Element(Color.pink,k8,8);
			elemente.add(pink);
			K2Copy = new ArrayList<>(K2);


		}if(aktuellVerfuegbareFarben.contains(9)) {
			k9 = komponentenZuwachs(K2Copy, 9, groeseK2);
			Element red = new Element(Color.red,k9,9);
			elemente.add(red);
			K2Copy = new ArrayList<>(K2);

		}
		
		
		//Nun groeste Farbe auswaehlen
		if(aktuellVerfuegbareFarben.size() > 0) {
		Element c = elemente.get(0);
		for(int i = 1; i < elemente.size(); i++) {
			
			if(elemente.get(i).getGroese() > c.getGroese()) {
				c = elemente.get(i);
			}
			
			
		}
		
		
		return c.getName();
		} else {
			return 0;
		}	
		
		
	}

	public int testStrategy03() {

		return 0;
	}

	
	public boolean toBoard(Field[][] anotherBoard, int moves) {
		
		return false;
	}

	public int minMoves(int row, int col) { 
		
		//In dieser ArrayList werden alle Felder vom Spieler gepackt
		ArrayList<Field> K1neu = new ArrayList<Field>();
		K1neu.add(board[board.length-1][0]);
		int groeseKNeu = 1;

		
		int farbe = board[board.length-1][0].getCol();
		
		//Zuerst die Nachbarn vom Spieler pruefen und ggf aufnehmen
		komponentenZuwachs(K1neu, farbe, groeseKNeu); 
		
		

		return K1neu.size();
	}

	public int minMovesFull() {

		return 0;
	}

	
	
	
	/*
	 * Getter und Setter
	 */
	public Field[][] getBoard() {
		return board;
	}

	public void setBoard(Field[][] board) {
		this.board = board;
	}

}
