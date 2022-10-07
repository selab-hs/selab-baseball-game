package domain;

import model.Numbers;

import java.util.ArrayList;
import java.util.List;

public class Strike {
    public int checkingStrike(List<Integer> randomList, List<Integer> userList) {
        int strike = Numbers.ZERO;
        List<Integer> strikeIntegers = new ArrayList<>();
        randomList.forEach(number -> strikeIntegers.add(userList.indexOf(number)));
        for (int index : strikeIntegers) {
            if (index < Numbers.ZERO) {
                continue;
            }
            if (randomList.get(index).equals(userList.get(index))) {
                strike++;
            }
        }
        return strike;
    }
}
