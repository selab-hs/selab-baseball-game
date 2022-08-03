import java.util.List;

public class Strike {
    private int strike;

    public Strike() {
        this.strike = 0;
    }

    public void countStrike(List<String> randNum, List<String> input) {
        strike = 0;
        for(int i = 0; i < 3; i ++) {
            System.out.println("idx: " + i);
            strike += checkStrike(i, randNum, input);
        }
    }

    public int checkStrike(int idx, List<String> randNum, List<String> input) {
        if(randNum.get(idx).equals(input.get(idx))) {
            return 1;
        }
        return 0;
    }

    public String checkPositive() {
        if (strike == 3) {
            return "WIN";
        }
        return strike > 0 ? "STRIKE" : "";
    }

    public int getStrike() {
        return strike;
    }
}
