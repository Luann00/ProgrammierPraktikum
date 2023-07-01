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
	
	
	public Bedienungsanleitung() {
		this.setTitle("Bedienungsanleitung");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());		
		this.setVisible(true);
		
		setup();
		
	}
	
	
	public void setup() {
		
		JLabel bd = new JLabel("<HTML><U>Help</U></HTML>", JLabel.CENTER);
		bd.setFont(new Font("Arial", 1, 15));
		bd.setBackground(Color.black);
		bd.setHorizontalAlignment(SwingConstants.CENTER);
		Font f = bd.getFont();
		bd.setFont(f.deriveFont(f.getStyle() & ~Font.BOLD));
		this.add(bd,BorderLayout.NORTH);

		
		JPanel Infos = new JPanel();
		Infos.setLayout(new FlowLayout());
		JLabel regel1 = new JLabel();
		JLabel regel3 = new JLabel();
		regel1.setText("<html><body>1. The next color can be selected in two ways: Either by a mouse click<br> on the respective color or by pressing a key on one of the digits 1-9,<br>where each digit repsents one of the 9 numbers.<br></body></html>");
		regel3.setText("<html><body>3. The current selectable colors are displayed below the playing field<br><br><br></body></html>");
		
		
		JPanel farben = new JPanel();
		farben.setLayout(new BoxLayout(farben, BoxLayout.Y_AXIS));
		

		Infos.add(regel1);
		Infos.add(regel3);

		this.add(Infos);
		
		
	}

}
