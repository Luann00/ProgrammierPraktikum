package logic;

/*
 * Siehe Hinweise zu Umgang mit dem Repository auf Aufgabenblatt.  
 */

public class Field {

	private int color;
	private int row;
	private int col;
	
	public Field(int row, int col, int color) {
		this.row = row; 
		this.col = col; 
		this.color = color;  
	
	
	}
	
	public Field copy() {
		
		Field field = new Field(this.row,this.col,this.color);
		field.setRow(this.row);
		field.setCol(this.col);
		field.setColor(this.color);
		
		return field;

		
	}

	
	
	
	/*
	 * Getter und Setter
	 */
	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	

}
