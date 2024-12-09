import javax.swing.*;
import java.awt.*;

public class MenuPrincipal extends JFrame {
    public MenuPrincipal() {
        setTitle("Menu Inicial");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criar os botões
        JButton botaoIniciar = new JButton("Iniciar Jogo");
        JButton botaoSair = new JButton("Sair");

        // Adicionar ActionListener para o botão "Iniciar Jogo"
        botaoIniciar.addActionListener(e -> {
            String nomeJogador = JOptionPane.showInputDialog("Digite seu nome:");
            if (nomeJogador != null && !nomeJogador.trim().isEmpty()) {
                // Criar a janela do jogo e iniciar
                JogoT_Rex jogo = new JogoT_Rex();
                jogo.nomeJogador = nomeJogador;
                
                JFrame frameJogo = new JFrame("Jogo T-Rex");
                frameJogo.add(jogo);
                frameJogo.pack();
                frameJogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frameJogo.setLocationRelativeTo(null);
                frameJogo.setVisible(true);
                
                // Ocultar o menu principal
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Nome do jogador não pode estar vazio.");
            }
        });

        // Adicionar ActionListener para o botão "Sair"
        botaoSair.addActionListener(e -> System.exit(0));

        // Criar um painel para organizar os botões
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(2, 1, 10, 10)); // Layout com 2 linhas e 1 coluna
        painel.add(botaoIniciar);
        painel.add(botaoSair);

        // Adicionar o painel à janela principal
        add(painel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        // Criar e exibir a janela principal
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }
}
        