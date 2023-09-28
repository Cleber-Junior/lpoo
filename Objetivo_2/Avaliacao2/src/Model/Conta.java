package Model;

public abstract class Conta {
    protected Double saldo;

    public Conta(){}
    public Conta(Double Saldo) {
        this.saldo = Saldo;
    }

    public Conta(double saldo, double deposita, double valor, double taxa) {
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double deposita){
        this.saldo = saldo + deposita;
    }
    public void  saca(double valor) {
        if (this.saldo > valor) {
            this.saldo = saldo - valor;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void atualiza(double taxa){
        this.saldo = saldo + (saldo * (taxa/100));
    }

    @Override
    public String toString() {
        return "Conta = " +
                "Saldo - " + saldo + "\n";
    }
}