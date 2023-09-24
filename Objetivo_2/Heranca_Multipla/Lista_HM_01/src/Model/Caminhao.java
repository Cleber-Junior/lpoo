package Model;

public class Caminhao extends Veiculo implements Automovel{
    private Integer capacidadeDeCarga;
    private String renavam;
    private String chassi;
    private String placa;

    public Caminhao(){
        super();
    }


    public Caminhao(Integer numeroDeEixos, String propulsao, String marca, String modelo, Integer anoFabricacao, Integer capacidadeDeCarga, String renavam, String chassi, String placa) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.renavam = renavam;
        this.chassi = chassi;
        this.placa = placa;

    }

    public Caminhao(Integer capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public int getCapacidadeDeCarga(){
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga){
        this.capacidadeDeCarga = capacidadeDeCarga;
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
        return "Caminhao: " +
                "capacidadeDeCarga - " + capacidadeDeCarga +
                "| ";
    }
}
