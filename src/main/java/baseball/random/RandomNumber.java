package baseball.random;

import baseball.random.list.RandomNumbers;

import java.util.LinkedHashSet;
import java.util.Set;

public class RandomNumber {
    private RandomNumbers rList;

	public RandomNumber(){
        generateRandomNum();
    }

    private void generateRandomNum(){
        Set<Integer> numberSet = new LinkedHashSet<>();

        while (numberSet.size() < 3) {
            numberSet.add((int)(Math.random() * 9 + 1));
        }

        rList = new RandomNumbers(numberSet);
    }

    public RandomNumbers getList(){
        return rList;
    }
}

