package cinema;

import javax.swing.JOptionPane;

public class Ator {

    String nomeator, nacional, datanasc, oscar, totalfilme;
    float cache, filmeultimoano;

    void atribuirNomeator(String valor) {
        nomeator = valor;
    }

    String returnNomeator() {
        return nomeator;
    }

    void atribuirNacional(String valor) {
        nacional = valor;
    }

    String returnNacional() {
        return nacional;
    }

    void atribuirCache(Float valor) {
        cache = valor;
    }

    Float returnCache() {
        return cache;
    }

    void atribuirDatanasc(String valor) {
        datanasc = valor;
    }

    String returnDatanasc() {
        return datanasc;
    }

    void atribuirTotalfilme(String valor) {
        totalfilme = valor;
    }

    String returnTotalFilme() {
        return totalfilme;
    }

    void atribuiFilmeultimoano(Float valor) {
        filmeultimoano = valor;
    }

    Float returnFilmeultimoano() {
        return filmeultimoano;
    }

    void atribuirOscar(String valor) {
        oscar = valor;
    }

    String returnOscar() {
        return oscar;
    }

    void ganhosultimoano(float cache, float filmeultimoano) {
        JOptionPane.showMessageDialog(null, "\nOs ganhos do último ano foram: R$" + cache * filmeultimoano + ".");
    }
}