import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {
    public static List<String> generateRandomNumber() {
        Random random = new Random();
        CheckArrayDupplicate checkArrayDupplicate = new CheckArrayDupplicate();
        List<String> result;
        do {
            result = List.of(String.valueOf(random.nextInt(999)).split(""));
        } while (!checkArrayDupplicate.checkDuplicate(result) || result.size() != 3);
        return result;
    }
}
