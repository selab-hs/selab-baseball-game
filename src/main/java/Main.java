import java.util.List;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        RandomNumber randomNumber = new RandomNumber();
        Comparison comparison = new Comparison();

        int[] result = new int[2];

        List<Integer> randomNumbers = randomNumber.createRandomNumber();

        output.playBaseballGame();

        while(result[1] != 3) {
            List<Integer> userNumbers = input.arrToList(input.inputDataSplit(input.input()));
            result = comparison.compare(randomNumbers, userNumbers);
            output.output(result);
        }
    }
}
