package model;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "Cliente = " +
                " | Nome - " + getNome() +
                " | Sobrenome - " + getSalario() +
                " | Bonus - " + getBonus() + "\n";
    }
}
