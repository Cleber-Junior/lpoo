package Model;

public class Cliente implements Associado{
    private String nome;
    private int cotas;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public double lucros(int qdeContas, double valorCota) {
        return 0;
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
        return "Cliente = " +
                "Nome - " + nome +
                " | Cotas - " + cotas + "\n";
    }
}