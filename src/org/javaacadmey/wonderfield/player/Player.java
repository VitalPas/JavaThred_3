package org.javaacadmey.wonderfield.player;

import org.javaacadmey.wonderfield.Game;

public class Player {
    private String name;
    private String city;
    public PlayerAnswer playerAnswer;

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

    public Player(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String sayLetter() {
        String letter;
        System.out.println("\nВведите букву русского алфавита");
        while (true) {
            letter = Game.scanner.nextLine();
            if (!letter.matches("[а-яА-Я]+")) {
                System.out.println("Ошибка! Это не русскакя буква, введите русскую букву");
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
        System.out.println("Если хотите букву нажмите \"б\" и Enter, +"
                + "если хотите слово нажмите \"с\" и Enter");
        while (true) {
            playerAnswer.setTypeAnswer(Game.scanner.nextLine());
            if (playerAnswer.getTypeAnswer().equals("б")) {
                playerAnswer.setAnswer(sayLetter());
                return playerAnswer;
            } else if (playerAnswer.getTypeAnswer().equals("с")) {
                playerAnswer.setAnswer(sayWord());
                return playerAnswer;
            } else {
                System.out.println("Некорректное значение, введите 'б' или 'с'");
            }
        }
    }
}
