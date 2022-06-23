package ExamPreparationMoreExercises.ExamFebruary2022;

import java.util.*;
import java.util.stream.Collectors;

public class FoodFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Character> vowelsQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(c -> vowelsQueue.offer(c.charAt(0)));

        ArrayDeque<Character> consonantsStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(c -> consonantsStack.push(c.charAt(0)));

        //⦁	"pear"
        //⦁	"flour"
        //⦁	"pork"
        //⦁	"olive"
        String[] words = new String[]{"pear", "flour", "pork", "olive"};
        String[] foundWords = new String[]{"****", "*****", "****", "*****"};

        while (!consonantsStack.isEmpty()) {
            char currentVowel = vowelsQueue.pop();
            char currentConsonant = consonantsStack.pop();
            for (int i = 0; i < words.length; i++) {
                int indexVow = words[i].indexOf(currentVowel);
                int indexCol = words[i].indexOf(currentConsonant);
                if (indexVow >= 0) {
                    foundWords[i] = foundWords[i].substring(0, indexVow) + currentVowel + foundWords[i].substring(indexVow + 1);
                }
                if (indexCol >= 0) {
                    foundWords[i] = foundWords[i].substring(0, indexCol) + currentConsonant + foundWords[i].substring(indexCol + 1);
                }
            }
            vowelsQueue.offer(currentVowel);
        }

        List<String> output = Arrays.stream(foundWords).filter(word -> !word.contains("*")).collect(Collectors.toList());

        System.out.printf("Words found: %d%n", output.size());
        output.forEach(System.out::println);

    }
}
