package mcdonalds;

public class Caixa {

    private String nome;
    private String data_nasc;
    private String cpf;
    private String horario_trab;

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

    public String getHorario_trab() {
        return horario_trab;
    }

    public void setHorario_trab(String horario_trab) {
        this.horario_trab = horario_trab;
    }

    public Double retornarSalario() {
        double salario = 1200;
        return salario;
    }

}
