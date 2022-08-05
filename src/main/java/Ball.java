import java.util.List;
import java.util.stream.IntStream;

public class Ball implements Baseball {

    private final int ball;

    public Ball() {
        this.ball = 0;
    }

    @Override
    public int compare(List<Integer> randomNumber, List<Integer> userNumber) {
        return (int) IntStream.range(0, 3).filter(n -> randomNumber.contains(userNumber.get(n))).count();
    }
}