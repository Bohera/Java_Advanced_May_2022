package ExamPreparationMoreExercises.ExamRetakeApril2022;

import java.util.*;
import java.util.stream.Collectors;

public class Blacksmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> steelQueue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> carbonStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(carbonStack::push);

        Map<String, Integer> swordsBuild = new TreeMap<>();
        swordsBuild.put("Gladius", 0);
        swordsBuild.put("Shamshir", 0);
        swordsBuild.put("Katana", 0);
        swordsBuild.put("Sabre", 0);
        int countSwords = 0;

        while (!steelQueue.isEmpty() && !carbonStack.isEmpty()) {
            int currentSteel = steelQueue.pop();
            int currentCarbon = carbonStack.pop();
            int sum = currentSteel + currentCarbon;

            if (sum == 70) {
                swordsBuild.put("Gladius", swordsBuild.get("Gladius") + 1);
                countSwords++;
            } else if (sum == 80) {
                swordsBuild.put("Shamshir", swordsBuild.get("Shamshir") + 1);
                countSwords++;
            } else if (sum == 90) {
                swordsBuild.put("Katana", swordsBuild.get("Katana") + 1);
                countSwords++;
            } else if (sum == 110) {
                swordsBuild.put("Sabre", swordsBuild.get("Sabre") + 1);
                countSwords++;
            } else {
                carbonStack.push(currentCarbon + 5);
            }
        }

        if (countSwords == 0) {
            System.out.println("You did not have enough resources to forge a sword.");
        } else {
            System.out.printf("You have forged %s swords.%n", countSwords);
        }

        if (steelQueue.isEmpty()) {
            System.out.println("Steel left: none");
        } else {
            String steelLeft = steelQueue.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
            System.out.printf("Carbon left: %s%n", steelLeft);
        }

        if (carbonStack.isEmpty()) {
            System.out.println("Carbon left: none");
        } else {
            String carbonLeft = carbonStack.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
            System.out.printf("Carbon left: %s%n", carbonLeft);

        }
        swordsBuild.entrySet().stream().filter(k -> k.getValue() > 0).forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
    }
}
