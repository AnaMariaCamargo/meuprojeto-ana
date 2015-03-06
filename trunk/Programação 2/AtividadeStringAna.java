package Ana;

import javax.swing.JOptionPane;

public class AtividadeStringAna {

    public static void main(String[] args) {
        String escalacao = " JÃºlio CÃ©sar, D. Alves, D. Luiz, T. Silva, Maxwell, L. Gustavo, "
                + "Paulinho, Oscar, Neymar, Fred, Hulk ";

        System.out.println("Tamanho da string:" + escalacao.length());

        escalacao = escalacao.replace("Fred", "JÃ´");
        System.out.println(escalacao);

        String ronaldinho = "Ronaldinho";
        if (escalacao.contains(ronaldinho)) {
            System.out.println("Ronaldinho estÃ¡ escalado");
        } else {
            System.out.println("Ronaldinho nÃ£o estÃ¡ escalado");
        }

        System.out.println("Sem espaÃ§os:" + escalacao.trim());

        String[] jog = escalacao.split(",");
        JOptionPane.showMessageDialog(null, "EscalaÃ§Ã£o\n1. " + jog[0] + "\n2. " + jog[1] + "\n3. " + jog[2]
                + "\n4. " + jog[3] + "\n5. " + jog[4] + "\n6. " + jog[5] + "\n7. " + jog[6] + "\n8. "
                + jog[7] + "\n9. " + jog[8] + "\n10. " + jog[9] + "\n11. " + jog[10]);
    }

}
