package Controller;

import Model.*;

import java.util.ArrayList;
import java.util.List;

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

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(dev1);
        funcionarios.add(dev2);
        funcionarios.add(dev3);
        funcionarios.add(dev4);
        funcionarios.add(dev5);
        funcionarios.add(dev6);
        funcionarios.add(g1);
        funcionarios.add(g2);
        funcionarios.add(g3);
        funcionarios.add(g4);
        funcionarios.add(g5);
        funcionarios.add(g6);

        System.out.println("\n------- Exercicio 1.B");
        System.out.println(funcionarios);

        List<Investidor> investidores = new ArrayList<>();
        investidores.add(c1);
        investidores.add(c2);
        investidores.add(c3);
        investidores.add(c4);
        investidores.add(c5);
        investidores.add(c6);
        investidores.add(g1);
        investidores.add(g2);
        investidores.add(g3);
        investidores.add(g4);
        investidores.add(g5);
        investidores.add(g6);
        System.out.println(investidores);

    }
}
