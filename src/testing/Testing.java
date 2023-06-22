package testing;

import java.util.ArrayList;

/*
 * Siehe Hinweise auf dem Aufgabenblatt. 
 */

import logic.Field;
import logic.JPanels;
import logic.MyFrame;

public class Testing {

	private Field[][] board;
	private JPanels jPanel;

	public Testing(Field[][] initBoard) {
		this.board = initBoard;
		
	}
	
	public void zugriffMyFrame(JPanels jPanel) {
		this.jPanel = jPanel;
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
		
		//Kopie von dem Board, um auf diesem dann zu den Zug zu berechnen, wo die Veraenderung am kleinsten ist
		Field[][] copyBoard = getBoard();
		
		
		
		//Zuerst alle verfuegbaren bzw waehlbaren Farben speichern
		ArrayList<Integer> alleVerfuegbarenFarben = new ArrayList<Integer>();
		
		int zeilen = jPanel.getGewaehlteZeilenAnzahl();
		int spalten = jPanel.getGewaehlteSpaltenAnzahl();

		
		for(int i = 0; i < zeilen; i++) {
			for(int j = 0; j < spalten; j++) {
				
				if(alleVerfuegbarenFarben.contains(copyBoard[i][j].getColor()) == false) {
					if((i == zeilen-1 && j == 0) || (i == 0 && j == spalten-1)) {
						continue;
					} else {
						alleVerfuegbarenFarben.add(copyBoard[i][j].getColor());

					}
				}
				
			}
		}
		
		
		/*
		 * Nun: berechnen, welcher naechster Zug die guenstigste Vergroeserung mit sich bringt
		 * Dazu jede Farbe einmal angucken und gucken, wie gros komponente von s2 danach ist
		 */
		
		
		int color = 1;
		for(int i = 0; i < alleVerfuegbarenFarben.size(); i++) {
			color = alleVerfuegbarenFarben.get(i);
		}
		
		
		
		int groeseK = 1;
		
		int colS1 = board[0][board[0].length-1].getColor();
		
		

		
		
		
		
		

		return 0;
	}

	public int testStrategy02() {

		return 0;
	}

	public int testStrategy03() {

		return 0;
	}

	
	public boolean toBoard(Field[][] anotherBoard, int moves) {
		
		return false;
	}

	public int minMoves(int row, int col) { 

		return 0;
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
