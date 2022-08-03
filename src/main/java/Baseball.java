import java.util.Arrays;
import java.util.List;

public class Baseball {
    private List<String> input;

    public Baseball(String[] input) {
        this.input = Arrays.asList(input);
    }

    public void run() {
        List<String> randNum = RandNum.generateNum();
        Strike strike = new Strike();
        Ball ball = new Ball();
        System.out.println("랜덤값: " + randNum);
        while(true) {
            strike.countStrike(randNum, input);
            ball.countBall(randNum, input);
            String message = OutputUtil.getMessage(strike, ball);
            OutputUtil.getOutput(message);
            if(strike.getStrike() == 3) {
                break;
            }
            input = Arrays.asList(InputUtil.getInput());
        }
    }
}
