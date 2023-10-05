package Controller;

import Model.Aluno;
import Model.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class ControllerAlunoDisciplina {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1L,"Ricardo", "Ferreira");
        Aluno a2 = new Aluno(2L, "Felippe", "Algusto");

        Disciplina d1 = new Disciplina(1, "Matemática");
        Disciplina d2 = new Disciplina(2, "Geografia");
        Disciplina d3 = new Disciplina(3, "Enfermagem");

        d1.getAlunos().add(a1);
        a1.getDisciplinas().add(d1);
        d2.getAlunos().add(a1);
        a1.getDisciplinas().add(d2);
        d1.getAlunos().add(a2);
        a2.getDisciplinas().add(d1);
        d2.getAlunos().add(a2);
        a2.getDisciplinas().add(d2);
        d3.getAlunos().add(a2);
        a2.getDisciplinas().add(d3);

        System.out.println(a1);
        System.out.println(a2);

    }
}
