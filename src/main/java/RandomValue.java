import java.util.Random;

public class RandomValue {
    public static String generateRandomValue() {
        Random random = new Random();
        String usedDigits = "";

        while (usedDigits.length() < 3) {
            char digit = (char) (random.nextInt(9) + '1');

            if (!hasDuplicateDigit(usedDigits, digit)) {
                usedDigits += digit;
            }
        }
        return usedDigits;
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
