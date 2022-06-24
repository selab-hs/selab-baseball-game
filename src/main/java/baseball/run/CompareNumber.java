package baseball.run;

import baseball.input.InputNumber;
import baseball.output.Output;
import baseball.random.RandomNumber;

import java.util.List;

public class CompareNumber {
    private static final int THREE = 3;

    private int strike;
    private int ball;

    CompareNumber(RandomNumber randomNum){
        do{
            valueInitialize();
            compareNumber(randomNum, new InputNumber());
            Output.print(outputResult());
        }while(strike!=THREE);
    }

    private void valueInitialize(){
        strike = 0;
        ball = 0;
    }

    private void compareNumber(RandomNumber randomNum, InputNumber inputNum) {
        List<Integer> randomNums = randomNum.getList().getRandomNumList();
        List<Integer> inputNums = inputNum.getList().getInputNumList();

        for(int i=0; i<randomNums.size();i++){
            if(randomNums.get(i).equals(inputNums.get(i))){
                strike++;
                continue;
            }
            if(randomNums.contains(inputNums.get(i))){
                ball++;
            }
        }
    }

    private String outputResult(){
        return strike == THREE ? "3 Strike !" : "Strike : " + strike + ", Ball : " + ball;
    }
}
