public class OutputUtil {
    public void getOutput(String message) {
        System.out.println(message);
    }

    public void getMessage(int strike, int ball) {
        isWin(strike);
        isOut(strike, ball);
        isGoing(strike, ball);
    }

    public void isWin(int strike) {
        if(strike==3) {
            getOutput("BASEBALL WIM~!");
        }
    }

    public void isOut(int strike, int ball) {
        if(strike+ball == 0) {
            getOutput("OUT!");
        }
    }

    public void isGoing(int strike, int ball) {
        if(strike!=3 && (strike+ball) != 0) {
            String message = strike + " strike " + ball + " ball";
            getOutput(message);
        }
    }

}
