package controller;

import dto.ResultDto;
import service.EndGameService;
import service.GameService;
import view.ResultView;

import java.util.Scanner;

public class BaseballGameController {
    private final GameService gameService = new GameService();
    private final ResultView resultView = new ResultView();
    private final EndGameService endGameService = new EndGameService();

    public void startGame() {
        while (true) {
            String userInput = new Scanner(System.in).nextLine();
            ResultDto resultDto = gameService.playGame(userInput);
            resultView.showResult(resultDto);
            endGameService.endGame(resultDto);
        }
    }
}