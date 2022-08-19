import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Scanner;

@NoArgsConstructor
public class InputUtil {
    public List<String> getInput() {
        Scanner scanner = new Scanner(System.in);
        return List.of(scanner.nextLine().split(""));
    }
}
