public class PlayBaseballGame {
    public PlayBaseballGame() {
        String randomValue = RandomValue.generateRandomValue();
        System.out.println("RandomValue : " + randomValue);     //Test 위한 코드, 최종 제출 시에는 제거
        while(true) {
            String inputValue = GetInputValue.getInputValue();
            BaseballGame(inputValue, randomValue);
        }
    }

    private void BaseballGame(String inputValue, String randomValue) {
        //야구게임
        Strike strike = new Strike();
        Ball ball = new Ball();
        checkBallStrike(strike, ball, inputValue, randomValue);
        new PrintResult(strike.getResult(), ball.getResult(), randomValue);
    }

    private void checkBallStrike(Strike strike, Ball ball, String inputValue, String randomValue) {

        for (int count = 0; count < 3; count++) {
            char inputChar = inputValue.charAt(count);
            strike.checkInput(inputChar, randomValue, count);
            ball.checkInput(inputChar, randomValue, count);
        }
    }

}
