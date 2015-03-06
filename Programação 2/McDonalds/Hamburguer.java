package McDonalds;

public class Hamburguer extends Produto {

    private Boolean novo;

    public Boolean getNovo() {
        return novo;
    }

    public void setNovo(Boolean novo) {
        this.novo = novo;
    }

    public String descricaoHamburguer() {
        String retorno, nv;
        if (this.novo == true) {
            nv = "Sim";
        } else {
            nv = "Não";
        }
        retorno = this.descricaoCardapio() + "O hambúrguer é novo - " + nv;
        return retorno;
    }
}
