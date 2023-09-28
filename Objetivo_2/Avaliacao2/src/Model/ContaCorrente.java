package Model;

public class ContaCorrente extends Conta implements Associado{
    public double saldo;
    public double lucro;
    public int cotas;
    public ContaCorrente(){}
    public ContaCorrente(Double saldo) {
        super();
        this.saldo = saldo;
    }
    @Override
    public double lucros(int qdeCotas, double valorCota) {
        lucro = qdeCotas * valorCota;
        deposita(lucro);
        return lucro;
    }

    @Override
    public void setqdeCotas(int cota) {
        this.cotas = cota;
    }

    @Override
    public int getqdeCota() {
        return cotas;
    }

    @Override
    public String toString() {
        return "ContaCorrente = " +
                "Saldo - " + saldo +
                " | Cotas - " + cotas +
                " | Lucro Total - " + lucro + "\n";
    }
}
