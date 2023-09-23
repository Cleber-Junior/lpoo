package Model;

public abstract class Funcionario {
    protected String nome;
    protected Double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void setSalario(double salario){
        this.salario=salario;
    }

    public Double getSalario() {
        return salario;
    }

    public abstract double getBonus();

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString() {
        return "Funcionario" +
                "Nome-" + nome + " | " +
                "Salario-" + salario;
    }
}
