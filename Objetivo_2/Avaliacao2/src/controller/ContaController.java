package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
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
        c1.setqdeCotas(100);
        c2.setqdeCotas(400);
        c3.setqdeCotas(600);
        cc1.setqdeCotas(300);
        cc2.setqdeCotas(600);
        cc3.setqdeCotas(600);
        System.out.println("---- Associados com Cotas ----");
        System.out.println(AssociadoList);

        System.out.println("\n------- Exercicio 1.F");
        AssociadoList.sort(Comparator.comparing(Associado::getqdeCota).reversed());
        System.out.println("---- Associados: Ordem maios ao menos ----");
        System.out.println(AssociadoList);
        System.out.println("---- Maiores cotas associados ----");
        int maxC = AssociadoList.stream().max(Comparator.comparing(Associado::getqdeCota)).get().getqdeCota();
        for (Associado a: AssociadoList){
            if (a.getqdeCota() == maxC){
                System.out.print(a);
            }
        }


        System.out.println("\n------- Exercicio 1.G");
        ContaList.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("\n---- Contas: Ordem Decrescente");
        System.out.println(ContaList);
        System.out.println("\n---- Associados: Possuem conta");
        for (Associado a: AssociadoList){
            if (a instanceof ContaCorrente){
                System.out.print(a);
            }
        }
        System.out.println("\n---- Maior saldo bancario:");
        double maiorS;
        maiorS = ContaList.stream().max(Comparator.comparing(Conta::getSaldo)).get().getSaldo();
        for(Conta c: ContaList){
            if (c.getSaldo() == maiorS){
                System.out.print(c);
            }
        }

    }
}
