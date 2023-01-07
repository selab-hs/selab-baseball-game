package service;

import java.util.*;

public class CompareService {

    public String notifyTheResult(String player, String computer) {
        Map<Integer, Integer> dividedNumberOfPlayer = divideTheNumber(player);
        Map<Integer, Integer> dividedNumberOfComputer = divideTheNumber(computer);

        int ball = countBall(dividedNumberOfPlayer, dividedNumberOfComputer);
        int strike = countStrike(dividedNumberOfPlayer, dividedNumberOfComputer);

        return ball + " " + strike;
    }

    private Map<Integer, Integer> divideTheNumber(String number) {
        Map<Integer, Integer> dividedNumber = new HashMap<>();
        for (int i = 0; i < number.length(); i++) {
            dividedNumber.put(i, Integer.parseInt(String.valueOf(number.charAt(i))));
        }
        return dividedNumber;
    }

    private int countBall(Map<Integer, Integer> player, Map<Integer, Integer> computer) {
        int count = 0;
        for (int i = 0; i < player.size(); i++) {
            if (computer.containsValue(player.get(i)) && !Objects.equals(player.get(i), computer.get(i))) {
                count++;
            }
        }
        return count;
    }

    private int countStrike(Map<Integer, Integer> player, Map<Integer, Integer> computer) {
        int count = 0;
        for (int i = 0; i < player.size(); i++) {
            if (Objects.equals(player.get(i), computer.get(i))) {
                count++;
            }
        }
        return count;
    }
}