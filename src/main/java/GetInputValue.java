import java.util.Scanner;

public class GetInputValue {
    public String getInputValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("값 입력 : ");
        return sc.nextLine();
    }
}
