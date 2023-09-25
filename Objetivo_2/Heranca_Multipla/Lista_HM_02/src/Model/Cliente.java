package Model;

public class Cliente implements Investidor{
    private String nome;
    private String sobrenome;
    private String ticker;
    private Integer quantidade;

    public Cliente(){
        super();
    }

    public Cliente(String nome, String sobrenome, String ticker, Integer quantidade) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ticker = ticker;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String getTicker() {
        return ticker;
    }

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
    public String toString() {
        return "Cliente = " +
                " | Nome - " + nome +
                " | Sobrenome - " + sobrenome +
                " | ticker - " + ticker +
                " | Quantidade - " + quantidade + "\n";
    }
}
