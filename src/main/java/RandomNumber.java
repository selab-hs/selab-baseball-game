import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomNumber {

    private Set<Integer> randomNumber = new HashSet<>();

    public List<Integer> createRandomNumber() {

        while(randomNumber.size() < 3) {
            randomNumber.add((int) (Math.random() * 9 + 1));
        }

        List<Integer> randomNumbers = new ArrayList<>(randomNumber);
        return randomNumbers;
    }
}
