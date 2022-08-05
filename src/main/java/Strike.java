import java.util.List;
import java.util.stream.IntStream;

public class Strike implements Baseball {

    private final int strike;

    public Strike() {
        this.strike = 0;
    }

    @Override
    public int compare(List<Integer> randomNumber, List<Integer> userNumber) {
        return (int) IntStream.range(0, 3).filter(n -> randomNumber.get(n).equals(userNumber.get(n))).count();
    }
}