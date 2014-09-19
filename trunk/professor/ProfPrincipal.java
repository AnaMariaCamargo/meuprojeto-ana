package Professor;

import javax.swing.JOptionPane;

public class ProfPrincipal {

    public static void main(String[] args) {
        Professor p = new Professor();

        String aulasup = "nada", aulatec = "nada";

        p.nome = "Ana";
        p.endereco = "Severo";
        p.escola = "IFSul";
        p.salario = 5000;
        p.AulaTecnico = true;
        p.AulaSuperior = false;


        if (p.AulaSuperior == true) {
            aulasup = "Sim";
        } else {
            aulasup = "Não";
        }

        if (p.AulaTecnico == true) {
            aulatec = "Sim";
        } else {
            aulatec = "Não";
        }

        JOptionPane.showMessageDialog(null, "Informações do Professor\nNome: " + p.nome + "\nEndereço: "
                + p.endereco + "\nEscola: " + p.escola + "\nSalário: "
                + p.salario + "\nProf. de Ensino Técnico: " + aulatec + "\nProf. de Ensino Superior: "
                + aulasup);
    }
}
