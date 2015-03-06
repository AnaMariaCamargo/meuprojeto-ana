
package televisao;

import javax.swing.JOptionPane;

public class TesteNovela {

    public static void main(String[] args) {
        Novela n = new Novela();

        n.titulo = "Vitória";
        n.dtinicioefim = "23..9.2014 até 23.07.2020";
        n.horarioex = "22:00 hrs";
        n.autor = "Lucinha";
        n.emissora = "Record";
        n.cenasviolencia = false;
        n.cenasdrogas = false;
        n.cenassexo = false;
        n.audiencia = 15000;

        JOptionPane.showMessageDialog(null, "Informações NOVELA\nTítulo: " + n.titulo + "\nData de ínicio e fim: "
                + n.dtinicioefim + "\n" + "Horário de exibição: " + n.horarioex + "\nAutor: " + n.autor
                + "\nEmissora: " + n.emissora + "\nPossui cenas de:\nViolência: " + n.cenasviolencia
                + "\nDrogas: " + n.cenasdrogas + "\nSexo: " + n.cenassexo + "\nAudiência: " + n.obterAudiencia()
                + " pessoa(s)" + "\nEssa " + "novela é indicada para " + n.obterClassificacao() + " anos.\nOBS: "
                + "0 anos = Livre.");
    }
}
