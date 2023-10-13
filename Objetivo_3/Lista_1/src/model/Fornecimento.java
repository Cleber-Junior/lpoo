package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Fornecimento {
    private Date data;
    private Double valorTotal;
    private List<Fornecedor> fornecedores = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();

    public Fornecimento(Date data, Double valorTotal, List<Fornecedor> fornecedores, List<Produto> produtos) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.fornecedores = fornecedores;
        this.produtos = produtos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Fornecimento{" +
                "data=" + data +
                ", valorTotal=" + valorTotal +
                ", fornecedores=" + fornecedores +
                ", produtos=" + produtos +
                '}';
    }
}