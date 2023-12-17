package org.javaacadmey.wonderfield.player;

import org.javaacadmey.wonderfield.Game;

public class Player {
    public static final String WRONG_LETTER_SCANNER = "Некорректное значение, введите 'б' или 'с'";
    public static final String ANSWER_CHECK = "Если хотите букву нажмите 'б' и Enter, "
            + "если хотите слово нажмите 'c' и Enter";
    public static final String EXCEPTION_RUSSIAN_LETTER = "Ошибка! это не русская буква, "
            + "введите русскую букву";
    private String name;
    private String city;
    private PlayerAnswer playerAnswer;

    public Player(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Player{"
                + "name='" + name + '\''
                + ", city='" + city + '\''
                + '}';
    }

    public String sayLetter() {
        String letter;
        System.out.println("\nВведите букву русского алфавита");
        while (true) {
            letter = Game.scanner.nextLine();
            if (!letter.matches("[а-яА-Я]+")) {
                System.out.println(EXCEPTION_RUSSIAN_LETTER);
                continue;
            }
            System.out.println("Игрок " + getName() + ": буква " + "\""
                    + letter.toUpperCase() + "\"");
            return letter.toUpperCase();
        }
    }

    public String sayWord() {
        String word;
        System.out.println("\nСкажите слово:");
        word = Game.scanner.nextLine();
        System.out.println("Игрок " + getName() + ": слово " + "\"" + word.toUpperCase() + "\"");
        return word.toUpperCase();
    }

    public PlayerAnswer move() {
        playerAnswer = new PlayerAnswer();
        System.out.println("Ход игрока " + name + ", " + city);
        System.out.println(ANSWER_CHECK);
        while (true) {
            playerAnswer.setTypeAnswer(Game.scanner.nextLine());
            if (playerAnswer.getTypeAnswer().equals("б")) {
                playerAnswer.setAnswer(sayLetter());
                return playerAnswer;
            } else if (playerAnswer.getTypeAnswer().equals("с")) {
                playerAnswer.setAnswer(sayWord());
                return playerAnswer;
            } else {
                System.out.println(WRONG_LETTER_SCANNER);
            }
        }
    }
}
