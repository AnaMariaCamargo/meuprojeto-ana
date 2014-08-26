package hotel;

import javax.swing.JOptionPane;

public class Hotel {

    public static void main(String[] args) {
        ClasHotel h = new ClasHotel();

        String nome = "0", loc = "0", tel = "0", ano = "0";
        float diaria = 0;
        int dia = 0;

        nome = JOptionPane.showInputDialog("Digite as informações do Hotel\nNome: ");
        loc = (JOptionPane.showInputDialog("Localização: "));
        tel = (JOptionPane.showInputDialog("Telefone: "));
        ano = (JOptionPane.showInputDialog("Ano de fundação: "));
        diaria = (Float.parseFloat(JOptionPane.showInputDialog("Valor da diária: R$ ")));
        JOptionPane.showMessageDialog(null, "Quanto mais dias você se hospedar menor será sua tarifa!");
        dia = Integer.parseInt(JOptionPane.showInputDialog("Quantos dias você irá se hospedar? "));
        
        h.atribuirNome(nome);
        h.atribuirLoc(loc);
        h.atribuirTel(tel);
        h.atribuirAno(ano);
        h.atribuiDiaria(diaria);
        h.atribuirDia(dia);
        
        JOptionPane.showMessageDialog(null, "Hotel " + nome + " em " + loc + "\nContato: " + tel
                + "\nAno de fundação " + ano + "\nValor da diária R$" + diaria);

        h.pacotes(diaria, dia);
        h.dolar(diaria, dia);
        h.euro(diaria, dia);

    }
}
