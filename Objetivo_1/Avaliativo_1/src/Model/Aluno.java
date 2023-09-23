package Model;

public class Aluno {

    private Long Id;
    private Integer cpf;
    private String nome;
    private String Sobrenome;
    private String email;

    public Aluno() {
    }

    public Aluno(Long id, String nome){
        Id = id;
        this.nome = nome;
    }

    public Aluno(Long id, Integer cpf, String nome, String sobrenome, String email) {
        Id = id;
        this.cpf = cpf;
        this.nome = nome;
        Sobrenome = sobrenome;
        this.email = email;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Id=" + Id +
                ", cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", Sobrenome='" + Sobrenome + '\'' +
                ", email='" + email + '\'' +
                '}' + "\n";
    }
}
