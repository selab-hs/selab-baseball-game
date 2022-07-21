import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Play Baseball Game");

        Input input = new Input();
        RandomNumber randomNumber = new RandomNumber();
        Comparison compareNumber = new Comparison();

        while (compareNumber.compareNumber(input.input(), randomNumber.createRandomNumber()) != 3) {

        }
    }
}
