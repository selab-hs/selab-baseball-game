package controller;

import service.Computer;
import model.Judgement;
import service.Referee;
import view.ResultWindow;

import java.util.Scanner;

public class BaseballGame {
    public void startGame() {
        String computerNumber = new Computer().getNonDuplicateNumber();
        boolean playerWin = false;

        while (! playerWin){
            playerWin = isPlayerWin(computerNumber);
        }
    }

    private boolean isPlayerWin(String computerNumber) {
        String playerNumber = new Scanner(System.in).nextLine();

        Judgement judgement = new Referee().notifyTheResult(playerNumber, computerNumber);

        new ResultWindow().showResult(judgement);
        return judgement.getStrike() == 3;
    }
}
