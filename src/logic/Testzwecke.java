package logic;

import testing.Testing;


public class Testzwecke {
	
	
	
	
	public static void main(String[] args) {
		
		Field[][] board = new Field[5][5];
		
		Field a = new Field(0,0,6);
		Field b = new Field(0,1,4);
		Field c = new Field(0,2,2);
		Field d = new Field(0,3,3);
		Field e = new Field(0,4,5);
		Field f = new Field(1,0,1);
		Field g = new Field(1,1,6);
		Field h = new Field(1,2,4);
		Field i = new Field(1,3,2);
		Field j = new Field(1,4,4);
		Field k = new Field(2,0,2);
		Field l = new Field(2,1,2);
		Field m = new Field(2,2,5);
		Field n = new Field(2,3,3);
		Field o = new Field(2,4,3);
		Field p = new Field(3,0,1);
		Field q = new Field(3,1,2);
		Field r = new Field(3,2,5);
		Field s = new Field(3,3,4);
		Field t = new Field(3,4,1);
		Field u = new Field(4,0,2);
		Field v = new Field(4,1,2);
		Field w = new Field(4,2,1);
		Field x = new Field(4,3,6);
		Field y = new Field(4,4,5);
		


		board[0][0] = a;
		board[0][1] = b;
		board[0][2] = c;
		board[0][3] = d;
		board[0][4] = e;
		board[1][0] = f;
		board[1][1] = g;
		board[1][2] = h;
		board[1][3] = i;
		board[1][4] = j;
		board[2][0] = k;
		board[2][1] = l;
		board[2][2] = m;
		board[2][3] = n;
		board[2][4] = o;
		board[3][0] = p;
		board[3][1] = q;
		board[3][2] = r;
		board[3][3] = s;
		board[3][4] = t;
		board[4][0] = u;
		board[4][1] = v;
		board[4][2] = w;
		board[4][3] = x;
		board[4][4] = y;


		for(int test = 0; test < board.length ; test ++){

            System.out.println();
            for(int test1 = 0 ; test1 < board[test].length ; test1++){
                System.out.print(" | " + board[test][test1].getColor()  );
            }
            System.out.print(" |");
            System.out.println();
        }
		

		
		
		
		
		Testing testing = new Testing(board);
		
		System.out.println("Kuerzester Weg: " + testing.minMovesFull());



		
		
	}

}
