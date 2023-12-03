package org.javaacadmey.wonder_field;

import org.javaacadmey.wonder_field.player.Player;
import org.javaacadmey.wonder_field.player.PlayerAnswer;

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
        Player player2 = new Player("Виталий", "Уфа");
        Player player3 = new Player("Оля", "Москва");

        player.move();
        Player[] players = new Player[]{player, player2, player3};

        Yakubovich.invitePlayers(players, 3);
    }
}
