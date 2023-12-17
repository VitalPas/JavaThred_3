package ord.example.lessons.lesson7.ex1;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.breath();
        dog.breath();
        Alive[] alives = {cat, dog};
        for (Alive alive : alives) {
            alive.breath();
        }

    }
}
