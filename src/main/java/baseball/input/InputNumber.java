package baseball.input;

import baseball.input.list.InputNumbers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InputNumber {
    private final Scanner sc = new Scanner(System.in);
    private InputNumbers numbers;

    public InputNumber() {
        setInputNumber();
    }

    private void setInputNumber() {
        String str;
        do {
            System.out.print("\nInput three Number : ");
            str = sc.nextLine();

            errMsg(validateNum(str));
        } while (!validateNum(str));

        numbers = new InputNumbers(Integer.parseInt(str));
    }

    private boolean validateNum(String str) {
        if (!str.matches("\\d*(\\.\\d+)?")) {
            return false;
        }
        return deduplicationNum(str);
    }

    private boolean deduplicationNum(String str){
        int number = Integer.parseInt(str);
        Set<Integer> numbers = new HashSet<>(Arrays.asList(number / 100, number % 100 / 10, number % 10));

        return numbers.size() == 3;
    }

    private void errMsg(boolean bool) {
        if (!bool) {
            System.out.println("잘못된 입력입니다");
        }
    }

    public InputNumbers getNumbers() {
        return numbers;
    }
}
