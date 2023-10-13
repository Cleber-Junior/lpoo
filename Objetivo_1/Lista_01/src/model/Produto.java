package model;

public class Produto {
    private String nome;
    private String descircao;
    private Double valor;
    private int estoque;

    @Override
    public String toString() {
        return "Produto: " +
                "nome='" + nome + '\'' +
                ", descircao='" + descircao + '\'' +
                ", valor=" + valor +
                ", estoque=" + estoque;
    }

    public Produto(String nome, String descircao, Double valor, int estoque) {
        this.nome = nome;
        this.descircao = descircao;
        this.valor = valor;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescircao() {
        return descircao;
    }

    public void setDescircao(String descircao) {
        this.descircao = descircao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}