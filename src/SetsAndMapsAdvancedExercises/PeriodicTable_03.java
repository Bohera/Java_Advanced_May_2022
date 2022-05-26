package SetsAndMapsAdvancedExercises;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linesCount = Integer.parseInt(scanner.nextLine());

        Set<String> elements = new TreeSet<>();

        for (int i = 0; i < linesCount; i++) {
            String[] elementsInput = scanner.nextLine().split("\\s+");

            Collections.addAll(elements, elementsInput);
        }

        String result = String.join(" ", elements);
        System.out.println(result);
    }
}
