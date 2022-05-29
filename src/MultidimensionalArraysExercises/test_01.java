package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class test_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 2;
        int cols = 3;
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] rowInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
                matrix[row] = rowInput;
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
