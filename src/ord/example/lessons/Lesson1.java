package ord.example.lessons;

public class Lesson1 {
    public static void main(String[] args) {
        //Булево значение (истина/ложь)
        boolean isGoToShop = true; //1
        boolean isNotGoToShop = false; //0

        //ЦЕЛЫЕ ЧИСЛА
        //bit - кусочек, число от 0 до 1
        //byte - из 8 bit
        //2 4 8 16 32 64 128 256
        //1 1 1 1  1   1  1   1
        //0 - 255
        //-128 - 0 - 127
        byte ipAddressFirst = -128;

        //short - состоит из двух байтов
        //16bit
        //256 * 256
        //0 - 65535
        //-32768 - 0 - 32767
        short shortType = 32767;

        //int - состоит из четырех байт
        //32bit
        //4 294 967 296
        //-2 147 483 648 - 0 - 2 147 483 647
        int countPeopleChina = 2_147_483_647;

        //long - состоит из 8 байт
        //64bit
        long countWorldPeople = 8_000_000_000L;

        //Числа с плавающей точкой
        //float
        //32bit
        float cola = 0.12345678901234F;

        //double
        //64bit
        double atom = 0.12345678901234567890;

        int apple = 5;
        // сложение
        apple = 5 + 1;
        //Вычитание
        apple = 5 - 1;
        //Деление
        apple = 8 / 3;
        //Умножение
        apple = 2 * 2;

        //Остаток от деления
        apple = 33 % 2;
        //33 % 2 = 33 - 32 = 1
        //10 % 3 = 10 - 9 = 1


        //Символ - char
        //16bit
        char symbol = 200;
        char symbol2 = 'л';
        System.out.printf("Печать символа: %s\n", symbol);

        //String (Текст)
        String name = "Юрий"; //02x7762
        String name2 = new String("Юрий"); //02x7762
        //Сравнение строк
        System.out.printf("Сравнение строк через equals: %s\n", name.equals(name2));
        System.out.printf("Сравнение строк через == (по ссылке): %s\n", name.equals(name2));

        //Перевод в верхний регистр
        String nameLower = name.toUpperCase();
        System.out.printf("Перевод в верхний регистр: %s\n", nameLower);


        //Перевод в нижний регистр
        System.out.printf("Перевод в нижний регистр: %s\n", name.toLowerCase());

        //Поиск по строке
        boolean containsRi = name.contains("ри");
        System.out.printf("Содержит строку 'ри': %s\n", containsRi);

        //Повторение строки
        String repeat = name.repeat(10);
        System.out.printf("Повторение строки 10 раз: %s\n", repeat);

        //Обрезка строки (от номера буквы до номера буквы)
        String substring = name.substring(2);
        System.out.printf("Обрезка строки (все символы после 2 символа): %s\n", substring);

        //Получение длины строки (сколько букв)
        int length = name.length();
        System.out.printf("Длина строки: %s\n", length);

        //Обрезка пробелов
        String text = " some text    ";
        System.out.printf("Обрезка пробелов: %s\n", text.trim());
    }
}