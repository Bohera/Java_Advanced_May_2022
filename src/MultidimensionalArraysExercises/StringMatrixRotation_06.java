package MultidimensionalArraysExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatrixRotation_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();


        Pattern degreePattern = Pattern.compile("[A-Za-z]+[(](?<degree>[0-9]+)[)]");
        Matcher degreeMatcher = degreePattern.matcher(command);
        int degree = 0;
        while (degreeMatcher.find()) {
            String degreeString = degreeMatcher.group("degree");
            degree = Integer.parseInt(degreeString);
        }

        List<String> textLines = new ArrayList<>();
        String textInput = scanner.nextLine();
        while (!textInput.equals("END")) {
            textLines.add(textInput);
            textInput = scanner.nextLine();
        }

        String longest = "";
        for (String text : textLines) {
            longest = text.length() > longest.length() ? text : longest;
        }

        fillWithSpaces(textLines, longest);


        System.out.println();
    }

    private static void fillWithSpaces(List<String> textLines, String longest) {
        for (int i = 0; i < textLines.size(); i++) {
            StringBuilder tempText = new StringBuilder(textLines.get(i));
            if (textLines.get(i).length() < longest.length()) {
                for (int j = 0; j < (longest.length() - tempText.length()); j++) {
                    tempText.append(" ");
                }
            }
            textLines.set(i, tempText.toString());
        }
    }
}
