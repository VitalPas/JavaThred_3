package ord.example.lessons;

import java.util.Arrays;

public class Lesson3 {

    public static void main(String[] args) {
        //примитив
        int number = 0;
        //Ссылочный тип данных
        String text = null;

        //Список возрастов для массива
        int age1 = 18;
        int age2 = 20;
        int age3 = 25;

        //Создание массива с размерностью 3
        System.out.println("Создание массива");
        int[] numbers = new int[3];
        //Значение по умолчанию
        //Примитивы
        //int, byte, long, short - 0
        //boolean - false
        //char - 0
        //double,float - 0.00
        //Ссылочные типы
        //null

        //Запись конкретного элемента в массив
        numbers[0] = age1;
        numbers[1] = age2;
        numbers[2] = age3;
        //Вывод всех элементов массивов
        System.out.printf("Список возрастов: %s", Arrays.toString(numbers));
        System.out.println("___________________________________________");

        //В случае обращения к индексу массива находящимся вне его размерности
        //возникает ошибка
        //System.out.println(numbers[5]);

        //Вывод длинны массива
        System.out.println("Длина массива");
        System.out.println("Длина массива: " + numbers.length);
        System.out.println("___________________________________________");

        System.out.println("Короткий способ объявления массива");
        //Короткий способ объявления массива
        char[] water = {'в', 'о', 'д', 'а'};
        System.out.println(Arrays.toString(water));
        System.out.println("___________________________________________");

        System.out.println("For each");
        //Конструкция for each - перебор всех элементов массива
        //Вывод каждого элемента
        int[] ints = {1, 2, 5, 10};
        for (int element : ints) {
            System.out.println(element);
        }
        System.out.println("___________________________________________");

        //Создание массива внутри которого массивы
        int[][] arrayOfArrays = new int[4][4];
        arrayOfArrays[0] = new int[] {1, 2, 3, 4};
        arrayOfArrays[1] = new int[] {1, 2, 3, 4};
        arrayOfArrays[2] = new int[] {1, 2, 3, 4};
        arrayOfArrays[3] = new int[] {1, 2, 3, 4};
        System.out.println("Массив массивов:" + Arrays.toString(arrayOfArrays));
        System.out.println("___________________________________________");

        //Вывод каждого массива из списка массивов
        for (int[] array : arrayOfArrays) {
            System.out.println(Arrays.toString(array));
        }
        System.out.println("___________________________________________");

        System.out.println("For i");
        //Конструкция fori - перебор значений i при выполнении условия.
        //необходима когда нам нужен индекс элемента.
        //Выбор четных элементов
        int[] numbers2 = {12, 20, 30, 40};
        for (int i = 0; i < numbers2.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Элемент: " + numbers2[i]);
                System.out.println("Индекс: " + i);
            }
        }
        System.out.println("_________________________________");

        System.out.println("Перестановка значений");
        //Перестановка значений элементов местами
        int[] num1 = {2, 5, 7}; //001122 - ссылка в области памяти
        int[] num2 = {3, 6, 9}; //001123
        int[] temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1: " + Arrays.toString(num1));
        System.out.println("num2: " + Arrays.toString(num2));
        System.out.println("___________________________________________");

        System.out.println("While");
        //Конструкция while - до тех пор, пока выполняется условие в скобках
        int number3 = 4;
        while (true) {
            if (number3 % 2 == 0) {
                System.out.println(number3);
            }
            if (number3 == 0) {
                //Заканчивает цикл
                break;
            }
            number3--;
        }
        System.out.println("___________________________________________");

        System.out.println("Continue");
        int a = 0;
        while (a < 10) {
            a++;
            if (a % 2 == 0) {
                //Начинает новую итерацию (перевод на 109 строку)
                continue;
            }
            System.out.println("Печать нечетного числа:" + a);
        }
        System.out.println("___________________________________________");

        System.out.println("Do while");
        //Конструкция do while - сначала действие, потом проверка условия.
        //Если условие true то снова делаем действие
        int price = 100;
        //не запустится while
        while (price > 1000) {
            System.out.println("Цена:" + price);
        }

        //Запустится do один раз
        do {
            System.out.println("Цена:" + price);
        } while (price > 1000);

        System.out.println("___________________________________________");

        System.out.println("Прерывание верхнеуровнего цикла");
        int[][] arrayOfArrays2 = new int[4][4];
        arrayOfArrays2[0] = new int[] {1, 2, 3, 4};
        arrayOfArrays2[1] = new int[] {1, 2, 3, 4};
        arrayOfArrays2[2] = new int[] {1, 2, 10, 4};
        arrayOfArrays2[3] = new int[] {1, 2, 3, 4};

        //[[1,2,3,4], [1,2,3,4], [1,2,10,4], [1,2,3,4]]

        //Метка (label)
        array1:
        for (int[] array : arrayOfArrays2) {
            for (int element : array) {
                if (element == 10) {
                    System.out.println("Десятка найдена, ура!");
                    break array1;
                }
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("___________________________________________");
    }
}
