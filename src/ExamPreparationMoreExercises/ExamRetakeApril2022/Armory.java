package ExamPreparationMoreExercises.ExamRetakeApril2022;

import java.util.Scanner;

public class Armory {
    private static int mOneRow = -1;
    private static int mOneCol = -1;
    private static int mTwoRow = -1;
    private static int mTwoCol = -1;
    private static int moneySpend = 0;
    private static int aRow = -1;
    private static int aCol = -1;
    private static boolean officerIsInField = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] armory = new char[n][n];

        boolean firstMIsFound = false;

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            armory[i] = line.toCharArray();

            if (line.contains("A")) {
                aRow = i;
                aCol = line.indexOf("A");
            }
            if (line.contains("M") && !firstMIsFound) {
                mOneRow = i;
                mOneCol = line.indexOf("M");
                firstMIsFound = true;
            } else if(line.contains("M")) {
                mTwoRow = i;
                mTwoCol = line.indexOf("M");
            }
        }

        String command = scanner.nextLine();

        while (isInBounds(armory, aRow, aCol)) {
            if (command.equals("up")) {
                moveOfficer(armory, - 1, 0);

            } else if (command.equals("down")) {
                moveOfficer(armory, + 1, 0);

            } else if (command.equals("left")) {
                moveOfficer(armory, 0, - 1);

            } else if (command.equals("right")) {
                moveOfficer(armory,  0, + 1);

            }
            if (!officerIsInField) {
                break;
            }
            if (moneySpend >= 65){
                break;
            }
            command = scanner.nextLine();
        }

        if (!officerIsInField) {
            System.out.println("I do not need more swords!");
        } else {
            System.out.println("Very nice swords, I will come back for more!");
        }

        System.out.printf("The king paid %d gold coins.%n", moneySpend);

        print(armory);

    }

    private static void print(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void moveOfficer(char[][] armory, int rowMutator, int colMutator) {
        int nextRow = aRow + rowMutator;
        int nextCol = aCol + colMutator;

        if (!isInBounds(armory, nextRow, nextCol)) {
            armory[aRow][aCol] = '-';
            officerIsInField = false;
            return;
        }

        if (Character.isDigit(armory[nextRow][nextCol])) {
            moneySpend += Integer.parseInt(armory[nextRow][nextCol] + "");
        } else if (nextRow == mOneRow && nextCol == mOneCol) {
            armory[mOneRow][mOneCol] = '-';
            nextRow = mTwoRow;
            nextCol = mTwoCol;
        } else if (nextRow == mTwoRow && nextCol == mTwoCol) {
            armory[mTwoRow][mTwoCol] = '-';
            nextRow = mOneRow;
            nextCol = mOneCol;
        }
        armory[aRow][aCol] = '-';
        armory[nextRow][nextCol] = 'A';
        aRow = nextRow;
        aCol = nextCol;


    }

    private static boolean isInBounds(char[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }
}
