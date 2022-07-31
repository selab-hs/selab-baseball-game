import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomNumber {

    private final Set<Integer> randomNumber;

    RandomNumber() {
        randomNumber = new HashSet<>();
    }

    public List<Integer> createRandomNumber() {

        while(randomNumber.size() < 3) {
            randomNumber.add((int) (Math.random() * 9 + 1));
        }

        System.out.println(randomNumber);
        return new ArrayList<>(randomNumber);
    }
}