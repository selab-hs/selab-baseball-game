import java.util.List;

public final class Strike {
    public Strike() {};

    public int countStrike(List<String> randomNumber, List<String> input) {
        int count = 0;

        for(int i=0;i<3;i++) {
            if(checkStrike(i, randomNumber, input)) {
                count++;
            }
        }

        return count;
    }

    public boolean checkStrike(int index, List<String> randomNumber, List<String> input) {
        return randomNumber.get(index).equals(input.get(index));
    }
}
