package service.context;

import dto.ResultDto;

public class EndGameService implements EndGame {
    @Override
    public void endGame(ResultDto resultDto) {
        if (resultDto.getStrikeDto().getStrike() == 3) {
            System.exit(0);
        }
    }
}