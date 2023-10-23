package Model;

public class Item {
    private Integer codItem;
    private Double desconto;
    private Integer qtItem;
    private Produto produto;
    private Double valorTotal;

    public Item(Integer codItem, Double desconto, Integer qtItem, Produto produto) {
        this.codItem = codItem;
        this.desconto = desconto;
        this.qtItem = qtItem;
        this.produto = produto;
    }

    public Integer getCodItem() {
        return codItem;
    }

    public void setCodItem(Integer codItem) {
        this.codItem = codItem;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Integer getQtItem() {
        return qtItem;
    }

    public void setQtItem(Integer qtItem) {
        this.qtItem = qtItem;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getValorTotal(){
        return (1 - (desconto/100)) * getProduto().getPreco();
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "\n__ Item __ " +
                "\nCodigo Item:" + codItem +
                "\n | Desconto:" + desconto +
                "\n  | Quantidade Item:" + qtItem +
                "\nProduto:" + produto;
    }
}
