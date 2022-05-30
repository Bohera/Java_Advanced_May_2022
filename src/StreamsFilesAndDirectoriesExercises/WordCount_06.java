package StreamsFilesAndDirectoriesExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class WordCount_06 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(new FileReader("Resources/words.txt"));
             Scanner textScanner = new Scanner(new FileReader("Resources/text.txt"));
             PrintWriter pw = new PrintWriter("Resources/output.txt")) {

            LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<>();

            Arrays.stream(scan.nextLine().split("\\s+")).forEach(word -> wordMap.put(word, 0));

            while (textScanner.hasNext()) {
                String textInput = textScanner.next();
                if (wordMap.containsKey(textInput)) {
                    int occurrences = wordMap.get(textInput);
                    occurrences++;
                    wordMap.put(textInput, occurrences);
                }
            }

            wordMap.entrySet().forEach(entry -> pw.printf("%s - %d%n", entry.getKey(),entry.getValue()));  //wordMap.forEach((k,v) -> pw.printf("%s - %d%n", k,v));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
