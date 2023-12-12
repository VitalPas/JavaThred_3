package ord.example.lessons.lesson6.example2;

public class Employee extends Human {
    protected String companyName;

    public Employee(String name, int age, String companyName) {
        super(name, age);
        this.companyName = companyName;
    }

    @Override
    public void say() {
        System.out.println("Я работаю");
    }
}
