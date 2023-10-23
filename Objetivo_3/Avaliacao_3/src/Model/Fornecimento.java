package Model;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

public class Fornecimento{
    private LocalDate data;
    private Double valorTotal;
    private Fornecedor fornecedor;
    private Produto produto;

    public Fornecimento(LocalDate data, Double valorTotal, Fornecedor fornecedor, Produto produto) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.fornecedor = fornecedor;
        this.produto = produto;
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

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Fornecimento = " +
                "\nData: " + data +
                "\n | ValorTotal: " + valorTotal +
                "\n  | Fornecedor: " + fornecedor +
                "\n   | Produto: " + produto;
    }
}