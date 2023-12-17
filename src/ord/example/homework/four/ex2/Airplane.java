package ord.example.homework.four.ex2;

public class Airplane implements Flyable {
    private int countPassenger;

    public Airplane(int countPassenger) {
        this.countPassenger = countPassenger;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public void setCountPassenger(int countPassenger) {
        this.countPassenger = countPassenger;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassenger < 0) {
            throw new FlyException("Ошибка: пассажиров в самолете меньше 0");
        }
        System.out.println("Самолет летит");
    }
}
