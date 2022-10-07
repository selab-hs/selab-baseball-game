package domain;

import model.Numbers;

import static controller.BaseballGame.*;


public class UserNumberService {

    public void initUserNumber() {
        boolean completionCheck = false;
        do {
            int number = Integer.parseInt(input.getData());
            if (number > Numbers.MAX_NUMBER) {
                output.printSizeMessage();
                userNumber.clearList();
                continue;
            }
            DigitizingNumber(number);
            completionCheck = DuplicateCheck.checkingDuplicate(userNumber.getList(), userNumber.getSize());
            if (!completionCheck) {
                output.printDuplicateMessage();
                userNumber.clearList();
            }
        } while (!completionCheck);
    }

    private void DigitizingNumber(int num) {
        userNumber.clearList();
        userNumber.addNumber(num / Numbers.HUNDRED);
        userNumber.addNumber((num % Numbers.HUNDRED) / Numbers.TEN);
        userNumber.addNumber(num % Numbers.TEN);
    }
}
