package com.rakshith.numberguessinggame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping("/start")
    public void startGame() {
        gameService.startGame();
    }

    @PostMapping("/stop")
    public void stopGame() {
        gameService.stopGame();
    }

    @PostMapping("/join")
    public void joinGame(@RequestParam String playerName) {
        gameService.addPlayer(playerName);
    }

    @PostMapping("/submit")
    public void submitNumber(@RequestParam String playerName, @RequestParam int number, @RequestParam String prompt) {
        gameService.submitNumber(playerName, number, prompt);
    }

    @PostMapping("/guess")
    public void submitGuess(@RequestParam String playerName, @RequestParam int guess) {
        gameService.submitGuess(playerName, guess);
    }

    @GetMapping("/score")
    public List<Player> getScores() {
        return gameService.getScores();
    }
}

