package baseball.run;

import baseball.input.InputNumber;
import baseball.input.InputNumbers;
import baseball.random.RandomNumber;

public class CompareNumber {
    public static final int THREE = 3;

    private int strike = 0;
    private int ball = 0;

    public CompareNumber(RandomNumber randomNum) {
        compareNumber(randomNum, new InputNumbers(new InputNumber().getNumber()));
    }

    private void compareNumber(RandomNumber randomNum, InputNumbers inputNums) {
        for (int i = 0; i < randomNum.getNumbers().size(); i++) {
            if (randomNum.getNumbers().get(i).equals(inputNums.getInputNumbers().get(i))) {
                strike++;
                continue;
            }
            if (randomNum.getNumbers().contains(inputNums.getInputNumbers().get(i))) {
                ball++;
            }
        }
    }

    public boolean isCheckStrike() {
        return strike == THREE;
    }

    public int getStrike(){
        return strike;
    }

    public int getBall(){
        return ball;
    }


}
