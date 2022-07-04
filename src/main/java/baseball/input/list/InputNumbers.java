package baseball.input.list;

import java.util.ArrayList;
import java.util.List;

public class InputNumbers {
    private final List<Integer> inputNumbers = new ArrayList<>();

    public InputNumbers(int number) {
        setInputNumbers(number);
    }

    private void setInputNumbers(int number) {
        inputNumbers.add(number / 100);
        inputNumbers.add(number % 100 / 10);
        inputNumbers.add(number % 10);
    }

    public List<Integer> getInputNumbers() {
        return inputNumbers;
    }
}
