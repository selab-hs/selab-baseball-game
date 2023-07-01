public class Ball {
    private int ball;

    public Ball(){

    }
    public Ball(int ball) {
        this.ball = ball;
    }

    public boolean checkBall(char inputChar, String randomValue, int count) {
        if (randomValue.contains(String.valueOf(inputChar)) && !(inputChar == randomValue.charAt(count))) {
            ball++;
            return true;
        }
        return false;
    }

    public int getBall() {
        return ball;
    }
}
