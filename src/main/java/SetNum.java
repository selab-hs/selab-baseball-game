import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SetNum {

    int baseballNum;
    int numLength=3;
    int digit=(int) Math.pow(10, numLength - 1);

    public void getNum() {

        while(!checkNum()){
            System.out.println("1~9 사이의 중복되지 않는 " + numLength + "개의 숫자를 입력해주세요. (예. 123)");
            Scanner sc = new Scanner(System.in);
            this.baseballNum = sc.nextInt();
            if (!checkNum()) {
                System.out.println("잘못 입력하셨습니다.");
            }
        }

    }

    public void getRandomNum() {
        Random rd = new Random();
        do{
            this.baseballNum = rd.nextInt((int) Math.pow(10, numLength));
        }
        while(checkDupulication()==0);
    }

    private boolean checkNum() {

        return checkDigit()!=0&& checkDupulication()!=0 ;

    }

    private int checkDupulication() {
        List<Integer> list = new ArrayList<>();

        int temp = baseballNum;

        for (int i = 0; i < numLength; i++) {
            int num = temp % 10;

            if (list.contains(num)) {
                return 0;
            }

            list.add(num);
            temp /= 10;
        }

        return 1;
    }

    private int checkDigit() {
        return (this.baseballNum / this.digit) <= 0 ||(this.baseballNum / this.digit)>=10? 0 : 1;
    }

}
