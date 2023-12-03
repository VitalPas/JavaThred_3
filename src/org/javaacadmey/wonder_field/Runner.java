package org.javaacadmey.wonder_field;

import org.javaacadmey.wonder_field.player.Player;

public class Runner {

    public static void main(String[] args) throws Exception {

        Game game = Game.init();

        Tableau.initTableau(game.answer[0]);

        Tableau.showTableau();

        Tableau.openLetter("л");

        Tableau.showTableau();

        Tableau.openWord();

        Tableau.showTableau();

        Player player = new Player("Тимур", "Новосибирск");

        player.move();
    }
}
