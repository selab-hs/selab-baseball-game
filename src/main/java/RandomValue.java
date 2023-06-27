import java.util.ArrayList;
import java.util.Random;

public class RandomValue {
    static String randomValue = "";

    public void RandomValue(){
        System.out.println("RandomValue 실행");

        Random random = new Random();
        for(int i = 0 ; i < 3 ; i++) {
            int randomInt = random.nextInt();
            randomValue += randomInt;
        }
    }

    public static String getRandomValue(){
        return randomValue;
    }

}
