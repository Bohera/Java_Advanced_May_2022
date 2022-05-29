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
        int tosses = Integer.parseInt(scanner.nextLine());
        int count = 0;
        while (kidsQueue.size() > 1) {
            for (int i = 1; i < tosses; i++) {
                kidsQueue.offer(kidsQueue.poll());
            }
            count++;
            int compCount = 0;
            for (int i = 1; i <= count; i++) {
                if (count % i == 0) {
                    compCount++;
                }
            }
            if (compCount == 1 || compCount > 2) {
                System.out.println("Removed " + kidsQueue.poll());
            } else {
                System.out.println("Prime " + kidsQueue.peek());
            }
        }

        System.out.println("Last is " + kidsQueue.poll());

    }


}



