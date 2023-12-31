package model;

public class Carro {
    private Long id;
    private String marca;
    private String modelo;
    private Integer anoFabricacao;

    public Carro() {
    }

    public Carro(Long id, String marca, String modelo, Integer anoFabricacao) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "\nCarro{" +
                "id=" + id + '\'' +
                "marca='" + marca + '\'' +
                "modelo='" + modelo + '\''+
                "anoFabicacao=" + anoFabricacao +
                "} \n";
    }
}