package model;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Corrida {
    private Long id;
    private String tipoPagamento;
    private String detalhePagemento;
    private LocalDateTime dataInicio;
    private Double preco;
    private Usuario usuario;
    private Motorista motorista;

    public Corrida(Long id, String tipoPagamento, String detalhePagemento, LocalDateTime dataInicio, Double preco, Usuario usuario, Motorista motorista) {
        super();
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.detalhePagemento = detalhePagemento;
        this.dataInicio = dataInicio;
        this.preco = preco;
        this.usuario = usuario;
        this.motorista = motorista;

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

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "\nCorrida = " +
                "id - " + id +
                "\n Tipo Pagamento - " + tipoPagamento +
                "\n Detalhe Pagemento - " + detalhePagemento +
                "\n Data Inicio - " + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(dataInicio) +
                "\n Preco - " + NumberFormat.getCurrencyInstance().format(preco) +
                "\n\n Usuario - " + usuario +
                "\n Motorista - " + motorista;
    }
}