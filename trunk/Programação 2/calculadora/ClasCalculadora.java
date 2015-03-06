package calculadora;

public class ClasCalculadora {

    Double a;
    Double b;

    void atribuirA(Double valor) {
        a = valor;
    }

    void atribuirB(Double valor) {
        b = valor;
    }

    Double somar() {
        return a + b;
    }

    Double subtrair() {
        return a - b;
    }

    Double multiplicar() {
        return a * b;
    }

    Double dividir() {
        return a / b;
    }
}
