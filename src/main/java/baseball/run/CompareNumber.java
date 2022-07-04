package baseball.run;

import baseball.input.InputNumber;
import baseball.random.RandomNumber;

import java.util.List;

public class CompareNumber {
    private static final int THREE = 3;

    private int strike;
    private int ball;

    public CompareNumber() {
        initValue();
    }

    public void setValue(RandomNumber randomNum) {
        initValue();
        compareNumber(randomNum, new InputNumber());
    }

    private void initValue() {
        strike = 0;
        ball = 0;
    }

    private void compareNumber(RandomNumber randomNum, InputNumber inputNum) {
        List<Integer> randomNumbers = randomNum.getNumbers().getRandomNumbers();
        List<Integer> inputNumbers = inputNum.getNumbers().getInputNumbers();

        for (int i = 0; i < randomNumbers.size(); i++) {
            if (randomNumbers.get(i).equals(inputNumbers.get(i))) {
                strike++;
                continue;
            }
            if (randomNumbers.contains(inputNumbers.get(i))) {
                ball++;
            }
        }
    }

    public boolean isCheckStrike() {
        return strike == THREE;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike(){
        return strike;
    }
}
