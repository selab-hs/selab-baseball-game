package controller;

import service.Computer;
import model.Judgement;
import service.Input;
import service.Referee;
import view.ResultWindow;

import java.util.Scanner;

public class BaseballGame {
    private boolean isGameGoingOn = true;

    public void startGame() {
        String computerNumber = new Computer().getNonDuplicateNumber();

        while (isGameGoingOn) {
            isPlayerWin(computerNumber);
        }
    }

    private void isPlayerWin(String computerNumber) {
        String playerNumber = new Scanner(System.in).nextLine();

        Judgement judgement = new Referee().notifyTheResult(playerNumber, computerNumber);

        new ResultWindow().showResult(judgement);
        this.isGameGoingOn = !(judgement.getStrike() == 3);
    }
}
