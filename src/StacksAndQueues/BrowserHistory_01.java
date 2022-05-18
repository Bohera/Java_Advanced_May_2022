package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> history = new ArrayDeque<>();

        String currentUrl = "Blank";

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (!history.isEmpty()) {
                    currentUrl = history.pop();
                } else {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                }
            } else {
                if (!currentUrl.equals("Blank")) {
                    history.push(currentUrl);
                }

                currentUrl = input;
            }
            System.out.println(currentUrl);
            input = scanner.nextLine();
        }

    }
}
