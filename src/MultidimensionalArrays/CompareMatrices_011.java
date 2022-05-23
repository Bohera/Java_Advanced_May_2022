package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        if (Arrays.deepEquals(firstMatrix,secondMatrix)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static int[][] readMatrix(Scanner scanner) {
        String[] dimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[0]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scanner.nextLine()
                            .split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = arr;
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
