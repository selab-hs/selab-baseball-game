package baseball.random.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RandomNumbers {
    private final List<Integer> randomNumbers;

    public RandomNumbers(Set<Integer> numbers) {
        randomNumbers = new ArrayList<>(numbers);
    }

    public List<Integer> getRandomNumbers() {
        return randomNumbers;
    }
}
