package ord.example.lessons.lesson5;

public class Cat {
    //private - означает зону видимости только в пределах этого класса
    private String name;

    public Cat() {
    }

    //Setter - установка нового значения атрибута
    public void setName(String name) {
        this.name = name;
    }

    //Getter - получение значения атрибута
    public String getName() {
        return name;
    }
}
