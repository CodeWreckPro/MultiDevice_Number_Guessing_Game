package com.rakshith.numberguessinggame;

public class Game {
    private boolean started;
    private int currentRound;
    private int currentPlayerIndex;
    private final List<Player> players;

    public Game(List<Player> players) {
        this.players = players;
        this.started = false;
        this.currentRound = 0;
        this.currentPlayerIndex = 0;
    }

    public void start() {
        this.started = true;
        this.currentRound = 1;
    }

    public void stop() {
        this.started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public int getCurrentRound() {
        return currentRound;
    }

    public int getCurrentPlayerIndex() {
        return currentPlayerIndex;
    }

    public void nextPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        if (currentPlayerIndex == 0) {
            currentRound++;
        }
    }
}

