import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class JogoT_Rex extends JPanel  implements ActionListener {
    //definições iniciais do jogo
    private int posicaoDinoY = 250;
    private final int alturaPuloDino = 75;
    private boolean pulando = false;
    private int pontuacao = 0;
    private int vidas = 1;
    private final javax.swing.Timer temporizador;
    private final java.util.List<ObjetoDoJogo> objetosDoJogo = new ArrayList<>();
    private final Random aleatorio = new Random();
    private boolean jogoTerminado = false;
    public String nomeJogador;
    private int aumentoDeVelocidade = 0;
    private int aumentoDePulo = 0;
    private int dificuldade = 1;

    public JogoT_Rex(){
        //desneha tela do jogo e o tamanho dela
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(800, 400));
        temporizador = new javax.swing.Timer(20, this);
        temporizador.start();
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE && !pulando && !jogoTerminado) {
                    pulando = true;
                }
                if (e.getKeyCode() == KeyEvent.VK_R && jogoTerminado) {
                    reiniciarJogo();
                }
            }
        });
        setFocusable(true);
        adicionarObstrucao();
    }

    private void adicionarObstrucao() { // adiciona a obstrução ao jogo
        int x = 800;
        int altura = 20 + aleatorio.nextInt(30);
        
        // Alterna entre Obstrucao normal e Obstrucao2
        if (aleatorio.nextBoolean()) {
            objetosDoJogo.add(new Obstrucao(x, altura)); // Obstrução padrão no chão
        } else {
            objetosDoJogo.add(new Obstrucao2(x, altura)); // Obstrução no topo
        }
    }
    

    private void adicionarBonus() { // adiciona o bônus ao jogo
        int x = 800;
        int y = 250 - 15;
        objetosDoJogo.add(new Bonus(x, y));
    }

    private void reiniciarJogo() { // reinicia o jogo e os valores das variáveis necessárias
        posicaoDinoY = 250;
        pulando = false;
        pontuacao = 0;
        vidas = 1;
        objetosDoJogo.clear();
        jogoTerminado = false;
        adicionarObstrucao();
        dificuldade = 1;
        aumentoDeVelocidade = 0;
        aumentoDePulo = 0;
    }

    private void salvarPontuacao() { // criar ou salva no arquivo (ranking.txt)e salva  a pontuação.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ranking.txt", true))) {
            writer.write(nomeJogador + " " + pontuacao);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private java.util.List<String[]> carregarRanking() {
        java.util.List<String[]> ranking = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("ranking.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                ranking.add(linha.split(" "));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ranking;
    }

    private java.util.List<String[]> obterRankingOrdenado() { // Ordena o ranking
        java.util.List<String[]> ranking = carregarRanking();
        ranking.sort((a, b) -> Integer.compare(Integer.parseInt(b[1]), Integer.parseInt(a[1])));
        return ranking;
    }

    @Override
    protected void paintComponent(Graphics g) {    //desenha o bloco do chão e do "Dino", e também da a mensagem de fim de jogo e reiniciar e aciona a função carregarRanking
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillRect(0, 269, 800, 100);
        g.setColor(Color.BLACK);
        g.fillRect(100, posicaoDinoY, 20, 20);

        for (ObjetoDoJogo obj : objetosDoJogo) {
            obj.desenhar(g);
        }

        g.setColor(Color.BLACK);
        g.drawString("Pontuação: " + pontuacao, 10, 20);
        g.drawString("Vidas: " + vidas, 700, 20);
        if (aumentoDeVelocidade > 0) {
            g.drawString("Aumento de Velocidade: " + aumentoDeVelocidade, 10, 40);
        }
        if (aumentoDePulo > 0) {
            g.drawString("Aumento de Pulo: " + aumentoDePulo, 10, 60);
        }
        if (jogoTerminado) {
            g.setColor(Color.RED);
            g.drawString("Fim de Jogo! Pressione 'R' para Reiniciar", 300, 200);
            salvarPontuacao();
            java.util.List<String[]> rankingOrdenado = obterRankingOrdenado();
            g.setColor(Color.BLACK);
            g.drawString("Ranking:", 300, 230);
            for (int i = 0; i < Math.min(rankingOrdenado.size(), 5); i++) {
                g.drawString((i + 1) + ". " + rankingOrdenado.get(i)[0] + ": " + rankingOrdenado.get(i)[1], 300, 250 + i * 20);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) { //define os pulos e melhorias, a pontuação juntamente com o nível de difículdade
        if (!jogoTerminado) {
            if (pulando) {
                if (posicaoDinoY > 250 - (aumentoDePulo > 0 ? alturaPuloDino + 50 : alturaPuloDino)) {
                    posicaoDinoY -= 5;
                } else {
                    pulando = false;
                }
            } else {
                if (posicaoDinoY < 250) {
                    posicaoDinoY += 5;
                }
            }

            for (int i = 0; i < objetosDoJogo.size(); i++) {
                ObjetoDoJogo obj = objetosDoJogo.get(i);
                obj.mover(aumentoDeVelocidade > 0 ? 8 : 5 + dificuldade);
                if (obj.getLimites().x < -20) {
                    objetosDoJogo.remove(i);
                    if (obj instanceof Obstrucao) pontuacao++;
                    i--;
                } else if (obj.getLimites().intersects(new Rectangle(100, posicaoDinoY, 20, 20))) {
                    if (obj instanceof Obstrucao) {
                        vidas--;
                        if (vidas <= 0) {
                            jogoTerminado = true;
                        }
                    } else if (obj instanceof Bonus) {
                        objetosDoJogo.remove(i);
                        i--;
                        if (aleatorio.nextBoolean()) {
                            aumentoDeVelocidade = 200;
                        } else {
                            aumentoDePulo = 10;
                        }
                    }
                }
            }

            if (pontuacao / 5 > dificuldade) {
                dificuldade++;
            }

            if (aleatorio.nextInt(100) < 2) {
                adicionarObstrucao();
            }
            if (aleatorio.nextInt(100) < 5) {
                adicionarBonus();
            }

            if (aumentoDeVelocidade > 0) {
                aumentoDeVelocidade--;
            }
            if (aumentoDePulo > 0) {
                aumentoDePulo--;
            }

            repaint();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Jogo T-Rex");
        JogoT_Rex jogo = new JogoT_Rex();
        frame.add(jogo);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
