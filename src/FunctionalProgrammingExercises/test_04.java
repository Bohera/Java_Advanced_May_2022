package FunctionalProgrammingExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class test_04 {
    public static void main(String[] args) {
        ToIntFunction<String> toIntFunction = Integer::parseInt;
        Function<String, Integer> function = Integer::parseInt;

        List<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");

        //numbers.stream().map(function)
        //numbers.stream().mapToInt(toIntFunction)
    }
}
