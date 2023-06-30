package view.input;

import view.input.Input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputView implements Input {
    @Override
    public String userInput() {
        System.out.println("[ System ] input");
        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))
        ) {
            bufferedReader.close();
            return bufferedReader.readLine(); //error
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}