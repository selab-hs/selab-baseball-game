import java.util.Scanner;
import java.util.regex.Pattern;

public class GetInputValue {
    public static String getInputValue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("값 입력 : ");
        return isValidInput(sc.nextLine());
    }

    public static String isValidInput(String value) {
        try {
            if (!Pattern.matches("\\d{3}", value))
                throw new NumberFormatException("입력된 문자열은 3자리 숫자가 아닙니다.");
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException : " + e.getMessage());
            System.exit(0);
        }
        return value;
    }
}