import java.util.List;

public class Strike extends Baseball {

    private int ball;
    private int strike;

    Strike() {
        this.ball = 0;
        this.strike = 0;
    }

    @Override
    public int checkBallOrStrike(List<Integer> randomNumber, List<Integer> userNumber) {

        for(int i = 0; i < 3; i++) {
            if (randomNumber.get(i).equals(userNumber.get(i))) {
                strike++;
                ball--;
            }
        }

        return strike;
    }

    public int getBall() {
        return ball;
    }
}
