package baseball.input.list;

import java.util.ArrayList;
import java.util.List;

public class InputNumbers {
    private final List<Integer> inputNumList = new ArrayList<>();

    public InputNumbers(int a){
        inputNumList.add(a/100);
        inputNumList.add(a%100/10);
        inputNumList.add(a%10);
    }

    public List<Integer> getInputNumList() {
        return inputNumList;
    }
}
