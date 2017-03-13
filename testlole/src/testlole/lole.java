
package testlole;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;

import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javafx.scene.layout.Pane;
public class lole {

	public static void main(String args[]){
		JFrame frame = new JFrame();
		frame.setSize(700,800);
	    frame.setLocation(300, 300);
	    frame.setTitle("Dank game");
	    frame.setDefaultCloseOperation(3);
	    frame.setResizable(false);
	    frame.setVisible(true);
	    JPanel lucas = new JPanel();
	    lucas.setBackground(new Color(119, 197, 234));
	    frame.add(lucas);
	    JButton buttonS = new JButton("ayy lmao");
	    JButton buttonkek = new JButton("kek");
	    JButton buttonQ = new JButton("quit");
	    buttonkek.setPreferredSize(new Dimension(200, 100));
	    frame.add(buttonkek, BorderLayout.CENTER);
	    
	

	    
	}
}
