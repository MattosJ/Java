import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

class Bonus extends ObjetoDoJogo {
  public Bonus(int x, int y) {
      super(x, y, 15, 15);
  }

  @Override
  public void desenhar(Graphics g) {
      g.setColor(Color.YELLOW);
      g.fillRect(limites.x, limites.y, limites.width, limites.height);
  }
}