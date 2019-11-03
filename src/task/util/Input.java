package task.util;

import java.util.Scanner;

public class Input {
    Scanner scanner;

    public int getInt() {
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public String gerString() {
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
