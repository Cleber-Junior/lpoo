package Model;

import java.util.ArrayList;
import java.util.List;

public class Motorista {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private List<Corrida> corridas = new ArrayList<>();
    private Veiculo veiculo;

    public Motorista(Long id, String nome, String email, String telefone, Veiculo veiculo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.corridas = corridas;
        this.veiculo = veiculo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Corrida> getCorridas() {
        return corridas;
    }

    public void setCorridas(List<Corrida> corridas) {
        this.corridas = corridas;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "\nMotorista: " + " Id - " + id + "| Nome - " + nome + "| Email - " + email + "| Telefone - " + telefone + "| Corridas - " + corridas + "| Veiculo - " + veiculo;
    }
}