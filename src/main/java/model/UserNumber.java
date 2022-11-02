package model;

import java.util.ArrayList;
import java.util.List;

public class UserNumber {
    private static final List<Integer> userNumber = new ArrayList<>();

    public void addNumber(int number) {
        userNumber.add(number);
    }

    public int getNumber(int index) {
        return userNumber.get(index);
    }

    public List<Integer> getList() {
        return userNumber;
    }

    public int getSize() {
        return userNumber.size();
    }

    public void clearList() {
        userNumber.clear();
    }
}
