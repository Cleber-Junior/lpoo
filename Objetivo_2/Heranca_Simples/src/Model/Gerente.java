package Model;

public class Gerente extends Funcionario{

    public Gerente(){
    }
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        double salario = getSalario();
        return salario * 0.20;
    }

    @Override
    public String toString() {
        return "Gerente - " +
                "Nome:" + nome + " | " +
                "Salario:" + salario;
    }
}
