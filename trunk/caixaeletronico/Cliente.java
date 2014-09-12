package caixaeletronico;

public class Cliente {
    private String cpf, nomecli, datanasc, endereco, negativadoSPC, negativadoSERASA;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomecli() {
        return nomecli;
    }

    public void setNomecli(String nomecli) {
        this.nomecli = nomecli;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String isNegativadoSPC() {
        return negativadoSPC;
    }

    public void setNegativadoSPC(String negativadoSPC) {
        this.negativadoSPC = negativadoSPC;
    }

    public String egativadoSERASA() {
        return negativadoSERASA;
    }

    public void setNegativadoSERASA(String negativadoSERASA) {
        this.negativadoSERASA = negativadoSERASA;
    }

    boolean verificaSPC() {
        if (negativadoSPC.equalsIgnoreCase("S")) {
            return true;
        } else {
            return false;
        }
    }

    boolean verificaSERASA() {
        if (negativadoSERASA.equalsIgnoreCase("S")) {
            return true;
        } else {
            return false;
        }
    }
}
