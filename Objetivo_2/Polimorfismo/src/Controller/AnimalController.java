package Controller;

import Model.Animal;
import Model.Cachorro;
import Model.Passaro;
import Model.Peixe;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public static void main(String[] args) {

        Cachorro ca1 = new Cachorro(5.0, 2.0);
        Cachorro ca2 = new Cachorro(1.0, 5.0);
        Cachorro ca3 = new Cachorro(3.0, 3.0);

        Peixe pe1 = new Peixe(1.0, 2.0, 3.0);
        Peixe pe2 = new Peixe(2.0, 5.0, 5.0);
        Peixe pe3 = new Peixe(4.0, 6.0, 4.0);

        Passaro pa1 = new Passaro(2.0, 1.0, 2.0);
        Passaro pa2 = new Passaro(7.0, 3.0, 6.0);
        Passaro pa3 = new Passaro(1.0, 4.0, 3.0);

        List<Animal> Animals = new ArrayList<>();

        Animals.add(ca1);
        Animals.add(ca2);
        Animals.add(ca3);
        Animals.add(pe1);
        Animals.add(pe2);
        Animals.add(pe3);
        Animals.add(pa1);
        Animals.add(pa2);
        Animals.add(pa3);

        System.out.println("------- Exercicio 1 -------\n");
        System.out.println("------- Exercicio 1.A");
        System.out.println(Animals);

        System.out.println("------- Exercicio 1.B");

        for (Animal a: Animals) {
            a.mover(2.0, 2.0);
            a.desenhar();
        }
        System.out.println(Animals);

        System.out.println("------- Exercicio 1.C");
        for (Animal a: Animals) {
            if (a instanceof Cachorro){
                a.mover(8.0, 8.0);
                a.desenhar();
            }
        }

        System.out.println("\n------- Exercicio 1.D");
        for (Animal a: Animals) {
            if (a instanceof Peixe){
                ((Peixe) a).mover(5.0, 5.0, 5.0);
                a.desenhar();
            }
            if (a instanceof Passaro){
                ((Passaro) a).mover(5.0, 5.0, 5.0);
                a.desenhar();
            }
        }
        System.out.println(Animals);
    }
}
