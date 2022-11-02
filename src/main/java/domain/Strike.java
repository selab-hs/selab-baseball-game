package domain;

import model.Numbers;

import java.util.ArrayList;
import java.util.List;

public class Strike {
    private int strike;

    public int checkingStrike(List<Integer> randomList, List<Integer> userList) {
        strike = Numbers.ZERO;
        List<Integer> strikeIntegers = new ArrayList<>();
        randomList.forEach(number -> strikeIntegers.add(userList.indexOf(number)));
        for (int index : strikeIntegers) {
            if (index < Numbers.ZERO) {
                continue;
            }
            compareNumber(randomList.get(index), strikeIntegers.get(index));
        }
        return strike;
    }

    private void compareNumber(int number1, int number2) {
        if (number1 == number2) {
            strike++;
        }
    }
}
