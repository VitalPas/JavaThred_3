package ord.example.lessons.lesson5;


public class Runner {
    public static void main(String[] args) {
        //Использование геттеров и сеттеров
        Car car = new Car();
        car.setModel("bmw i8");
        System.out.println(car.getModel());
        System.out.println("___________________________________________");

        //Вложение объекта внутрь другого объекта (cat внутрь human)
        Cat cat = new Cat();
        Human human = new Human(1992, cat);
        System.out.println(human.getYearOfBirth());
        //Все тот же кот, что и в переменной cat (одна и та же ссылка)
        Cat cat1 = human.getCat();
        System.out.println("___________________________________________");

        //Использование статических переменных и методов для подсчета созданных собак
        //И печати имен собак
        //Создание 5 собак
        Dog dog1 = new Dog("Dog1");
        Dog dog2 = new Dog("Dog2");
        Dog dog3 = new Dog("Dog3");
        Dog dog4 = new Dog("Dog4");
        Dog dog5 = new Dog("Dog5");

        //Вывод количества собак, благодаря статическому методу
        Dog.printDogsName();
    }
}
