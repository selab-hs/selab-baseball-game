import java.util.List;

public class Ball {
    private int ball;

    public Ball() {
        this.ball = 0;
    }

    public void countBall(List<String> randNum, List<String> input) {
        ball = 0;
        for(int i = 0; i < 3; i++) {
            ball += checkBall(i, randNum, input);
        }
    }

    public int checkBall(int idx, List<String> randNum, List<String> input) {
        if(!randNum.get(idx).equals(input.get(idx)) &&
                randNum.contains(input.get(idx))) {
            return 1;
        }
        return 0;
    }

    public String checkPositive() {
        return ball > 0 ? "BALL" : "";
    }

    public int getBall() {
        return ball;
    }
}
