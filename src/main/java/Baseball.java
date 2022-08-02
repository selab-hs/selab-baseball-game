import java.util.Arrays;

public class Baseball {
    private String[] input;

    public Baseball(String[] input) {
        this.input = input;
    }

    public void run() {
        String[] randNum = RandNum.generateNum();
        Strike strikeInstance = new Strike();
        Ball ballInstance = new Ball();

        while(true) {
            int strike = strikeInstance.countStrike(randNum, input);
            int ball = ballInstance.countBall(randNum, input);
            String message = OutputUtil.getMessage(ball, strike);
            OutputUtil.getOutput(message);
            if(strike == 3) {
                break;
            }
            input = InputUtil.getInput();
        }
    }
}
