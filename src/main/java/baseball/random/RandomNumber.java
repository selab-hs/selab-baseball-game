package baseball.random;

import baseball.random.list.RandomNumList;

import java.util.HashSet;
import java.util.Set;

public class RandomNumber {
    private RandomNumList rList;

	public RandomNumber(){
        generateRandomNum();
    }

    private void generateRandomNum(){
        Set<Integer> numberSet = new HashSet<>();

        while (numberSet.size() < 3) {
            int number = (int)(Math.random() * 9 + 1);
            numberSet.add(number);
        }

        rList = new RandomNumList(numberSet);
    }

    public RandomNumList getList(){
        return rList;
    }
}

