package Model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String cnpj;
    private String  razaoSocial;
    private String nomeFantasma;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(String cnpj, String razaoSocial, String nomeFantasma, List<Funcionario> funcionarios) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasma = nomeFantasma;
        this.funcionarios = funcionarios;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasma() {
        return nomeFantasma;
    }

    public void setNomeFantasma(String nomeFantasma) {
        this.nomeFantasma = nomeFantasma;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cnpj='" + cnpj +
                ", razaoSocial='" + razaoSocial +
                ", nomeFantasma='" + nomeFantasma +
                ", funcionarios=" + funcionarios +
                '}';
    }
}