package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");

        ArrayDeque<String> kidsQueue = new ArrayDeque<>();
        Collections.addAll(kidsQueue, names);
        int tossCount = Integer.parseInt(scanner.nextLine());

        while (kidsQueue.size() > 1) {
            for (int i = 1; i < tossCount; i++) {
                kidsQueue.offer(kidsQueue.poll());
            }
            System.out.println("Removed " + kidsQueue.poll());
        }

        System.out.println("Last is " + kidsQueue.poll());

    }
}
