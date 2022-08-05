import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomNumber {
    private final static Logger log = LoggerFactory.getLogger(RandomNumber.class);

    private final Set<Integer> randomNumber;

    public RandomNumber() {
        randomNumber = new HashSet<>();
    }

    public List<Integer> createRandomNumber() {
        while(randomNumber.size() < 3) {
            randomNumber.add((int) (Math.random() * 9 + 1));
        }

        log.info("랜덤값 = {}", randomNumber);
        return new ArrayList<>(randomNumber);
    }
}