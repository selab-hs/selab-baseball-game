package view;

import dto.ResultDto;

public class ResultView {
    public void showResult(ResultDto resultDto) {
        if(resultDto.getStrikeDto().getStrike() == 3){
            System.out.println("[ 결과 ] BASEBALL WIN~!");
        }else {
            System.out.println("[ 결과 ] Strike : " + resultDto.getStrikeDto().getStrike() + "   Ball : " + resultDto.getBallDto().getBall());
        }
    }
}