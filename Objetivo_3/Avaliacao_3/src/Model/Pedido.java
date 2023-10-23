package Model;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

public class Pedido {
    private Integer numero;
    private LocalDate data;
    private Double valor;
    private Integer quantidade;
    private Vendedor vendedor;
    private Item item;
    private String tipo;
    private List<Item> itens = new ArrayList<>();

    public Pedido(Integer numero, LocalDate data, Integer quantidade, Vendedor vendedor, Item item, String tipo) {
        this.numero = numero;
        this.data = data;
        this.valor =  quantidade * (item.getValorTotal());
        this.vendedor = vendedor;
        this.item = item;
        this.tipo = tipo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    public void attQuant (Item item) {

    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void attQ(Item item) {
        try {
            if (item.getProduto().getQuantidade() < item.getQtItem()){
                throw new EstoqueInsuficienteException();
            }
            this.itens.add(item);
            this.valor += item.getValorTotal();
            item.getProduto().setQuantidade(item.getProduto().getQuantidade() - item.getQtItem());
        } catch (EstoqueInsuficienteException e) {
            System.err.println(e.getMessage());
        }
    }

    public void retiraItens(Item item){
        this.itens.remove(item);
        this.valor -= item.getValorTotal();
        item.getProduto().setQuantidade(item.getProduto().getQuantidade() + item.getQtItem());
    }

    @Override
    public String toString() {
        return "__ Pedido __ " +
                "\n Numero:" + numero +
                "\n  | Data:" + data +
                "\n   | Valor:" + valor +
                "\n| Vendedor:" + vendedor +
                "\n| Item:" + item +
                "\n| Tipo:" + tipo + "\n\n";
    }
}