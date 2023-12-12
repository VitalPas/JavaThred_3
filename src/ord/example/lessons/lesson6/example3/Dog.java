package ord.example.lessons.lesson6.example3;

public class Dog extends Animal {
    private String name;
    private String ownerName;

    public Dog(int age, String name, String ownerName) {
        super(age);
        this.name = name;
        this.ownerName = ownerName;
    }
}
