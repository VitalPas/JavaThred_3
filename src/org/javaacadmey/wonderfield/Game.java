package org.javaacadmey.wonderfield;

import java.util.Arrays;
import java.util.Scanner;
import org.javaacadmey.wonderfield.player.Player;
import org.javaacadmey.wonderfield.player.PlayerAnswer;

public class Game {
    public static final int COUNT_PLAYER = 3;
    public static final int COUNT_ALL_ROUND = 4;
    private static final int COUNT_GROUP_ROUND = 3;
    public static final int INDEX_FINAL_ROUND = 3;
    public static Scanner scanner = new Scanner(System.in);
    private Tableau tableau;
    private QuestionAnswer[] questionAnswer;
    private Yakubovich yakubovich;
    private Player[] winners;

    public Game() {
        this.winners = new Player[COUNT_PLAYER];
        this.tableau = new Tableau();
        this.yakubovich = new Yakubovich();
    }

    public Yakubovich getYakubovich() {
        return yakubovich;
    }

    public QuestionAnswer[] getQuestion() {
        return questionAnswer;
    }

    public void init() {
        this.questionAnswer = new QuestionAnswer[COUNT_ALL_ROUND];
        System.out.println("Запуск игры \"Поле Чудес\"");
        for (int i = 0; i < COUNT_ALL_ROUND; i++) {
            questionAnswer[i] = new QuestionAnswer();
            System.out.println("Введите вопрос № " + (i + 1));
            questionAnswer[i].setQuestion(scanner.nextLine());
            System.out.println("Введите ответ на вопрос № " + (i + 1));
            questionAnswer[i].setAnswer(scanner.nextLine().toUpperCase());
        }
        System.out.println("Инизиализация закончена, игра начнется через 5 секунд");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("\n".repeat(50));
    }

    public Player[] createPlayers() {
        Player[] players = new Player[3];
        int numberPlayer = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println("Игрок №" + numberPlayer
                    + " представьтесь: имя,город. Например: Иван,Москва.");
            numberPlayer++;
            String playerSay;
            int comma;
            players[i] = new Player();
            playerSay = scanner.nextLine();
            comma = playerSay.indexOf(",");
            players[i].setName(playerSay.substring(0, comma));
            players[i].setCity(playerSay.substring(comma + 1));
        }
        return players;
    }

    public String[] getPlayerName(Player[] players) {
        String[] names = new String[3];
        for (int i = 0; i < players.length; i++) {
            names[i] = players[i].getName();
        }
        return names;
    }

    public boolean checkTableau(Tableau tableau) {
        return !tableau.containsUnknownLetters();
    }

    public boolean playerMove(QuestionAnswer questionAnswer, Player player) {
        boolean result;
        while (true) {
            PlayerAnswer playerAnswer = player.move();
            if (questionAnswer.getAnswer().contains(playerAnswer.getAnswer())) {
                yakubovich.checkAnswer(playerAnswer, questionAnswer.getAnswer(), tableau);
                if (checkTableau(tableau)) {
                    result = true;
                    break;
                }
            } else {
                yakubovich.checkAnswer(playerAnswer, questionAnswer.getAnswer(), tableau);
                result = false;
                tableau.showTableau();
                break;
            }
        }
        return result;
    }

    public void playRound(Player[] players, Yakubovich yakubovich, int round) {
        Round:
        for (int i = 0; i < players.length; i++) {
            while (playerMove(getQuestion()[round - 1], players[i])) {
                winners[round - 1] = players[i];
                yakubovich.announceWinner(players[i], round);
                break Round;
            }
            if (i == players.length - 1) {
                i = -1;
            }
        }
    }

    public void playGroupRound() {
        for (int i = 1; i < COUNT_ALL_ROUND; i++) {
            Player[] players = createPlayers();
            tableau.initTableau(questionAnswer[i - 1].getAnswer());
            yakubovich.invitePlayers(players, i);
            getYakubovich().askQuestion(getQuestion(), i);
            playRound(players, getYakubovich(), i);
        }
    }

    public void playFinalRound() {
        tableau.initTableau(questionAnswer[INDEX_FINAL_ROUND].getAnswer());
        yakubovich.invitePlayers(winners, COUNT_ALL_ROUND);
        yakubovich.askQuestion(getQuestion(), COUNT_ALL_ROUND);
        Round:
        for (int i = 0; i < winners.length; i++) {
            while (playerMove(getQuestion()[COUNT_ALL_ROUND - 1], winners[i])) {
                yakubovich.announceWinner(winners[i], COUNT_ALL_ROUND);
                break Round;
            }
            if (i == winners.length - 1) {
                i = -1;
            }
        }
    }

    public void start() {
        yakubovich.startShow();
        playGroupRound();
        playFinalRound();
        yakubovich.endShow();
    }

    public void easyInit() {
        this.questionAnswer = new QuestionAnswer[COUNT_ALL_ROUND];
        questionAnswer[0] = new QuestionAnswer();
        questionAnswer[1] = new QuestionAnswer();
        questionAnswer[2] = new QuestionAnswer();
        questionAnswer[3] = new QuestionAnswer();
        questionAnswer[0].setQuestion("Спутник земли?");
        questionAnswer[0].setAnswer("ЛУНА");
        questionAnswer[1].setQuestion("Школа гарри поттера");
        questionAnswer[1].setAnswer("ХОГВАРТС");
        questionAnswer[2].setQuestion("Банк России");
        questionAnswer[2].setAnswer("СБЕРБАНК");
        questionAnswer[3].setQuestion("Чем является сплав железа и углерода");
        questionAnswer[3].setAnswer("СТАЛЬ");
        System.out.println(Arrays.toString(questionAnswer));
        System.out.println(Arrays.toString(questionAnswer));
    }

    public Player[] easyCreatePlayers() {
        Player player = new Player("Виталий", "Новосибирск");
        Player player2 = new Player("Оля", "Москва");
        Player player3 = new Player("Тимур", "Владивосток");
        return new Player[]{player, player2, player3};
    }
}
