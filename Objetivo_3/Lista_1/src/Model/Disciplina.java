package Model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private Long codigo;
    private String nome;

    private List<Aluno> alunos = new ArrayList<>();

    public Disciplina(long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return " \n Disciplina = " +
                "Codigo - " + codigo +
                " | Nome - " + nome;
    }
}