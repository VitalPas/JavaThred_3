package ord.example.lessons.lesson7.ex3;

public class Runner {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Flyable bird = new Bird();
        airplane.fly();
        bird.fly();
        Flyable[] flyables = {airplane, bird};
        for (Flyable flyable : flyables) {
            flyable.fly();
            flyable.fall(200);
        }
        System.out.println("___________________________________________");

        Mechanics somethings = new Mechanics() {
            public void repair() {
                System.out.println("чиним что то");
            }
        };

        somethings.repair();
    }
}
