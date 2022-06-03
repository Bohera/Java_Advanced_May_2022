package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        for (String s : list) {
            System.out.println(s);
        }
    }
}
