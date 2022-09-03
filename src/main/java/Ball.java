import java.util.List;

public final class Ball {
    public Ball() {};

    public int countBall(List<String> randomNumber, List<String> input) {
        int count = 0;

        for (int i = 0; i < 3; i++) {
            if(checkBall(i, randomNumber, input)) {
                count++;
            }
        }

        return count;
    }

    public boolean checkBall(int index, List<String> randomNumber, List<String> input) {
        boolean isStrike = randomNumber.get(index).equals(input.get(index));
        boolean isBall = input.contains(randomNumber.get(index));

        return !isBall && isStrike;
    }
}
