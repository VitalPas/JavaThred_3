package ord.example.homework.four.ex3;

public class Builder extends Human {

    @Override
    public void makeSound() {
        System.out.print("Я строитель ");
        super.makeSound();
    }
}
