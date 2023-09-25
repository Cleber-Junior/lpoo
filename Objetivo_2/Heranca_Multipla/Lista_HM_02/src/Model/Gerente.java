package Model;

public class Gerente extends Funcionario implements Investidor{

    private String nome;
    private Double salario;
    private String ticker;
    private Integer quantidade;

    public Gerente(){
        super();
    }

    public Gerente(String nome, Double salario, String ticker, Integer quantidade) {
        super();
        this.nome = nome;
        this.salario = salario;
        this.ticker = ticker;
        this.quantidade = quantidade;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String getTicker() {
        return ticker;
    }

    @Override
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.01;
    }

    @Override
    public String toString() {
        return "Gerente = " +
                " | Nome - " + nome +
                " | Salario - " + salario +
                " | Ticker - " + ticker +
                " | Quantidade - " + quantidade + "\n";
    }
}
