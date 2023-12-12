package ord.example.lessons.lesson6.example2;

public class Manager extends Employee {
    private int salary;

    public Manager(String name, int age, String companyName, int salary) {
        super(name, age, companyName);
        this.salary = salary;
    }

    @Override
    public void say() {
        System.out.println("Я очень много работаю");
    }

    @Override
    public void live() {
        super.live();
    }

    @Override
    public String toString() {
        return "Manager{"
                + "salary=" + salary
                + ", companyName='" + companyName + '\''
                + ", name='" + name + '\''
                + ", age=" + age
                + '}';
    }
}
