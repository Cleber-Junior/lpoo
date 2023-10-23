package controller;

import model.Empresa;
import model.Funcionario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ControllerEmpresaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(1,"12345678901", "Yuri", "Costa", LocalDate.of(1996,1,23));
        Funcionario f2 = new Funcionario(2,"97531246809", "Matheus", "Braga", LocalDate.of(1985,5,2));
        Funcionario f3 = new Funcionario(3,"24680975311", "Gustavo", "Almeida", LocalDate.of(1970,7,11));
        Funcionario f4 = new Funcionario(4,"67890054321", "Ricardo", "Rocha", LocalDate.of(2000,12,9));
        Funcionario f5 = new Funcionario(5,"65432178908", "Breno", "Martins", LocalDate.of(1998,11,27));
        Funcionario f6 = new Funcionario(6,"09876543210", "Marcos", "Silva", LocalDate.of(1990,5,12));

        Empresa e1 = new Empresa("64.434.343/7165-8", "Matrizes","Matriz");
        Empresa e2 = new Empresa("43.846.038/0780-9", "Portas", "Porta");

        e1.getFuncionarios().add(f1);
        e1.getFuncionarios().add(f2);
        e1.getFuncionarios().add(f3);
        e2.getFuncionarios().add(f4);
        e2.getFuncionarios().add(f5);
        e2.getFuncionarios().add(f6);

        List<Empresa> empresaList = new ArrayList<>();
        empresaList.add(e1);
        empresaList.add(e2);
        System.out.println("---- Execicio 1.c ----");
        System.out.println("\n--- Empresa 1");
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(e1);

        System.out.println("\n--- Empresa 2");
        e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(e2);

        System.out.println("--- Ordem de acordo com a idade (Empresa 1) ---");
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
        System.out.println(e1);

        System.out.println("\n--- Ordem de acordo com a idade (Empresa 2) ---");
        e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
        System.out.println(e2);
    }
}