package controller;

import model.Aluno;

import java.util.*;

public class ControllerAluno {
    public static void main(String[] args) {
        System.out.println("------- EXERCICIO 1 ------- \n");

        // A -
        System.out.println("Questão A -\n");
            Aluno a1 = new Aluno(1L, 1122334451, "Jorge", "Santos", "jorge@gmail.com");
            Aluno a2 = new Aluno(2L, 1234567891, "Hugo", "Da Silva", "hugo@gmail.com");
            Aluno a3 = new Aluno();
            Aluno a4 = new Aluno();
            Aluno a5 = new Aluno(5L, "Ricardo");
            Aluno a6 = new Aluno(6L, "Gustavo");

            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
            System.out.println(a4);
            System.out.println(a5);
            System.out.println(a6);

        // B -
        System.out.println("Questão B -\n");
            a3.setId(3L);
            a3.setCpf(476444821);
            a3.setNome("Guilherme");
            a3.setSobrenome("Rocha");
            a3.setEmail("gui44@gmail.com");

            a4.setId(4L);
            a4.setCpf(757645764);
            a4.setNome("Gabriel");
            a4.setSobrenome("Pereira");
            a4.setEmail("pereira@gmail.com");

            Long id_3 = a3.getId();
            int cpf_3 = a3.getCpf();
            String nome_3 = a3.getNome();
            String sobrenome_3 = a3.getSobrenome();
            String email_3 = a3.getEmail();

            Long id_4 = a4.getId();
            int cpf_4 = a4.getCpf();
            String nome_4 = a4.getNome();
            String sobrenome_4 = a4.getSobrenome();
            String email_4 = a4.getEmail();

            System.out.println("Id - " + id_3);
            System.out.println("Cpf - " + cpf_3);
            System.out.println("Nome - " + nome_3);
            System.out.println("Sobrenome - " + sobrenome_3);
            System.out.println("Email - " + email_3);

            System.out.println();
            System.out.println("Id - " + id_4);
            System.out.println("Cpf - " + cpf_4);
            System.out.println("Nome - " + nome_4);
            System.out.println("Sobrenome - " + sobrenome_4);
            System.out.println("Email - " + email_4);

        // 2 -
        System.out.println("------- EXECICIO 2 ------- \n");

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a5);
        alunos.add(a6);
        System.out.println("\n ----- Alunos List -----");
        System.out.println(alunos);

        System.out.println("\n ----- Alunos Ordem Decrescente -----");
        alunos.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println(alunos);

        System.out.println("\n ----- Id 5 na Lista -----");
        System.out.println(alunos.stream().filter(aluno -> aluno.getId()==5).findAny().orElse(null));

        Map<Long, Aluno> AlunosMap = new HashMap<>();
        AlunosMap.put(a1.getId(), a1);
        AlunosMap.put(a2.getId(), a2);
        AlunosMap.put(a3.getId(), a3);
        AlunosMap.put(a4.getId(), a4);
        AlunosMap.put(a5.getId(), a5);
        AlunosMap.put(a6.getId(), a6);

        System.out.println("\n ----- Alunos Map -----");
        System.out.println(AlunosMap);

        System.out.println("\n ----- Id 5 no Map -----");
        System.out.println(AlunosMap.get(a5.getId()));

        System.out.println("----- Não é possivel mudar a ordem do Map -----");
    }
}
