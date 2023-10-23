package model;

public class GerenteGeral extends Gerente{

    public GerenteGeral(String nome, double salario){
        super (nome, salario);
    }
    @Override
    public double getBonus() {
        return this.getSalario() * 0.40;
    }

    @Override
    public String toString() {
        return "Gerente Geral - " +
                "Nome:" + nome + " | " +
                "Salario:" + salario;
    }
}
