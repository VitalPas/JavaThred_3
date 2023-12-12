package ord.example.lessons.lesson5;

public class Human {
    //Константа - атрибут static final, особый стиль написания
    public static final String APPEAL_TO_HUMAN = "mr.";
    private String name;
    private String appeal;
    private final int yearOfBirth;

    //Final для атрибута cat НЕ ЗАПРЕЩАЕТ менять значения внутри присвоенного кота
    //Он ЗАПРЕЩАЕТ присваивать нового кота
    private final Cat cat;

    //Статическая инициализация
    static {
        System.out.println("Привет мир!");
    }

    public Human(int yearOfBirth, Cat cat) {
        this.yearOfBirth = yearOfBirth;
        this.cat = cat;
        this.appeal = APPEAL_TO_HUMAN;
    }

    public String getName() {
        return APPEAL_TO_HUMAN + name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public Cat getCat() {
        return cat;
    }
}
