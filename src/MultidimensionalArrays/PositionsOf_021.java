package MultidimensionalArrays;

import Methods.Utils_Matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class PositionsOf_021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = Utils_Matrix.readMatrix(scanner);


        int numToFind = Integer.parseInt(scanner.nextLine());

        ArrayList<String> outputLines = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == numToFind) {
                    outputLines.add(row + " " + col);
                }
            }
        }
        String output = formatOutput(outputLines);

        System.out.println(output);
    }

    private static String formatOutput(ArrayList<String> outputLines) {
        if (outputLines.isEmpty()) {
            return "not found";
        }
        return String.join(System.lineSeparator(), outputLines);
    }
}