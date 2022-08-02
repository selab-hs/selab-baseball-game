import java.util.List;

public class Ball extends Baseball {

    private int ball;

    Ball() {
        this.ball = 0;
    }

    @Override
    public int checkBallOrStrike(List<Integer> randomNumber, List<Integer> userNumber) {

        for (int i = 0; i < 3; i++) {
            if (randomNumber.contains(userNumber.get(i))) {
                ball++;
            }
        }

        return ball;
    }
}
