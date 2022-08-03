import java.util.Arrays;

public class BallUtil {
    private int ball;

    BallUtil(int ball) {
        this.ball = ball;
    }

    public int countBall(String[] randomNumber, String[] input) {
        ball = 0;

        for (int i = 0; i < 3; i++) {
            if(checkBall(i, randomNumber, input)) {
                ball++;
            }
        }

        return ball;
    }

    //TODO : 로직 수정하기! strike 제외하고 세도록 수정 필요
    public boolean checkBall(int index, String[] randomNumber, String[] input) {
        return !randomNumber[index].equals(input[index]) && Arrays.stream(randomNumber).anyMatch(r -> r.equals(input[index]));
    }
}
