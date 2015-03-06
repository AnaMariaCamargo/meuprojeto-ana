
package televisao;

import javax.swing.JOptionPane;

public class TesteEmissora {

    public static void main(String[] args) {
        Emissora e = new Emissora();

        e.nomeemissora = "Globo";
        e.tvabertaoufechada = "Aberta";

        JOptionPane.showMessageDialog(null, "Informações EMISSORA\nEmissora: " + e.nomeemissora
                + "\nAberta ou Fechada: " + e.tvabertaoufechada);
    }
}
