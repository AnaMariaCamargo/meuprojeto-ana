package caixaeletronico;

import java.util.ArrayList;

import java.util.List;

public class ListaConta {

    public static void main(String[] args) {
        List<Conta> lista = new ArrayList<Conta>();
        Conta c = new Conta();

        c.abrir("Hiasmin", "21", "123456");
        lista.add(c);

        c = new Conta();
        c.abrir("Ana", "23", "7891011");
        lista.add(c);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNomeCorrentista());
            System.out.println(lista.get(i).getAgencia());
            System.out.println(lista.get(i).getNumeroConta());
        }
    }
}
