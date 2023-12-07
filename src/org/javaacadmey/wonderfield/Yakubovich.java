package org.javaacadmey.wonderfield;

import java.util.Arrays;
import org.javaacadmey.wonderfield.player.Player;
import org.javaacadmey.wonderfield.player.PlayerAnswer;

public class Yakubovich {
    public static final String START_SHOW_PHRASE = "Якубович: Здравствуйте, "
            + "уважаемые дамы и господа! Пятница! В эфире капитал-шоу «Поле чудес»!";
    public static final String END_SHOW_PHRASE = "Якубович: Мы прощаемся с вами ровно на одну "
            + "неделю! Здоровья вам, до встречи!";

    public void startShow() {
        System.out.println(START_SHOW_PHRASE);
    }

    public void endShow() {
        System.out.println(END_SHOW_PHRASE);
    }

    public void invitePlayers(Player[] players, int numberRound) {
        String[] namePlayers = new String[3];
        for (int i = 0; i < namePlayers.length; i++) {
            namePlayers[i] = players[i].getName();
        }
        if (numberRound == Game.INDEX_FINAL_ROUND + 1) {
            System.out.println("Якубович: приглашаю победителей групповых этапов:");
            presentationName(namePlayers);
        } else {
            System.out.println("Якубович: приглашаю " + numberRound + " тройку игроков:");
            presentationName(namePlayers);
        }
    }

    private void presentationName(String[] names) {
        System.out.println(Arrays.toString(names).replaceAll("\\[|]", ""));
    }

    public void askQuestion(Game game, int round) {
        System.out.println("Якубович: Внимание вопрос!");
        System.out.println(game.getQuestion()[round - 1]);
    }

    public void announceWinner(Player player, int finalRound) {
        if (finalRound == Game.INDEX_FINAL_ROUND) {
            System.out.println("Якубович: И перед нами победитель Капитал шоу поле чудес! Это "
                    + player.getName() + " из " + player.getCity());
        } else {
            System.out.println("Якубович: Молодец! " + player.getName() + " из "
                    + player.getCity() + "проходит в финал!");
        }
    }

    public void checkAnswer(PlayerAnswer playerAnswer, String correctAnswer, Tableau tableau) {
        if (playerAnswer.getTypeAnswer().equals("б")) {
            if (correctAnswer.contains(playerAnswer.getAnswer())) {
                System.out.println("Якубович: Есть такая буква, откройте ее!");
                tableau.openLetter(playerAnswer.getAnswer());
                tableau.showTableau();
            } else {
                System.out.println("Якубович: Нет такой буквы! Следующий игрок, крутите барабан!");
                System.out.println("__________________________________");
            }
        } else {
            if (correctAnswer.equals(playerAnswer.getAnswer())) {
                System.out.println("Якубович: " + playerAnswer.getAnswer() + "! "
                        + "Абсолютно верно!");
                tableau.openWord();
                tableau.showTableau();
            } else {
                System.out.println("Якубович: Неверно! Следующий игрок!");
                System.out.println("__________________________________");
            }
        }
    }
}
