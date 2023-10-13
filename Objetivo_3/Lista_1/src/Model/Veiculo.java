package Model;

public class Veiculo {
    private Long id;
    private String tipo;
    private String placa;
    private Integer anoFabricacao;

    public Veiculo(Long id, String tipo, String placa, Integer anoFabricacao) {
        this.id = id;
        this.tipo = tipo;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "Veiculo = " + "Id - " + id + "| Tipo - " + tipo + "| Placa - " + placa + "| Ano Fabricacao - " + anoFabricacao;
    }
}