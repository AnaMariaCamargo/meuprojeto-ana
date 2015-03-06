
package caixaeletronico;

import java.util.ArrayList;
import java.util.List;

public class ListaCliente {

    public static void main(String[] args) {
        List<Cliente> lista = new ArrayList<Cliente>();
        Cliente cli = new Cliente();

        cli.setNomecli("Hiasmin");
        cli.setCpf("040");
        lista.add(cli);

        cli = new Cliente();
        cli.setNomecli("Tiffany");
        cli.setCpf("123");
        lista.add(cli);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNomecli());
            System.out.println(lista.get(i).getCpf());
        }
    }
}
