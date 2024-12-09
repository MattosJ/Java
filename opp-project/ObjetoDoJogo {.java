import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
// classe abstrata que cria os objetos de obstruções e bônus.
abstract class ObjetoDoJogo{
    protected Rectangle limites;

    public ObjetoDoJogo(int x, int y, int largura, int altura) {
        limites = new Rectangle(x, y, largura, altura);
    }

    public abstract void desenhar(Graphics g);

    public Rectangle getLimites() {
        return limites;
    }

    public void mover(int dx) { //defini a movimentação do obstáculo no eixo x;
        limites.x -= dx;
    }

    public void mover(int dx, int dy) { //defini a movimentação do obstáculo no eixo x e y;
        limites.x -= dx;
        limites.y += dy;
    }
}