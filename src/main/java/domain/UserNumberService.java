package domain;

import model.Numbers;

import static controller.BaseballGame.*;


public class UserNumberService {

    public void initUserNumber() {
        boolean completionCheck = false;

        while (!completionCheck) {
            int number = Integer.parseInt(input.getData());
            if (number > Numbers.MAX_NUMBER || number < Numbers.MIN_NUMBER) {
                output.printSizeMessage();
                userNumber.clearList();
                continue;
            }
            digitizingNumber(number);
            completionCheck = NumberService.checkingDuplicate(userNumber.getList());
            if (!completionCheck) {
                output.printDuplicateMessage();
                userNumber.clearList();
            }
        }
    }

    private void digitizingNumber(int num) {
        userNumber.clearList();
        userNumber.addNumber(num / 100);
        userNumber.addNumber((num % 100) / 10);
        userNumber.addNumber(num % 10);
    }
}
