package Controller;

import Model.Carro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarroController {
    public static void main(String[] args) {
        Carro c1 = new Carro(1L,"Fiat", "Uno", 2000);
        Carro c2 = new Carro(2L, "Nissan", "Sentra", 2015);
        Carro c3 = new Carro(3L, "Ford", "Mustang", 2020);
        Carro c4 = new Carro(4L, "Hyundai", "Elantra",  2012);
        Carro c5 = new Carro(5L, "Citroen", "C3", 2013);
        Carro c6 = new Carro(6L, "Subaru", "Forester", 2020);
        Carro c7 = new Carro(3L, "Ford", "Mustang", 2020);


        List<Carro> carros = new ArrayList<>();
        carros.add(c1);
        carros.add(c2);
        carros.add(c3);
        carros.add(c4);
        carros.add(c5);
        carros.add(c6);
        carros.add(c7);

        System.out.println("\n\nCarros List:");
        System.out.println(carros);


        Map<Long, Carro> CarrosMap = new HashMap<>();
        CarrosMap.put(c1.getId(), c1);
        CarrosMap.put(c2.getId(), c2);
        CarrosMap.put(c3.getId(), c3);
        CarrosMap.put(c4.getId(), c4);
        CarrosMap.put(c5.getId(), c5);
        CarrosMap.put(c6.getId(), c6);
        CarrosMap.put(c7.getId(), c7);
        System.out.println("\n\nColeção Map:");
        System.out.println(CarrosMap);

    }
}