package model;

public class Produto {
    private Integer codigo;
    private String nome;
    private Integer quantidade;
    private Double preco;

    public Produto(Integer codigo, String nome, Integer quantidade, Double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public boolean manterProduto(int codigo){
        return true;
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

    @Override
    public String toString() {
        return "\nProduto = " +
                "Codigo - " + codigo +
                "| Nome - " + nome +
                "| Quantidade - " + quantidade +
                "| Preco - " + preco;
    }
}