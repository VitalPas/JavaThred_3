package ord.example.lessons.lesson6.example4;

public final class Gorilla extends Mammal {
    private boolean isMale;

    public Gorilla(double weight, boolean isMale) {
        super(weight);
        this.isMale = isMale;
    }

    public void breath() {
        System.out.println("Горилла дышит ноздрями");
    }


}
