
package roupashoward;

import java.util.ArrayList;
import java.util.List;

public class Prateleira {
    
    private List<Roupa> lista;
    private String nomeprateleira;

    public Prateleira() {
        lista = new ArrayList<Roupa>();
    }
    
    public List<Roupa> getLista() {
        return lista;
    }

    public void setLista(List<Roupa> lista) {
        this.lista = lista;
    }

    public String getNomeprateleira() {
        return nomeprateleira;
    }

    public void setNomeprateleira(String nomeprateleira) {
        this.nomeprateleira = nomeprateleira;
    }
    
    public String listarRoupas() {
        String retorno = "";

        for (Roupa roupa : lista) {
            retorno = retorno + roupa.informacoes() + "\n\n";
        }
        
        return retorno;
    }
    
}
