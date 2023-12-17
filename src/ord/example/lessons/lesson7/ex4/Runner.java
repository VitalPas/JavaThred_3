package ord.example.lessons.lesson7.ex4;

public class Runner {
    public static void main(String[] args) {
        Boat boat = new Boat();
        IvanDyrak ivanDyrak = new IvanDyrak(60, boat);
        ivanDyrak.swim();
    }
}
