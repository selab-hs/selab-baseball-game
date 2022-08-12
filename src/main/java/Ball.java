import java.util.Arrays;
import java.util.List;

public final class Ball {
    private int ball;

    public Ball(int ball) {
        this.ball = ball;
    }

    public int countBall(List<String> randomNumber, List<String> input) {
        ball = 0;

        for (int i = 0; i < 3; i++) {
            if(checkBall(i, randomNumber, input)) {
                ball++;
            }
        }

        return ball;
    }

    public boolean checkBall(int index, List<String> randomNumber, List<String> input) {
        return !randomNumber.get(index).equals(input.get(index)) && input.contains(randomNumber.get(index));
    }
}
