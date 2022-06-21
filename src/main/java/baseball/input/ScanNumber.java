package baseball.input;

import baseball.input.list.ScanNumList;

import java.util.Scanner;

public class ScanNumber {
    private final Scanner sc = new Scanner(System.in);
    private final ScanNumList sList;

    public ScanNumber(){
        sList = new ScanNumList(scan());
    }

    private int scan(){
        while(true) {
            System.out.print("Input three Number : ");
            String str = sc.nextLine();
            System.out.println("입력한 숫자 : " + str);

            if(validateNum(str))
                return Integer.parseInt(str);
            System.out.println("잘못된 입력 \n");
        }
    }

    private boolean validateNum(String str) {
        if(str.length() !=3) {
            return false;
        }
        return str.matches("[+-]?\\d*(\\.\\d+)?");
    }

    public ScanNumList getList(){
        return sList;
    }
}
