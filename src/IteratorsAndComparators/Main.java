package IteratorsAndComparators;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> strings = List.of();

        printString("Hello", "World", "!");
        printString("Hello", "World");
        printString(13, 73);

        printString();

    }
    public static <T> void printString(T... strings) {
        if (strings.length == 0) {
            System.out.println("Please add input!");
        }
        Arrays.stream(strings).forEach(System.out::println);
    }

}
