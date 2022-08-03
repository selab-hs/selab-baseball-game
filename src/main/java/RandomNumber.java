import java.util.Random;

public class RandomNumber {
    public static String[] generateRandomNumber() {
        Random random = new Random();
        return String.valueOf(random.nextInt(999)).split("");
    }
}
