package controller;

import dto.ResultDto;
import service.context.*;
import view.input.Input;
import view.output.Result;

import java.util.Scanner;

public class BaseballGameController {
    private final EndGame endGame;
    private final OverallGame overallGame;
    private final Result result;
    private final Input input;

    private final Generator generator;

    public BaseballGameController(EndGame endGame, OverallGame overallGame, Result result, Input input, Generator generator) {
        this.endGame = endGame;
        this.overallGame = overallGame;
        this.result = result;
        this.input = input;
        this.generator = generator;
    }

    public void startGame() {
        String randomNumber = generator.generate();

        while (true) {
            String userInput = new Scanner(System.in).nextLine();
            ResultDto resultDto = overallGame.playGame(userInput, randomNumber);
            result.showResult(resultDto);
            endGame.endGame(resultDto);
        }
    }
}