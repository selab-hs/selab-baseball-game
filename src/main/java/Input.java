import java.util.*;
import java.util.stream.Collectors;

public class Input {

    public String input() {
        System.out.println("\n1~9 사이의 숫자 3개를 입력해 주세요.");
        return new Scanner(System.in).nextLine();
    }

    public String[] inputDataSplit(String str) {
        return str.split("");
    }

    public List<Integer> arrToList(String[] str) {

        List<Integer> numbers = Arrays.asList(str).stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());

        validateForNumberLength(numbers);
        validateForDuplication(numbers);

        return numbers;
    }

    public void validateForNumberLength(List<Integer> numbers) {
        if(numbers.size() < 3 || numbers.size() > 3 || numbers.contains(0)) {
            throw new RuntimeException("1~9 사이의 3자리 숫자를 입력해 주세요.");
        }
    }

    public void validateForDuplication(List<Integer> numbers) {
        if (numbers.size() != numbers.stream().distinct().count()) {
            throw new RuntimeException("중복값이 있습니다.");
        }
    }
}
