package ord.example.homework.four.ex3;

public class Builder extends Human {

    @Override
    public String makeSound() {
        return "Я строитель " + super.makeSound();
    }
}
