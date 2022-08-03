public class OutputUtil {
    public void getOutput(String message) {
        System.out.println(message);
    }

    public String getMessage(int strike, int ball) {
        if(strike == 3) {
            return "정답입니다!";
        }
        return strike + "strike " + ball + "ball";
    }
}
