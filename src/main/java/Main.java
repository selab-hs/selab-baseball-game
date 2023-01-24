import controller.BaseballGameController;
import service.compare.CompareService;
import service.context.EndGameService;
import service.context.OverallGameService;
import service.context.RandomNumberGenerateService;
import view.input.InputView;
import view.output.ResultView;

public class Main {
    public static void main(String[] args) {
        System.out.println("Play Baseball Game");

        new BaseballGameController(
                new EndGameService(),
                new OverallGameService(new CompareService()),
                new ResultView(),
                new InputView(),
                new RandomNumberGenerateService()
        ).startGame();
    }
}