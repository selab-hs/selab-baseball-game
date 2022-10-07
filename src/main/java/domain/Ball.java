package domain;

import model.Numbers;

import java.util.List;

public class Ball {

    public int checkingBall(List<Integer> randomList, List<Integer> userList) {
        int ball = Numbers.ZERO;
        for (int index = Numbers.ZERO; index < Numbers.THREE; index++) {
            final int finalIndex = index;
            ball += randomList.stream()
                    .filter(number -> number.equals(userList.get(finalIndex)))
                    .count();
        }
        return ball;
    }
}
