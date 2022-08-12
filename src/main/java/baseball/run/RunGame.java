package baseball.run;

import baseball.output.Output;
import baseball.random.RandomNumber;

public class RunGame {
    private final RandomNumber randomNum;
    private final Output output = new Output();

    public RunGame() {
        this.randomNum = new RandomNumber();
    }

    public void run() {
        repeatCompareNumber();

        output.output("BASEBALL GAME END!");
    }

    private void repeatCompareNumber(){
        CompareNumber compareNumber = new CompareNumber(randomNum);
        output.outputResult(compareNumber.getStrike(), compareNumber.getBall());

        if(!compareNumber.isCheckStrike()) {
            repeatCompareNumber();
        }
    }
}
