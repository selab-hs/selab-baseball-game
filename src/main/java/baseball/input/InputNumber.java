package baseball.input;

import java.util.*;

public class InputNumber {
    private final Scanner sc = new Scanner(System.in);
    private String inputNumber;

    public InputNumber() {
        inputNumber();
    }

    private void inputNumber() {
        inputNumber = inputString();

        boolean isCheckInputNumber = validateNum(inputNumber);
        if (isCheckInputNumber) {
            return;
        }

        errMsg();
        inputNumber();
    }

    private String inputString() {
        System.out.print("\nInput three Number : ");
        return sc.nextLine();
    }

    private boolean validateNum(String str) {
        if (!str.matches("\\d*(\\.\\d+)?")) {
            return false;
        }
        return str.length() == 3 && deduplicationNum().size() == 3;
    }

    protected Set<Integer> deduplicationNum() {
        int number = Integer.parseInt(inputNumber);
        return new LinkedHashSet<>(Arrays.asList(number / 100, number % 100 / 10, number % 10));
    }

    private void errMsg() {
        System.out.println("잘못된 입력입니다");
    }
}
