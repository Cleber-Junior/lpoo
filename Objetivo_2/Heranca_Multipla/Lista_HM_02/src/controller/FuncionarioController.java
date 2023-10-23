package controller;

import model.*;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {
        Desenvolvedor dev1 = new Desenvolvedor("Ricardo", 2000.0);
        Desenvolvedor dev2 = new Desenvolvedor("Julio", 2500.0);
        Desenvolvedor dev3 = new Desenvolvedor("Hugo", 2250.0);
        Desenvolvedor dev4 = new Desenvolvedor("Natalia", 1850.0);
        Desenvolvedor dev5 = new Desenvolvedor("Getulio", 1900.0);
        Desenvolvedor dev6 = new Desenvolvedor("Paulo", 2150.0);
        System.out.println("------- Exercicio 1.A \n");
        System.out.println("---- Desenvolvedor ----");
        System.out.println(dev1 + "" + dev2 + "" + dev3 + "" + dev4 + "" + dev5 + "" + dev6);

        Cliente c1 = new Cliente("Julia", "Pozzada", "ASUS1", 1000);
        Cliente c2 = new Cliente("Luis", "Gonsalves", "ASUS2", 1200);
        Cliente c3 = new Cliente("Thiago", "Fritz", "ASUS3", 1500);
        Cliente c4 = new Cliente("Eliza", "Webber", "ASUS4", 2000);
        Cliente c5 = new Cliente("Cesar", "Cohen", "ASUS5", 2500);
        Cliente c6 = new Cliente("Arthur", "Gomes", "ASUS6", 3000);
        System.out.println("\n---- Cliente ----");
        System.out.println(c1 + "" + c2 + "" + c3 + "" + c4 + "" + c5 + "" + c6);

        Gerente g1 = new Gerente("Tristan", 5000.0, "TOST17", 2000);
        Gerente g2 = new Gerente("Clarissa", 4000.0, "TOST18", 2200);
        Gerente g3 = new Gerente("Agatha", 5500.0, "TOST19", 2500);
        Gerente g4 = new Gerente("Samuel", 6000.0, "TOST10", 4000);
        Gerente g5 = new Gerente("Mia", 6500.0, "TOST11", 4500);
        Gerente g6 = new Gerente("Cristofer", 10000.0, "TOST12", 5000);
        System.out.println("\n---- Gerente ----");
        System.out.println(g1 + "" + g2 + "" + g3 + "" + g4 + "" + g5 + "" + g6);

        List<Funcionario> funcionarioList = new ArrayList<>();
        funcionarioList.add(dev1);
        funcionarioList.add(dev2);
        funcionarioList.add(dev3);
        funcionarioList.add(dev4);
        funcionarioList.add(dev5);
        funcionarioList.add(dev6);
        funcionarioList.add(g1);
        funcionarioList.add(g2);
        funcionarioList.add(g3);
        funcionarioList.add(g4);
        funcionarioList.add(g5);
        funcionarioList.add(g6);

        System.out.println("\n------- Exercicio 1.B");
        System.out.println(funcionarioList);

        List<Investidor> investidorList = new ArrayList<>();
        investidorList.add(c1);
        investidorList.add(c2);
        investidorList.add(c3);
        investidorList.add(c4);
        investidorList.add(c5);
        investidorList.add(c6);
        investidorList.add(g1);
        investidorList.add(g2);
        investidorList.add(g3);
        investidorList.add(g4);
        investidorList.add(g5);
        investidorList.add(g6);
        System.out.println(investidorList);

        System.out.println("\n------- Exercicio 1.C");
        funcionarioList.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println("--- Lista Funcionarios -- ");
        System.out.println(funcionarioList);

        investidorList.sort(Comparator.comparing(Investidor::getQuantidade).reversed());
        System.out.println("--- Lista Clientes --");
        System.out.println(investidorList);

        System.out.println("\n------- Exercicio 1.D");
        System.out.println("--- Funcionario  com maior salario");
        Funcionario maior_salario = Collections.max(funcionarioList, Comparator.comparing(Funcionario::getSalario));
        funcionarioList.forEach(fun ->{
           if(fun.getSalario() >= maior_salario.getSalario()){
                System.out.println(fun);
            }
        });

        System.out.println("--- Investidor com maior número e ações");
        Investidor maior_quantidade  =  Collections.max(investidorList, Comparator.comparing(Investidor::getQuantidade));
        investidorList.forEach(inv ->{
            if (inv.getQuantidade() >= maior_quantidade.getQuantidade()){
                System.out.println(inv);
            }
        });
    }
}
