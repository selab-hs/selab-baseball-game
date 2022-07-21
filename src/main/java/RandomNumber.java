import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RandomNumber {

    private static final Set<Integer> randomNumbersSet = new HashSet<>();

    public ArrayList<Integer> createRandomNumber() {

        while(randomNumbersSet.size() < 3) {
            randomNumbersSet.add((int) (Math.random() * 9 + 1));
        }

        ArrayList<Integer> randomNumbers = new ArrayList<>(randomNumbersSet);
        return randomNumbers;
    }
}
