public class Strike implements BaseBallResult{
    private int strike;
    @Override
    public void checkInput(char inputChar, String randomValue, int count) {
        if(inputChar == randomValue.charAt(count)){
            strike++;
        }
    }

    @Override
    public int getResult() {
        return strike;
    }
}
