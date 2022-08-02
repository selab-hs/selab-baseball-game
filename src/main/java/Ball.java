import java.util.List;

public class Ball extends Baseball {

    private final int ball;

    public Ball() {
        this.ball = 0;
    }

    @Override
    public int check(List<Integer> randomNumber, List<Integer> userNumber) {

        int ball = 0;

        for (int i = 0; i < 3; i++) {
            if (randomNumber.contains(userNumber.get(i))) {
                ball++;
            }
        }

        return ball;
    }
}
