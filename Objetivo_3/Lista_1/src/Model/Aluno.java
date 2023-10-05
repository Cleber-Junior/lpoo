package Model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private Long matricula;
    private String nome;
    private String sobrenome;
    private List<Disciplina> Disciplinas = new ArrayList<>();

    public Aluno(Long matricula, String nome, String sobrenome) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Aluno(long matricula, String nome, String sobrenome, List<Disciplina> disciplinas) {
        Disciplinas = disciplinas;
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public List<Disciplina> getDisciplinas() {
        return Disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        Disciplinas = disciplinas;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
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
    public String toString() {
        return "Aluno{" +
                ", matricula=" + matricula +
                ", nome='" + nome +
                ", sobrenome='" + sobrenome +
                '}';
    }
}
