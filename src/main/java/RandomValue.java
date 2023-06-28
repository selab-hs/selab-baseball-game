import java.util.Random;

public class RandomValue {
    private static String randomValue = "";

    public RandomValue(){
        System.out.println("RandomValue 실행");
        Random random = new Random();
        randomValue = Integer.toString(random.nextInt(900) + 100); //100 ~ 999 백의 자리 0은 제외
    }

    public static String getRandomValue(){
        return randomValue;
    }

}
