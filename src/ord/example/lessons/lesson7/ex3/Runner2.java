package ord.example.lessons.lesson7.ex3;

public class Runner2 {
    public static void main(String[] args) {
        Mechanics mechanics = new Mechanics() {
            @Override
            public void repair() {
                System.out.println("Это объект 1");
            }
        };
        Mechanics mechanics2 = new Mechanics() {
            @Override
            public void repair() {
                System.out.println("Это объект 2");
            }
        };
        Mechanics mechanics3 = new Mechanics() {
            @Override
            public void repair() {
                System.out.println("hhh");
            }
        };

        mechanics.repair();
        mechanics2.repair();
        mechanics3.repair();

        System.out.println(mechanics.getClass().getName());

        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("что то летит");
            }

        };

        flyable.fly();

    }
}
