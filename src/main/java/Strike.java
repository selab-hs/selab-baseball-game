import java.util.List;

public class Strike extends Baseball {

    private final int strike;

    public Strike() {
        this.strike = 0;
    }

    @Override
    public int check(List<Integer> randomNumber, List<Integer> userNumber) {

        int strike = 0;

        for(int i = 0; i < 3; i++) {
            if (randomNumber.get(i).equals(userNumber.get(i))) {
                strike++;
            }
        }

        return strike;
    }
}
