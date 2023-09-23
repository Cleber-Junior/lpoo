package Model;

public class Conta {
    private Double saldo;

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void deposito(double valor){
        saldo+= valor;
    }

    public void saca(double valor){
        if (valor < saldo) {
            saldo-= valor;
        }
    }

    public void atualiza(double valor){
        saldo = saldo * valor;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}