package controller;

import model.Corrida;
import model.Motorista;
import model.Usuario;
import model.Veiculo;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ControllerCorridaMotorista {
    public static void main(String[] args) {
        Veiculo v = new Veiculo(1L,"Palio Adventure", "II80AG5", 2020);
        Motorista m = new Motorista(1L, "João", "Joaocorridas@gmail.com", "99874658", v);
        Usuario u = new Usuario(1L, "Gabriel", "Gabgol@gmail.com", "53998765578");

        Corrida c1 = new Corrida(1L, "Dinheiro", "Uma nota de 10 e outra de 2",LocalDateTime.of(2022, 3, 12, 11,54), 12.00, u, m);
        Corrida c2 = new Corrida(2L, "Pix", "Pix Token",LocalDateTime.of(2022, 3, 20, 9,30), 25.00, u, m);

        List<Corrida> corridaList = new ArrayList<>();
        corridaList.add(c1);
        corridaList.add(c2);

        corridaList.sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        System.out.println("--- Lista Corridas ---");
        System.out.println(corridaList);

        System.out.println("\n--- Corridas Dos Motoristas ---");
        m.getCorridas().add(c1);
        m.getCorridas().add(c2);
        m.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        System.out.println(m.getCorridas());

        System.out.println("\n--- Total pagamento Corridas ---");
        System.out.println(NumberFormat.getCurrencyInstance().format(
                m.getCorridas().stream().mapToDouble(Corrida::getPreco).sum()));
    }
}
