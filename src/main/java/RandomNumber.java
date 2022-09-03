import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RandomNumber {
    public RandomNumber(){};

    public List<String> generateRandomNumber() {
        Random random = new Random();
        CheckArrayDupplicate checkArrayDupplicate = new CheckArrayDupplicate();
        List<String> result;
        do {
            result = List.of(String.valueOf(random.nextInt(999)).split(""));
        } while (!checkArrayDupplicate.checkDuplicate(result) || result.size() != 3);
        return result;
    }
}
