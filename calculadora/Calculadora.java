package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        ClasCalculadora calc = new ClasCalculadora();

        Double resultado, valor1, valor2;

        Scanner e = new Scanner(System.in);

        System.out.println("Calculadora!\nInforme dois valores: ");
        valor1 = e.nextDouble();
        valor2 = e.nextDouble();

        calc.atribuirA(valor1);
        calc.atribuirB(valor2);

        resultado = calc.somar();
        System.out.println("\nSoma: " + resultado);

        resultado = calc.subtrair();
        System.out.println("\nSubtração: " + resultado);

        resultado = calc.multiplicar();
        System.out.println("\nMultiplicação: " + resultado);

        resultado = calc.dividir();
        System.out.println("\nDivisão: " + resultado);
    }
}
