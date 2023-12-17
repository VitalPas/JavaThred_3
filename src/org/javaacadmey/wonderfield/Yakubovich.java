package org.javaacadmey.wonderfield;

import java.util.Arrays;
import org.javaacadmey.wonderfield.player.Player;
import org.javaacadmey.wonderfield.player.PlayerAnswer;

public class Yakubovich {
    public static final String START_SHOW_PHRASE = "Якубович: Здравствуйте, "
            + "уважаемые дамы и господа! Пятница! В эфире капитал-шоу «Поле чудес»!";
    public static final String END_SHOW_PHRASE = "Якубович: Мы прощаемся с вами ровно на одну "
            + "неделю! Здоровья вам, до встречи!";
    public static final String SPACE = "__________________________________";
    public static final String WRONG_LETTER = "Якубович: Нет такой буквы! "
            + "Следующий игрок, крутите барабан!";
    public static final String WRONG_WORD = "Якубович: Неверно! Следующий игрок!";

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

    public void askQuestion(QuestionAnswer[] questionAnswer, int round) {
        System.out.println("Якубович: Внимание вопрос!");
        System.out.println(questionAnswer[round - 1].getQuestion());
    }

    public void announceWinner(Player player, int round) {
        if (round == Game.INDEX_FINAL_ROUND + 1) {
            System.out.printf("Якубович: И перед нами победитель Капитал шоу поле чудес! "
                    + "Это %s из %s\n", player.getName(), player.getCity());

        } else {
            System.out.printf("Якубович: Молодец! %s из %s проходит в финал!\n",
                    player.getName(), player.getCity());
            System.out.println(SPACE);
        }
    }

    public void checkAnswer(PlayerAnswer playerAnswer, String correctAnswer, Tableau tableau) {
        if (playerAnswer.getTypeAnswer().equals("б")) {
            checkLetter(correctAnswer, playerAnswer, tableau);
        } else {
            checkWord(correctAnswer, playerAnswer, tableau);
        }
    }

    private void print(String text) {
        System.out.println(text);
        System.out.println(SPACE);
    }

    private void checkLetter(String correctAnswer, PlayerAnswer playerAnswer, Tableau tableau) {
        if (correctAnswer.contains(playerAnswer.getAnswer())) {
            System.out.println("Якубович: Есть такая буква, откройте ее!");
            tableau.openLetter(playerAnswer.getAnswer());
            tableau.showTableau();
        } else {
            print(WRONG_LETTER);
        }
    }

    private void checkWord(String correctAnswer, PlayerAnswer playerAnswer, Tableau tableau) {
        if (correctAnswer.equals(playerAnswer.getAnswer())) {
            System.out.println("Якубович: " + playerAnswer.getAnswer() + "! "
                    + "Абсолютно верно!");
            tableau.openWord();
            tableau.showTableau();
        } else {
            print(WRONG_WORD);
        }
    }
}
