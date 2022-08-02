import java.util.List;

public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        RandomNumber randomNumber = new RandomNumber();
        List<Integer> randomNumbers = randomNumber.createRandomNumber();

        Ball ball = new Ball();
        Strike strike = new Strike();

        int totalStrike = 0;
        int totalBall;

        output.printPlayBaseballGame();

        while(totalStrike != 3) {
            List<Integer> userNumbers = input.toNumbers(input.inputDataSplit(input.input()));

            totalStrike = strike.check(randomNumbers, userNumbers);
            totalBall = ball.check(randomNumbers, userNumbers) - totalStrike;

            output.output(totalBall, totalStrike);
        }
    }
}
