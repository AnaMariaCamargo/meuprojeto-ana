
package caixaeletronico;

public class Banco {
    private String nome, numero;
    boolean EmprestimoImovel, EmprestimoCarro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isEmprestimoImovel() {
        return EmprestimoImovel;
    }

    public void setEmprestimoImovel(boolean EmprestimoImovel) {
        this.EmprestimoImovel = EmprestimoImovel;
    }

    public boolean isEmprestimoCarro() {
        return EmprestimoCarro;
    }

    public void setEmprestimoCarro(boolean EmprestimoCarro) {
        this.EmprestimoCarro = EmprestimoCarro;
    }

}
