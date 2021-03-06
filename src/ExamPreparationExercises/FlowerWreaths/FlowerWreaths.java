package ExamPreparationExercises.FlowerWreaths;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class FlowerWreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // lilies stack
        // roses queue
        // sum = 15 to create wreathe, remove
        // sum > 15 remove 2 lilies
        // sum < 15 remove roses/lilies and store the sum for later
        // ends when lilies || roses == 0

        int[] inputLilies = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> liliesStack = new ArrayDeque<>();

        for (int i = 0; i < inputLilies.length; i++) {
            liliesStack.push(inputLilies[i]);
        }

        int[] inputRoses = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> rosesQueue = new ArrayDeque<>();

        for (int i = 0; i < inputRoses.length; i++) {
            rosesQueue.offer(inputRoses[i]);
        }

        int wreathsCount = 0;
        int flowersStored = 0;

        while (!liliesStack.isEmpty() && !rosesQueue.isEmpty()) {
            int currentLilies = liliesStack.pop();
            int currentRoses =  rosesQueue.pop();

            int sumOfFlowers = currentLilies + currentRoses;

            while (sumOfFlowers > 15) {
                currentLilies -= 2;
                sumOfFlowers = currentLilies + currentRoses;
            }
            if (sumOfFlowers == 15) {
                wreathsCount++;
            } else {
                flowersStored += sumOfFlowers;
            }
        }

        wreathsCount += flowersStored / 15;

        if (wreathsCount >= 5) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!", wreathsCount);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!", 5 - wreathsCount);
        }

    }
}
