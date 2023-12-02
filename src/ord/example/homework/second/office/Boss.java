package ord.example.homework.second.office;

public class Boss {
    String name;

    public Boss(String name) {
        this.name = name;
    }

    public void hurryManager(Manager manager) {
        System.out.println(manager.name + " быстрее!");
    }
}
