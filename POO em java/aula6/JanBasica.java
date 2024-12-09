package aula6;

import java.awt.Graphics;
import javax.swing.JPanel;

public class JanBasica extends JPanel
{
 public void paintComponent(Graphics g){
     super.paintComponent(g);
     int largura = getWidth();
     int altura = getHeight();
     
     g.drawLine(110,110,largura, altura);
     g.drawLine(150, altura, largura,150);
     
 }
}
