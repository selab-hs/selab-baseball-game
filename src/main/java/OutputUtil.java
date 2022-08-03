public class OutputUtil {
    public void getOutput(String message) {
        System.out.println(message);
    }

    public String getMessage(int strike, int ball) {
        if (strike == 3) {
            return "BASEBALL WIN~!";
        }
        if (strike == 0 && ball == 0) {
            return "Out!";
        }
        return strike + " strike " + ball + " ball";
    }
}
