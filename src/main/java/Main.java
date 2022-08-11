import java.util.List;

public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        RandomNumber randomNumber = new RandomNumber();
        List<Integer> randomNumbers = randomNumber.createRandomNumber();

        Ball ball = new Ball();
        Strike strike = new Strike();

        output.printPlayBaseballGame();

        while(true) {
            List<Integer> userNumbers = input.toNumbers(input.input());

            int totalStrike = strike.compare(randomNumbers, userNumbers);
            int totalBall = ball.compare(randomNumbers, userNumbers) - totalStrike;

            output.output(totalBall, totalStrike);

            if(totalStrike == 3) {
                break;
            }
        }
    }
}
