package logic;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import java.awt.*;


//Name Luan Zekiri
//Matrikelnummer 7379949

public class MyFrame extends JFrame{
	
	private JPanels jPanel;
	
	public JPanels getjPanel() {
		return jPanel;
	}

	public void setjPanel(JPanels jPanel) {
		this.jPanel = jPanel;
	}

	public MyFrame() {
		
		this.setMinimumSize(new Dimension(600,600));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(true);
		
		this.setLayout(new GridLayout());

		jPanel = new JPanels(this);

		this.add(jPanel);


		

		

		
		
		
//		this.addComponentListener(new ComponentAdapter() {
//			public void componentResized(ComponentEvent component) {
//				
//				Component mase = (Component) component.getSource();
//				
//				int width = mase.getWidth();
//				int height = mase.getHeight();
//				
//				menueTafel.setPreferredSize(new Dimension(width/3, height));
//				anzeigeTafel.setPreferredSize(new Dimension(width/3*2, height));
//				System.out.println(height);
//
//				
//			}
//		});
				
		
		
		this.setVisible(true);
		
	}

}
