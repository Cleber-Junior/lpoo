package Model;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
    private Integer cnpj;
    private String contato;
    private String nome;

    private List<Produto> produtos = new ArrayList<>();

    public Fornecedor(Integer cnpj, String contato, String nome) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
    }

    public boolean mainterFornecedor(int cnpj){
        return true;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "cnpj=" + cnpj +
                ", contato='" + contato + '\'' +
                ", nome='" + nome + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}