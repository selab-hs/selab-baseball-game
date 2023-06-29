import java.util.Random;

public class RandomValue {
    private static String randomValue = "";

    public RandomValue(){
        randomValue = generateRandomValue();
    }

    private String generateRandomValue() {
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

    private boolean hasDuplicateDigit(String usedDigits, char digit) {
        for (int i = 0; i < usedDigits.length(); i++) {
            if (usedDigits.charAt(i) == digit) {
                return true;
            }
        }
        return false;
    }

    public static String getRandomValue(){
        return randomValue;
    }

}
