package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixSize = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = matrixSize[0];
        int cols = matrixSize[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = arr;
        }

        int maxSum = Integer.MIN_VALUE;

        int[][] result = new int[3][3];

        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int sum = matrix[row][col]
                        + matrix[row][col + 1]
                        + matrix[row][col + 2]
                        + matrix[row + 1][col]
                        + matrix[row + 1][col + 1]
                        + matrix[row + 1][col + 2]
                        + matrix[row + 2][col]
                        + matrix[row + 2][col + 1]
                        + matrix[row + 2][col + 2];

                if (sum > maxSum) {
                    maxSum = sum;
                    result = new int[][]{
                            {matrix[row][col], matrix[row][col + 1], matrix[row][col + 2]},
                            {matrix[row + 1][col], matrix[row + 1][col + 1], matrix[row + 1][col + 2]},
                            {matrix[row + 2][col], matrix[row + 2][col + 1], matrix[row + 2][col + 2]}
                    };
                }
            }
        }
        System.out.printf("Sum = %d%n", maxSum);
        printMatrix(result);
    }
    private static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
