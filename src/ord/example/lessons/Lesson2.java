package ord.example.lessons;

public class Lesson2 {
    public static void main(String[] args) {
        int money = 40;
        int priceBread = 50;
        int milk = 20;
        boolean condition = false;
        if (false) {
            System.out.println("Покупаю хлеб");
        } else if (milk < money) {
            System.out.println("Покупаю молоко");
        } else {
            System.out.println("Хлеб не покупаю и молоко тоже не покупаю");
        }
        //Операторы числового сравнения
        // > - больше
        // < - меньше
        // >= - больше или равно
        // <= - меньше или равно
        // == - ровно такое же число
        // != - число не равно второму числу

        // && - Логическое "и" - два условия должны быть true, иначе false
        if (milk == 30 && priceBread == 20) {
            System.out.println("Покупаю и хлеб и молоко");
        }

        // || - Логическое или - одно из условий должно быть true -> тогда true, иначе false
        // & и | - побитовые операции
        // число 2 в десятичной системе
        // 10
        // число 3 в десятичной системе
        // 11
        // 2 & 3  - 10
        // 2 | 3 - 11

        //Составление логических цепочек
        int childAge1 = 5;
        int childAge2 = 10;
        int childAge3 = 15;
        // (false)          || (false)          || (false)
        // false || (false)
        // false
        if (childAge1 >= 18 || childAge2 >= 18 || childAge3 >= 18) {
            System.out.println("Открываю шампанское");
        }

        if (true) System.out.println();

        //Логическое "Не" - переворачивает значение
        boolean isGoToSchool = !true;
        System.out.println(isGoToSchool);

        String name = new String("Юрий");
        if (!name.contains("Ю")) {
            System.out.println("Имя не содержит букву Ю");
        }

        String text = null;
        text.toLowerCase();
        System.out.println(text);
        text = "какой то текст";
        System.out.println(text);

    }
}
