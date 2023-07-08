public class Strike {
    private int strike;
    public Strike(){

    }
    public void checkStrike(char inputChar, String randomValue, int count){
        if(inputChar == randomValue.charAt(count)){
            strike++;
        }
    }

    public int getStrike(){
        return strike;
    }
}
