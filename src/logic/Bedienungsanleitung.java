package logic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JPanel.*;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Bedienungsanleitung extends JFrame{
	
	//Name Luan Zekiri
	//Matrikelnummer 7379949
	
	
	public Bedienungsanleitung() {
		this.setTitle("Bedienungsanleitung");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());		
		this.setVisible(true);
		
		setup();
		
	}
	
	
	public void setup() {
		
		JLabel bd = new JLabel("<HTML><U>Bedienungsanleitung</U></HTML>", JLabel.CENTER);
		bd.setFont(new Font("Arial", 1, 15));
		bd.setBackground(Color.black);
		bd.setHorizontalAlignment(SwingConstants.CENTER);
		Font f = bd.getFont();
		bd.setFont(f.deriveFont(f.getStyle() & ~Font.BOLD));
		this.add(bd,BorderLayout.NORTH);

		
		
		JLabel ueberschrift = new JLabel("Ablauf:");
		JLabel eins = new JLabel("1. Bretteinstellungen und Spieleinstellungen vornehmen");
		JLabel startDruecken = new JLabel("2. Den Start Button betaetigen, um das Spielbrett zu generieren");
		JLabel playDruecken = new JLabel("3. Den Play Button betaetigen, um das Spiel zu starten");
		JLabel farbenText = new JLabel();
		farbenText.setText("<html><body> 4. Die Farben koennen auf 3 verschieden Arten gewaehlt werden: <br> Entweder durch einen Mausklick auf das jeweilige Feld mit der Farbe<br> oder durch einen Mausklick auf die waehlbaren Farben unter dem Spielbrett <br> oder indem man die gewuenschte Nummer der Farbe auf der Tastatur drueckt<br></body></html>");


		
		JLabel regel1 = new JLabel();
		JLabel regel3 = new JLabel();
//		regel1.setText("<html><body>1. The next color can be selected in three ways: Either by a mouse click<br> on the respective color at at the game baord or by a mouse click<br> on one of the color Fields<br>below the game board or by pressing a key on one of the digits 1-9,<br>where each digit represents one of the 9 numbers.<br></body></html>");
//		regel3.setText("<html><body>2. The current selectable colors are displayed below the playing field<br><br><br></body></html>");
		
		
		JPanel farben = new JPanel();
		farben.setLayout(new BoxLayout(farben, BoxLayout.Y_AXIS));
		

		farben.add(ueberschrift);
		farben.add(eins);
		farben.add(startDruecken);
		farben.add(playDruecken);
		farben.add(farbenText);


		this.add(farben);
		
		
	}

}
