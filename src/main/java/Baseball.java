import java.util.Arrays;
import java.util.List;

public class Baseball {
    public void playBaseball() {
        InputUtil inputUtil = new InputUtil();
        OutputUtil outputUtil = new OutputUtil();
        RandomNumber randomNumberUtil = new RandomNumber();
        Strike strike = new Strike();
        Ball ball = new Ball();

        CheckArrayDupplicate checkArrayDupplicate = new CheckArrayDupplicate();
        List<String> randomNumber = randomNumberUtil.generateRandomNumber();

        boolean success = false;
        while (!success) {
            List<String> input = inputUtil.getInput();
            if(!checkArrayDupplicate.checkDuplicate(input)) {
                outputUtil.getOutput("중복 없이 입력해주세요!");
                continue;
            }

            int strikeCount = strike.countStrike(randomNumber, input);
            int ballCount = ball.countBall(randomNumber, input);
            outputUtil.getMessage(strikeCount, ballCount);

            if (strikeCount == 3) {
                success = true;
            }
        }
    }
}
