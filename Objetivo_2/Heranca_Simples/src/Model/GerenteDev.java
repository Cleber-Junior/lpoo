package Model;

public class GerenteDev extends Gerente{
    public GerenteDev(String nome, double salario){
        super (nome, salario);
    }
    @Override
    public double getBonus() {
        double salario = getSalario();
        return salario * 0.20;
    }

    @Override
    public String toString() {
        return "Gerente De Desenvolvimento - " +
                "Nome:" + nome + " | " +
                "Salario:" + salario;
    }

}
