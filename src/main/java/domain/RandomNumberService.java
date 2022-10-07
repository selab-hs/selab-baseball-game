package domain;

import model.Numbers;

import java.util.Random;

import static controller.BaseballGame.randomNumber;

public class RandomNumberService {
    Random random = new Random();

    public void initNumber() {
        int index = Numbers.ZERO;
        while (randomNumber.getSize() < Numbers.THREE) {
            randomNumber.addNumber(createNumber());
            if (!DuplicateCheck.checkingDuplicate(randomNumber.getList(), randomNumber.getSize())) {
                randomNumber.removeNumber(index);
            }
            index++;
        }
    }

    private int createNumber() {
        return random.nextInt(10);
    }

}
