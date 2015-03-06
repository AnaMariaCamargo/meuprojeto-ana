
package caixaeletronico;

import javax.swing.JOptionPane;

public class CaixaEletronico {

    public static void main(String[] args) {
        Conta c = new Conta();
        String agencia = "0", NumeroConta = "0", NomeCorrentista = "0";
        float transacao;
        boolean ativa = false;
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja fazer?\n"
                    + "1. Abrir Conta\n2. Depositar\n3. Sacar\n4. Consultar seu saldo\n"
                    + "5. Fechar conta\n6. Sair"));

            switch (op) {
                case 1: {
                    agencia = JOptionPane.showInputDialog("Caixa Eletrônico\nInforme:\nAgência: ");
                    NumeroConta = JOptionPane.showInputDialog("Número da conta: ");
                    NomeCorrentista = JOptionPane.showInputDialog("Nome do correntista: ");

                    c.abrir(ativa);
                    JOptionPane.showMessageDialog(null, "Conta criada com sucesso.");
                    break;
                }
                case 2: {
                    transacao = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da transação: "));
                    c.depositar(ativa, transacao);
                    break;
                }
                case 3: {
                    transacao = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da transação: "));
                    c.sacar(ativa, transacao);
                    break;
                }
                case 4: {
                    JOptionPane.showMessageDialog(null, "Seu saldo atual é: R$ " + c.saldo);
                    break;
                }
                case 5: {
                    c.fechar();
                    JOptionPane.showMessageDialog(null, "Sua conta foi desativada.");
                    break;
                }
                default: {
                    agencia = "0";
                    NumeroConta = "0";
                    NomeCorrentista = "0";
                    ativa = false;
                }
            }
        } while (op != 6);

    
    }
}
