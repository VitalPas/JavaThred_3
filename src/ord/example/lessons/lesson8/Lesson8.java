package ord.example.lessons.lesson8;

public class Lesson8 {
    public static void main(String[] args) throws Exception {
        Car car = new Car(0);

        car.start();



        System.out.println("пойти гулять в лес");
        System.out.println("___________________________________________");
        System.out.println(converter(""));
    }


    public static String converter(String text) {
        return  text.substring(1);
    }
}
