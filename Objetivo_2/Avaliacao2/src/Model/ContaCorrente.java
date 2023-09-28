package Model;

public class ContaCorrente extends Conta implements Associado{
    public double saldo;
    public double lucro;
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
    //@Override
    //public void setqdeCotas() {

    //}

    //@Override
    //public double setvalorCota() {
    //    return setvalorCota();
    //}

    @Override
    public String toString() {
        return "ContaCorrente = " +
                "Saldo - " + saldo +
                " | Lucro Total - " + lucro + "\n";
    }
}
