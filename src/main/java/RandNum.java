import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandNum {
    public static List<String> generateNum() {
        Random random = new Random();
        return Arrays.asList(
                String.valueOf(random.nextInt(999)).split("")
        );
    }
}
