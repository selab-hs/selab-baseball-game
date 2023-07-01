public class Strike {
    private int strike;
    public Strike(){

    }
    public Strike(int strike) {
        this.strike = strike;
    }
    public boolean checkStrike(char inputChar, String randomValue, int count){
        if(inputChar == randomValue.charAt(count)){
            strike++;
            return true;
        }
        return false;
    }

    public int getStrike(){
        return strike;
    }
}
