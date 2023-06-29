import java.util.regex.Pattern;

public class PlayBaseballGame {
    public PlayBaseballGame() {
        RandomValue rv = new RandomValue();
        String randomValue = RandomValue.getRandomValue();
        System.out.println("RandomValue : " + RandomValue.getRandomValue());
        while(true) {
            String inputValue = GetInputValue.getInputValue();
            checkValue(inputValue, randomValue);
        }
    }

    private void checkValue(String inputValue, String randomValue) {
        //야구게임
        checkAnswer(inputValue,randomValue);
        checkBaseball(inputValue,randomValue);
    }

    private void checkBaseball(String inputValue, String randomValue) {
        int strike = 0;
        int ball = 0;

        // 입력과 난수를 각 자리별로 비교
        for (int i = 0; i < 3; i++) {
            char inputChar = inputValue.charAt(i);

            if (inputChar == randomValue.charAt(i)) {
                strike++;
            } else if (randomValue.contains(String.valueOf(inputChar))) {
                ball++;
            }
        }
       printResult(strike,ball);
    }

    private void printResult(int strike, int ball) {
        System.out.println(strike + " Strike, " + ball + " Ball");
    }

    private void checkAnswer(String inputValue, String randomValue) {
        if(inputValue.equals(randomValue)) {
            System.out.println("BASEBALL WIN~");
            System.out.println("RandomValue : " + RandomValue.getRandomValue());
            System.exit(0);
        }
    }





}
