package JavaAdvancedExam25June2022.StickyFingers;

import java.util.Scanner;

public class Main {
    private static int moneyRob = 0;
    private static int dRow = -1;
    private static int dCol = -1;
    private static boolean isCaught = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] town = new char[n][n];

        String[] commandLine = scanner.nextLine().split(",");

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().replaceAll(" ","");
            town[i] = line.toCharArray();

            if (line.contains("D")) {
                dRow = i;
                dCol = line.indexOf("D");
            }
        }

        for (int i = 0; i < commandLine.length; i++) {
            String command = commandLine[i];
            if (command.equals("up")) {
                move(town, - 1, 0);

            } else if (command.equals("down")) {
                move(town, + 1, 0);

            } else if (command.equals("left")) {
                move(town, 0, - 1);

            } else if (command.equals("right")) {
                move(town,  0, + 1);

            }
            if (isCaught) {
                break;
            }
        }

        if (!isCaught) {
            System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", moneyRob);
        } else {
            System.out.printf("You got caught with %d$, and you are going to jail.%n", moneyRob);
        }

        print(town);

    }

    private static void print(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
                if (j < matrix[0].length - 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void move(char[][] matrix, int rowMutator, int colMutator) {
        int nextRow = dRow + rowMutator;
        int nextCol = dCol + colMutator;

        if (!isInBounds(matrix, nextRow, nextCol)) {
            System.out.println("You cannot leave the town, there is police outside!");
            return;
        }

        if (matrix[nextRow][nextCol] == '$') {
            moneyRob += nextRow * nextCol;
            System.out.printf("You successfully stole %d$.%n", nextRow * nextCol);
        } else if (matrix[nextRow][nextCol] == 'P') {
            matrix[dRow][dCol] = '+';
            matrix[nextRow][nextCol] = '#';
            isCaught = true;
            return;
        }
        matrix[dRow][dCol] = '+';
        matrix[nextRow][nextCol] = 'D';
        dRow = nextRow;
        dCol = nextCol;


    }

    private static boolean isInBounds(char[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }
}
