package ord.example.lessons.lesson7.ex4;

public class Swan implements Swim {
    private String color;
    private boolean hasFeathers;

    public Swan(String color, boolean hasFeathers) {
        this.color = color;
        this.hasFeathers = hasFeathers;
    }

    @Override
    public void swim() {
        System.out.println("Утка плывет");
    }
}
