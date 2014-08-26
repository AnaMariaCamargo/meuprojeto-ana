
package caixaeletronico;

import javax.swing.JOptionPane;

public class Conta {
    String agencia, NumeroConta, NomeCorrentista;
    float saldo;
    boolean ativa;

    void atribuirAgencia(String valor) {
        agencia = valor;
    }

    String returnAgencia() {
        return agencia;
    }

    void atribuirNumeroConta(String valor) {
        NumeroConta = valor;
    }

    String returnNumeroConta() {
        return NumeroConta;
    }

    void atribuirNomeCorrentista(String valor) {
        NomeCorrentista = valor;
    }

    String returnNomeCorrentista() {
        return NomeCorrentista;
    }

    void atribuirSaldo(Float valor) {
        saldo = valor;
    }

    Float returnSaldo() {
        return saldo;
    }

    void atribuirAtiva(Boolean valor) {
        ativa = valor;
    }

    Boolean returnAtiva() {
        return ativa;
    }

    void abrir(boolean ativa) {
        ativa = true;
    }

    boolean depositar(boolean ativa, float transacao) {
        if (ativa = true) {
            saldo = saldo + transacao;
            JOptionPane.showMessageDialog(null, "Transação concluída.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar essa transação.");
            return false;
        }
    }

    boolean sacar(boolean ativa, float transacao) {
        if (saldo >= transacao) {
            saldo = saldo - transacao;
            JOptionPane.showMessageDialog(null, "Transação concluída.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Você não possui conta ou seu saldo é insuficiente para realizar essa transação.");
            return false;
        }
    }

    float saldo() {
        return saldo;
    }

    void fechar() {
        ativa = false;
    }

}
