package baseball.input;


import baseball.input.list.InputNumbers;

import java.util.Scanner;

public class InputNumber {
    private final Scanner sc = new Scanner(System.in);
    private InputNumbers sList;

    public InputNumber(){
        inputNumber();
    }

    private void inputNumber(){
        String str;
        do{
            System.out.print("Input three Number : ");
            str = sc.nextLine();

            errMsg(validateNum(str));
        }while(!validateNum(str));

        sList = new InputNumbers(Integer.parseInt(str));
    }

    private boolean validateNum(String str) {
        if(str.length() !=3) {
            return false;
        }
        return str.matches("[+-]?\\d*(\\.\\d+)?");
    }

    private void errMsg(boolean bool){
        if(!bool){
            System.out.println("잘못된 입력입니다");
        }
    }

    public InputNumbers getList(){
        return sList;
    }
}
