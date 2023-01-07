package service;

import dto.ResultDto;

public class EndGameService {
    public void endGame(ResultDto resultDto){
        if(resultDto.getStrikeDto().getStrike()==3){
            System.exit(0);
        }
    }
}