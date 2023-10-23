package model;

public class DevJunior extends Desenvolvedor{
    public DevJunior(String nome, double salario) {
        super(nome, salario);
    }
    public DevJunior(){
    }

    @Override
    public double getBonus() {
        double salario = getSalario();
        return salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor Junior - " +
                "Nome:" + nome + " | " +
                "Salario:" + salario;
    }
}
