package Model;

public class Caminhao extends Veiculo implements Automovel{
    private Integer capacidadeDeCarga;

    public Caminhao(){
        super();
    }

    public Caminhao(Integer capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public Caminhao(Integer numeroDeEixos, String propulsao, String marca, String modelo, Integer anoFabricacao, Integer capacidadeDeCarga) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadeDeCarga = capacidadeDeCarga;
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
        return "Caminhao: " +
                "capacidadeDeCarga - " + capacidadeDeCarga +
                "| " + super.toString();
    }
}
