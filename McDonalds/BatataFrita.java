package McDonalds;

public class BatataFrita extends Produto {

    private String tamanho;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String descricaoBatata() {
        String retorno;
        retorno = this.descricaoCardapio() + this.tamanho;
        return retorno;
    }
}
