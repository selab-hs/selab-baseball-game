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
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < 3; i++) {
            char inputChar = inputValue.charAt(i);

            if (inputChar == randomValue.charAt(i)) {
                strike++;
            } else if (randomValue.contains(String.valueOf(inputChar))) {
                ball++;
            }
        }
        new PrintResult(strike, ball, randomValue);
    }



}
