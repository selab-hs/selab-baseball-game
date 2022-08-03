public class StrikeUtil {
    private int strike;

    public StrikeUtil(int strike) {
        this.strike = strike;
    }

    public int countStrike(String[] randomNumber, String[] input) {
        strike = 0;

        for(int i=0;i<3;i++) {
            if(checkStrike(i, randomNumber, input)) {
                strike++;
            }
        }

        return strike;
    }

    public boolean checkStrike(int index, String[] randomNumber, String[] input) {
        return randomNumber[index].equals(input[index]);
    }
}
