import java.util.*;
import java.util.stream.Stream;

public class Input {
    private ArrayList<Integer> numbers = new ArrayList<>();

    public ArrayList<Integer> input() {
        clear();
        System.out.println("\n" + "숫자 3개를 입력해 주세요. (예: 123)");
        String[] number = inputData();

        while (checkForDuplicates(number) == true || checkForLength(number) == true) {
            System.out.println("\n" + "입력값은 중복이 없어야 하며 3자리여야 합니다. 재입력해 주세요.");
            number = inputData();
        }

        for (int i = 0; i < 3; i++) {
            numbers.add(Integer.parseInt(number[i]));
        }

        return numbers;
    }

    public void clear() {
        numbers.clear();
    }

    public String[] inputData() {
        return new Scanner(System.in).nextLine().split("");
    }

    private static boolean checkForLength(String[] nums) {
        return nums.length > 3 || nums.length < 3;
    }

    private static boolean checkForDuplicates(String[] nums) {
        Long count = Stream.of(nums).distinct().count();
        return nums.length != count;
    }
}
