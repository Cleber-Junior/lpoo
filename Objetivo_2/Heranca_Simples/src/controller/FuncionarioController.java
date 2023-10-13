package controller;


import model.*;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    public static void main(String[] args) {
        System.out.println("\n      ---- Parte 1 ---- \n");
        Desenvolvedor dev1 = new Desenvolvedor("Cleber", 1800.00);
        Desenvolvedor dev2 = new Desenvolvedor("Alessadro", 1800.00);
        Desenvolvedor dev3 = new Desenvolvedor();

        Gerente gen1 = new Gerente("Andrew", 2250.00);
        Gerente gen2 = new Gerente("Gabriel", 2250.00);
        Gerente gen3 = new Gerente();

        System.out.println("------- Desenvolvedores -------");
        System.out.println(dev1);
        System.out.println(dev2);
        System.out.println(dev3);

        System.out.println("\n------- Gerentes -------");
        System.out.println(gen1);
        System.out.println(gen2);
        System.out.println(gen3);

        dev1.setSalario(2000.00);
        dev2.setSalario(2000.00);
        dev3.setSalario(2000.00);
        gen1.setSalario(2500.00);
        gen2.setSalario(2500.00);
        gen3.setSalario(2500.00);


        System.out.println("\n------- Salarios Alterados -------");
        System.out.println(dev1);
        System.out.println(dev2);
        System.out.println(dev3);

        System.out.println();
        System.out.println(gen1);
        System.out.println(gen2);
        System.out.println(gen3);

        System.out.println("\n------- Bônus Dos Salarios -------");
        System.out.println("Bônus dos Desenvolvedores: " + dev1.getBonus());
        System.out.println("Bônus dos Gerentes: " + gen1.getBonus());
        System.out.println("------------------------------------");
        System.out.println("\n      ---- Parte 2 ----");


        System.out.println("\n ------- Folha Salarial (Sem Bônus)-------");

        GerenteGeral gg = new GerenteGeral("Alexandre", 6500.00);
        GerenteDev gd = new GerenteDev("Matheus", 4500.00);

        DevSenior ds1 = new DevSenior("Cleber", 3500.00);
        DevSenior ds2 = new DevSenior("Alessandro", 3500.00);
        DevSenior ds3 = new DevSenior("Andrew", 3500.00);
        DevSenior ds4 = new DevSenior("Miguel", 3500.00);
        DevSenior ds5 = new DevSenior("Luigi", 3500.00);
        DevSenior ds6 = new DevSenior("Gabriel", 3500.00);

        DevPleno dp1 = new DevPleno("Guilherme", 2500.00);
        DevPleno dp2 = new DevPleno("Carlos", 2500.00);
        DevPleno dp3 = new DevPleno("Yuri", 2500.00);
        DevPleno dp4 = new DevPleno("Gustavo", 2500.00);
        DevPleno dp5 = new DevPleno("Micael", 2500.00);
        DevPleno dp6 = new DevPleno("Raphael", 2500.00);

        DevJunior dj1 = new DevJunior("Marcos", 1800.00);
        DevJunior dj2 = new DevJunior("Fernando", 1800.00);
        DevJunior dj3 = new DevJunior("Julio", 1800.00);
        DevJunior dj4 = new DevJunior("Henrique", 1800.00);
        DevJunior dj5 = new DevJunior("Fredy", 1800.00);
        DevJunior dj6 = new DevJunior("Bernardo", 1800.00);

        List<Funcionario> Funcionarios = new ArrayList<>();
        Funcionarios.add(gg);
        Funcionarios.add(gd);
        Funcionarios.add(ds1);
        Funcionarios.add(ds2);
        Funcionarios.add(ds3);
        Funcionarios.add(ds4);
        Funcionarios.add(ds5);
        Funcionarios.add(ds6);
        Funcionarios.add(dp1);
        Funcionarios.add(dp2);
        Funcionarios.add(dp3);
        Funcionarios.add(dp4);
        Funcionarios.add(dp5);
        Funcionarios.add(dp6);
        Funcionarios.add(dj1);
        Funcionarios.add(dj2);
        Funcionarios.add(dj3);
        Funcionarios.add(dj4);
        Funcionarios.add(dj5);
        Funcionarios.add(dj6);

        double sal = 0;
        for (Funcionario f : Funcionarios) {
            sal += f.getSalario();

        }
            //System.out.println(Funcionarios.stream().mapToDouble(f -> f.getSalario()).sum());

        System.out.println("Salario: R$ " + sal);

        System.out.println("\n ------- Folha Salarial (Com Bônus)-------");

        for (Funcionario f: Funcionarios) {
            sal += f.getSalario() + f.getBonus();
        }

        System.out.println("Salario: R$" + sal);

        System.out.println("\n ------- Salarial Bruto de Cada Funcionario -------");

        for (Funcionario f: Funcionarios) {
            System.out.println( f.getNome() + ": " + f.getSalario() + "(Salario) - " + f.getBonus() + " (Bonus)");
        }

        System.out.println("\n ------- Salarial de todos Funcionario com reajuste de 5% -------");

        for (Funcionario f: Funcionarios) {
            sal = f.getSalario() + f.getBonus() + f.getSalario() * 0.05;
            System.out.println( f.getNome() + ": " + sal);
        }

    }

}
