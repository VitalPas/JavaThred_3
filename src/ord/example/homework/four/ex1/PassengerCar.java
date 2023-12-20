package ord.example.homework.four.ex1;

public class PassengerCar extends Car {
    private boolean isCruiseControl;

    public PassengerCar(boolean isClear, int length, int width, double height,
                        boolean isCruiseControl) {
        super(isClear, length, width, height);
        this.isCruiseControl = isCruiseControl;
    }

    public boolean isCruiseControl() {
        return isCruiseControl;
    }

    public void setCruiseControl(boolean cruiseControl) {
        isCruiseControl = cruiseControl;
    }
}
