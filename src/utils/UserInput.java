package utils;

import java.util.Scanner;

public class UserInput {
    private Scanner user_input = new Scanner(System.in);

    public int getInt() {
        return user_input.nextInt();
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        return user_input.nextInt();
    }

    public void pressEnter() {
        user_input.nextLine();
    }
}
