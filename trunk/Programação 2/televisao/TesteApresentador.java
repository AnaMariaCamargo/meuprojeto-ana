
package televisao;

import javax.swing.JOptionPane;

public class TesteApresentador {

    public static void main(String[] args) {
        Apresentador a = new Apresentador();

        a.nomeapre = "Rodrigo";
        a.dtnascimentoapre = "23.06.1989";
        a.programa = "Hora do Faro";
        a.emailapre = "rodrigo@hotmail.com";
        a.nomeartisticoapre = "Rodrigo F";
        a.cidadeapre = "São Paulo";
        a.enderecoapre = "Rua do Rodrigo";
        a.bairroapre = "Bairro Rodrigo";
        a.estadoapre = "SP";
        a.cacheeventoapre = 1500;
        a.salmensalapre = 20000;
        a.valormerch = 800;

        JOptionPane.showMessageDialog(null, "Informações APRESENTADOR\nNome: " + a.nomeapre + "\nData de nascimento: "
                + a.dtnascimentoapre + "\n" + "Programa: " + a.programa + "\nE-mail: " + a.emailapre
                + "\nNome artístico do apresentador: " + a.nomeartisticoapre + "\n" + "Cidade: " + a.cidadeapre
                + "\nEndereço: " + a.enderecoapre + "\nBairro: " + a.bairroapre + "\nEstado: " + a.estadoapre
                + "\nGanhos mensais: R$" + a.calcularGanhosApre());
    }
}
