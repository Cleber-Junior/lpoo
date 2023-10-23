package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VeiculoController {
    public static void main(String[] args) {
        System.out.println("------- Exercicio 1 -------\n");
        System.out.println("------- Exercicio 1.A");
        Veiculo bike1 = new Bicicleta(2,"Humana", "Caloi", "Cross", 2021, 20, "5456sdad846");
        System.out.println(bike1);

        System.out.println("------- Exercicio 1.B");
        Veiculo car1 = new Carro(4, "Combustão", "Volkswagen", "Polo", 2019, 300, "25000", "5456sdad846", "IMO54112");
        System.out.println(car1);

        System.out.println("------- Exercicio 1.C");
        Veiculo cam1 = new Caminhao(8, "Combustão", "Ford", "F-350", 2020, 200000, "63826336379", "5456baoq846", "I93YHU0A");
        System.out.println(cam1);

        System.out.println("------- Exercicio 2 -------\n");
        Veiculo bike2 = new Bicicleta(2,"Humana", "Caloi", "Cross", 2012, 20, "5456sdad846");
        Veiculo bike3 = new Bicicleta(2,"Humana", "Caloi", "Cross", 2015, 20, "5456sdad846");
        Veiculo bike4 = new Bicicleta(2,"Humana", "Caloi", "Cross", 2018, 20, "5456sdad846");
        Veiculo bike5 = new Bicicleta(2,"Humana", "Caloi", "Cross", 2020, 20, "5456sdad846");
        Veiculo bike6 = new Bicicleta(2,"Humana", "Caloi", "Cross", 2023, 20, "5456sdad846");

        Veiculo car2 = new Carro(4, "Combustão", "Volkswagen", "Polo", 2011, 300, "25000", "5456sdad846", "IMO54112");
        Veiculo car3 = new Carro(4, "Combustão", "Volkswagen", "Polo", 2016, 300, "25000", "5456sdad846", "imo45445");
        Veiculo car4 = new Carro(4, "Combustão", "Volkswagen", "Polo", 2015, 300, "25000", "5456sdad846", "IMI87683");
        Veiculo car5 = new Carro(4, "Combustão", "Volkswagen", "Polo", 2014, 300, "25000", "5456sdad846", "TDS73984");
        Veiculo car6 = new Carro(4, "Combustão", "Volkswagen", "Polo", 2013, 300, "25000", "5456sdad846", "VSG63836");

        Veiculo cam2 = new Caminhao(8, "Combustão", "Ford", "F-350", 2016, 200000,  "01546914016", "5456baoq846", "IJD810MD");
        Veiculo cam3 = new Caminhao(8, "Combustão", "Ford", "F-350", 2018, 200000,  "42961329073", "2819mfjd720", "iHCUI17K");
        Veiculo cam4 = new Caminhao(8, "Combustão", "Ford", "F-350", 2023, 200000,  "83649356294", "6173dwop927", "I93YHU0A");
        Veiculo cam5 = new Caminhao(8, "Combustão", "Ford", "F-350", 2021, 200000,  "76203739584", "7290oqoe898", "D71NDUQ7");
        Veiculo cam6 = new Caminhao(8, "Combustão", "Ford", "F-350", 2012, 200000,  "02673592072", "5278jfhd726", "JC13619M");

        List<Veiculo> veiculoList = new ArrayList<>();
        veiculoList.add(bike2);
        veiculoList.add(bike3);
        veiculoList.add(bike4);
        veiculoList.add(bike5);
        veiculoList.add(bike6);
        veiculoList.add(car2);
        veiculoList.add(car3);
        veiculoList.add(car4);
        veiculoList.add(car5);
        veiculoList.add(car6);
        veiculoList.add(cam2);
        veiculoList.add(cam3);
        veiculoList.add(cam4);
        veiculoList.add(cam5);
        veiculoList.add(cam6);

        System.out.println("------- 2.A Ordenação -------");
        veiculoList.sort(Comparator.comparing(Veiculo::getAnoFabricacao).reversed());
        System.out.println(veiculoList);

        System.out.println("\n------- 2.B Ordenação Automoveis -------\n");
        veiculoList.forEach(veiculo -> {
            if(veiculo instanceof Automovel){
                System.out.println(veiculo.toString());
            }
        });

        System.out.println("\n------- 2.C Ordenação Bicicletas -------\n");
        veiculoList.forEach(veiculo -> {
            if (veiculo instanceof Bicicleta){
                System.out.println(veiculo.toString());
            }
        });

        System.out.println("\n------- 2.D Ordenação Veiculos com I e i -------\n");
        veiculoList.forEach(veiculo -> {
            if (veiculo instanceof Automovel){
                if (((Automovel) veiculo).getPlaca().startsWith("I") || ((Automovel) veiculo).getPlaca().startsWith("i")){
                    System.out.println(veiculo);
                }
            }
        });
    }
}
