package caixaeletronico;

import java.util.ArrayList;
import java.util.List;

public class ListaBanco {

    public static void main(String[] args) {
        List<Banco> lista = new ArrayList<Banco>();
        Banco b = new Banco();

        b.setNome("Itaú");
        b.setNumero("123");
        lista.add(b);

        b = new Banco();
        b.setNome("\nBradesco");
        b.setNumero("456");
        lista.add(b);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNome());
            System.out.println(lista.get(i).getNumero());
        }
    }
}
