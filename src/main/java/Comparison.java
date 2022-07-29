import java.util.List;

public class Comparison {

    private int ball;
    private int strike;

    public int[] compare(List<Integer> randomNumber, List<Integer> userNumber) {

        ball = 0;
        strike = 0;

        checkForStrike(randomNumber, userNumber);
        checkForBall(randomNumber, userNumber);

        return new int[] {ball, strike};
    }

    public int checkForBall(List<Integer> randomNumber, List<Integer> userNumber) {

        for(int i = 0; i < 3; i++) {
            if (randomNumber.contains(userNumber.get(i))) {
                ball++;
            }
        }

        return ball;
    }

    public int checkForStrike(List<Integer> randomNumber, List<Integer> userNumber) {

        for(int i = 0; i < 3; i++) {
            if (randomNumber.get(i).equals(userNumber.get(i))) {
                strike++;
                ball--;
            }
        }

        return strike;
    }

}
