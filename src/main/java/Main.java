public class Main {
    public static void main(String[] args) {
        System.out.println("Play Baseball Game");
        RandomValue randomValue = new RandomValue();
        GetInputValue getInputValue = new GetInputValue();

        CheckValue checkValue = new CheckValue(getInputValue.getInputValue(),RandomValue.getRandomValue());
    }
}
