package mcdonalds;

public class Cozinheiro {

    private String nome;
    private String data_nasc;
    private String cpf;
    private String turno_trab;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTurno_trab() {
        return turno_trab;
    }

    public void setTurno_trab(String turno_trab) {
        this.turno_trab = turno_trab;
    }

    public Double retornarSalario() {
        double salario = 1300;
        if (turno_trab.equalsIgnoreCase("Noite")) {
            salario = salario + 400;
        }
        return salario;
    }

}
