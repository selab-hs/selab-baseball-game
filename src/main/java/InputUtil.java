import java.util.Scanner;

public class InputUtil {
    public String[] getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().split("");
    }
}
