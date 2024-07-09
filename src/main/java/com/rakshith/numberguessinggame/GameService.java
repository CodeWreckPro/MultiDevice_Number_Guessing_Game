package com.rakshith.numberguessinggame;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Service
public class GameService {
    private final List<Player> players = new ArrayList<>();
    private final ConcurrentMap<String, Integer> scores = new ConcurrentHashMap<>();
    private boolean gameStarted = false;

    public void startGame() {
        gameStarted = true;
        // Initialize game state
    }

    public void stopGame() {
        gameStarted = false;
        // Clean up game state
    }

    public void addPlayer(String playerName) {
        if (gameStarted) return;
        players.add(new Player(playerName));
        scores.put(playerName, 0);
    }

    public void submitNumber(String playerName, int number, String prompt) {
        if (!gameStarted) return;
        // Handle number submission
    }

    public void submitGuess(String playerName, int guess) {
        if (!gameStarted) return;
        // Handle guess submission
    }

    public List<Player> getScores() {
        return players;
    }
}

