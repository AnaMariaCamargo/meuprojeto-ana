package Professor;

public class Professor {

    String nome, endereco, escola;
    double salario;
    boolean AulaTecnico, AulaSuperior;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAulaTecnico() {
        return AulaTecnico;
    }

    public void setAulaTecnico(boolean AulaTecnico) {
        this.AulaTecnico = AulaTecnico;
    }

    public boolean isAulaSuperior() {
        return AulaSuperior;
    }

    public void setAulaSuperior(boolean AulaSuperior) {
        this.AulaSuperior = AulaSuperior;

    }
}
