package logic;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Endfenster{
	
	
	
	public Endfenster(String gewinner, int i) {
		
		JFrame gewinnerBekanntgabe = new JFrame("Gewinnerbekanntgabe");
		
		/*
		 * Ist es ein unentschieden, so wird unterschieden ob durch Stagnation oder nicht
		 * Bei Stagnation ist i 3, bei normalem Ende mit gleich grosen Komponenten ist i 2
		 * Bei einem Gewinner ist i dann 1
		 */
		
		if(i == 3) {
			JOptionPane.showMessageDialog(gewinnerBekanntgabe,"Gewinner: Unentschieden(4 Zuege ohne Vergroeserung)");
		}
		
		
		if(i == 2) {
			JOptionPane.showMessageDialog(gewinnerBekanntgabe,"Gewinner: Unentschieden(gleich grose Komponente)");

		}
		
		if(i == 1) {
			
			if(gewinner.equals("S1")) {
				JOptionPane.showMessageDialog(gewinnerBekanntgabe,"Gewinner: S1!");

			} else {
				JOptionPane.showMessageDialog(gewinnerBekanntgabe,"Gewinner: S2!");

			}			
		}
		
		
						
	}

}
