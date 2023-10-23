package model;

public class Passaro extends Animal{

    private Double z = 0.0;

    public Passaro() {
        super();
    }

    public Passaro(Double x, Double y, Double z) {
        super(x, y);
        this.z = z;
    }

    public Passaro(Double x, Double y) {
        super(x, y);
    }

    public void mover(Double x, Double y, Double z){
        super.mover(x,y);
        this.z = z;
    }


    @Override
    public void desenhar() {
        System.out.printf("Desenhou Passaro na posição: X = %.1f | Y = %.1f | Z = %.1f \n", x, y, z);
    }

    @Override
    public String toString() {
        return "Passaro{" +
                ", x=" + x +
                ", y=" + y +
                " z=" + z +
                "}\n ";
    }
}
