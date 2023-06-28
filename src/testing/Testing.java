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
	private int s1FarbeDavor;
	private int s2FarbeDavor;
	private int s1FarbeCopy;
	private int s2FarbeCopy;
	private ArrayList<Integer> aktuellVerfuegbareFarben;
	
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
		aktuellVerfuegbareFarben= farbenAktualisierenStrats();				

	}
	
	public void spielbrett() {
		
		

	}
	
	
	public ArrayList<Integer> getAktuellVerfuegbareFarben() {
		return aktuellVerfuegbareFarben;
	}





	public void setAktuellVerfuegbareFarben(ArrayList<Integer> aktuellVerfuegbareFarben) {
		this.aktuellVerfuegbareFarben = aktuellVerfuegbareFarben;
	}
	
	
	
	




	//In dieser Methode werdne alle Startwerte initialisiert und von dort aus wird alles Aktuelle berechnet
	public void init() {
		K1 = new ArrayList<Field>();
		K2 = new ArrayList<Field>();
		
		s1Farbe = board[board.length-1][0].getColor();
		s2Farbe = board[0][board[0].length-1].getColor();
		
		K1.add(board[board.length-1][0]);
		K2.add(board[0][board[0].length-1]);
		
				
		aktuellVerfuegbareFarben= farbenAktualisierenStrats();
		
		
	
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
		
		
		aktuellVerfuegbareFarben= farbenAktualisierenStrats();
		
		
		
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
		
		
			
		int col = farbeWaehlens1(k1Black, k1Blue, k1Cyan, k1Gray, k1Green, k1Brown,k1Yellow,k1Pink,k1Red);
		
//		spielZugPC(col);
		
				
		
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





//In dieser Methode wird die jeweilige Farbe uebernommen	
//public void spielZugMovesFull(int c, ArrayList<Integer> aktuellVerfuegbareFarben,int s1FarbeDavor, int s1Farbe, int groeseK1, ArrayList<Field>K1, int spielZuege) {
//				
//		
//		try {	
//		if(c == 1) {
//			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
//			if((s1Farbe == 1) == false) {
//
//				if(aktuellVerfuegbareFarben.contains(1) == true) {
//					
//					s1FarbeDavor = s1Farbe;
//					s1Farbe = 1;
//					aktuellVerfuegbareFarben.remove(s1Farbe);
//					aktuellVerfuegbareFarben.add(s1FarbeDavor);
//					
//					
//					/*
//					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
//					 * zurueckgegeben
//					 */
//					
//					aktuellVerfuegbareFarben= farbenAktualisierenMoves();
//
//					spielZuege++;
//					groeseK1 = komponenteAnpassen(K1, 1, groeseK1);
//
//											
//
//			}
//			}
//		}
//		
//		if(c == 2) {
//			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
//			if((s1Farbe == 2) == false) {
//
//				if(aktuellVerfuegbareFarben.contains(2) == true) {
//					
//
//					s1FarbeDavor = s1Farbe;
//					s1Farbe = 2;
//					aktuellVerfuegbareFarben.remove(s1Farbe);
//					aktuellVerfuegbareFarben.add(s1FarbeDavor);
//					
//					/*
//					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
//					 * zurueckgegeben
//					 */
//					
//					aktuellVerfuegbareFarben= farbenAktualisierenMoves();
//
//
//					spielZuege++;
//					groeseK1 = komponenteAnpassen(K1, 2, groeseK1);
//
//											
//
//			}
//			}
//		}
//		if(c == 3) {
//			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
//			if((s1Farbe == 3) == false) {
//
//				if(aktuellVerfuegbareFarben.contains(3) == true) {
//					
//
//					s1FarbeDavor = s1Farbe;
//					s1Farbe = 3;
//					aktuellVerfuegbareFarben.remove(s1Farbe);
//					aktuellVerfuegbareFarben.add(s1FarbeDavor);
//					
//					/*
//					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
//					 * zurueckgegeben
//					 */
//					
//					aktuellVerfuegbareFarben= farbenAktualisierenMoves();
//
//
//					spielZuege++;
//					groeseK1 = komponenteAnpassen(K1, 3, groeseK1);
//
//											
//
//			}
//			}
//		}
//		
//		if(c == 4) {
//			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
//			if((s1Farbe == 4) == false) {
//
//				if(aktuellVerfuegbareFarben.contains(4) == true) {
//
//					s1FarbeDavor = s1Farbe;
//					s1Farbe = 4;
//					aktuellVerfuegbareFarben.remove(s1Farbe);
//					aktuellVerfuegbareFarben.add(s1FarbeDavor);
//					/*
//					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
//					 * zurueckgegeben
//					 */
//					
//					aktuellVerfuegbareFarben= farbenAktualisierenMoves();
//
//
//					spielZuege++;
//					groeseK1 = komponenteAnpassen(K1, 4, groeseK1);
//
//											
//
//			}
//			}
//		}
//		
//		if(c == 5) {
//			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
//			if((s1Farbe == 5) == false) {
//
//				if(aktuellVerfuegbareFarben.contains(5) == true) {
//					
//
//					s1FarbeDavor = s1Farbe;
//					s1Farbe = 5;
//					aktuellVerfuegbareFarben.remove(s1Farbe);
//					aktuellVerfuegbareFarben.add(s1FarbeDavor);
//					
//					/*
//					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
//					 * zurueckgegeben
//					 */
//					
//					aktuellVerfuegbareFarben= farbenAktualisierenMoves();
//
//
//					spielZuege++;
//					groeseK1 = komponenteAnpassen(K1, 5, groeseK1);
//
//											
//
//			}
//			}
//		}
//		
//
//		if(c == 6) {
//			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
//			if((s1Farbe == 6) == false) {
//
//				if(aktuellVerfuegbareFarben.contains(6) == true) {
//					
//
//					s1FarbeDavor = s1Farbe;
//					s1Farbe = 6;
//					aktuellVerfuegbareFarben.remove(s1Farbe);
//					aktuellVerfuegbareFarben.add(s1FarbeDavor);
//					
//					/*
//					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
//					 * zurueckgegeben
//					 */
//					
//					aktuellVerfuegbareFarben= farbenAktualisierenMoves();
//
//
//					spielZuege++;
//					groeseK1 = komponenteAnpassen(K1, 6, groeseK1);
//
//											
//
//			}
//			}
//		}
//		
//		if(c == 7) {
//			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
//			if((s1Farbe == 7) == false) {
//
//				if(aktuellVerfuegbareFarben.contains(7) == true) {
//					
//
//					s1FarbeDavor = s1Farbe;
//					s1Farbe = 7;
//					aktuellVerfuegbareFarben.remove(s1Farbe);
//					aktuellVerfuegbareFarben.add(s1FarbeDavor);
//					
//					/*
//					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
//					 * zurueckgegeben
//					 */
//					
//					aktuellVerfuegbareFarben= farbenAktualisierenMoves();
//
//
//					spielZuege++;
//					groeseK1 = komponenteAnpassen(K1, 7, groeseK1);
//
//											
//
//			}
//			}
//		}
//		
//		if(c == 8) {
//			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
//			if((s1Farbe == 8) == false) {
//
//				if(aktuellVerfuegbareFarben.contains(8) == true) {
//					
//
//					s1FarbeDavor = s1Farbe;
//					s1Farbe = 8;
//					aktuellVerfuegbareFarben.remove(s1Farbe);
//					aktuellVerfuegbareFarben.add(s1FarbeDavor);
//					
//					/*
//					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
//					 * zurueckgegeben
//					 */
//					
//					aktuellVerfuegbareFarben= farbenAktualisierenMoves();
//
//
//					spielZuege++;
//					groeseK1 = komponenteAnpassen(K1, 8, groeseK1);
//
//											
//
//			}
//			}
//		}
//		
//		if(c == 9) {
//			//Zuerst ueberpruefen, ob schwarz schon zu s1 oder s2 gehoert
//			if((s1Farbe == 9) == false) {
//
//				if(aktuellVerfuegbareFarben.contains(9) == true) {
//					
//
//					s1FarbeDavor = s1Farbe;
//					s1Farbe = 9;
//					aktuellVerfuegbareFarben.remove(s1Farbe);
//					aktuellVerfuegbareFarben.add(s1FarbeDavor);
//					
//					/*
//					 * in farbenAktualisieren wird mit s1 und s2 farbe gearbeitet und die aktuellen farben
//					 * zurueckgegeben
//					 */
//					
//					aktuellVerfuegbareFarben= farbenAktualisierenMoves();
//
//
//					spielZuege++;
//					groeseK1 = komponenteAnpassen(K1, 9, groeseK1);
//
//			}
//			}
//		}
//		
//		} catch(Exception e) {
//			System.out.println("Spiel zu Ende!");
//		}
//			
//			
//		
	

public int komponenteAnpassen(ArrayList<Field> K, int geklickteFarbe, int groeseK) {
	


	//Alle Komponente von S2 bzw vom PC mit der jeweiligen Farbe faerben
	for (int i = 0; i < K.size(); i++) {
		K.get(i).setColor(geklickteFarbe);
		nachbarAufnehmen(K, geklickteFarbe, K.get(i).getRow(), K.get(i).getCol());
	}
	groeseK = K.size();
	return groeseK;

}

	
	
	
	public void boardAnzeigen() {
		
		 for(int i = 0; i < board.length ; i ++){

	            System.out.println();
	            for(int j = 0 ; j < board[i].length ; j++){
	                System.out.print(" | " + board[i][j].getColor()  );
	            }
	            System.out.print(" |");
	            System.out.println();
	        }
		
	}
	

	
	
public ArrayList<Integer> farbenAktualisierenStrats() {
		
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

public ArrayList<Integer> farbenAktualisierenMoves(int s1Farbe) {
	
	ArrayList<Integer> alleFarbenImSpiel = new ArrayList<Integer>();

	for(int i = 0; i < board.length; i++) {
		for(int j = 0; j < board[i].length; j++) {
			
			if(alleFarbenImSpiel.contains(board[i][j].getColor()) == false) {
				if(board[i][j].getColor() == s1Farbe) {
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
	aktuellVerfuegbareFarben= farbenAktualisierenStrats();

					
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


	
	
	
	public int testStrategy02() {
		
		
		aktuellVerfuegbareFarben= farbenAktualisierenStrats();
		
		
		
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

	aktuellVerfuegbareFarben= farbenAktualisierenStrats();
	

					
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
		
		aktuellVerfuegbareFarben= farbenAktualisierenStrats();
				
		
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
		
		
		
			
			
		int col = farbeWaehlens3(k1Black, k1Blue, k1Cyan, k1Gray, k1Green, k1Brown,k1Yellow,k1Pink,k1Red);
		
		
		return col;

	}
	
	public int farbeWaehlens3(int k1, int k2, int k3, int k4, int k5, int k6, int k7, int k8, int k9) {
		
		
		
		ArrayList<Element> elemente = new ArrayList<Element>();
		Color brown = new Color(153,102,0);

						
			if(aktuellVerfuegbareFarben.contains(1)) {
				k1 = komponentenZuwachs(K1Copy, 1, groeseK1);
				Element black = new Element(Color.black,k1, 1);
				elemente.add(black);
				K1Copy = new ArrayList<>(K1);

			}
			

			if(aktuellVerfuegbareFarben.contains(2)) {
				k2 = komponentenZuwachs(K1Copy, 2, groeseK1);
				Element blue = new Element(Color.blue,k2, 2);
				elemente.add(blue);
				K1Copy = new ArrayList<>(K1);



			}if(aktuellVerfuegbareFarben.contains(3)) {
				k3 = komponentenZuwachs(K1Copy, 3, groeseK1);
				Element cyan = new Element(Color.cyan,k3,3);
				elemente.add(cyan);
				K1Copy = new ArrayList<>(K1);


			}if(aktuellVerfuegbareFarben.contains(4)) {
				k4 = komponentenZuwachs(K1Copy,4, groeseK1);
				Element gray = new Element(Color.gray,k4,4);
				elemente.add(gray);
				K1Copy = new ArrayList<>(K1);


			}if(aktuellVerfuegbareFarben.contains(5)) {
				k5 = komponentenZuwachs(K1Copy, 5, groeseK1);
				Element green = new Element(Color.green,k5,5);
				elemente.add(green);
				K1Copy = new ArrayList<>(K1);


			}if(aktuellVerfuegbareFarben.contains(6)) {
				k6 = komponentenZuwachs(K1Copy, 6, groeseK1);
				Element brown1 = new Element(brown,k6,6);
				elemente.add(brown1);
				K1Copy = new ArrayList<>(K1);


			}if(aktuellVerfuegbareFarben.contains(7)) {
				k7 = komponentenZuwachs(K1Copy, 7, groeseK1);
				Element orange = new Element(Color.orange,k7,7);
				elemente.add(orange);
				K1Copy = new ArrayList<>(K1);


			}if(aktuellVerfuegbareFarben.contains(8)) {
				k8 = komponentenZuwachs(K1Copy, 8, groeseK1);
				Element pink = new Element(Color.pink,k8,8);
				elemente.add(pink);
				K1Copy = new ArrayList<>(K1);


			}if(aktuellVerfuegbareFarben.contains(9)) {
				k9 = komponentenZuwachs(K1Copy, 9, groeseK1);
				Element red = new Element(Color.red,k9,9);
				elemente.add(red);
				K1Copy = new ArrayList<>(K1);

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
			
			}
			
			return 0;
			
	}
		

	
	public boolean toBoard(Field[][] anotherBoard, int moves) {
		
		return false;
	}

	public int minMoves(int row, int col) { 
		
		//In dieser ArrayList werden alle aktuellen Felder, die sich in der Komponene vom Spieler befinden, gepackt
		ArrayList<Field> K1neu = new ArrayList<Field>();
		K1neu.add(board[board.length-1][0]);
		int groeseKNeu = 1;

		
		//Aktuelle Farbe vom Spieler speichern
		int farbe = board[board.length-1][0].getCol();
				
		

		return K1neu.size();
	}

	public int minMovesFull() {
		
		//Alle wichtigen Variablen deklarieren
		
		
		//In dieser ArrayList werden alle Felder vom Spieler gepackt
		ArrayList<Field> K1neu = new ArrayList<Field>(K1);
		
		
		int farbe = board[board.length-1][0].getColor();
		
		//Alle Farben, inklusive die oben links, koennen angenommen werden. Auser natuerlich die eigene Farbe
		ArrayList<Integer> verfuegbareFarben = new ArrayList<Integer>();
		verfuegbareFarben = farbenAktualisierenMoves(farbe);
		
		
		int moves1 = 0;
		int moves2 = 0;
		int moves3 = 0;
		int moves4 = 0;
		int moves5 = 0;
		int moves6 = 0;

		
						
		//Zuerst die Nachbarn vom Spieler pruefen und ggf aufnehmen
		for(int i = 0; i < K1neu.size(); i++) {
			nachbarAufnehmen(K1neu,K1neu.get(i).getColor(), K1neu.get(i).getRow(), K1neu.get(i).getCol());
		}	

		
		
		/*
		 * Ansatz: Waehle alle der 6 Farben als die Anfangsfarbe. Dann: Fuer jede Farbe jeweils Zyklisch board faerben, so lange
		 * bis man nicht mehr erhoehen kann. Dann spielzug in der jeweiligen spielZug Variable speichern
		 * Die Farben dann so auswaehlen, indem man fuer jede Farbe 1-6 in einer jeweiligen Schleife immer wieder
		 * die Farben durchgeht
		 */
		
	
		//Fuer farbe 1 Farben zyklisch waehlen
		int m1 = move1(moves1);
		int m2 = move2(moves2);
		int m3 = move2(moves3);
		int m4 = move2(moves4);
		int m5 = move2(moves5);
		int m6 = move2(moves6);
		
		

		System.out.println("Moves, wenn man mit blau anfaengt: " + m3);

				
			
		
		
		return m2;
	}
	
	
	public int move1(int moves1) {
				
		//In dieser ArrayList werden alle Felder vom Spieler gepackt
		ArrayList<Field> K1Copy = new ArrayList<Field>(K1);
		
		for(int i = 0; i < K1Copy.size(); i++) {
			nachbarAufnehmen(K1Copy,K1Copy.get(i).getColor(), K1Copy.get(i).getRow(), K1Copy.get(i).getCol());
		}	

		
		int groeseK1Neu = K1Copy.size();
		

		int farbe = board[board.length-1][0].getColor();
		
		//Alle Farben, inklusive die oben links, koennen angenommen werden. Auser natuerlich die eigene Farbe
		ArrayList<Integer> verfuegbareFarben = new ArrayList<Integer>();
		verfuegbareFarben = farbenAktualisierenMoves(farbe);

		
		//So lange mit den jeweiligen Farben vergroesern, bis Feld komplett eingenommen ist
		
		
		while(K1Copy.size() < board.length*board[0].length) {
			for(int i = 1; i <= 6; i++) {

				if(verfuegbareFarben.contains(i)) {
					farbe = i;
					spielZug(i, verfuegbareFarben, K1Copy, groeseK1Neu);
					verfuegbareFarben = farbenAktualisierenMoves(farbe);
					moves1++;

				}
		
			}
			
		}
		
		System.out.println("Moves: " + moves1);	
		
		return moves1;
		
	}
	
	public int move2(int moves2) {
		
		//In dieser ArrayList werden alle Felder vom Spieler gepackt
		ArrayList<Field> K1Copy = new ArrayList<Field>(K1);
		
		for(int i = 0; i < K1Copy.size(); i++) {
			nachbarAufnehmen(K1Copy,K1Copy.get(i).getColor(), K1Copy.get(i).getRow(), K1Copy.get(i).getCol());
		}	

		
		int groeseK1Neu = K1Copy.size();
		

		int farbe = board[board.length-1][0].getColor();
		
		//Alle Farben, inklusive die oben links, koennen angenommen werden. Auser natuerlich die eigene Farbe
		ArrayList<Integer> verfuegbareFarben = new ArrayList<Integer>();
		verfuegbareFarben = farbenAktualisierenMoves(farbe);

		
		//So lange mit den jeweiligen Farben vergroesern, bis Feld komplett eingenommen ist
		
		
		while(K1Copy.size() < board.length*board[0].length) {
			for(int i = 2; i <= 6; i++) {

				if(verfuegbareFarben.contains(i)) {
					farbe = i;
					spielZug(i, verfuegbareFarben, K1Copy, groeseK1Neu);
					verfuegbareFarben = farbenAktualisierenMoves(farbe);
					moves2++;

				}
		
			}
			
		}
		
		System.out.println("Moves: " + moves2);	
		
		return moves2;
		
	}
	
public int move3(int moves3) {
		
		//In dieser ArrayList werden alle Felder vom Spieler gepackt
		ArrayList<Field> K1Copy = new ArrayList<Field>(K1);
		
		for(int i = 0; i < K1Copy.size(); i++) {
			nachbarAufnehmen(K1Copy,K1Copy.get(i).getColor(), K1Copy.get(i).getRow(), K1Copy.get(i).getCol());
		}	

		
		int groeseK1Neu = K1Copy.size();
		

		int farbe = board[board.length-1][0].getColor();
		
		//Alle Farben, inklusive die oben links, koennen angenommen werden. Auser natuerlich die eigene Farbe
		ArrayList<Integer> verfuegbareFarben = new ArrayList<Integer>();
		verfuegbareFarben = farbenAktualisierenMoves(farbe);

		
		//So lange mit den jeweiligen Farben vergroesern, bis Feld komplett eingenommen ist
		
		
		while(K1Copy.size() < board.length*board[0].length) {
			for(int i = 3; i <= 6; i++) {

				if(verfuegbareFarben.contains(i)) {
					farbe = i;
					spielZug(i, verfuegbareFarben, K1Copy, groeseK1Neu);
					verfuegbareFarben = farbenAktualisierenMoves(farbe);
					moves3++;

				}
		
			}
			
		}
		
		System.out.println("Moves: " + moves3);	
		
		return moves3;
		
	}

public int move4(int moves4) {
	
	//In dieser ArrayList werden alle Felder vom Spieler gepackt
	ArrayList<Field> K1Copy = new ArrayList<Field>(K1);
	
	for(int i = 0; i < K1Copy.size(); i++) {
		nachbarAufnehmen(K1Copy,K1Copy.get(i).getColor(), K1Copy.get(i).getRow(), K1Copy.get(i).getCol());
	}	

	
	int groeseK1Neu = K1Copy.size();
	

	int farbe = board[board.length-1][0].getColor();
	
	//Alle Farben, inklusive die oben links, koennen angenommen werden. Auser natuerlich die eigene Farbe
	ArrayList<Integer> verfuegbareFarben = new ArrayList<Integer>();
	verfuegbareFarben = farbenAktualisierenMoves(farbe);

	
	//So lange mit den jeweiligen Farben vergroesern, bis Feld komplett eingenommen ist
	
	
	while(K1Copy.size() < board.length*board[0].length) {
		for(int i = 4; i <= 6; i++) {

			if(verfuegbareFarben.contains(i)) {
				farbe = i;
				spielZug(i, verfuegbareFarben, K1Copy, groeseK1Neu);
				verfuegbareFarben = farbenAktualisierenMoves(farbe);
				moves4++;

			}
	
		}
		
	}
	
	System.out.println("Moves: " + moves4);	
	
	return moves4;
	
}

public int move5(int moves5) {
	
	//In dieser ArrayList werden alle Felder vom Spieler gepackt
	ArrayList<Field> K1Copy = new ArrayList<Field>(K1);
	
	for(int i = 0; i < K1Copy.size(); i++) {
		nachbarAufnehmen(K1Copy,K1Copy.get(i).getColor(), K1Copy.get(i).getRow(), K1Copy.get(i).getCol());
	}	

	
	int groeseK1Neu = K1Copy.size();
	

	int farbe = board[board.length-1][0].getColor();
	
	//Alle Farben, inklusive die oben links, koennen angenommen werden. Auser natuerlich die eigene Farbe
	ArrayList<Integer> verfuegbareFarben = new ArrayList<Integer>();
	verfuegbareFarben = farbenAktualisierenMoves(farbe);

	
	//So lange mit den jeweiligen Farben vergroesern, bis Feld komplett eingenommen ist
	
	
	while(K1Copy.size() < board.length*board[0].length) {
		for(int i = 5; i <= 6; i++) {

			if(verfuegbareFarben.contains(i)) {
				farbe = i;
				spielZug(i, verfuegbareFarben, K1Copy, groeseK1Neu);
				verfuegbareFarben = farbenAktualisierenMoves(farbe);
				moves5++;

			}
	
		}
		
	}
	
	System.out.println("Moves: " + moves5);	
	
	return moves5;
	
}

public int move6(int moves6) {
	
	//In dieser ArrayList werden alle Felder vom Spieler gepackt
	ArrayList<Field> K1Copy = new ArrayList<Field>(K1);
	
	for(int i = 0; i < K1Copy.size(); i++) {
		nachbarAufnehmen(K1Copy,K1Copy.get(i).getColor(), K1Copy.get(i).getRow(), K1Copy.get(i).getCol());
	}	

	
	int groeseK1Neu = K1Copy.size();
	

	int farbe = board[board.length-1][0].getColor();
	
	//Alle Farben, inklusive die oben links, koennen angenommen werden. Auser natuerlich die eigene Farbe
	ArrayList<Integer> verfuegbareFarben = new ArrayList<Integer>();
	verfuegbareFarben = farbenAktualisierenMoves(farbe);

	
	//So lange mit den jeweiligen Farben vergroesern, bis Feld komplett eingenommen ist
	
	
	while(K1Copy.size() < board.length*board[0].length) {
		for(int i = 6; i <= 6; i++) {

			if(verfuegbareFarben.contains(i)) {
				farbe = i;
				spielZug(i, verfuegbareFarben, K1Copy, groeseK1Neu);
				verfuegbareFarben = farbenAktualisierenMoves(farbe);
				moves6++;

			}
	
		}
		
	}
	
	System.out.println("Moves: " + moves6);	
	
	return moves6;
	
}
	
	
	public void spielZug(int col, ArrayList<Integer> verfuegbareFarben, ArrayList<Field> K1Copy,int groeseK1Neu) {
		
		
		if(verfuegbareFarben.contains(col)) {
			
			
			//Alle Komponente von S mit der jeweiligen Farbe faerben und weitere Nachbarn bei gleicher Farbe aufnehmen
			for (int i = 0; i < K1Copy.size(); i++) {
				K1Copy.get(i).setColor(col);
				nachbarAufnehmen(K1Copy, col, K1Copy.get(i).getRow(), K1Copy.get(i).getCol());
			}
			
		}
		groeseK1Neu = K1Copy.size();
		
		
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
