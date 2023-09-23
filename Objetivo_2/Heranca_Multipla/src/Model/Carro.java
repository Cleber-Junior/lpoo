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
        return null;
    }

    @Override
    public Void serRenavam(String renavam) {
        return null;
    }

    @Override
    public String getChassi() {
        return null;
    }

    @Override
    public Void setChassi(String chassi) {
        return null;
    }

    @Override
    public String getPlaca() {
        return null;
    }

    @Override
    public Void setPlaca(String placa) {
        return null;
    }

    @Override
    public String toString() {
        return "Carro: " +
                "capacidaddePortaMalas - " + capacidaddePortaMalas +
                " |" + super.toString();
    }
}