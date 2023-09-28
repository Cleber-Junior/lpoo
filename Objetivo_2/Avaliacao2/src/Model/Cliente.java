package Model;

public class Cliente implements Associado{
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public double lucros(int qdeContas, double valorCota) {
        return 0;
    }

    //@Override
    //public void setqdeCotas() {
    //}

    //@Override
    //public double setvalorCota() {
    //    return 0;
    //}

    @Override
    public String toString() {
        return "Cliente = " +
                "Nome - " + nome + "\n";
    }
}