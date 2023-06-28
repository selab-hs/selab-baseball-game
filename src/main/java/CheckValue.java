import java.util.regex.Pattern;

public class CheckValue {

    public CheckValue(String inputValue, String randomValue) {
        checkString(inputValue);
        checkValue(inputValue,randomValue);
        System.out.println(inputValue + " " + randomValue);
    }

    private void checkValue(String inputValue, String randomValue) {
        //야구게임
    }

    private boolean checkString(String value) {
        try {
            if (!Pattern.matches("\\d{3}", value))
                throw new NumberFormatException("입력된 문자열은 3자리 숫자가 아닙니다.");
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException : " + e.getMessage());
            System.exit(0);
        }
        return false;
    }



}
