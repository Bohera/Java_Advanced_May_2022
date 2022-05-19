package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputs = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();

//        for (int i = 0; i < inputs.length; i++) {
//            stack.push(inputs[i]);
//        }

        Collections.addAll(stack, inputs);


        for (String s : stack) {
            System.out.println(s);
        }

    }
}
