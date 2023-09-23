package Model;

public class Cachorro extends Animal{

    public Cachorro() {
    }

    public Cachorro(Double x, Double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.printf("Desenhou Cachorro na posição: X = %.1f | Y = %.1f\n", x, y);
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "x=" + x +
                ", y=" + y +
                "}\n ";
    }
}
