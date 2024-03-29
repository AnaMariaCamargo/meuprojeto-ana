package anapessoa;

import javax.swing.JOptionPane;
import modelo.Cidade;

public class AnaCid {

    public static void main(String[] args) {
        Cidade cidade = new Cidade();
        while (cidade.getCodigocidade() == null) {
            try {
                cidade.setCodigocidade(Integer.parseInt(JOptionPane.showInputDialog("Código: ")));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "O código só pode ser preenchido com números.");
            }
        }
        cidade.setNomecidade(JOptionPane.showInputDialog("Nome: "));
        JOptionPane.showMessageDialog(null, "Código: " + cidade.getCodigocidade() + "\nNome: " + cidade.getNomecidade());
    }
}
