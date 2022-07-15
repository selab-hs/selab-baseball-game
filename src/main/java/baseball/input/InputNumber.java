package baseball.input;

import java.util.*;

public class InputNumber {
    private final Scanner sc = new Scanner(System.in);
    private String str;

    public InputNumber() {
        inputNumber();
    }

    private void inputNumber() {
        str = inputString();

        if (validateNum(str)) {
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
        int number = Integer.parseInt(str);
        return new LinkedHashSet<>(Arrays.asList(number / 100, number % 100 / 10, number % 10));
    }

    public List<Integer> getNumber(){
        return new ArrayList<>(deduplicationNum());
    }

    private void errMsg() {
        System.out.println("잘못된 입력입니다");
    }
}
