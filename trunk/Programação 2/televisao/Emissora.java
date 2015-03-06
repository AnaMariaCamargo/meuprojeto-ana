package Televisao;

public class Emissora {

    String nomeemissora, tvabertaoufechada;

    public String getNomeemissora() {
        return nomeemissora;
    }

    public void setNomeemissora(String nomeemissora) {
        this.nomeemissora = nomeemissora;
    }

    public String getTvabertaoufechada() {
        return tvabertaoufechada;
    }

    public void setTvabertaoufechada(String tvabertaoufechada) {
        this.tvabertaoufechada = tvabertaoufechada;
    }

    public Emissora() {
        nomeemissora = null;
        tvabertaoufechada = "Fechada";
    }

}
