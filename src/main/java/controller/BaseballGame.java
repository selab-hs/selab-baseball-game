package controller;

import domain.Ball;
import domain.RandomNumberService;
import domain.Strike;
import domain.UserNumberService;
import model.Numbers;
import model.RandomNumber;
import model.UserNumber;
import view.Input;
import view.Output;

public class BaseballGame {
    public static final RandomNumber randomNumber = new RandomNumber();
    public static final RandomNumberService randomNumberService = new RandomNumberService();
    public static final UserNumber userNumber = new UserNumber();
    public static final UserNumberService userNumberService = new UserNumberService();
    public static final Input input = new Input();
    public static final Output output = new Output();
    public static final Ball ball = new Ball();
    public static final Strike strike = new Strike();


    public static int result = Numbers.ZERO;


    public void play() {
        randomNumberService.initNumber();
        output.printCreateMessage();
        while (result == Numbers.ZERO) {
            userNumberService.initUserNumber();
            int countingBall = ball.checkingBall(userNumber.getList(), randomNumber.getList());
            int countingStrike = 0;
            if (countingBall > Numbers.ONE) {
                countingStrike = strike.checkingStrike(userNumber.getList(), randomNumber.getList());
                countingBall -= countingStrike;
                if (countingStrike == Numbers.THREE) {
                    output.printVictoryMessage();
                    result = Numbers.ONE;
                }
            }
            output.printOutputMessage(countingStrike, countingBall);
        }
    }
}
