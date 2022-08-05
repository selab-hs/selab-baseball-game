import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Input {

    public String input() {
        System.out.println("\n1~9 사이의 숫자 3개를 입력해 주세요.");
        return new Scanner(System.in).nextLine();
    }

    public List<Integer> toNumbers(String str) {
        List<Integer> numbers = Pattern.compile("").splitAsStream(str).map(Integer::parseInt).collect(Collectors.toList());

        validateForNumberLength(numbers);
        validateForDuplication(numbers);

        return numbers;
    }

    public void validateForNumberLength(List<Integer> numbers) {
        if(numbers.size() > 3 || numbers.size() < 3 || numbers.contains(0)) {
            throw new RuntimeException("1~9 사이의 3자리 숫자를 입력해 주세요.");
        }
    }

    public void validateForDuplication(List<Integer> numbers) {
        int count = (int) numbers.stream().distinct().count();

        if (count < 3) {
            throw new RuntimeException("중복값이 있습니다.");
        }
    }
}
