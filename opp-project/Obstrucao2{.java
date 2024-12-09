import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

class Obstrucao2 extends Obstrucao {
    public Obstrucao2(int x, int altura) {
        super(x, 270 - altura);
        this.limites.y = 150; 
        this.limites.height = altura; 
    }

    @Override
    public void desenhar(Graphics g) {
        g.setColor(Color.ORANGE); 
        g.fillRect(limites.x, limites.y, limites.width, limites.height);
    }
}
