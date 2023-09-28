package Model;

public abstract class Conta {
    protected double saldo;

    public Conta(){}
    public Conta(double valor) {
        this.saldo = valor;
    }

    public Conta(double saldo, double deposita, double valor, double taxa) {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double deposita){
        this.saldo = this.saldo + deposita;
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