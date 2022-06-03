package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        UnaryOperator<List<Integer>> addFunction = numbersList -> numbersList.stream().map(el -> el + 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtractFunction = numbersList -> numbersList.stream().map(el -> el - 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiplyFunction = numbersList -> numbersList.stream().map(el -> el * 2).collect(Collectors.toList());

        String input = scanner.nextLine();

        Consumer<Integer> print = number -> System.out.printf("%d ", number);

        while (!input.equals("end")) {
            switch (input) {
                case "add":
                    numbers= addFunction.apply(numbers);
                    break;
                case "subtract":
                    numbers= subtractFunction.apply(numbers);
                    break;
                case "multiply":
                    numbers= multiplyFunction.apply(numbers);
                    break;
                case "print":
                    numbers.forEach(print);
                    System.out.println();
                    break;
            }
            input = scanner.nextLine();
        }

    }
}
