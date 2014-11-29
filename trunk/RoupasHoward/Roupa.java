
package roupashoward;

public class Roupa {
    private String descricao, cor, tipo;
    private boolean preferida;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Boolean getPreferida() {
        return preferida;
    }

    public void setPreferida(Boolean preferida) {
        this.preferida = preferida;
    }

    public String informacoes() {
        String retorno, p;
        if (this.preferida == true) {
            p = " - TÁ UM ARRASO! ";
        } else {
            p = "";
        }
        retorno = this.descricao + " - " + this.tipo + " - " + this.cor + p;
        return retorno;
    }

}
