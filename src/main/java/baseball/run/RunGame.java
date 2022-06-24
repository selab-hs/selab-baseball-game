package baseball.run;

import baseball.input.InputNumber;
import baseball.output.Output;
import baseball.random.RandomNumber;

import java.util.List;

public class RunGame {
    private final RandomNumber randomNum;

    public RunGame() {
        randomNum = new RandomNumber();
    }

    public void run() {
        new CompareNumber(randomNum);
        Output.print("BASEBALL GAME END!");
    }


}
