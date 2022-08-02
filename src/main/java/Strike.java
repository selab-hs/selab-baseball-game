public class Strike {
    private int strike;

    public Strike() {
        this.strike = 0;
    }

    public int countStrike(String[] randNum, String[] input) {
        strike = 0;
        for(int i = 0; i < 3; i ++) {
            strike += checkStrike(i, randNum, input);
        }
        return strike;
    }

    public int checkStrike(int idx, String[] randNum, String[] input) {
        if(randNum[idx].equals(input[idx])) {
            return 1;
        }
        return 0;
    }
}
