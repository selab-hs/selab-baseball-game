import java.util.Arrays;

public class Baseball {
    public void playBaseball() {
        InputUtil inputUtil = new InputUtil();
        OutputUtil outputUtil = new OutputUtil();
        CheckArrayDupplicate checkArrayDupplicate = new CheckArrayDupplicate();

        String[] input;
        String[] randomNumber = RandomNumber.generateRandomNumber();

        StrikeUtil strikeUtil = new StrikeUtil(0);
        BallUtil ballUtil = new BallUtil(0);
        System.out.println("random : " + Arrays.toString(randomNumber));
        while (true) {
            input = inputUtil.getInput();
            if(!checkArrayDupplicate.checkDuplicate(input)) {
                outputUtil.getOutput("중복 없이 입력해주세요!");
                continue;
            }

            int strikeCount = strikeUtil.countStrike(randomNumber, input);
            int ballCount = ballUtil.countBall(randomNumber, input);
            outputUtil.getOutput(outputUtil.getMessage(strikeCount, ballCount));
            if (strikeCount == 3) {
                break;
            }
        }

    }
}
