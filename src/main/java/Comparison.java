import java.util.ArrayList;

public class Comparison {
    int ball;
    int strike;

    public int compareNumber(ArrayList<Integer> input, ArrayList<Integer> randomNumber) {
        ball = 0;
        strike = 0;

        for (int i = 0; i < 3; i++) {
            if (input.contains(randomNumber.get(i))) {
                ball++;
            }

            if (input.get(i).equals(randomNumber.get(i))) {
                ball = 0;
                strike++;
            }
        }

        Output output = new Output();
        output.output(strike, ball);

        return strike;
    }
}
