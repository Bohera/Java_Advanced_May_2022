package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squareDimensions = Integer.parseInt(scanner.nextLine());

        int rows = squareDimensions;
        int cols = squareDimensions;

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = arr;
        }
        int[] firstDiagonal = new int[rows];
        int[] secondDiagonal = new int[rows];


        for (int row = 0; row < rows; row++) {
            firstDiagonal[row] = matrix[row][row];
        }

        for (int row = rows; row > 0; row--) {
            for (int col = 0; col < cols; col++) {
                secondDiagonal[col] = matrix[row - 1][col];
                row--;
            }
        }


        for (int i : firstDiagonal) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : secondDiagonal) {
            System.out.print(i + " ");
        }

    }
}
