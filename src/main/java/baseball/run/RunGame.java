package baseball.run;

import baseball.input.InputNumber;
import baseball.random.RandomNumber;

import java.util.List;

public class RunGame {
    private final RandomNumber randomNum;

    public RunGame() {
        randomNum = new RandomNumber();
    }

    public void run() {
        InputNumber scanNum;
        do{
            scanNum = new InputNumber();
        }while(!compareNumber(randomNum.getList().getRandomNumList(), scanNum.getList().getInputNumList()));
    }

    private boolean compareNumber(List<Integer> rNumList, List<Integer> inputNumList) {
        int strike = 0;
        int ball = 0;

        for(int i=0; i<rNumList.size();i++){
            if(rNumList.get(i).equals(inputNumList.get(i))){
                strike++;
                continue;
            }
            if(rNumList.contains(inputNumList.get(i))){
                ball++;
            }
        }

        return outputResult(strike, ball);
    }

    private boolean outputResult(int strike, int ball){
        if (strike == 3){
            System.out.println("3 Strike ! Game End");
            return true;
        }

        System.out.println("Strike : " + strike + ", Ball : " + ball);
        return false;
    }
}
