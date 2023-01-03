package view;

import model.Judgement;

public class ResultWindow {
    public void showResult(Judgement judgement) {
        if(judgement.getStrike() == 3){
            System.out.println("[ 결과 ] BASEBALL WIN~!");
        }else {
            System.out.println("[ 결과 ] Strike : " + judgement.getStrike() + "   Ball : " + judgement.getBall());
        }
    }
}
