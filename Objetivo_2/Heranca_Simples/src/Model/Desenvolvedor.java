package Model;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }
    public Desenvolvedor(){
    }

    @Override
    public double getBonus() {
        double salario = getSalario();
        return salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor - " +
                "Nome:" + nome + " | " +
                "Salario:" + salario;
    }
}
