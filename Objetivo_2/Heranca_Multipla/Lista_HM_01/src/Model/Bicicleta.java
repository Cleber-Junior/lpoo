package Model;

public class Bicicleta extends Veiculo{

    private Integer tamanhoRoda;
    private String chassi;

    public Bicicleta() {
        super();
    }

    public Bicicleta(Integer tamanhoRoda, String chassi) {
        this.tamanhoRoda = tamanhoRoda;
        this.chassi = chassi;
    }

    public Bicicleta(Integer numeroDeEixos, String propulsao, String marca, String modelo, Integer anoFabricacao, Integer tamanhoRoda, String chassi) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.tamanhoRoda = tamanhoRoda;
        this.chassi = chassi;
    }


    @Override
    public String toString() {
        return "Bicicleta:" +
                " tamanhoRoda - " + tamanhoRoda +
                "| chassi - " + chassi + "| ";
    }
}
