package service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {
    public String userInput() {
        System.out.println("[ System ] input");
        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))
        ) {
            return bufferedReader.readLine(); //error
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
