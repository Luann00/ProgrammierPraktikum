package logic;

import java.awt.Color;

public class Element {
	
	private Color col;
	private int groese;
	private int name;
	
	
	public Element(Color col, int groese, int name) {
		this.col = col;
		this.groese = groese;
		this.name = name;
	}

	


	public int getName() {
		return name;
	}




	public void setName(int name) {
		this.name = name;
	}




	public Color getCol() {
		return col;
	}


	public void setCol(Color col) {
		this.col = col;
	}


	public int getGroese() {
		return groese;
	}


	public void setGroese(int groese) {
		this.groese = groese;
	}

}
