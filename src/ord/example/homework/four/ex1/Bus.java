package ord.example.homework.four.ex1;

public class Bus extends Car {
    private int maxCountPassenger;

    public Bus(boolean isClear, int length, int width, double height, int maxCountPassenger) {
        super(isClear, length, width, height);
        this.maxCountPassenger = maxCountPassenger;
    }

    public int getMaxCountPassenger() {
        return maxCountPassenger;
    }

    public void setMaxCountPassenger(int maxCountPassenger) {
        this.maxCountPassenger = maxCountPassenger;
    }
}
