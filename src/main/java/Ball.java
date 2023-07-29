public class Ball implements BaseBallResult{
    private int ball;
    @Override
    public void checkInput(char inputChar, String randomValue, int count) {
        if (randomValue.contains(String.valueOf(inputChar)) && !(inputChar == randomValue.charAt(count))) {
            ball++;
        }
    }

    @Override
    public int getResult() {
        return ball;
    }
}
