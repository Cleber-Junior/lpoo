package controller;

import model.Conta;

public class ContaController {
    public static void main(String[] args) {
        Conta cont1 = new Conta(500.00);
        Conta cont2 = new Conta(600.00);

        System.out.println(cont1);
        System.out.println(cont2);
    }
}