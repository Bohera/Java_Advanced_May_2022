package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] arr = scanner.nextLine().split("\\s+");

            matrix[row] = arr;
        }

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String[] data = command.split("\\s+");
            if (!data[0].equals("swap") || data.length != 5) {
                System.out.println("Invalid input!");
                command = scanner.nextLine();
                continue;
            }
            int r1 = Integer.parseInt(data[1]);
            int c1 = Integer.parseInt(data[2]);
            int r2 = Integer.parseInt(data[3]);
            int c2 = Integer.parseInt(data[4]);
            if (r1 < 0 || r1 > matrix.length || c1 < 0 || c1 > matrix[0].length
                    || r2 < 0 || r2 > matrix.length || c2 < 0 || c2 > matrix[0].length) {
                System.out.println("Invalid input!");
                command = scanner.nextLine();
                continue;
            }
            String temp = matrix[r1][c1];
            matrix[r1][c1] = matrix[r2][c2];
            matrix[r2][c2] = temp;
            printMatrix(matrix);

            command = scanner.nextLine();
        }


    }

    private static void printMatrix(String[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

}
