package Model;

public class DevPleno extends Desenvolvedor{
    public DevPleno(String nome, double salario) {
        super(nome, salario);
    }
    public DevPleno(){
    }

    @Override
    public double getBonus() {
        double salario = getSalario();
        return salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor Pleno - " +
                "Nome:" + nome + " | " +
                "Salario:" + salario;
    }
}
