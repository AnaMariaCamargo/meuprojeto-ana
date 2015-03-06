package McDonalds;

public class Bebida extends Produto {

    private String unidademedida;
    private String quantidade;

    public String getUnidademedida() {
        return unidademedida;
    }

    public void setUnidademedida(String unidademedida) {
        this.unidademedida = unidademedida;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String descricaoBebida() {
        String retorno;
        retorno = this.descricaoCardapio() + this.quantidade + this.unidademedida;
        return retorno;
    }

}
