package aula6;

import javax.swing.JFrame;

public class AppJanela
{
    public static void main(String args[]){
        JanBasica tela = new JanBasica();
        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(tela);
        app.setSize(300,300);
        app.setVisible(true);
    }
    
}