package org.javaacadmey.wonderfield;

import org.javaacadmey.wonderfield.player.Player;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) throws Exception {

        Game game = new Game();
        //game.init();
        game.easyStart();



        game.tableau.initTableau(game.getAnswer()[0]);

        game.tableau.showTableau();

        //game.tableau.openLetter("л");

        game.tableau.showTableau();

        //game.tableau.openWord();

        game.tableau.showTableau();

        Player[] players = game.createPlayers();

        System.out.println(Arrays.toString(players));
//        player.move();
//        System.out.println(player.playerAnswer);
//        game.yakubovich.startShow();
//
//        game.yakubovich.askQuestion(game, 1);
//        game.yakubovich.checkAnswer(player.playerAnswer,
//                game.getAnswer()[0], game.tableau);

    }
}