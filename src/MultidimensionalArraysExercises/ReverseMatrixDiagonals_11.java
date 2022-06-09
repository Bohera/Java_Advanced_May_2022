package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = currentRow;
        }
        int currentRow = rows - 1;
        int currentCol = cols - 1;

        for (int i = 0; i < rows + cols - 1; i++) {
            diagonal(currentRow, currentCol, matrix);
            currentCol--;
            System.out.println();
        }
    }
    private static void diagonal(int row, int col,int[][] matrix){
        while (row >= 0 && col < matrix[0].length) {
            if (row < matrix.length && col >= 0) {
                System.out.print(matrix[row][col] + " ");
            }
            row--;
            col++;
        }
    }
}
