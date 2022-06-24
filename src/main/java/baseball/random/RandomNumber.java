package baseball.random;

import baseball.random.list.RandomNumbers;

import java.util.LinkedHashSet;
import java.util.Set;

public class RandomNumber {
    private final RandomNumbers rList;

	public RandomNumber(){
        rList = generateRandomNum();
    }

    private RandomNumbers generateRandomNum(){
        Set<Integer> numberSet = new LinkedHashSet<>();

        while (numberSet.size() < 3) {
            numberSet.add((int)(Math.random() * 9 + 1));
        }

        return new RandomNumbers(numberSet);
    }

    public RandomNumbers getList(){
        return rList;
    }
}

