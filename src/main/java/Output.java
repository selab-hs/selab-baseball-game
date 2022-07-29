public class Output {

    public void output(int[] result) {
        if(result[1] == 3) {
            System.out.println("BASEBALL WIN~!");
            return;
        }

        System.out.println(result[0] + " " + "ball / " + result[1] + " strike");
    }

    public void playBaseballGame() {
        System.out.println("Play Baseball Game");
    }

}
