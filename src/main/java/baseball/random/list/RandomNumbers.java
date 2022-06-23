package baseball.random.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RandomNumbers {
    private final List<Integer> randomNumList;

    public RandomNumbers(Set<Integer> numberSet){
        randomNumList = new ArrayList<>(numberSet);
    }

    public List<Integer> getRandomNumList() {
        return randomNumList;
    }
}
