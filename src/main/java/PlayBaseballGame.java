public class PlayBaseballGame {
    public PlayBaseballGame() {
        String randomValue = RandomValue.generateRandomValue();
        System.out.println("RandomValue : " + randomValue);
        while(true) {
            String inputValue = GetInputValue.getInputValue();
            BaseballGame(inputValue, randomValue);
        }
    }

    private void BaseballGame(String inputValue, String randomValue) {
        checkStrikeBall(inputValue,randomValue);
    }

    private void checkStrikeBall(String inputValue, String randomValue) {
        //야구게임
        Strike strike = new Strike();
        Ball ball = new Ball();
        for (int count = 0; count < 3; count++) {
            char inputChar = inputValue.charAt(count);
            if(!strike.checkStrike(inputChar, randomValue, count)){
                ball.checkBall(inputChar, randomValue, count);
            }
        }
        new PrintResult(strike.getStrike(), ball.getBall(), randomValue);
    }
}
