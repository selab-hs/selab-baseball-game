package baseball.random;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RandomNumber {
    private final List<Integer> randomNumbers;

    public RandomNumber() {
        Set<Integer> deduplicationNumbers = new LinkedHashSet<>();

        while (deduplicationNumbers.size() < 3) {
            deduplicationNumbers.add((int) (Math.random() * 9 + 1));
        }

        randomNumbers = new ArrayList<>(deduplicationNumbers);
    }

    public List<Integer> getNumbers() {
        return randomNumbers;
    }
}

