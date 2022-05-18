package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class test_03 {

    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(13);
        stack.push(42);
        stack.push(123);
        stack.push(69);
        stack.push(73);

        int element = 123;


        // Add -> push(e), Remove Top -> pop(), look at top -> peek()

        System.out.println(stack.contains(element)); //true/false
        stack.remove(element); // premahva elementa ot stacka

        for (Integer integer : stack) { // vurti stacka bez da go izprazva
            System.out.println(integer);
        }

        while (!stack.isEmpty()) {          // vurti stacka i premahva vseki sledvasht element
            int topElement = stack.pop();
            System.out.println(topElement);
        }


    }
}
