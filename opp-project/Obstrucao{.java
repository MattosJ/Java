import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
class Obstrucao extends ObjetoDoJogo {
    public Obstrucao(int x, int altura) {
        super(x, 270 - altura, 20, altura);
    }

    @Override
    public void desenhar(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(limites.x, limites.y, limites.width, limites.height);
    }
}