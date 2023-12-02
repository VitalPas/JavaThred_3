package ord.example.lessons.lesson4;

public class Human {
    //Атрибут, свойство, поле
    String name;
    int yearOfBirth;

    //Конструктор
    public Human(String name, int yearOfBirth) {
        if (name != null && !name.equals("Yuri")) {
            this.name = name;
        }
        this.yearOfBirth = yearOfBirth;
        System.out.println("Человек родился");
    }

    public Human(String name, String yearOfBirth) {
        this.name = name;
        this.yearOfBirth = Integer.valueOf(yearOfBirth);
    }

    public void handsUp() {
        System.out.println(this.name + " поднимает руки");
    }

    public String getInfo() {
        return "Имя человека: " + this.name + " ,год рождения: " + this.yearOfBirth;
    }

    public void sum(int number1, int number2) {
        System.out.println(this.name + " считает сумму: " + (number1 + number2));
    }

    //Перегрузка метода (overload)
    public void sum(int number1, int number2, int number3) {
        System.out.println(this.name + " считает сумму: " + (number1 + number2 + number3));
    }

    public void sum(String number1, String number2) {
        int number1Int = Integer.valueOf(number1);
        int number2Int = Integer.valueOf(number2);


        sum(number1Int, number2Int);
    }

    public void calc(String... elements) {
        System.out.println(elements);
    }

    public int concat(int number1, int number2) {
        //number1 = 1
        //number2 = 1
        //result = 11;
        String result = number1 + " " + number2;
        return Integer.valueOf(result);
    }

    public String concat(String number1, String number2) {
        return number1 + number2;
    }

}
