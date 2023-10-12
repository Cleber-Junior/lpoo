package Controller;

import Model.Aluno;
import Model.Disciplina;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ControllerAlunoDisciplina {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1L,"Ricardo", "Ferreira");
        Aluno a2 = new Aluno(2L, "Felippe", "Algusto");

        Disciplina d1 = new Disciplina(1, "Matemática");
        Disciplina d2 = new Disciplina(2, "Geografia");
        Disciplina d3 = new Disciplina(3, "Enfermagem");

        a1.getDisciplinas().add(d1);
        a1.getDisciplinas().add(d2);
        a2.getDisciplinas().add(d1);
        a2.getDisciplinas().add(d2);
        a2.getDisciplinas().add(d3);

        List<Aluno> alunoList = new ArrayList<>();
        alunoList.add(a1);
        alunoList.add(a2);
        System.out.println("---- Exercicio 1.b ----");
        alunoList.sort(Comparator.comparing(Aluno::getNome));
        System.out.println(alunoList);
        a2.getDisciplinas().remove(d1);
        a2.getDisciplinas().remove(d2);
        a2.getDisciplinas().remove(d3);

        System.out.println("\n ---- Lista sem Disciplinas ----");
        System.out.println(alunoList);

    }
}
