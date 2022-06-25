package JavaAdvancedExam25June2022.ChocolateTime;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Double> milkQueue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Double> cacaoStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .forEach(cacaoStack::push);

        Map<String, Integer> chocolateMade = new TreeMap<>();

        while (!milkQueue.isEmpty() && !cacaoStack.isEmpty()) {
            double currentMilk = milkQueue.pop();
            double currentCacao = cacaoStack.pop();
            double calc = (currentCacao / (currentMilk + currentCacao)) * 100;
            if (calc == 30) {
                chocolateMade.putIfAbsent("Milk Chocolate", 0);
                chocolateMade.put("Milk Chocolate", chocolateMade.get("Milk Chocolate") + 1);
            } else if (calc == 50) {
                chocolateMade.putIfAbsent("Dark Chocolate", 0);
                chocolateMade.put("Dark Chocolate", chocolateMade.get("Dark Chocolate") + 1);
            } else if (calc == 100) {
                chocolateMade.putIfAbsent("Baking Chocolate", 0);
                chocolateMade.put("Baking Chocolate", chocolateMade.get("Baking Chocolate") + 1);
            } else {
                milkQueue.offer(currentMilk + 10);
            }
        }

        if (chocolateMade.size() < 3) {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        } else {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        }

        chocolateMade.entrySet().stream().forEach(k -> System.out.println("# " + k.getKey() + " --> " + k.getValue()));
    }
}
