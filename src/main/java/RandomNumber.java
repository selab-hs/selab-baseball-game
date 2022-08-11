import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class RandomNumber {

    private final Set<Integer> randomNumber;

    public RandomNumber() {
        randomNumber = new HashSet<>();
    }

    public List<Integer> createRandomNumber() {
        Random random = new Random(System.currentTimeMillis());

        while(randomNumber.size() < 3) {
            randomNumber.add(random.nextInt(9) + 1);
        }

        log.info("랜덤값 = {}", randomNumber);
        return new ArrayList<>(randomNumber);
    }
}