package ord.example.lessons.lesson6.example4;

public abstract class Mammal extends Alive {
    public Mammal(double weight) {
        super(weight);
    }

    public final void feed() {
        System.out.println("Кормит малыша");
    }

    public static void run() {
        System.out.println("все бегут");
    }
}
