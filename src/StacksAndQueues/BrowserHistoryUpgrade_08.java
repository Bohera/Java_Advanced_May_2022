package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forwardHistory = new ArrayDeque<>();
        String currentUrl = "Blank";

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (!history.isEmpty()) {
                    forwardHistory.push(currentUrl);
                    currentUrl = history.pop();

                } else {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                }
            } else if (input.equals("forward")) {
                if (!forwardHistory.isEmpty()) {
                    history.push(currentUrl);
                    currentUrl = forwardHistory.pop();
                } else {
                    System.out.println("no next URLs");
                    input = scanner.nextLine();
                    continue;
                }
            } else {
                if (!currentUrl.equals("Blank")) {
                    history.push(currentUrl);
                    forwardHistory.clear();
                }

                currentUrl = input;
            }
            System.out.println(currentUrl);
            input = scanner.nextLine();
        }


    }
}
