package org.javaacadmey.wonder_field;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static final int COUNT_PLAYER = 3;
    public static final int COUNT_ALL_ROUND = 4;
    private static final int COUNT_GROUP_ROUND = 3;
    public static final int INDEX_FINAL_ROUND = 3;
    public static Scanner scanner = new Scanner(System.in);
    static Tableau tableau;
    public String[] question;
    public String[] answer;
    static Yakubovich yakubovich;

    public Game(String[] question, String[] answer) {
        this.question = question;
        this.answer = answer;
    }

    public static Game init() throws InterruptedException {
        yakubovich = new Yakubovich();

        String[] question = new String[COUNT_ALL_ROUND];
        String[] answer = new String[COUNT_ALL_ROUND];

        System.out.println("Запуск игры \"Поле Чудес\"");
        for (int i = 0; i < COUNT_ALL_ROUND; i++) {
            System.out.println("Введите вопрос № " + (i + 1));
            question[i] = scanner.nextLine();
            System.out.println("Введите ответ на вопрос № " + (i + 1));
            answer[i] = scanner.nextLine().toUpperCase();
        }
//        question[0] = "Спутник земли?";
//        answer[0] = "ЛУНА";
//        question[1] = "Школа гарри поттера";
//        answer[1] = "ХОГВАРТС";
//        question[2] = "Банк России";
//        answer[2] = "СБЕРБАНК";
//        question[3] = "Чем является сплав железа и углерода";
//        answer[3] = "СТАЛЬ";
        System.out.println("Инизиализация закончена, игра начнется через 5 секунд");
        Thread.sleep(5);
        System.out.print("\n".repeat(50));
        System.out.println(Arrays.toString(question));
        System.out.println(Arrays.toString(answer));

        return new Game(question, answer);
    }
}
