package controller;

import model.Automovel;

public class AutomovelController {
    public static void main(String[] args) {
        Automovel auto1 = new Automovel("263726", "IF20211", "Vermelho", 4, "Gasolina", 20000,"Bom estado",200.00);
        System.out.println(auto1);
        Automovel auto2 = new Automovel();
        System.out.println(auto2);
    }
}
