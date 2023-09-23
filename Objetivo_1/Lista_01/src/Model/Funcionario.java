package Model;

public class Funcionario {
    private String nome;
    private Double salaraio;

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salaraio=" + salaraio +
                '}';
    }

    public Funcionario(String nome, Double salaraio) {
        this.nome = nome;
        this.salaraio = salaraio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalaraio() {
        return salaraio;
    }

    public void setSalaraio(Double salaraio) {
        this.salaraio = salaraio;
    }
}
