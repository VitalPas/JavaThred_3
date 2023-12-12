package ord.example.lessons.lesson6.example4;

public abstract class Alive extends Object {
    protected double weight;

    public Alive(double weight) {
        this.weight = weight;
    }

    public abstract void breath();
}
