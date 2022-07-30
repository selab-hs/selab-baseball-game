import java.util.Arrays;

public class Baseball {
    private String[] input;
    private int strike;
    private int ball;

    public Baseball(String[] input) {
        this.input = input;
        this.strike = 0;
        this.ball = 0;
    }

    public void run() {
        String[] randNum = RandNum.generateNum();
        System.out.println("랜덤값: "+ Arrays.toString(randNum));
        while(true) {
            countStrike(randNum);
            countBall(randNum);
            String message = OutputUtil.getMessage(ball, strike);
            OutputUtil.getOutput(message);
            if(strike == 3) {
                break;
            }
            input = InputUtil.getInput();
        }
    }

    public void countBall(String[] randNum) {
        ball = 0;
        for(int i = 0; i < 3; i++) {
            ball += checkBall(i, randNum);
        }
    }

    public int checkBall(int idx, String[] randNum) {
        if(!randNum[idx].equals(input[idx]) &&
                Arrays.stream(randNum).anyMatch(n -> n.equals(input[idx]))) {
            return 1;
        }
        return 0;
    }

    public void countStrike(String[] randNum) {
        strike = 0;
        for(int i = 0; i < 3; i ++) {
            strike += checkStrike(i, randNum);
        }
    }

    public int checkStrike(int idx, String[] randNum) {
        if(randNum[idx].equals(input[idx])) {
            return 1;
        }
        return 0;
    }
}
