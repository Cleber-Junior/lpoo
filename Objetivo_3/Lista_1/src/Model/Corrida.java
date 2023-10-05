package Model;

import java.util.Date;

public class Corrida {
    private Long id;
    private String tipoPagamento;
    private String detalhePagemento;
    private Date dataInicio;
    private Double preco;
    private Integer Attribute;

    public Corrida(Long id, String tipoPagamento, String detalhePagemento, Date dataInicio, Double preco, Integer attribute) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.detalhePagemento = detalhePagemento;
        this.dataInicio = dataInicio;
        this.preco = preco;
        Attribute = attribute;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getDetalhePagemento() {
        return detalhePagemento;
    }

    public void setDetalhePagemento(String detalhePagemento) {
        this.detalhePagemento = detalhePagemento;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getAttribute() {
        return Attribute;
    }

    public void setAttribute(Integer attribute) {
        Attribute = attribute;
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "id=" + id +
                ", tipoPagamento = " + tipoPagamento +
                ", detalhePagemento = " + detalhePagemento +
                ", dataInicio = " + dataInicio +
                ", preco = " + preco +
                ", Attribute = " + Attribute +
                '}';
    }
}