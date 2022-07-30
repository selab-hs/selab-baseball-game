public class OutputUtil {

    public static void getOutput(String message) {
        System.out.println(message);
    }

    public static String getMessage(int ball, int strike) {
        String message = "";
        if(strike > 0) {
            message = strike + " strike";
        }
        if(ball > 0) {
            message = ball + " ball";
        }
        if(strike > 0 && ball > 0) {
            message = ball + " ball / " + strike + " strike";
        }
        if(strike == 3) {
            message = "BASEBALL WIN ~!";
        }
        return message;
    }
}
