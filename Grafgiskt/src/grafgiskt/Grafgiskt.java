/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafgiskt;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class Grafgiskt extends JPanel {
    private int WIDTH = 100;
    private int HEIGHT = 100;
    private int d = 50;
    private int x = 0;
    private int y = 0;
    private int T = 200;
    private int S = 200;
    private int K = 100;
    private int A = 100;
    private int B = 100;
    private int C = 50;
   
    
    private void moveBall(){
        int T = 200;
        int S = 200;
        int K = 100;
        int radius1 = 25;
        int radius2 = 50;
        double xDif = T+450 - x;
        double yDif = S+450 - y;
        double squareddist = xDif * xDif + yDif * yDif;
        System.out.println(squareddist + " :: " + (radius1 + radius2) * (radius1 + radius2));
        boolean collision = squareddist < (radius1 + radius2) * (radius1 + radius2);
        if(collision){
            System.exit(3);
        }
        x += 1;
        y += 1;
        
    }
    private void shootBall(){
    	int A = 100;
    	int B = 100;
    	int C = 50;
    }
    public Grafgiskt(){
        
        
       
   
 

    
    
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         JFrame frame = new JFrame();
         Grafgiskt grafik = new Grafgiskt();
             
    frame.setSize(700, 800);
    frame.setLocation(300, 300);
    frame.setTitle("Dank game");
    frame.setDefaultCloseOperation(3);
    frame.setResizable(true);
    frame.setVisible(true);
    frame.add(grafik);
    
    while(true){
             
                 grafik.moveBall();
                 grafik.repaint();
             try {
                 Thread.sleep(10);
             } catch (InterruptedException ex) {
                 Logger.getLogger(Grafgiskt.class.getName()).log(Level.SEVERE, null, ex);
             }

    
    }
    }
    
    
    public void paint(Graphics g){
        super.paint(g);
Graphics2D g2d = (Graphics2D) g;
g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
g2d.fillOval(x, y, d, d);
g2d.setColor(Color.blue);
g2d.drawOval(T+400, S+400, K, K);
g2d.fillOval(T+400, S+400, K, K);
g2d.drawOval(A + 200, B + 200, C, C);
g2d.setColor(Color.red);
g2d.fillOval(A + 200, B + 200, C, C);



    }
 
}
