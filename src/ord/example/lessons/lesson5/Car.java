package ord.example.lessons.lesson5;

public class Car {
    //Статический атрибут, которое принадлежит классу Car
    //Объекты класса видят данный атрибут
    //public - означает зону возможность использовать это значение из всех классов
    public static String factoryName = "bmw";
    //private - означает зону видимости только в пределах этого класса
    private String model;
    private int yearFounded;
    private int fuel;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    //Getter - получение значения атрибута
    public String getModel() {
        return model;
    }

    //Setter - установка нового значения атрибута
    public void setModel(String model) {
        this.model = model;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void startEngine() {
        //Набор действий до
        printEngineWorks();
    }

    public void startEngine(String text) {
        System.out.println(text);
        printEngineWorks();
    }

    //Приватный метод, для использования в других методах этого класса
    private void printEngineWorks() {
        System.out.println("Двигатель запущен");
        System.out.println("Двигатель успешно работает");
    }

}
