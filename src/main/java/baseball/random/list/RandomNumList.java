package baseball.random.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class RandomNumList {
    private final List<Integer> randomNumList;

    public RandomNumList(Set<Integer> numberSet){
        randomNumList = new ArrayList<>(numberSet);
        Collections.shuffle(randomNumList);
    }

    public List<Integer> getRandomNumList() {
        return randomNumList;
    }
}
