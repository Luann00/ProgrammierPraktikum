package testing;

import java.util.ArrayList;
import java.util.Collections;

//Name Luan Zekiri
//Matrikelnummer 7379949


import logic.ElementTesting;

/*
 * Siehe Hinweise auf dem Aufgabenblatt. 
 */

import logic.Field;

public class Testing {

	private Field[][] board;
	
	
	private Field[][] copyBoard;
	public Field[][] getCopyBoard() {
		return copyBoard;
	}





	public void setCopyBoard(Field[][] copyBoard) {
		this.copyBoard = copyBoard;
	}





	public int getS1FarbeDavor() {
		return s1FarbeDavor;
	}





	public void setS1FarbeDavor(int s1FarbeDavor) {
		this.s1FarbeDavor = s1FarbeDavor;
	}





	public int getS2FarbeDavor() {
		return s2FarbeDavor;
	}





	public void setS2FarbeDavor(int s2FarbeDavor) {
		this.s2FarbeDavor = s2FarbeDavor;
	}





	public int getS1FarbeCopy() {
		return s1FarbeCopy;
	}





	public void setS1FarbeCopy(int s1FarbeCopy) {
		this.s1FarbeCopy = s1FarbeCopy;
	}





	public int getS2FarbeCopy() {
		return s2FarbeCopy;
	}





	public void setS2FarbeCopy(int s2FarbeCopy) {
		this.s2FarbeCopy = s2FarbeCopy;
	}





	public ArrayList<Integer> getAlleFarben() {
		return alleFarben;
	}





	public void setAlleFarben(ArrayList<Integer> alleFarben) {
		this.alleFarben = alleFarben;
	}





	public ArrayList<Field> getK2Copy() {
		return K2Copy;
	}





	public void setK2Copy(ArrayList<Field> k2Copy) {
		K2Copy = k2Copy;
	}

	private int groeseK1;
	private int groeseK2;
	private int s1Farbe;
	private int s2Farbe;
	private int s1FarbeDavor;
	private int s2FarbeDavor;
	private int s1FarbeCopy;
	private int s2FarbeCopy;
	private ArrayList<Integer> alleFarben;
	
	private ArrayList<Field> K2;
	public ArrayList<Field> getK2() {
		return K2;
	}





	public void setK2(ArrayList<Field> k2) {
		K2 = k2;
	}

	private ArrayList<Field> K2Copy;
	private ArrayList<Field> K1Copy;
	
	
	
	
	
	public ArrayList<Field> getK1Copy() {
		return K1Copy;
	}





	public void setK1Copy(ArrayList<Field> k1Copy) {
		K1Copy = k1Copy;
	}

	//Das hier sind die jeweiligen Felder der Kompnente von S1 bzw. S2
	private ArrayList<Field> K1;
	public ArrayList<Field> getK1() {
		return K1;
	}





	public void setK1(ArrayList<Field> k1) {
		K1 = k1;
	}




	public Testing(Field[][] initBoard) {
		this.board = initBoard;
		init();
		alleFarben= farbenAktualisierenStrats();	
		
		

	}
	
	public void spielbrett() {
		
		

	}
	
	
	public ArrayList<Integer> getAktuellVerfuegbareFarben() {
		return alleFarben;
	}





	public void setAktuellVerfuegbareFarben(ArrayList<Integer> aktuellVerfuegbareFarben) {
		this.alleFarben = aktuellVerfuegbareFarben;
	}
	
	
	
	




	//In dieser Methode werdne alle Startwerte initialisiert und von dort aus wird alles Aktuelle berechnet
	public void init() {
		K1 = new ArrayList<Field>();
		K2 = new ArrayList<Field>();
		
		s1Farbe = board[board.length-1][0].getColor();
		s2Farbe = board[0][board[0].length-1].getColor();
		
		K1.add(board[board.length-1][0]);
		K2.add(board[0][board[0].length-1]);
		
				
		alleFarben= farbenAktualisierenStrats();
		
		
	
		//Nehme alle Nachbarn von S1 auf, falls diese die gleiche Farbe haben
		
		for(int i = 0; i < K1.size(); i++) {
			nachbarAufnehmen(K1,K1.get(i).getColor(), K1.get(i).getRow(), K1.get(i).getCol());
		}
		
		
		//Nehme alle Nachbarn von S2 auf, falls diese die gleiche Farbe haebn
		for(int i = 0; i < K2.size(); i++) {
			nachbarAufnehmen(K2,K2.get(i).getColor(), K2.get(i).getRow(), K2.get(i).getCol());
		}
		
		groeseK1 = K1.size();
		groeseK2 = K2.size();
		
		
		copyBoard = new Field[board.length][board[0].length];
		for (int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				
				copyBoard[i][j] = board[i][j].copy();

			}
		}
		
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
	
	

	public boolean isEndConfig() {
		
		int felderAnzahl = board.length * board[0].length;

		if (felderAnzahl - K1.size() - K2.size() == 0) {
			return true;
		} else {
			return false;

		}
		
		
		
	}
	
	
	
	public int testStrategy01() {
		
		
		alleFarben= farbenAktualisierenStrats();
		
		
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
		
		
			
		int col = farbeWaehlens1Testing(k1Black, k1Blue, k1Cyan, k1Gray, k1Green, k1Brown,k1Yellow,k1Pink,k1Red);
		
		
				
		
		return col;

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





	public int getS1Farbe() {
		return s1Farbe;
	}





	public void setS1Farbe(int s1Farbe) {
		this.s1Farbe = s1Farbe;
	}





	public int getS2Farbe() {
		return s2Farbe;
	}





	public void setS2Farbe(int s2Farbe) {
		this.s2Farbe = s2Farbe;
	}
	
			
		
	

public int komponenteAnpassen(ArrayList<Field> K, int geklickteFarbe, int groeseK) {
	


	//Alle Komponente von S2 bzw vom PC mit der jeweiligen Farbe faerben
	for (int i = 0; i < K.size(); i++) {
		K.get(i).setColor(geklickteFarbe);
		nachbarAufnehmen(K, geklickteFarbe, K.get(i).getRow(), K.get(i).getCol());
	}
	groeseK = K.size();
	return groeseK;

}

	
	
	

	
	
public ArrayList<Integer> farbenAktualisierenStrats() {
	
	ArrayList<Integer> alleFarbenImSpiel = new ArrayList<Integer>();
	
	for(int i = 1; i <= 6; i++) {
		if(i == s1Farbe || i == s2Farbe) {
			continue;
		} else {
			
			if(alleFarbenImSpiel.contains(i)) {
				continue;
			}
			
			alleFarbenImSpiel.add(i);
			
			
		}
	}
	
	return alleFarbenImSpiel;
	
		
	}

public ArrayList<Integer> farbenAktualisierenMoves(int s1Farbe) {
	
ArrayList<Integer> alleFarbenImSpiel = new ArrayList<Integer>();
	
	//Pruefen, ob Farbe s1Farbe ist. Falls nein, dann aufnehmen
	
	for(int i = 1; i <= 6; i++) {
		
		if(i == s1Farbe) {
			continue;
		} else {
			
			if(alleFarbenImSpiel.contains(i)) {
				continue;
			}
			
			alleFarbenImSpiel.add(i);
			
		}
		
		
	}
	
	
	return alleFarbenImSpiel;
	
}



public int farbeWaehlens1Testing(int k1, int k2, int k3, int k4, int k5, int k6, int k7, int k8, int k9) {
	
	ArrayList<ElementTesting> elemente = new ArrayList<ElementTesting>();
	alleFarben= farbenAktualisierenStrats();

					
	//Wichtig: Die ks in Elementtesting stellen die Groesen der jeweiligen Zahlen dar, die direkt danach mit dazu stehen
	
	if(alleFarben.contains(1)) {

			k1 = komponentenZuwachsTesting(K2Copy, 1, groeseK2);
			ElementTesting farbe1 = new ElementTesting(k1, 1);
			elemente.add(farbe1);
			K2Copy = new ArrayList<>(K2);

	}
		

	if(alleFarben.contains(2)) {

			k2 = komponentenZuwachsTesting(K2Copy, 2, groeseK2);
			ElementTesting farbe2 = new ElementTesting(k2, 2);
			elemente.add(farbe2);
			K2Copy = new ArrayList<>(K2);

	}

	
	if(alleFarben.contains(3)) {

			k3 = komponentenZuwachsTesting(K2Copy, 3, groeseK2);
			ElementTesting farbe3 = new ElementTesting(k3,3);
			elemente.add(farbe3);
			K2Copy = new ArrayList<>(K2);

	}

	if(alleFarben.contains(4)) {

			k4 = komponentenZuwachsTesting(K2Copy, 4, groeseK2);
			ElementTesting farbe4 = new ElementTesting(k4,4);
			elemente.add(farbe4);
			K2Copy = new ArrayList<>(K2);

	}

	
	if(alleFarben.contains(5)) {

			k5 = komponentenZuwachsTesting(K2Copy, 5, groeseK2);
			ElementTesting farbe5 = new ElementTesting(k5,5);
			elemente.add(farbe5);
			K2Copy = new ArrayList<>(K2);

	}

	
	if(alleFarben.contains(6)) {

			k6 = komponentenZuwachsTesting(K2Copy, 6, groeseK2);
			ElementTesting farbe6 = new ElementTesting(k6,6);
			elemente.add(farbe6);
			K2Copy = new ArrayList<>(K2);

	}
		
		
		ElementTesting c = elemente.get(0);
		for(int i = 1; i < elemente.size(); i++) {
			
			if(elemente.get(i).getGroese() < c.getGroese()) {
				c = elemente.get(i);
			}
			
		}
		
		return c.getName();
	
}


public int komponentenZuwachsTesting(ArrayList<Field> K, int c, int groeseK) {
	
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


public void nachbarAufnehmenMoves(ArrayList<Field> K, int farbe, int zeile, int spalte, Field[][] brett) {
	

	if (zeile > 0) {
		int obererNachbar = brett[zeile - 1][spalte].getColor();
		if (obererNachbar == farbe) {

			if (K.contains(brett[zeile - 1][spalte])) {

			} else {
				K.add(brett[zeile - 1][spalte]);
			}

		}

	}

	if (zeile < brett.length - 1) {

		int untererNachbar = brett[zeile + 1][spalte].getColor();
		if (untererNachbar == farbe) {

			if (K.contains(brett[zeile + 1][spalte])) {
			} else {
				K.add(brett[zeile + 1][spalte]);

			}

		}

	}

	if (spalte > 0) {

		int rechterNachbar = brett[zeile][spalte - 1].getColor();
		if (rechterNachbar == farbe) {

			if (K.contains(brett[zeile][spalte - 1])) {
			} else {
				K.add(brett[zeile][spalte - 1]);

			}

		}

	}

	if (spalte < brett[0].length - 1) {

		int linkerNachbar = brett[zeile][spalte + 1].getColor();
		if (linkerNachbar == farbe) {

			if (K.contains(brett[zeile][spalte + 1])) {
			} else {
				K.add(brett[zeile][spalte + 1]);

			}

		}

	}
	
	
}



	
	
	
	public int testStrategy02() {
		
		
		alleFarben= farbenAktualisierenStrats();
		
		
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
		
			
			
		int col = farbeWaehlens2Testing(k1Black, k1Blue, k1Cyan, k1Gray, k1Green, k1Brown,k1Yellow,k1Pink,k1Red);
		
		
		
		return col;

	}
	
public int farbeWaehlens2Testing(int k1, int k2, int k3, int k4, int k5, int k6, int k7, int k8, int k9) {
		
		
	ArrayList<ElementTesting> elemente = new ArrayList<ElementTesting>();

	
	alleFarben= farbenAktualisierenStrats();
	
	

					
		if(alleFarben.contains(1)) {
			k1 = komponentenZuwachsTesting(K2Copy, 1, groeseK2);
			ElementTesting black = new ElementTesting(k1, 1);
			elemente.add(black);
			K2Copy = new ArrayList<>(K2);

		}
		

		if(alleFarben.contains(2)) {
			k2 = komponentenZuwachsTesting(K2Copy, 2, groeseK2);
			ElementTesting blue = new ElementTesting(k2, 2);
			elemente.add(blue);
			K2Copy = new ArrayList<>(K2);



		}if(alleFarben.contains(3)) {
			k3 = komponentenZuwachsTesting(K2Copy, 3, groeseK2);
			ElementTesting cyan = new ElementTesting(k3,3);
			elemente.add(cyan);
			K2Copy = new ArrayList<>(K2);


		}if(alleFarben.contains(4)) {
			k4 = komponentenZuwachsTesting(K2Copy, 4, groeseK2);
			ElementTesting gray = new ElementTesting(k4,4);
			elemente.add(gray);
			K2Copy = new ArrayList<>(K2);


		}if(alleFarben.contains(5)) {
			k5 = komponentenZuwachsTesting(K2Copy, 5, groeseK2);
			ElementTesting green = new ElementTesting(k5,5);
			elemente.add(green);
			K2Copy = new ArrayList<>(K2);


		}if(alleFarben.contains(6)) {
			k6 = komponentenZuwachsTesting(K2Copy, 6, groeseK2);
			ElementTesting brown1 = new ElementTesting(k6,6);
			elemente.add(brown1);
			K2Copy = new ArrayList<>(K2);


		}
		
		
		//Nun groeste Farbe auswaehlen
		ElementTesting c = elemente.get(0);
		for(int i = 1; i < elemente.size(); i++) {
			
			if(elemente.get(i).getGroese() > c.getGroese()) {
				c = elemente.get(i);
			}
			
			
		}
				
		
		return c.getName();
		
		
		
	}

	public int testStrategy03() {
		
		alleFarben= farbenAktualisierenStrats();
				
		
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
		K1Copy = new ArrayList<Field>(K1);
		
		
		
			
			
		int col = farbeWaehlens3Testing(k1Black, k1Blue, k1Cyan, k1Gray, k1Green, k1Brown,k1Yellow,k1Pink,k1Red);
		
		
		return col;

	}
	
	public int farbeWaehlens3Testing(int k1, int k2, int k3, int k4, int k5, int k6, int k7, int k8, int k9) {
		
		
		alleFarben= farbenAktualisierenStrats();

		
		ArrayList<ElementTesting> elemente = new ArrayList<ElementTesting>();
		
						
			if(alleFarben.contains(1)) {
				k1 = komponentenZuwachsTesting(K1Copy, 1, groeseK1);
				ElementTesting black = new ElementTesting(k1, 1);
				elemente.add(black);
				K1Copy = new ArrayList<>(K1);

			}
			

			if(alleFarben.contains(2)) {
				k2 = komponentenZuwachsTesting(K1Copy, 2, groeseK1);
				ElementTesting blue = new ElementTesting(k2, 2);
				elemente.add(blue);
				K1Copy = new ArrayList<>(K1);



			}if(alleFarben.contains(3)) {
				k3 = komponentenZuwachsTesting(K1Copy, 3, groeseK1);
				ElementTesting cyan = new ElementTesting(k3,3);
				elemente.add(cyan);
				K1Copy = new ArrayList<>(K1);


			}if(alleFarben.contains(4)) {
				k4 = komponentenZuwachsTesting(K1Copy,4, groeseK1);
				ElementTesting gray = new ElementTesting(k4,4);
				elemente.add(gray);
				K1Copy = new ArrayList<>(K1);


			}if(alleFarben.contains(5)) {
				k5 = komponentenZuwachsTesting(K1Copy, 5, groeseK1);
				ElementTesting green = new ElementTesting(k5,5);
				elemente.add(green);
				K1Copy = new ArrayList<>(K1);


			}if(alleFarben.contains(6)) {
				k6 = komponentenZuwachsTesting(K1Copy, 6, groeseK1);
				ElementTesting brown1 = new ElementTesting(k6,6);
				elemente.add(brown1);
				K1Copy = new ArrayList<>(K1);


			}
			
			
			//Nun groeste Farbe auswaehlen
			if(alleFarben.size() > 0) {
			ElementTesting c = elemente.get(0);
			for(int i = 1; i < elemente.size(); i++) {
				
				if(elemente.get(i).getGroese() > c.getGroese()) {
					c = elemente.get(i);
				}
				
				
			}
			
			return c.getName();
			
			}
			
			return 0;
			
	}
	
	public boolean toBoard(Field[][] anotherBoard, int moves) {
	
		
		
		//Wenn Zeilen und Spalten der beiden Boards anders ist, so koennen diese niemals gleiche Farbverteilung haben
		if(board.length*board[0].length != anotherBoard.length*anotherBoard[0].length) {
			return false;
		}
		
		
		
		
		//Pruefen, ob beide Boards gleich viele farben haben

		ArrayList<Integer> alleFarbenBoard1 = farbenAktualisierenStrats();
		
		
		ArrayList<Integer> alleFarbenBoard2 = new ArrayList<Integer>();

		
		int colorS1Board2 = anotherBoard[anotherBoard.length-1][0].getColor();		
		int colorS2Board2 = anotherBoard[0][anotherBoard[0].length-1].getColor();		
		
		for(int i = 0; i < anotherBoard.length; i++) {
			for(int j = 0; j < anotherBoard[0].length; j++) {
				
				if(alleFarbenBoard2.contains(anotherBoard[i][j].getColor()) == false) {
					if(anotherBoard[i][j].getColor() == colorS1Board2 || anotherBoard[i][j].getColor() == colorS2Board2) {
						continue;
					}
					alleFarbenBoard2.add(anotherBoard[i][j].getColor());
				}
				
			}
		}
		
		
	
		if(gleicheBoards(anotherBoard)) {
			return true;
		}
		
		
		

		
		
		
		
		
		return false;
	}
	
	
	public boolean gleicheBoards(Field[][] anotherB) {
		
		//Pruefen, ob beide boards die gleichen sind. falls ja, wird am Ende true ausgegeben
				boolean gleichesBoard = true;
				for(int i = 0; i < board.length; i++) {
					for(int j = 0; j < board[0].length; j++) {
						
						if(board[i][j].getColor() != anotherB[i][j].getColor()) {
							gleichesBoard = false;
						}
						
					}
				}
				
				if(gleichesBoard) {
					return true;
				} else {
					return false;
				}
						
		
	}

	public int minMoves(int row, int col) { 
		
		///Pruefen, ob Feld schon eingenommen wurde. Falls ja, 0 zurueckgeben
		if(K1.contains(board[row][col])) {
			return 0;
		}
		
		
		int moves1 = 0;
		int moves2 = 0;
		int moves3 = 0;
		int moves4 = 0;
		int moves5 = 0;
		int moves6 = 0;
		ArrayList<Integer> verfuegbareFarben = new ArrayList<Integer>();
		int farbe = board[board.length-1][0].getColor();
		verfuegbareFarben = farbenAktualisierenMoves(farbe);
		
		
		/*
		 * Hier werden alle Zuege fuer jede Farbe gespeichert und anschliesend mit collections sort aufsteigen sortiert,
		 * sodass man die erste Zahl zurueckgeben kann
		 */
		ArrayList<Integer> alleZahlen = new ArrayList<Integer>();

			int m1 = move1neu(row,col,moves1);		
			boardZuweisen();
			alleZahlen.add(m1);


		
			int m2 = move2neu(row,col,moves2);
			boardZuweisen();
			alleZahlen.add(m2);

		
			int m3 = move3neu(row,col,moves3);
			boardZuweisen();
			alleZahlen.add(m3);

		
			int m4 = move4neu(row,col,moves4);
			boardZuweisen();
			alleZahlen.add(m4);

		
			int m5 = move5neu(row,col,moves5);		
			boardZuweisen();
			alleZahlen.add(m5);

		
			int m6 = move6neu(row,col,moves6);
			boardZuweisen();
			alleZahlen.add(m6);

		
										
		Collections.sort(alleZahlen);
		
		return alleZahlen.get(0);
		
		
	}
	
	

	public int minMovesFull() {
		
		//zuerst pruefen, ob spielbrett bereits in einer farbe ist
		if(K1.size() == board.length*board[0].length) {
			return 0;
		}
		
		
		
		//Alle wichtigen Variablen deklarieren
		
		int moves1 = 0;
		int moves2 = 0;
		int moves3 = 0;
		int moves4 = 0;
		int moves5 = 0;
		int moves6 = 0;

		ArrayList<Integer> verfuegbareFarben = new ArrayList<Integer>();
		int farbe = board[board.length-1][0].getColor();
		verfuegbareFarben = farbenAktualisierenMoves(farbe);
				
		
		/*
		 * Hier werden alle Zuege fuer jede Farbe gespeichert und anschliesend mit collections sort aufsteigen sortiert,
		 * sodass man die erste Zahl zurueckgeben kann
		 */
		ArrayList<Integer> alleZahlen = new ArrayList<Integer>();
			
		
		int m1 = move1(moves1);		
		alleZahlen.add(m1);
		boardZuweisen();
		
		
		
		int m2 = move2(moves2);
		boardZuweisen();
		alleZahlen.add(m2);

		
		
			
	

			int m3 = move3(moves3);
			boardZuweisen();
			alleZahlen.add(m3);



		

			int m4 = move4(moves4);
			boardZuweisen();
			alleZahlen.add(m4);


		

			int m5 = move5(moves5);		
			boardZuweisen();
			alleZahlen.add(m5);

			
		
			int m6 = move6(moves6);
			boardZuweisen();
			alleZahlen.add(m6);


			
		
		Collections.sort(alleZahlen);

					
		
		
		return alleZahlen.get(0);
	}
	
	public void boardZuweisen() {
		
		
		board = new Field[copyBoard.length][copyBoard[0].length];
		for (int i = 0; i < copyBoard.length; i++) {
			for(int j = 0; j < board[0].length; j++) {

			board[i][j] = copyBoard[i][j].copy();
		
		}
		}
		
		
	}
	
	
	public int move1neu(int row, int col, int moves1) {
		
		ArrayList<Field> K1Copy;

		if(K1.size() != 1) {
			K1Copy = new ArrayList<Field>(K1);

		} else {
		K1Copy = new ArrayList<Field>();
		K1Copy.add(board[board.length-1][0]);
		
		for(int i = 0; i < K1Copy.size(); i++) {
			nachbarAufnehmenMoves(K1Copy,K1Copy.get(i).getColor(), K1Copy.get(i).getRow(), K1Copy.get(i).getCol(), board);
		}	
		}
		
		int groeseK1Neu = K1Copy.size();		

		int farbe = board[board.length-1][0].getColor();
		
		//Alle Farben, inklusive die oben links, koennen angenommen werden. Auser natuerlich die eigene Farbe
		ArrayList<Integer> verfuegbareFarben = new ArrayList <Integer>();
		verfuegbareFarben = farbenAktualisierenMoves(farbe);

		
		
		while(K1Copy.contains(board[row][col]) == false) {
			for(int i = 1; i <= 6; i++) {
				
				if(K1Copy.contains(board[row][col])) {
					break;
				}
				
				if(verfuegbareFarben.contains(i) && K1Copy.contains(board[row][col])==false) {
					farbe = i;
					spielZugMoves(i,K1Copy);
					verfuegbareFarben = farbenAktualisierenMoves(farbe);
					moves1++;
				}
				
			
				
				if(K1Copy.contains(board[row][col])) {
					break;
					
				}
				
			}	

		}	

		return moves1;
		
		
	}
	
	public int move2neu(int row, int col, int moves2) {
		
		ArrayList<Field> K1Copy;


		if(K1.size() != 1) {
			K1Copy = new ArrayList<Field>(K1);

		} else {
		K1Copy = new ArrayList<Field>();
		K1Copy.add(board[board.length-1][0]);

		for(int i = 0; i < K1Copy.size(); i++) {
			nachbarAufnehmenMoves(K1Copy,K1Copy.get(i).getColor(), K1Copy.get(i).getRow(), K1Copy.get(i).getCol(), board);
		}	
		}
						
			int groeseK1Neu = K1Copy.size();


			int farbe = board[board.length-1][0].getColor();
			
			//Alle Farben, inklusive die oben links, koennen angenommen werden. Auser natuerlich die eigene Farbe
			ArrayList<Integer> verfuegbareFarben = new ArrayList <Integer>();
			verfuegbareFarben = farbenAktualisierenMoves(farbe);


					
			boolean erstesMal = true;
			
			while(K1Copy.contains(board[row][col]) == false) {
				verfuegbareFarben = farbenAktualisierenMoves(farbe);
				for(int i = 1; i <= 6; i++) {

					if(i == 1 && erstesMal == true) {
						erstesMal = false;
						continue;
					}
					verfuegbareFarben = farbenAktualisierenMoves(farbe);
					
					if(K1Copy.contains(board[row][col]) == true) {
						break;
					}

					if(verfuegbareFarben.contains(i) && K1Copy.contains(board[row][col]) == false) {
						farbe = i;
						spielZugMoves(farbe,K1Copy);
						moves2++;
						verfuegbareFarben = farbenAktualisierenMoves(farbe);
					}
					
					if(K1Copy.contains(board[row][col]) == true) {
						break;
					}

				}
			}


			return moves2;
		
		
	}


	public int move3neu(int row, int col, int moves3) {
	
		ArrayList<Field> K1Copy;

		if(K1.size() != 1) {
			K1Copy = new ArrayList<Field>(K1);

		} else {
		K1Copy = new ArrayList<Field>();
		K1Copy.add(board[board.length-1][0]);
		
		for(int i = 0; i < K1Copy.size(); i++) {
			nachbarAufnehmenMoves(K1Copy,K1Copy.get(i).getColor(), K1Copy.get(i).getRow(), K1Copy.get(i).getCol(), board);
		}	
		}

		int groeseK1Neu = K1Copy.size();		

		int farbe = board[board.length-1][0].getColor();
		
		//Alle Farben, inklusive die oben links, koennen angenommen werden. Auser natuerlich die eigene Farbe
		ArrayList<Integer> verfuegbareFarben = new ArrayList <Integer>();
		verfuegbareFarben = farbenAktualisierenMoves(farbe);


		boolean erstesMal1 = true;
		boolean erstesMal2 = true;

		
		while(K1Copy.contains(board[row][col]) == false) {
			verfuegbareFarben = farbenAktualisierenMoves(farbe);

			for(int i = 1; i <= 6; i++) {

				if(K1Copy.contains(board[row][col])) {
					break;
				}
				
				if(i == 1 && erstesMal1 == true) {
					erstesMal1 = false;
					continue;
				}
				
				if(i == 2 && erstesMal2 == true) {
					erstesMal2 = false;
					continue;
				}
				
				verfuegbareFarben = farbenAktualisierenMoves(farbe);

				if(verfuegbareFarben.contains(i) && K1Copy.contains(board[row][col])==false) {
					farbe = i;
					spielZugMoves(farbe, K1Copy);
					moves3++;
					verfuegbareFarben = farbenAktualisierenMoves(farbe);
				}	
				
				if(K1Copy.contains(board[row][col])) {
					break;
				}
				

			}
			
			if(K1Copy.contains(board[row][col])) {
				break;
				
			}
			

		}
		
		
		return moves3;
		
	
	
}
	
	
	public int move1(int moves1) {
			
ArrayList<Field> K1Copy;
		
		if(K1.size() != 1) {
			K1Copy = new ArrayList<Field>(K1);

		} else {
		K1Copy = new ArrayList<Field>();
		K1Copy.add(board[board.length-1][0]);
		
		for(int i = 0; i < K1Copy.size(); i++) {
			nachbarAufnehmenMoves(K1Copy,K1Copy.get(i).getColor(), K1Copy.get(i).getRow(), K1Copy.get(i).getCol(), board);
		}	
		}
	
		

		int groeseK1Neu = K1Copy.size();		

		int farbe = board[board.length-1][0].getColor();
		
		//Alle Farben, inklusive die oben links, koennen angenommen werden. Auser natuerlich die eigene Farbe
		ArrayList<Integer> verfuegbareFarben = new ArrayList <Integer>();
		verfuegbareFarben = farbenAktualisierenMoves(farbe);

		int z = 1;
		
		boolean full = allesEineFarbe();

		while(full == false) {
			for(int i = 1; i <= 6; i++) {
				
				if(verfuegbareFarben.contains(i)) {
					farbe = i;
					spielZugMoves(i, K1Copy);
					verfuegbareFarben = farbenAktualisierenMoves(farbe);
					moves1++;
					
				}
				
				full = allesEineFarbe();
				
				if(full) {
					break;
				}
			
				
				
			
			}

		}
		
		
	
		
		return moves1;
		
	}
	
	
	public int move4neu(int row, int col, int moves4) {
		
		ArrayList<Field> K1Copy;

		if(K1.size() != 1) {
			K1Copy = new ArrayList<Field>(K1);

		} else {
		K1Copy = new ArrayList<Field>();
		K1Copy.add(board[board.length-1][0]);
		
		for(int i = 0; i < K1Copy.size(); i++) {
			nachbarAufnehmenMoves(K1Copy,K1Copy.get(i).getColor(), K1Copy.get(i).getRow(), K1Copy.get(i).getCol(), board);
		}	
		}
		
		int groeseK1Neu = K1Copy.size();
		


		int farbe = board[board.length-1][0].getColor();
		
		//Alle Farben, inklusive die oben links, koennen angenommen werden. Auser natuerlich die eigene Farbe
		ArrayList<Integer> verfuegbareFarben = new ArrayList <Integer>();
		verfuegbareFarben = farbenAktualisierenMoves(farbe);


		//So lange mit den jeweiligen Farben vergroesern, bis Feld komplett eingenommen ist
		
		boolean erstesMal1 = true;
		boolean erstesMal2 = true;
		boolean erstesMal3 = true;

		
		while(K1Copy.contains(board[row][col]) == false) {
			verfuegbareFarben = farbenAktualisierenMoves(farbe);

			for(int i = 1; i <= 6; i++) {
				
				if(K1Copy.contains(board[row][col])) {
					break;
				}

				if(i == 1 && erstesMal1 == true) {
					erstesMal1 = false;
					continue;
				}
				if(i == 2 && erstesMal2 == true) {
					erstesMal2 = false;
					continue;
				}
				if(i == 3 && erstesMal3 == true) {
					erstesMal3 = false;
					continue;
				}
				
				verfuegbareFarben = farbenAktualisierenMoves(farbe);

				if(verfuegbareFarben.contains(i) && K1Copy.contains(board[row][col])==false) {
					farbe = i;
					spielZugMoves(farbe, K1Copy);
					moves4++;
					verfuegbareFarben = farbenAktualisierenMoves(farbe);
				}	
				
				if(K1Copy.contains(board[row][col])) {
					break;
				}
			}
			
			if(K1Copy.contains(board[row][col])) {
				break;
				
			}
		}
		

		return moves4;
		
		
	}
	
	
	public int move5neu(int row, int col, int moves5) {

		ArrayList<Field> K1Copy;
		
		if(K1.size() != 1) {
			K1Copy = new ArrayList<Field>(K1);

		} else {
		K1Copy = new ArrayList<Field>();
		K1Copy.add(board[board.length-1][0]);
		
		for(int i = 0; i < K1Copy.size(); i++) {
			nachbarAufnehmenMoves(K1Copy,K1Copy.get(i).getColor(), K1Copy.get(i).getRow(), K1Copy.get(i).getCol(), board);
		}	
		}
		
		int groeseK1Neu = K1Copy.size();
		


		int farbe = board[board.length-1][0].getColor();
		
		//Alle Farben, inklusive die oben links, koennen angenommen werden. Auser natuerlich die eigene Farbe
		ArrayList<Integer> verfuegbareFarben = new ArrayList <Integer>();
		verfuegbareFarben = farbenAktualisierenMoves(farbe);
		

		
		//So lange mit den jeweiligen Farben vergroesern, bis Feld komplett eingenommen ist
		
		boolean erstesMal1 = true;
		boolean erstesMal2 = true;
		boolean erstesMal3 = true;
		boolean erstesMal4 = true;
		
		while(K1Copy.contains(board[row][col]) == false) {
			verfuegbareFarben = farbenAktualisierenMoves(farbe);

			for(int i = 1; i <= 6; i++) {
				
				if(K1Copy.contains(board[row][col])) {
					break;
				}

				if(i == 1 && erstesMal1 == true) {
					erstesMal1 = false;
					continue;
				}
				if(i == 2 && erstesMal2 == true) {
					erstesMal2 = false;
					continue;
				}
				if(i == 3 && erstesMal3 == true) {
					erstesMal3 = false;
					continue;
				}
				if(i == 4 && erstesMal4 == true) {
					erstesMal4 = false;
					continue;
				}
				
				verfuegbareFarben = farbenAktualisierenMoves(farbe);

				if(verfuegbareFarben.contains(i) && K1Copy.contains(board[row][col])==false) {
					farbe = i;
					spielZugMoves(farbe,K1Copy);
					moves5++;
					verfuegbareFarben = farbenAktualisierenMoves(farbe);
				}	
				
				if(K1Copy.contains(board[row][col])) {
					break;
				}
				
				
				

			}
			
		}
		
		return moves5;
		
	}


	public int move6neu(int row, int col, int moves6) {

		ArrayList<Field> K1Copy;
		
		if(K1.size() != 1) {
			K1Copy = new ArrayList<Field>(K1);

		} else {
		K1Copy = new ArrayList<Field>();
		K1Copy.add(board[board.length-1][0]);
		
		for(int i = 0; i < K1Copy.size(); i++) {
			nachbarAufnehmenMoves(K1Copy,K1Copy.get(i).getColor(), K1Copy.get(i).getRow(), K1Copy.get(i).getCol(), board);
		}	
	}
		
		
		
		int groeseK1Neu = K1Copy.size();

		int farbe = board[board.length-1][0].getColor();
		
		//Alle Farben, inklusive die oben links, koennen angenommen werden. Auser natuerlich die eigene Farbe
		ArrayList<Integer> verfuegbareFarben = new ArrayList <Integer>();
		verfuegbareFarben = farbenAktualisierenMoves(farbe);

		//So lange mit den jeweiligen Farben vergroesern, bis Feld komplett eingenommen ist
		
		boolean erstesMal1 = true;
		boolean erstesMal2 = true;
		boolean erstesMal3 = true;
		boolean erstesMal4 = true;
		boolean erstesMal5 = true;
		

		while(K1Copy.contains(board[row][col]) == false) {

			for(int i = 1; i <= 6; i++) {
				
				if(K1Copy.contains(board[row][col])) {
					break;
				}

				if(i == 1 && erstesMal1 == true) {
					erstesMal1 = false;
					continue;
				}
				if(i == 2 && erstesMal2 == true) {
					erstesMal2 = false;
					continue;
				}
				if(i == 3 && erstesMal3 == true) {
					erstesMal3 = false;
					continue;
				}
				if(i == 4 && erstesMal4 == true) {
					erstesMal4 = false;
					continue;
				}
				if(i == 5 && erstesMal5 == true) {
					erstesMal5 = false;
					continue;
				}
				
				
				//Problem: Wenn Farbe beim ersten Klick verschwindet, wird sie von der methode farbenaktualisierenmoves trotzdem noch erkannt und aufgenommen, deswegen hat man am ende 1 klick mehr
				if(K1Copy.contains(board[row][col])==false && verfuegbareFarben.contains(i)) {	
					farbe = i;
					spielZugMoves(farbe, K1Copy);
					verfuegbareFarben = farbenAktualisierenMoves(farbe);
					moves6++;
					if(K1Copy.contains(board[row][col])) {
						break;
					
				}	
				
			
			}
				
				
				
			if(K1Copy.contains(board[row][col])) {
				break;
				
			}
			}
		}
		return moves6;
		
	
	
	
}
	
	
	
	
	
public int move2(int moves2) {
		
ArrayList<Field> K1Copy;
	
	if(K1.size() != 1) {
		K1Copy = new ArrayList<Field>(K1);

	} else {
	K1Copy = new ArrayList<Field>();
	K1Copy.add(board[board.length-1][0]);
	
	for(int i = 0; i < K1Copy.size(); i++) {
		nachbarAufnehmenMoves(K1Copy,K1Copy.get(i).getColor(), K1Copy.get(i).getRow(), K1Copy.get(i).getCol(), board);
	}	
	}
					
		int groeseK1Neu = K1Copy.size();


		int farbe = board[board.length-1][0].getColor();
		
		//Alle Farben, inklusive die oben links, koennen angenommen werden. Auser natuerlich die eigene Farbe
		ArrayList<Integer> verfuegbareFarben = new ArrayList <Integer>();
		verfuegbareFarben = farbenAktualisierenMoves(farbe);


		boolean erstesMal = true;
		
		boolean full = allesEineFarbe();
		
		
		while(full == false) {
			verfuegbareFarben = farbenAktualisierenMoves(farbe);

			for(int i = 1; i <= 6; i++) {

				if(i == 1 && erstesMal == true) {
					erstesMal = false;
					continue;
				}
				
				verfuegbareFarben = farbenAktualisierenMoves(farbe);

				if(verfuegbareFarben.contains(i)) {
					farbe = i;
					spielZugMoves(farbe, K1Copy);
					moves2++;
					verfuegbareFarben = farbenAktualisierenMoves(farbe);
				}
				
				full = allesEineFarbe();
				
				if(full) {
					break;
				}

			}
		}

		
		return moves2;
		
		
	}

public boolean allesEineFarbe() {
	
	ArrayList<Integer> farben = new ArrayList<Integer>();
	farben.add(board[board.length-1][0].getColor());
	
	for(int i = 0; i < board.length; i++) {
		for(int j = 0; j < board[0].length; j++) {
			
			if(farben.contains(board[i][j].getColor()) == false) {
				return false;
			}
			
		}
	}
	
	return true;
	
}




public void spielZug(int col, ArrayList<Integer> verfuegbareFarben, ArrayList<Field> K1Copy,int groeseK1Neu) {		
	

	//Alle Komponente von S mit der jeweiligen Farbe faerben und weitere Nachbarn bei gleicher Farbe aufnehmen
	for (int i = 0; i < K1Copy.size(); i++) {
		K1Copy.get(i).setColor(col);
		nachbarAufnehmen(K1Copy, col, K1Copy.get(i).getRow(), K1Copy.get(i).getCol());	
	}

	groeseK1Neu = K1Copy.size();

}


public void spielZugMoves(int col, ArrayList<Integer> verfuegbareFarben, ArrayList<Field> K1Copy) {
	
	for(int i = 0; i < K1Copy.size(); i++) {
		K1Copy.get(i).setColor(col);
		int zeile = K1Copy.get(i).getRow();
		int spalte = K1Copy.get(i).getCol();
		
		board[zeile][spalte].setColor(col);
		nachbarAufnehmen(K1Copy, col, K1Copy.get(i).getRow(), K1Copy.get(i).getCol());	
		
	}
	
}

	
	
public int move3(int moves3) {
	
ArrayList<Field> K1Copy;
	
	if(K1.size() != 1) {
		K1Copy = new ArrayList<Field>(K1);

	} else {
	K1Copy = new ArrayList<Field>();
	K1Copy.add(board[board.length-1][0]);
	
	for(int i = 0; i < K1Copy.size(); i++) {
		nachbarAufnehmenMoves(K1Copy,K1Copy.get(i).getColor(), K1Copy.get(i).getRow(), K1Copy.get(i).getCol(), board);
	}	
	}
	
	int groeseK1Neu = K1Copy.size();
	

	int farbe = board[board.length-1][0].getColor();
	
	
	
	//Alle Farben, inklusive die oben links, koennen angenommen werden. Auser natuerlich die eigene Farbe
	ArrayList<Integer> verfuegbareFarben = new ArrayList <Integer>();
	verfuegbareFarben = farbenAktualisierenMoves(farbe);


	
	//So lange mit den jeweiligen Farben vergroesern, bis Feld komplett eingenommen ist
	
	boolean erstesMal1 = true;
	boolean erstesMal2 = true;

	
	boolean full = allesEineFarbe();

	
	while(full == false) {
		verfuegbareFarben = farbenAktualisierenMoves(farbe);

		for(int i = 1; i <= 6; i++) {

			if(i == 1 && erstesMal1 == true) {
				erstesMal1 = false;
				continue;
			}
			
			if(i == 2 && erstesMal2 == true) {
				erstesMal2 = false;
				continue;
			}
			
			verfuegbareFarben = farbenAktualisierenMoves(farbe);

			if(verfuegbareFarben.contains(i)) {
				farbe = i;
				spielZugMoves(farbe,K1Copy);
				moves3++;
				verfuegbareFarben = farbenAktualisierenMoves(farbe);
			}	
			
			full = allesEineFarbe();
			
			if(full) {
				break;
			}

		}
		

	}
	

	

	return moves3;
	
	
}
	
	
	

public int move4(int moves4) {
	
ArrayList<Field> K1Copy;
	
	if(K1.size() != 1) {
		K1Copy = new ArrayList<Field>(K1);

	} else {
	K1Copy = new ArrayList<Field>();
	K1Copy.add(board[board.length-1][0]);
	
	for(int i = 0; i < K1Copy.size(); i++) {
		nachbarAufnehmenMoves(K1Copy,K1Copy.get(i).getColor(), K1Copy.get(i).getRow(), K1Copy.get(i).getCol(), board);
	}	
	}
	
	int groeseK1Neu = K1Copy.size();
	


	int farbe = board[board.length-1][0].getColor();
	
	//Alle Farben, inklusive die oben links, koennen angenommen werden. Auser natuerlich die eigene Farbe
	ArrayList<Integer> verfuegbareFarben = new ArrayList <Integer>();
	verfuegbareFarben = farbenAktualisierenMoves(farbe);

	
	//So lange mit den jeweiligen Farben vergroesern, bis Feld komplett eingenommen ist
	
	boolean erstesMal1 = true;
	boolean erstesMal2 = true;
	boolean erstesMal3 = true;
	
	
	boolean full = allesEineFarbe();

	
	while(full == false) {
		verfuegbareFarben = farbenAktualisierenMoves(farbe);

		for(int i = 1; i <= 6; i++) {

			if(i == 1 && erstesMal1 == true) {
				erstesMal1 = false;
				continue;
			}
			if(i == 2 && erstesMal2 == true) {
				erstesMal2 = false;
				continue;
			}
			if(i == 3 && erstesMal3 == true) {
				erstesMal3 = false;
				continue;
			}
			
			verfuegbareFarben = farbenAktualisierenMoves(farbe);

			if(verfuegbareFarben.contains(i)) {
				farbe = i;
				spielZugMoves(farbe, K1Copy);
				moves4++;
				verfuegbareFarben = farbenAktualisierenMoves(farbe);
			}	
			
			full = allesEineFarbe();
			
			if(full) {
				break;
			}


		}
	}


	
	return moves4;
	
	
}

public int move5(int moves5) {
	
ArrayList<Field> K1Copy;
	
	if(K1.size() != 1) {
		K1Copy = new ArrayList<Field>(K1);

	} else {
	K1Copy = new ArrayList<Field>();
	K1Copy.add(board[board.length-1][0]);
	
	for(int i = 0; i < K1Copy.size(); i++) {
		nachbarAufnehmenMoves(K1Copy,K1Copy.get(i).getColor(), K1Copy.get(i).getRow(), K1Copy.get(i).getCol(), board);
	}	
	}
			
	
	int groeseK1Neu = K1Copy.size();
	
	

	int farbe = board[board.length-1][0].getColor();
	
	//Alle Farben, inklusive die oben links, koennen angenommen werden. Auser natuerlich die eigene Farbe
	ArrayList<Integer> verfuegbareFarben = new ArrayList <Integer>();
	verfuegbareFarben = farbenAktualisierenMoves(farbe);


	
	//So lange mit den jeweiligen Farben vergroesern, bis Feld komplett eingenommen ist
	
	boolean erstesMal1 = true;
	boolean erstesMal2 = true;
	boolean erstesMal3 = true;
	boolean erstesMal4 = true;


	boolean full = allesEineFarbe();
	
	while(!full) {
		verfuegbareFarben = farbenAktualisierenMoves(farbe);

		for(int i = 1; i <= 6; i++) {

			if(i == 1 && erstesMal1 == true) {
				erstesMal1 = false;
				continue;
			}
			if(i == 2 && erstesMal2 == true) {
				erstesMal2 = false;
				continue;
			}
			if(i == 3 && erstesMal3 == true) {
				erstesMal3 = false;
				continue;
			}
			if(i == 4 && erstesMal4 == true) {
				erstesMal4 = false;
				continue;
			}
			
			verfuegbareFarben = farbenAktualisierenMoves(farbe);

			if(verfuegbareFarben.contains(i)) {
				farbe = i;
				spielZugMoves(farbe, K1Copy);
				moves5++;
				verfuegbareFarben = farbenAktualisierenMoves(farbe);
			}	
			
			full = allesEineFarbe();
			
			if(full) {
				break;
			}


		}
	}


	return moves5;
	
	
}

public int move6(int moves6) {
ArrayList<Field> K1Copy;
	
	if(K1.size() != 1) {
		K1Copy = new ArrayList<Field>(K1);

	} else {
	K1Copy = new ArrayList<Field>();
	K1Copy.add(board[board.length-1][0]);
	
	for(int i = 0; i < K1Copy.size(); i++) {
		nachbarAufnehmenMoves(K1Copy,K1Copy.get(i).getColor(), K1Copy.get(i).getRow(), K1Copy.get(i).getCol(), board);
	}	
	}
			
	
	int groeseK1Neu = K1Copy.size();
	
	


	int farbe = board[board.length-1][0].getColor();
	
	//Alle Farben, inklusive die oben links, koennen angenommen werden. Auser natuerlich die eigene Farbe
	ArrayList<Integer> verfuegbareFarben = new ArrayList<Integer>();
	verfuegbareFarben = farbenAktualisierenMoves(farbe);


	
	//So lange mit den jeweiligen Farben vergroesern, bis Feld komplett eingenommen ist
	
	boolean erstesMal1 = true;
	boolean erstesMal2 = true;
	boolean erstesMal3 = true;
	boolean erstesMal4 = true;
	boolean erstesMal5 = true;


	boolean full = allesEineFarbe();

	while(!full) {
		verfuegbareFarben = farbenAktualisierenMoves(farbe);

		for(int i = 1; i <= 6; i++) {

			if(i == 1 && erstesMal1 == true) {
				erstesMal1 = false;
				continue;
			}
			if(i == 2 && erstesMal2 == true) {
				erstesMal2 = false;
				continue;
			}
			if(i == 3 && erstesMal3 == true) {
				erstesMal3 = false;
				continue;
			}
			if(i == 4 && erstesMal4 == true) {
				erstesMal4 = false;
				continue;
			}
			if(i == 5 && erstesMal5 == true) {
				erstesMal5 = false;
				continue;
			}
			
			verfuegbareFarben = farbenAktualisierenMoves(farbe);
			if(verfuegbareFarben.contains(i)) {
				farbe = i;
				spielZugMoves(farbe, K1Copy);
				moves6++;
				verfuegbareFarben = farbenAktualisierenMoves(farbe);
			}	
			
			full = allesEineFarbe();
			
			if(full) {
				break;
			}


		}
	}


	return moves6;
	
	
}

public void spielZugMoves(int col,ArrayList<Field> K1Copy) {
	
	for(int i = 0; i < K1Copy.size(); i++) {
		K1Copy.get(i).setColor(col);
		int zeile = K1Copy.get(i).getRow();
		int spalte = K1Copy.get(i).getCol();
		
		board[zeile][spalte].setColor(col);
		nachbarAufnehmen(K1Copy, col, K1Copy.get(i).getRow(), K1Copy.get(i).getCol());	
		
	}

	
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
