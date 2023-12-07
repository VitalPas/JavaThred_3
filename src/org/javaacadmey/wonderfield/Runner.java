package org.javaacadmey.wonderfield;

import org.javaacadmey.wonderfield.player.Player;

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

        Player player = new Player("Тимур", "Новосибирск");
        Player player2 = new Player("Тимур", "Новосибирск");
        Player player3 = new Player("Тимур", "Новосибирск");

        player.move();
        System.out.println(player.playerAnswer);
        game.yakubovich.startShow();

        game.yakubovich.askQuestion(game, 1);
        game.yakubovich.checkAnswer(player.playerAnswer,
                game.getAnswer()[0], game.tableau);

    }
}
