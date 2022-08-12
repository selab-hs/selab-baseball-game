import java.util.List;

public class Baseball {
    public void playBaseball() {
        InputUtil inputUtil = new InputUtil();
        OutputUtil outputUtil = new OutputUtil();
        CheckArrayDupplicate checkArrayDupplicate = new CheckArrayDupplicate();

        List<String> input;
        List<String> randomNumber = RandomNumber.generateRandomNumber();

        Strike strike = new Strike(0);
        Ball ball = new Ball(0);

        boolean success = false;
        while (!success) {
            input = inputUtil.getInput();
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
