package model;

public class DevSenior extends Desenvolvedor{
    public DevSenior(String nome, double salario) {
        super(nome, salario);
    }
    public DevSenior(){
    }

    @Override
    public double getBonus() {
        double salario = getSalario();
        return salario * 0.10;
    }

    @Override
    public String toString() {
        return "Desenvolvedor Senior - " +
                "Nome:" + nome + " | " +
                "Salario:" + salario;
    }
}
