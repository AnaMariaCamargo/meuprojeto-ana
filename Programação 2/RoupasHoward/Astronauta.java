
package roupashoward;

public class Astronauta extends Roupa{
    private String dia, codigosecreto;

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getCodigosecreto() {
        return codigosecreto;
    }

    public void setCodigosecreto(String codigosecreto) {
        this.codigosecreto = codigosecreto;
    }
    
    public String informacoes() {
        String retorno;
        retorno = super.informacoes() + " | " + this.codigosecreto;
        return retorno;
    }
}
