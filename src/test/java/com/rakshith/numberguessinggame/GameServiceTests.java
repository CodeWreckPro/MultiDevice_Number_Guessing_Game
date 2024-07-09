package com.rakshith.numberguessinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GameServiceTests {

    @Autowired
    private GameService gameService;

    @BeforeEach
    void setUp() {
        gameService.stopGame();
        gameService.addPlayer("Player1");
    }

    @Test
    void testAddPlayer() {
        assertEquals(1, gameService.getScores().size());
    }

    @Test
    void testStartGame() {
        gameService.startGame();
        // Add assertions to check game state
    }

    @Test
    void testSubmitNumber() {
        gameService.startGame();
        gameService.submitNumber("Player1", 42, "A hint for 42");
        // Add assertions to verify number submission
    }

    @Test
    void testSubmitGuess() {
        gameService.startGame();
        gameService.submitGuess("Player1", 42);
        // Add assertions to verify guess submission
    }
}

