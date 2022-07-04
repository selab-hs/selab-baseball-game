package baseball.random;

import baseball.random.list.RandomNumbers;

import java.util.LinkedHashSet;
import java.util.Set;

public class RandomNumber {
    private RandomNumbers numbers;

    public RandomNumber() {
        generateRandomNum();
    }

    private void generateRandomNum() {
        Set<Integer> deduplicationNumbers = new LinkedHashSet<>();

        while (deduplicationNumbers.size() < 3) {
            deduplicationNumbers.add((int) (Math.random() * 9 + 1));
        }

        numbers = new RandomNumbers(deduplicationNumbers);
    }

    public RandomNumbers getNumbers() {
        return numbers;
    }
}

