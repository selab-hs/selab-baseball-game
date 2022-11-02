package view;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);

    private void printInputMessage() {
        System.out.print("중복되지 않는 숫자 3개를 입력해주세요 : ");
    }

    public String getData() {
        printInputMessage();
        return scanner.nextLine();
    }
}
