import javax.swing.*;

public class FramaJava02 {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Interface Gráfica");

        JButton botao = new JButton("Clique Aqui");

        JLabel texto = new JLabel("Número de clicks: 0");

        JPanel painel = new JPanel();
        painel.add(botao);
        painel.add(texto);
        janela.getContentPane().add(painel);
        janela.setSize(400,400);
        janela.show();
    }
}
