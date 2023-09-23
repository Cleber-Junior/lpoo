package Model;

public abstract class Animal {
    protected Double x;
    protected Double y;

    public Animal() {
        super();
    }

    public void mover(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Animal(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public abstract void desenhar();

    @Override
    public String toString() {
        return "Animal{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}