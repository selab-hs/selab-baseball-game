import java.util.Random;

public class RandomNumber {
    public static String[] generateRandomNumber() {
        Random random = new Random();
        CheckArrayDupplicate checkArrayDupplicate = new CheckArrayDupplicate();

        String[] result;
        do {
            result = String.valueOf(random.nextInt(999)).split("");
        } while (!checkArrayDupplicate.checkDuplicate(result) || result.length != 3);
        return result;
    }
}
