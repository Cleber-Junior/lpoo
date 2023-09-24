package Model;

public class Carro extends Veiculo implements Automovel{
    private Integer capacidaddePortaMalas;
    private String renavam;
    private String chassi;
    private String placa;

    public Carro(){
        super();
    }

    public Carro(Integer capacidaddePortaMais) {
        this.capacidaddePortaMalas = capacidaddePortaMais;
    }

    public Carro(Integer numeroDeEixos, String propulsao, String marca, String modelo, Integer anoFabricacao, Integer capacidaddePortaMalas, String renavam, String chassi, String placa) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidaddePortaMalas = capacidaddePortaMalas;
        this.renavam = renavam;
        this.chassi = chassi;
        this.placa = placa;
    }

    @Override
    public String getRenavam() {
        return renavam;
    }

    @Override
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    @Override
    public String getChassi() {
        return chassi;
    }

    @Override
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Carro: " +
                "capacidaddePortaMalas - " + capacidaddePortaMalas +
                " |";
    }
}