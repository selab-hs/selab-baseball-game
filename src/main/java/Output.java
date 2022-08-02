public class Output {

    public void output(int ball, int strike) {
        if(strike == 3) {
            System.out.println("BASEBALL WIN~!");
            return;
        }

        System.out.println(ball + " " + "ball / " + strike + " strike");
    }

    public void printPlayBaseballGame() {
        System.out.println("Play Baseball Game");
    }

}
