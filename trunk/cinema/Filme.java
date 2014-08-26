package cinema;

import javax.swing.JOptionPane;

public class Filme {

    String nome, genero, atores;
    Integer idade, classificacao, duracao;

    void atribuirIdade(Integer valor) {
        idade = valor;
    }

    Integer returnIdade() {
        return idade;
    }

    void atribuirClassificacao(Integer valor) {
        classificacao = valor;
    }

    Integer returnClassificacao() {
        return classificacao;
    }

    void atribuirDuracao(Integer valor) {
        duracao = valor;
    }

    Integer returnDuracao() {
        return duracao;
    }

    void atribuirNome(String valor) {
        nome = valor;
    }

    String returnNome() {
        return nome;
    }

    void atribuirGenero(String valor) {
        genero = valor;
    }

    String returnGenero() {
        return genero;
    }

    void atribuirAtores(String valor) {
        atores = valor;
    }

    String returnAtores() {
        return atores;
    }

    boolean indicado(int idade, int classificacao) {
        if (idade >= classificacao) {
            JOptionPane.showMessageDialog(null, "\nVocê pode assistir esse filme.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "\nVocê não pode assistir esse filme.");
            return false;
        }
    }

    void duracaofilme(int duracao) {
        if (duracao >= 60) {
            JOptionPane.showMessageDialog(null, "\nEsse é um filme de longa duração.");
        } else {
            JOptionPane.showMessageDialog(null, "\nEsse é um filme de curta duração.");
        }
    }
}
