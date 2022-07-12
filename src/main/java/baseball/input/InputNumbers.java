package baseball.input;

import baseball.input.InputNumber;

import java.util.ArrayList;
import java.util.List;

public class InputNumbers {
    private final List<Integer> inputNumbers;

    public InputNumbers() {
        inputNumbers = new ArrayList<>(new InputNumber().deduplicationNum());
    }

    public List<Integer> getInputNumbers() {
        return inputNumbers;
    }
}
