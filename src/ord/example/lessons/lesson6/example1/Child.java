package ord.example.lessons.lesson6.example1;

public class Child extends Father {
    private String toyName;

    public Child(String name, String secondName, String toyName) {
        super(name, secondName);
        this.toyName = toyName;
    }


    public void run() {
        System.out.println("Ребенок бежит");
    }

    public void watchSoccer(String phrase) {
        super.watchSoccer();
        System.out.println("еще и кричит!");
    }

}
