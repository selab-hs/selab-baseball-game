import java.util.Random;

public class RandNum {
    public static String[] generateNum() {
        Random random = new Random();
        return String.valueOf(random.nextInt(999)).split("");
    }
}
