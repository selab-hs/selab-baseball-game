package baseball.run;

import baseball.output.Output;
import baseball.random.RandomNumber;

public class RunGame {
    private RandomNumber randomNum;
    private final Output output = new Output();

    public RunGame() {
        generateRandomNum();
    }

    private void generateRandomNum(){
        randomNum = new RandomNumber();
    }

    public void run() {
        CompareNumber compareNumber = new CompareNumber();

        do {
            compareNumber.setValue(randomNum);
            output.output(outputResult(compareNumber));
        } while (!compareNumber.isCheckStrike());

        output.output("BASEBALL GAME END!");
    }

    private String outputResult(CompareNumber compareNumber) {
        return compareNumber.isCheckStrike() ? "3 Strike !" : "Strike : " + compareNumber.getStrike() + ", Ball : " + compareNumber.getBall();
    }
}
