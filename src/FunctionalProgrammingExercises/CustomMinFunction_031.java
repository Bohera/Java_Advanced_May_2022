package FunctionalProgrammingExercises;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction_031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], Integer> number = arr -> Arrays.stream(arr).min().getAsInt();
        Function<int[], Integer> number2 = arr -> Collections.min(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        System.out.println(number.apply(numbers));

    }

    public static int smallestInt(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}
