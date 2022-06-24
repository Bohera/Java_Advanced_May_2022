package ExamPreparationMoreExercises.ExamRetakeDecember2021;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> maleStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(maleStack::push);

        ArrayDeque<Integer> femaleQueue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        int matchedCount = 0;

        while (!maleStack.isEmpty() && !femaleQueue.isEmpty()) {
            int currentMale = maleStack.peek();
            int currentFemale = femaleQueue.peek();

            if (currentMale <= 0 && currentFemale <= 0) {
                maleStack.pop();
                femaleQueue.pop();
                continue;
            }

            if (currentMale <= 0) {
                maleStack.pop();
                continue;
            }

            if (currentFemale <= 0) {
                femaleQueue.pop();
                continue;
            }

            if (currentMale % 25 == 0 && currentFemale % 25 == 0) {
                maleStack.pop();
                maleStack.pop();
                femaleQueue.pop();
                femaleQueue.pop();
                continue;
            }

            if (currentMale % 25 == 0) {
                maleStack.pop();
                maleStack.pop();
                continue;
            }

            if (currentFemale % 25 == 0) {
                femaleQueue.pop();
                femaleQueue.pop();
                continue;
            }

            if (currentMale == currentFemale) {
                maleStack.pop();
                femaleQueue.pop();
                matchedCount++;
            } else {
                maleStack.pop();
                femaleQueue.pop();
                maleStack.push(currentMale - 2);
            }
        }
        System.out.printf("Matches: %d%n", matchedCount);

        String malesLeft = maleStack.isEmpty() ? "none" : maleStack.stream().map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println("Males left: " + malesLeft);

        String femalesLeft = femaleQueue.isEmpty() ? "none" : femaleQueue.stream().map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println("Females left: " + femalesLeft);
    }
}
