package anapessoa;

import javax.swing.JOptionPane;
import modelo.Pessoa;

public class AnaPes {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        while (pessoa.getCodigo() == null) {
            try {
                //Pra executar
                pessoa.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código: ")));
            } catch (Exception ex) {
                //Fazer se der erro
                JOptionPane.showMessageDialog(null, "O código só pode ser preenchido com números.");
            }
        }
        pessoa.setNome(JOptionPane.showInputDialog("Nome: "));
        pessoa.setSexo(JOptionPane.showInputDialog("Sexo: "));
        JOptionPane.showMessageDialog(null, "Código: " + pessoa.getCodigo() + "\nNome: " + pessoa.getNome() + "\nSexo: " + pessoa.getSexo());
    }
}
