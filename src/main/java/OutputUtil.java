public class OutputUtil {

    public static void getOutput(String message) {
        System.out.println(message);
    }

    public static String getMessage(Strike strike, Ball ball) {
        String flag = getOutputFlag(strike, ball);
        String message = "";
        int strikeCnt = strike.getStrike();
        int ballCnt = ball.getBall();

        switch (flag) {
            case "STRIKE":
                message = strikeCnt + " strike";
                break;
            case "BALL":
                message = ballCnt + " ball";
                break;
            case "STRIKEBALL":
                message = ballCnt + " ball / " + strikeCnt + " strike";
                break;
            case "WIN":
                message = "BASEBALL WIN ~!";
                break;
        }
        return message;
    }

    private static String getOutputFlag(Strike strike, Ball ball) {
        return strike.checkPositive() + ball.checkPositive();
    }
}
