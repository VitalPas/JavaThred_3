package ord.example.homework.third;

import ord.example.homework.third.ex1.*;
import ord.example.homework.third.ex2.Factory;
import ord.example.homework.third.ex2.Iphone;
import ord.example.homework.third.ex2.Samsung;
import ord.example.homework.third.ex3.Pyramid1;
import ord.example.homework.third.ex4.LotteryTicket;
import ord.example.homework.third.ex5.City;
import ord.example.homework.third.ex5.House;

public class Homework3 {
    public static void main(String[] args) {
        //В этом дз уже будет проверятся наличие корректных модификаторов доступа
        //у классов, атрибутов, методов
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
    }

    public static void ex1() {
        //Реализовать в Java следующую схему (в скобках свойства объектов)
        //У нас есть Дерево(возраст)
        //Деревья делятся на:
        //хвойные(имеют тип иголок)
        //лиственные(есть листья на дереве сейчас), умеют опадать (листья пропадают с дерева)
        //умеют цвести (листья появляются)
        //
        //Сосна и Ель являются хвойными.
        //для сосны характерен тип иголок - крупный
        //для ели характерен тип иголок - мелкий
        //
        //Береза является лиственным деревом.
        //Когда Береза цветет, помимо появления листьев, она источает аллергены (печать в консоль)
        //
        //Создать в методе ex1 сосну, березу, ель. Положить в массив.
        //Посчитать их средний возраст.
        Pine pine = new Pine(150);
        Birch birch = new Birch(250, true);
        Spruce spruce = new Spruce(380);
        Tree[] trees = new Tree[] {pine, birch, spruce};
        int averageAge;
        int sumAge = 0;
        for (Tree tree : trees) {
            sumAge += tree.getAge();
        }
        averageAge = sumAge / trees.length;
        System.out.println(averageAge);
        System.out.println("_____________________________");
    }

    public static void ex2() {
        //Задача: Фабрика телефонов
        //Создать 2 типа телефонов и комплектующих к ним.
        //При печати телефона должны показываться все свойства телефона и вложенных объектов.
        //1 тип: Samsung galaxy. Имеет операционную систему Android, плату j-108(размер (ширина Х длина Х высота) 10х12х13),
        //камеру Samsung(20x zoom).
        //2 Тип: Iphone 15. Имеет операционную систему Ios, плату 7uik(размер 15х12х13),
        //камеру iphone(15x zoom, есть вспышка).
        //
        //Создать фабрику, которая заполняет созданный телефон деталями
        //При создании телефона в нем нет комплектующих, как будто пустой пластиковый каркас,
        //но при этом модель телефона уже есть.
        //
        //
        //В фабрике должно быть два публичных метода с одним названием:
        //один будет собирать iphone, второй будет собирать samsung.
        //В данном методе создать два телефона, собрать их, распечатать.
        Factory factory = new Factory();
        Iphone iphone = new Iphone("15");
        Samsung samsung = new Samsung("galaxy");
        factory.createPhone(iphone);
        factory.createPhone(samsung);
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println("_____________________________");
    }

    public static void ex3() {
        //Задача: Пирамида наследования
        //Создать классы Pyramid1, Pyramid2, Pyramid3.
        //НЕОБХОДИМО НАСЛЕДОВАНИЕ С ИСПОЛЬЗОВАНИЕМ РОДИТЕЛЬСКИХ МЕТОДОВ!
        // Создать метод print, который будет выводить следующий текст:
        // M <- из Pyramid1
        // MM <- из Pyramid2
        // MMM <- из Pyramid3

        //Т.е. при вызове pyramid1.print выведется:
        // M
        // MM
        // MMM

        //при вызове pyramid2.print выведется:
        // MM
        // MMM

        //при вызове pyramid3.print выведется:
        // MMM

        //создать здесь pyramid1 и вызвать print
        Pyramid1 pyramid1 = new Pyramid1();
        pyramid1.print();
        System.out.println("_____________________________");
    }

    public static void ex4() {
        //Задача со звездочкой!: Лотерейный билет
        //Создать класс лотерейный билет (у объекта не может быть атрибутов)
        //создать метод проверить удачу (не принимает в себя аргументов!):
        //каждый десятый билет дает 100 руб,
        //каждый сотый - 5_000,
        //иначе 0
        //Если совпало что билет одновременно десятый и сотый выбор в пользу сотого.
        //
        //Создать здесь 110 билетов, и проверить по каждому удачу.
        //Итоговая сумма выигрыша после проверки удачи 110 билетов должна составить 6_000.
        LotteryTicket[] lotteryTickets = new LotteryTicket[110];
        for (int i = 0; i < lotteryTickets.length; i++) {
            lotteryTickets[i] = new LotteryTicket();
            lotteryTickets[i].testLuck();
        }
        System.out.println(LotteryTicket.winnings);
        System.out.println("_____________________________");
    }

    public static void ex5() {
        //Задача со звездочкой: иммутабельность города.
        //Иммутабельность - невозможность поменять свойства объекта и всех его вложенных объектов.
        //
        //Создать класс House (наименование улицы, номер дома) - создать сеттеры! и геттеры на него.
        //Переопределить вывод в текст - вывод улицы и номера дома
        //Создать иммутабельный класс City (наименование города, и массив домов).
        //Переопределить вывод в текст - чтобы выводило имя города, и все дома
        //
        //Создать два дома, создать город с массивом созданных домов
        //При получении домов из массива, и изменении данных (например замена улицы) у дома,
        //у домов внутри city ничего не поменяется. Т.е. при вызове toString, будут старые имена улицы
        House house1 = new House("Lenina", 6);
        House house2 = new House("Pushkina", 6);
        House[] houses = new House[]{house1, house2};
        City city = new City("Moscow", houses);
        System.out.println(city);
        city.getHouses()[0].setStreetName("ssssssssss");
        city.getHouses()[1].setStreetName("dddddddddd");
        city.getHouses()[0].setHouseNumber(33333333);
        city.getHouses()[1].setHouseNumber(22222222);
        System.out.println(city);
    }
}
