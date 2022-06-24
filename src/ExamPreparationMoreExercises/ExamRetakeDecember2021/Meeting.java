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
            int currentMale = maleStack.pop();
            if (currentMale <= 0) {
                if (!maleStack.isEmpty()) {
                    currentMale = maleStack.pop();
                } else {
                    break;
                }
            }

            if (currentMale % 25 == 0) {
                if (!maleStack.isEmpty()) {
                    currentMale = maleStack.pop();
                } else {
                    break;
                }
                if (!maleStack.isEmpty()) {
                    currentMale = maleStack.pop();
                } else {
                    break;
                }
            }

            int currentFemale = femaleQueue.pop();

            if (currentFemale <= 0) {
                if (!femaleQueue.isEmpty()) {
                    currentFemale = femaleQueue.pop();
                } else {
                    break;
                }
            }

            if (currentFemale % 25 == 0) {
                if (!femaleQueue.isEmpty()) {
                    currentFemale = femaleQueue.pop();
                } else {
                    maleStack.push(currentMale);
                    break;
                }
                if (!femaleQueue.isEmpty()) {
                    currentFemale = femaleQueue.pop();
                } else {
                    maleStack.push(currentMale);
                    break;
                }
            }

            if (currentMale == currentFemale) {
                matchedCount++;
            } else {
                if (currentMale - 2 > 0) {
                    maleStack.push(currentMale - 2);
                }
            }
        }
        System.out.printf("Matches: %d%n", matchedCount);

        if (maleStack.isEmpty()) {
            System.out.println("Males left: none");
        } else {
            System.out.print("Males left: ");
            int maleCount = maleStack.size();
            for (int i = 0; i < maleCount; i++) {
                System.out.print(maleStack.pop());
                if (i < maleCount - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        if (femaleQueue.isEmpty()) {
            System.out.println("Females left: none");
        } else {
            System.out.print("Females left: ");
            int femaleCount = femaleQueue.size();
            for (int i = 0; i < femaleCount; i++) {
                System.out.print(femaleQueue.pop());
                if (i < femaleCount - 1) {
                    System.out.print(", ");
                }
            }
        }

    }
}
