package service;

import dto.BallDto;
import dto.ResultDto;
import dto.StrikeDto;

public class GameService {

    private final CompareService compareService = new CompareService();
    private final RandomNumberGenerateService randomNumberGenerateService = new RandomNumberGenerateService();

    private final String randomNumber;

    public GameService(){
        this.randomNumber = randomNumberGenerateService.getNonDuplicateNumber();
    }

    public ResultDto playGame(String playerNumber) {
        String[] result = compareService.notifyTheResult(playerNumber, randomNumber).split(" ");

        return new ResultDto(new BallDto(Integer.parseInt(result[0]))
                ,new StrikeDto(Integer.parseInt(result[1])));
    }
}