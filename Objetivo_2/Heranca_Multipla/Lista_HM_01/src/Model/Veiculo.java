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

    public void setNumeroDeEixos(int numeroDeEixos) {
        this.numeroDeEixos = numeroDeEixos;
    }

    public String getPropulsao() {
        return propulsao;
    }

    public void setPropulsao(String propulsao) {
        this.propulsao = propulsao;
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

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

}
