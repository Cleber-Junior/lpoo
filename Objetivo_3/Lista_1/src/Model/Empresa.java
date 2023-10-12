package Model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String cnpj;
    private String  razaoSocial;
    private String nomeFantasia;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(String cnpj, String razaoSocial, String nomeFantasia) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
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
        return nomeFantasia;
    }

    public void setNomeFantasma(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "Empresa =" +
                "\nCNPJ:" + cnpj +
                "\nRazaoSocial:" + razaoSocial +
                "\nNome Fantasia:" + nomeFantasia +
                "\nFuncionarios:" + funcionarios;
    }
}