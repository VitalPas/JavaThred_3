package ord.example.lessons.lesson6.example1;

public class Father {
    protected String name;
    protected String secondName;
    private int age;

    public Father(String name) {
        this.name = name;
    }

    public Father(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public void run() {
        System.out.println("Отец бежит");
    }

    public void watchSoccer() {
        System.out.println("Смотрит футбол");
    }

    public String getName() {
        return name;
    }
}
