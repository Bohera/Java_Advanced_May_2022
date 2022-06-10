package MultidimensionalArraysExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crossfire_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];

        int filler = 1;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = filler;
                filler++;
            }
        }
        String commandString = scanner.nextLine();
        while (!commandString.equals("Nuke it from orbit")) {
            String[] command = commandString.split("\\s+");
            int targetRow = Integer.parseInt(command[0]);
            int targetCol = Integer.parseInt(command[1]);
            int radius = Integer.parseInt(command[2]);

            List<Integer> listRow = new ArrayList<>();

            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    if (row == targetRow && col > targetCol - 1 - radius && col < targetCol + 1 + radius
                            || col == targetCol && row > targetRow - 1 - radius && row < targetRow + 1 + radius) {
                        continue;
                    }
                    listRow.add(matrix[row][col]);
                }
                int[] tempArr = new int[listRow.size()];
                for (int i = 0; i < listRow.size(); i++) {
                    tempArr[i] = listRow.get(i);
                }
                matrix[row] = tempArr;
                listRow = new ArrayList<>();
            }


            commandString = scanner.nextLine();
        }
        for (int row = 0; row < rows; row++) {
            //if (matrix[row].length != 0) {
                for (int col = 0; col < matrix[row].length; col++) {
                    System.out.print(matrix[row][col] + " ");
                }
                System.out.println();
            //}
        }
    }
}
