package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");

        ArrayDeque<String> kidsQueue = new ArrayDeque<>();
        Collections.addAll(kidsQueue, names);
        int tossToLeave = Integer.parseInt(scanner.nextLine());
        int cycleCount = 1;
        int tossesCount = 0;
        while (kidsQueue.size() > 1) {
            for (int i = 0; i < tossToLeave; i++) {
                kidsQueue.offer(kidsQueue.poll());
                tossesCount++;
            }
            if (tossesCount >= kidsQueue.size()) {
                cycleCount++;
                tossesCount -= kidsQueue.size();
            }
            int countForComposite = 1;
            for (int i = 1; i < cycleCount; i++) {
                if (countForComposite % i == 0) {
                countForComposite++;
                }
            }

            if (cycleCount == 1 || countForComposite > 2) {
                System.out.println("Removed " + kidsQueue.poll());
            } else {
                System.out.println("Prime " + kidsQueue.peek());
            }
        }
        System.out.println("Last is " + kidsQueue.poll());

    }
}
