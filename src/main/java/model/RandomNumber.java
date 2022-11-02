package model;

import java.util.ArrayList;
import java.util.List;

public class RandomNumber {
    private static final List<Integer> randomNumber = new ArrayList<>();

    public void addNumber(int number) {
        randomNumber.add(number);
    }

    public void removeNumber(int index) {
        randomNumber.remove(index);
    }

    public int getNumber(int index) {
        return randomNumber.get(index);
    }

    public List<Integer> getList() {
        return randomNumber;
    }

    public int getSize() {
        return randomNumber.size();
    }
}
