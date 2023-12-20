package ord.example.homework.four.ex1;

public class CarWash {

    public static int clearCar(Car car) {
        int price = 0;
        if (!car.getIsClear()) {
            price = wash(car);
            car.setClear(true);
        }
        return price;
    }

    public static int clearCars(Car[] cars) {
        int price = 0;
        for (Car car : cars) {
            if (!car.getIsClear()) {
                price += wash(car);
                car.setClear(true);
            }
        }
        return price;
    }

    private static boolean expensiveRate(Car car) {
        return (car.getLength() > 6 || car.getWidth() > 2 || car.getHeight() > 2.5);
    }

    private static int wash(Car car) {
        int price = 0;
        if (expensiveRate(car)) {
            price += 4000;
        } else {
            price += 2000;
        }
        return price;
    }
}



