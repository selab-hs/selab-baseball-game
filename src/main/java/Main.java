public class Main {
    public static void main(String[] args) {
        String[] input = InputUtil.getInput();
        Baseball baseball = new Baseball(input);
        baseball.run();
    }
}
