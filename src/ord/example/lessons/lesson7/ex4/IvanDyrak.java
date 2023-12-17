package ord.example.lessons.lesson7.ex4;

public class IvanDyrak implements Swim {
    private int weight;
    private Boat boat;

    public IvanDyrak(int weight, Boat boat) {
        this.weight = weight;
        this.boat = boat;
    }

    @Override
    public void swim() {
        boat.swim();
    }
}
