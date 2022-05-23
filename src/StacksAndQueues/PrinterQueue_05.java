package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!input.equals("print")) {

            if (input.equals("cancel") && queue.size() == 0) {
                System.out.println("Printer is on standby");
            } else if (input.equals("cancel")) {
                System.out.printf("Canceled %s%n", queue.pop()); ;
            } else {
                queue.offer(input);
            }
            input = scanner.nextLine();
        }
        for (String s : queue) {
            System.out.println(queue.pop());
        }
    }
}
