import java.util.Random;

public class RandomValue {
    private static final int RANDOM_VALUE_SIZE = 3;
    public static String generateRandomValue() {
        String  usedDigit = "";
        final String randomValue = createRandomDigit(usedDigit);;
        return randomValue;
    }

    private static String createRandomDigit(String randomValue) {
        Random random = new Random();
        while (randomValue.length() < RANDOM_VALUE_SIZE) {
            char digit = (char) (random.nextInt(9) + '1');
            if (!hasDuplicateDigit(randomValue, digit)) {
                randomValue += digit;
            }
        }
        return randomValue;
    }

    public static boolean hasDuplicateDigit(String usedDigits, char digit) {
        for (int i = 0; i < usedDigits.length(); i++) {
            if (usedDigits.charAt(i) == digit) {
                return true;
            }
        }
        return false;
    }

}
