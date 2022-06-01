package MultidimensionalArraysExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation_061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String degreeString = scanner.nextLine().split("[()]")[1];

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

        int rows = textLines.size();
        int cols = longest.length();

        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = textLines.get(row).toCharArray();
        }

        int degree = Integer.parseInt(degreeString) % 360;

        rotateMatrixAndPrint(rows, cols, matrix, degree);
    }

    private static void rotateMatrixAndPrint(int rows, int cols, char[][] matrix, int degree) {
        switch (degree) {
            case 0:
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 90:
                for (int col = 0; col < cols; col++) {
                    for (int row = rows - 1; row >= 0; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int row = rows - 1; row >= 0; row--) {
                    for (int col = cols - 1; col >= 0; col--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int col = cols - 1; col >= 0; col--) {
                    for (int row = 0; row < rows; row++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
        }
    }

    private static void fillWithSpaces(List<String> textLines, String longest) {
        for (int i = 0; i < textLines.size(); i++) {
            StringBuilder tempText = new StringBuilder(textLines.get(i));
            int diff = longest.length() - tempText.length();
            if (tempText.toString().length() < longest.length()) {
                for (int j = 0; j < diff; j++) {
                    tempText.append(" ");
                }
            }
            textLines.set(i, tempText.toString());
        }

    }
}
