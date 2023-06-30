package service.context;

import dto.BallDto;
import dto.ResultDto;
import dto.StrikeDto;
import service.compare.Comparison;

public class OverallGameService implements OverallGame {

    private final Comparison comparison;

    public OverallGameService(Comparison comparison) {
        this.comparison = comparison;
    }

    @Override
    public ResultDto playGame(String playerNumber, String randomNumber) {
        String[] result = comparison.compare(playerNumber, randomNumber).split(" ");

        return new ResultDto(new BallDto(Integer.parseInt(result[0]))
                , new StrikeDto(Integer.parseInt(result[1])));
    }
}