public class Output {
    public void output(int strike, int ball) {
        if(strike == 3) {
            System.out.println("BASEBALL WIN~!");
            return;
        }

        System.out.println();
        System.out.println(ball + "ball");
        System.out.println(strike + "strike");
    }
}
