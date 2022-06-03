package FunctionalProgrammingExercises;

import java.util.List;
import java.util.Scanner;
import java.util.function.*;

public class test_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Function<приема, връща>
        Function<String, Integer> myFunc = s -> Integer.parseInt(s);
        Function<String, Integer> myFunc1 = Integer::parseInt;
        Function<String, String> func = s -> s + "Bravo";
        //UnaryOperator<приема/връща>
        UnaryOperator<String> un = s -> s + "Bravo";
        // връща boolean true/false
        Predicate<String> pred = s -> s.equals("Pesho");
        //декларира какво връща, не приема нищо
        Supplier<String> supp = () -> "Gosho";
        //приема тип данни и не връща нищо
        Consumer<String> print = System.out::println;

        BiConsumer<String, Integer> biConsumer = (text, number) -> System.out.println(text + number);
        BiPredicate<String, Integer> biPredicate = (text, number) -> text.length() > number;
        BiFunction<String, Integer, Integer> biFunction = (text, number) -> text.length() + number;
        BinaryOperator<String> binaryOperator = (text, text2) -> text + text2; // Bi UnaryOperator



    }
}
