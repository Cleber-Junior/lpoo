package Model;

import java.util.ArrayList;
import java.util.List;

public class Produto{
    private Integer codigo;
    private String nome;
    private Integer quantidade;
    private Double preco;
    private List<Fornecedor> fornecedorList = new ArrayList<>();
    private List<Item> itemList = new ArrayList<>();

    public Produto(Integer codigo, String nome, Integer quantidade, Double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public List<Fornecedor> getFornecedorList() {
        return fornecedorList;
    }

    public void setFornecedorList(List<Fornecedor> fornecedorList) {
        this.fornecedorList = fornecedorList;
    }

    @Override
    public String toString() {
        return "\n__ Produto __" +
                "\n  Codigo:" + codigo +
                "\n  | Nome:" + nome +
                "\n   | Quantidade:" + quantidade +
                "\n    | Preco:" + preco + "\n\n";

    }
}