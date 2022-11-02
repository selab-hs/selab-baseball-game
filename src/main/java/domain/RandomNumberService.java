package domain;

import model.Numbers;

import java.util.Random;

import static controller.BaseballGame.randomNumber;

public class RandomNumberService {
    private final Random random = new Random();

    public void initNumber() {
        int index = Numbers.ZERO;
        while (randomNumber.getSize() < 3) {
            randomNumber.addNumber(createNumber());
            if (!NumberService.checkingDuplicate(randomNumber.getList())) {
                randomNumber.removeNumber(index);
            }
            index++;
        }
    }

    private int createNumber() {
        return random.nextInt(10);
    }

}
