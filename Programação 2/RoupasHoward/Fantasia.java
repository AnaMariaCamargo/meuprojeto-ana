
package roupashoward;

public class Fantasia extends Roupa{
    private String personagem;

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }
    
    public String informacoes() {
        String retorno;
        retorno = super.informacoes() + " / " + this.personagem;
        return retorno;
    }
    
}
