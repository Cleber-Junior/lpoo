package Model;

public abstract class Veiculo {
    protected Integer numeroDeEixos;
    protected String propulsao;
    protected String marca;

    protected String modelo;
    protected Integer anoFabricacao;

    public Veiculo(){
        super();
    }

    public Veiculo(Integer numeroDeEixos, String propulsao, String marca, String modelo, Integer anoFabricacao) {
        super();
        this.numeroDeEixos = numeroDeEixos;
        this.propulsao = propulsao;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public Integer getNumeroDeEixos() {
        return numeroDeEixos;
    }

    public String getPropulsao() {
        return propulsao;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    @Override
    public String toString() {
        return " Veiculo: " +
                "numeroDeEixos - " + numeroDeEixos +
                "| propulsao - " + propulsao +
                "| marca - " + marca +
                "| modelo - " + modelo +
                "| anoFabricacao - " + anoFabricacao + "\n";
    }
}
