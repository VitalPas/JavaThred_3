package ord.example.lessons.lesson4;

/**
 * Класс - описывает свойства и действия объекта.
 * Для каждого объекта значения свойств и результат действий могут быть разными.
 */
public class Human {
    //Атрибут (синонимы: свойство, поле)
    String name;
    int yearOfBirth;

    //Конструктор (Создание и инициализация объекта)
    public Human(String name, int yearOfBirth) {
        if (name != null && !name.equals("Yuri")) {
            this.name = name;
        }
        this.yearOfBirth = yearOfBirth;
        System.out.println("Человек родился");
    }

    //Перегрузка конструктора
    public Human(String name, String yearOfBirth) {
        this.name = name;
        this.yearOfBirth = Integer.valueOf(yearOfBirth);
    }

    //Метод - действие объекта с результатом зависящим от значений свойств объекта
    public void handsUp() {
        System.out.println(this.name + " поднимает руки");
    }

    //Действие с

    //Метод с возвратом результата
    public String getInfo() {
        return "Имя человека: " + this.name + " ,год рождения: " + this.yearOfBirth;
    }

    //Перегрузка метода (создание метода с таким же названием,
    //но другим количеством и(или) типов аргумента)
    public void sum(int number1, int number2) {
        System.out.println(this.name + " считает сумму: " + (number1 + number2));
    }

    //Перегрузка метода sum (overload)
    public void sum(int number1, int number2, int number3) {
        System.out.println(this.name + " считает сумму: " + (number1 + number2 + number3));
    }

    //Перегрузка метода sum (overload)
    public void sum(String number1, String number2) {
        int number1Int = Integer.valueOf(number1);
        int number2Int = Integer.valueOf(number2);

        sum(number1Int, number2Int);
    }

    //String... - неизвестное количество аргументов данного типа (преобразуется в массив)
    //Может быть только последним в списке аргументов
    public void calc(String... elements) {
        System.out.println(elements);
    }

    public int concat(int number1, int number2) {
        //number1 = 1
        //number2 = 1
        //result = 11;
        String result = number1 + " " + number2;
        //Integer - класс обертка над примитивом int
        return Integer.valueOf(result);
    }

    public String concat(String number1, String number2) {
        return number1 + number2;
    }
}
