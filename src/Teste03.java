import javax.swing.JOptionPane;

public class Teste03 {
    public static void main(String[] args) {

        float n1, n2, calculaMedia;

            n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
            n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));

            calculaMedia = (n1 + n2) / 2;

            JOptionPane.showMessageDialog(null, "Resultado da Média = "+ calculaMedia, "Média das notas: ", JOptionPane.INFORMATION_MESSAGE);

    }
}
