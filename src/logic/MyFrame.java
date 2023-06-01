package logic;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	Menuetafel menueTafel;
	Anzeigetafel anzeigeTafel;
	
	public MyFrame() {
		
		this.setSize(new Dimension(600,600));
//		this.setMinimumSize(new Dimension(500, 500));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(true);
		
		this.setLayout(new BorderLayout());
		
		
		menueTafel = new Menuetafel(this);
		anzeigeTafel = new Anzeigetafel(this);
		

		
		this.add(menueTafel, BorderLayout.EAST);
		this.add(anzeigeTafel, BorderLayout.WEST);
		
		
		
		/*
		 * Responsitivitaet einbauen, sodass die Komponenten und deren Anordnung auch nach resizen des
		 * Fensters die gleiche Anordnung haben
		 */
		this.addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent component) {
				
				Component mase = (Component) component.getSource();
				
				int width = mase.getWidth();
				int height = mase.getHeight();
				
				menueTafel.setPreferredSize(new Dimension(width/3, height));
				anzeigeTafel.setPreferredSize(new Dimension(width/3*2, height));

				
			}
		});
		
		
		
		
		
		this.setVisible(true);
		
	}

}
