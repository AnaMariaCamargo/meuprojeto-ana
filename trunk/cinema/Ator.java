package cinema;

import javax.swing.JOptionPane;

public class Ator {

    String nomeat, nacionalidade, datanasc, oscar, totalfil;
    float cache, filmeultimo;

    void atribuirNomeat(String valor) {
        nomeat = valor;
    }

    String returnNomeat() {
        return nomeat;
    }

    void atribuirNacionalidade(String valor) {
        nacionalidade = valor;
    }

    String returnNacionalidade() {
        return nacionalidade;
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

    void atribuirTotalfil(String valor) {
        totalfil = valor;
    }

    String returnTotalFilm() {
        return totalfil;
    }

    void atribuiFilmeultimo(Float valor) {
        filmeultimo = valor;
    }

    Float returnFilmeultimo() {
        return filmeultimo;
    }

    void atribuirOscar(String valor) {
        oscar = valor;
    }

    String returnOscar() {
        return oscar;
    }

    void ganhos(float cache, float filmeultimo) {
        JOptionPane.showMessageDialog(null, "\nOs ganhos do último ano foram: R$" + cache * filmeultimo + ".");
    }
}