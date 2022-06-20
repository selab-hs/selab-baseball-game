package baseball.random.list;

import java.util.ArrayList;
import java.util.List;

public class RandomNumList {
    private List<Integer> randomNumList = new ArrayList<Integer>();

    public RandomNumList(int a, int b, int c){
        randomNumList.add(a);
        randomNumList.add(b);
        randomNumList.add(c);
    }

    public List<Integer> getRandomNumList() {
        return randomNumList;
    }
}
