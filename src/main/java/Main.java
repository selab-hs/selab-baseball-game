import java.util.List;

public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        RandomNumber randomNumber = new RandomNumber();
        List<Integer> randomNumbers = randomNumber.createRandomNumber();

        int[] result = new int[2];
        output.printPlayBaseballGame();

        while(result[1] != 3) {

            Ball ball = new Ball();
            Strike strike = new Strike();

            List<Integer> userNumbers = input.arrToList(input.inputDataSplit(input.input()));

            int totalStrike = strike.checkBallOrStrike(randomNumbers, userNumbers);
            int totalBall = strike.getBall() + ball.checkBallOrStrike(randomNumbers, userNumbers);

            result = new int[]{totalBall, totalStrike};

            output.output(result);
        }
    }
}
