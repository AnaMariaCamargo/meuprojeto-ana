
package televisao;

import javax.swing.JOptionPane;

public class TesteAtor {

    public static void main(String[] args) {
         Ator at = new Ator();
        
        int neventos; 
        
        at.nomeator = JOptionPane.showInputDialog("Informações do Ator\nNome: ");
        at.dtnascimentoator = JOptionPane.showInputDialog("Data de nascimento: ");
        at.emailator = JOptionPane.showInputDialog("E-mail: ");
        at.nomeartisticoator = JOptionPane.showInputDialog("Nome artístico: ");
        at.cidadeator = JOptionPane.showInputDialog("Cidade: ");
        at.enderecoator = JOptionPane.showInputDialog("Endereço: ");
        at.bairroator = JOptionPane.showInputDialog("Bairro: ");
        at.estadoator = JOptionPane.showInputDialog("Estado: ");
        at.qtnovelas = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de novelas já feitas: "));
        at.salmensalator = Double.parseDouble(JOptionPane.showInputDialog("Salário mensal: "));
        at.cacheeventoator = Double.parseDouble(JOptionPane.showInputDialog("Cachê por evento: "));
        neventos = Integer.parseInt(JOptionPane.showInputDialog("Quantos eventos você participou nesse mês? "));

        JOptionPane.showMessageDialog(null, "Informações ATOR\nNome artístico: " + at.nomeartisticoator
                + "\nData de nascimento: " + at.dtnascimentoator + "\n" + "E-mail: " + at.emailator
                + "\nQuantidade de novelas: " + at.qtnovelas + "\nStatus: " + at.obterStatus()
                + "\nGanhos Mensais: R$" + at.calcularGanhos(neventos));
    }
}
