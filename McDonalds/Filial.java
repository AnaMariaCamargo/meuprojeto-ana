package mcdonalds;

import java.util.ArrayList;
import java.util.List;

public class Filial {

    private String cidade;
    private double preco_medio_lanche;
    private int qtde_vendida;
    private Gerente gerente;
    private List<Cozinheiro> cozinheiro;
    private List<Caixa> caixa;

    public Filial() {
        this.gerente = new Gerente();
        this.caixa = new ArrayList<Caixa>();
        this.cozinheiro = new ArrayList<Cozinheiro>();
        cidade = null;
        preco_medio_lanche = 0.0;
        qtde_vendida = 0;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public double getPreco_medio_lanche() {
        return preco_medio_lanche;
    }

    public void setPreco_medio_lanche(double preco_medio_lanche) {
        this.preco_medio_lanche = preco_medio_lanche;
    }

    public int getQtde_vendida() {
        return qtde_vendida;
    }

    public void setQtde_vendida(int qtde_vendida) {
        this.qtde_vendida = qtde_vendida;
    }

    public List<Cozinheiro> getCozinheiro() {
        return cozinheiro;
    }

    public void setCozinheiro(List<Cozinheiro> cozinheiros) {
        this.cozinheiro = cozinheiro;
    }

    public List<Caixa> getCaixa() {
        return caixa;
    }

    public void setCaixa(List<Caixa> caixa) {
        this.caixa = caixa;
    }

    public Double faturamento_medio() {
        Double faturamento;
        faturamento = qtde_vendida * preco_medio_lanche;
        return faturamento;
    }

}
