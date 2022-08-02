import java.util.Arrays;

public class Ball {
    private int ball;

    public Ball() {
        this.ball = 0;
    }

    public int countBall(String[] randNum, String[] input) {
        ball = 0;
        for(int i = 0; i < 3; i++) {
            ball += checkBall(i, randNum, input);
        }
        return ball;
    }

    public int checkBall(int idx, String[] randNum, String[] input) {
        if(!randNum[idx].equals(input[idx]) &&
                Arrays.stream(randNum).anyMatch(n -> n.equals(input[idx]))) {
            return 1;
        }
        return 0;
    }
}
