package Controller;

import Model.*;

import java.util.ArrayList;
import java.util.List;

public class ContaController {
    public static void main(String[] args) {
        System.out.println("------- Exercicio 1.A");
        Cliente c1 = new Cliente("Cleber");
        Cliente c2 = new Cliente("Guilherme");
        Cliente c3 = new Cliente("Gabriel");

        ContaCorrente cc1 = new ContaCorrente(1000.00);
        ContaCorrente cc2 = new ContaCorrente(1200.00);
        ContaCorrente cc3 = new ContaCorrente(1500.00);

        ContaPoupanca cp1 = new ContaPoupanca(1000.00);
        ContaPoupanca cp2 = new ContaPoupanca(2000.00);
        ContaPoupanca cp3 = new ContaPoupanca(1500.00);

        System.out.println("---- Cliente ----");
        System.out.println(c1 + "" + c2 + "" + c3);
        System.out.println("---- Conta Corrente ----");
        System.out.println(cc1 + "" + cc2 + "" + cc3);
        System.out.println("---- Corrente Poupança ----");
        System.out.println(cp1 + "" + cp2 + "" + cp3);

        System.out.println("------- Exercicio 1.B");
        System.out.println("---- Lista Conta ----");
        List<Conta>ContaList = new ArrayList<>();
        ContaList.add(cp1);
        ContaList.add(cp2);
        ContaList.add(cp3);
        ContaList.add(cc1);
        ContaList.add(cc2);
        ContaList.add(cc3);
        System.out.println(ContaList);

        System.out.println("\n---- Lista Associados ----");
        List<Associado>AssociadoList = new ArrayList<>();
        AssociadoList.add(c1);
        AssociadoList.add(c2);
        AssociadoList.add(c3);
        AssociadoList.add(cc1);
        AssociadoList.add(cc2);
        AssociadoList.add(cc3);
        System.out.println(AssociadoList);

        System.out.println("------- Exercicio 1.C");
        System.out.println("Deposita:");
        cp3.deposita(1000.0);
        System.out.print(cp3);
        System.out.println("Atualiza:");
        cp3.atualiza(5);
        System.out.print(cp3);
        System.out.println("Saca:");
        cp3.saca(50.0);
        System.out.print(cp3);

        System.out.println("\n------- Exercicio 1.D");
        System.out.println("Deposita:");
        cc2.deposita(500.0);
        System.out.print(cc2);
        cc2.saca(400.0);
        System.out.println("Deposita");
        System.out.print(cc2);

        System.out.println("\n------- Exercicio 1.E");


    }
}
