package com.rakshith.numberguessinggame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTests {

    @Test
    void testPlayerCreation() {
        Player player = new Player("Player1");
        assertEquals("Player1", player.getName());
        assertEquals(0, player.getScore());
    }

    @Test
    void testIncrementScore() {
        Player player = new Player("Player1");
        player.incrementScore();
        assertEquals(1, player.getScore());
    }
}
