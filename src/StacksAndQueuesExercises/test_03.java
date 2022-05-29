package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class test_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        System.out.println(queue.contains(2));

    }
}
