package ord.example.lessons.lesson5;

public class Dog {
    //количество созданных собак (возможно за счет static)
    private static int counter = 0;

    //созданные собаки (возможно за счет static)
    private static Dog[] dogs = new Dog[10];

    //Final - запрещает присваивать новое значение атрибуту
    private final String name;

    //Функция создания собаки (конструктор)
    public Dog(String name) {
        this.name = name;
        //положить созданную собаку в массив dogs
        dogs[counter] = this;
        //увеличиваем счетчик созданных собак
        counter++;
    }

    //Статический метод печати имен собак
    public static void printDogsName() {
        System.out.println("Имена собак");
        for (int i = 0; i < counter; i++) {
            System.out.println(dogs[i].name);
        }
    }

}
