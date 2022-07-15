package baseball.output;

import baseball.run.CompareNumber;

public class Output {
    public void output(String str) {
        System.out.println(str);
    }

    public void outputResult(int strike, int ball) {
        if(strike == CompareNumber.THREE){
            System.out.println("3 Strike !");
        }

        System.out.println("Strike : " + strike + ", Ball : " + ball);
    }
}
