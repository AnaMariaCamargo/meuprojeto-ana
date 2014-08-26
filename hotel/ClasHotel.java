package hotel;

import javax.swing.JOptionPane;

public class ClasHotel {

    String nome, loc, tel, ano;
    float diaria;
    int dia;

    void atribuirNome(String valor) {
        nome = valor;
    }

    String returnNome() {
        return nome;
    }

    void atribuirLoc(String valor) {
        loc = valor;
    }

    String returnLoc() {
        return loc;
    }

    void atribuirTel(String valor) {
        tel = valor;
    }

    String returnTel() {
        return tel;
    }

    void atribuirAno(String valor) {
        ano = valor;
    }

    String returnAno() {
        return ano;
    }

    void atribuiDiaria(Float valor) {
        diaria = valor;
    }

    Float returnV_diaria() {
        return diaria;
    }

    void atribuirDia(Integer valor) {
        dia = valor;
    }

    Integer returnDia() {
        return dia;
    }

    public static double pacotes(float diaria, int dia) {
        double pacote = 0, tarifa;
        tarifa = diaria * dia;

        if (dia <= 6) {
            pacote = tarifa;
        } else if (dia >= 7 && dia < 10) {
            pacote = tarifa - (tarifa * 0.1);
        } else if (dia >= 10) {
            pacote = tarifa - (tarifa * 0.3);
        }
        JOptionPane.showMessageDialog(null, "O valor do seu pacote é R$ " + pacote + ".");
        return pacote;
    }

    public static double dolar(double diaria, int dia) {
        double tarifaD = 0, tarifa;
        tarifa = diaria * dia;
        if (dia <= 6) {
            tarifaD = tarifa * 2;
        } else if (dia >= 7 && dia < 10) {
            tarifaD = (tarifa * 0.1) * 2;
        } else if (dia >= 10) {
            tarifaD = (tarifa * 0.3) * 2;
        }
        JOptionPane.showMessageDialog(null, "O valor da sua tarifa em DÓLARES é " + tarifaD + ".");
        return tarifaD;
    }

    public static double euro(double diaria, int dia) {
        double tarifaE = 0, tarifa;
        tarifa = diaria * dia;
        if (dia <= 6) {
            tarifaE = tarifa * 3;
        } else if (dia >= 7 && dia < 10) {
            tarifaE = (tarifa * 0.1) * 3;
        } else if (dia >= 10) {
            tarifaE = (tarifa * 0.3) * 3;
        }
        JOptionPane.showMessageDialog(null, "O valor da sua tarifa em EUROS é " + tarifaE + ".");
        return tarifaE;
    }
}
