package org.javaacadmey.wonder_field;

import org.javaacadmey.wonder_field.player.Player;
import org.javaacadmey.wonder_field.player.PlayerAnswer;

import java.util.Arrays;

public class Yakubovich {
    public static void startShow() {
        System.out.println("Якубович: Здравствуйте, уважаемые дамы и господа! Пятница! В эфире капитал-шоу «Поле чудес»!");
    }

    public static void endShow() {
        System.out.println("Якубович: Мы прощаемся с вами ровно на одну неделю! Здоровья вам, до встречи!");
    }

    public static void invitePlayers(Player[] players, int numberRound) {
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

    private static void presentationName(String[] names) {
        System.out.println(Arrays.toString(names).replaceAll("\\[|]", ""));
    }

    public static void askQuestion(Game game, int round) {
        System.out.println("Якубович: Внимание вопрос!");
        System.out.println(game.question[round - 1]);
    }

    public static void announceWinner(Player player, int finalRound) {
        if (finalRound == Game.INDEX_FINAL_ROUND) {
            System.out.println("Якубович: И перед нами победитель Капитал шоу поле чудес! Это " +
                    player.getName() + " из " + player.getCity());
        } else {
            System.out.println("Якубович: Молодец! " + player.getName() + " из "
                    + player.getCity() + "проходит в финал!");
        }
    }

    public static void checkAnswer(String playerAnswer, String answer, Tableau tableau) {

    }
}
