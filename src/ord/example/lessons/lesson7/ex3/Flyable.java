package ord.example.lessons.lesson7.ex3;

public interface Flyable {
    int NULL_SPEED = 0;

    void fly();

    default void fall(int speedFall) {
        if (speedFall > 500) {
            printSmallFall();
        } else {
            System.out.println("объект падает");
        }
    }

    private void printSmallFall() {
        System.out.println("Объект очень быстро падает");
    }
}
