package baseball.input;

import java.util.ArrayList;
import java.util.List;

public class InputNumbers {
    private final List<Integer> inputNumbers;

    public InputNumbers(List<Integer> numbers){
        this.inputNumbers = numbers;
    }

    public List<Integer> getInputNumbers() {
        return inputNumbers;
    }
}
