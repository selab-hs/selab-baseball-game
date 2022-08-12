import java.util.List;

public final class Strike {
    private int strike;

    public Strike(int strike) {
        this.strike = strike;
    }

    public int countStrike(List<String> randomNumber, List<String> input) {
        strike = 0;

        for(int i=0;i<3;i++) {
            if(checkStrike(i, randomNumber, input)) {
                strike++;
            }
        }

        return strike;
    }

    public boolean checkStrike(int index, List<String> randomNumber, List<String> input) {
        return randomNumber.get(index).equals(input.get(index));
    }
}
