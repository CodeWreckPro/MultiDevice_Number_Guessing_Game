package com.rakshith.numberguessinggame;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GameTests {

    @Test
    void testGameInitialization() {
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        Game game = new Game(Arrays.asList(player1, player2));

        assertFalse(game.isStarted());
        assertEquals(1, game.getCurrentRound());
        assertEquals(0, game.getCurrentPlayerIndex());
    }

    @Test
    void testStartGame() {
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        Game game = new Game(Arrays.asList(player1, player2));
        game.start();

        assertTrue(game.isStarted());
    }

    @Test
    void testNextPlayer() {
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        Game game = new Game(Arrays.asList(player1, player2));
        game.start();

        game.nextPlayer();
        assertEquals(1, game.getCurrentPlayerIndex());
        game.nextPlayer();
        assertEquals(0, game.getCurrentPlayerIndex());
        assertEquals(2, game.getCurrentRound());
    }
}
