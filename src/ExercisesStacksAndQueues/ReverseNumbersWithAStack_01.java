package ExercisesStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (String number : numbers) {
            stack.push(Integer.parseInt(number));
        }

        for (Integer element : stack) {
            System.out.printf("%s ", stack.pop()); // peek she vika vse poslednata poziciq i nqma da pokaje vsichki chisla
        }
    }
}
