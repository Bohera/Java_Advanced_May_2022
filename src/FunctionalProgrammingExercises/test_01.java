package FunctionalProgrammingExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class test_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<String, Integer> myFunc = s -> Integer.parseInt(s);


    }
    public static Integer myFunc (String s){
        return Integer.parseInt(s);
    }
}
