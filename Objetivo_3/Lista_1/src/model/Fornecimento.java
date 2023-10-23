package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Fornecimento {
    private LocalDate data;
    private Double valorTotal;
    private List<Fornecedor> fornecedores = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();

    public Fornecimento(LocalDate data, Double valorTotal) {
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
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
        return "Fornecimento = " +
                " Data - " + data +
                "| ValorTotal - " + valorTotal + "\n" +
                "|Fornecedores - " + fornecedores + "\n" +
                "|Produtos - " + produtos;
    }
}