
/* Skriver in storlek på korsordet, skriver in vilka siffror
som ska vara var (x = inget eller svart) skriver in nyckel ordet. Trycker på en knapp
, programmet ersätterde siffror som står i nyckelordet med respektive bokstäver.*/

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Korsord {
	static int inputlol;

	char[] key = new char[29];

	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setSize(800, 800);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Krypto");
		frame.setResizable(false);
		frame.setVisible(true);
		
		Container con = frame.getContentPane();
		
		ross ross = new ross();
		
		frame.add(ross);

		Scanner kryptolol = new Scanner(System.in);
		int kryptoin1 = kryptolol.nextInt();
		int kryptoin2 = kryptolol.nextInt();
		int[][] krypto = new int[kryptoin1][kryptoin2];
		System.out.println(krypto.length);
	}
}

class ross extends JComponent{
private static final long serialVersionUID = -4432169011741815260L;

	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.drawRect(800/3, 800/4, 60, 60);
		g2.drawString("H", 800/3, 800/6);
	}

	
}
