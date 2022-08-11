import java.util.List;

import static java.util.stream.IntStream.range;

public class Strike implements Baseball {

    private final int strike;

    public Strike() {
        this.strike = 0;
    }

    @Override
    public int compare(List<Integer> randomNumber, List<Integer> userNumber) {
        return (int) range(0, 3)
                .filter(n -> randomNumber.get(n).equals(userNumber.get(n)))
                .count();
    }
}