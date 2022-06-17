package ExamPreparation.MouseAndCheese;

import java.util.Scanner;

public class MouseAndCheese_02 {

    public static int row = 0;
    public static int col = 0;
    public static int eatenCheese = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[n][n];


        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            field[i] = line.toCharArray();

            if (line.contains("M")) {
                row = i;
                col = line.indexOf("M");
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.equals("up")) {
                moveMouseUp(field);

            } else if (command.equals("down")) {
                moveMouseDown(field);

            } else if (command.equals("left")) {
                moveMouseLeft(field);
                
            } else if (command.equals("right")) {
                moveMouseRight(field);
                
            }

            System.out.println();
            command = scanner.nextLine();
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    private static void moveMouseRight(char[][] field) {
        int nextRow = row;
        int nextCol = col + 1;

        if (field[nextRow][nextCol] == 'c') {
            eatenCheese++;
        } else if (field[nextRow][nextCol] == 'B') {

        }
        field[row][col] = '-';
        field[nextRow][nextCol] = 'M';
        row = nextRow;
        col = nextCol;
    }

    private static void moveMouseLeft(char[][] field) {
        int nextRow = row;
        int nextCol = col - 1;

        if (field[nextRow][nextCol] == 'c') {
            eatenCheese++;
        } else if (field[nextRow][nextCol] == 'B') {

        }
        field[row][col] = '-';
        field[nextRow][nextCol] = 'M';
        row = nextRow;
        col = nextCol;
    }

    private static void moveMouseDown(char[][] field) {
        int nextRow = row + 1;
        int nextCol = col;

        if (field[nextRow][nextCol] == 'c') {
            eatenCheese++;
        } else if (field[nextRow][nextCol] == 'B') {

        }
        field[row][col] = '-';
        field[nextRow][nextCol] = 'M';
        row = nextRow;
        col = nextCol;
    }

    private static void moveMouseUp(char[][] field) {
        int nextRow = row - 1;
        int nextCol = col;

        if (field[nextRow][nextCol] == 'c') {
            eatenCheese++;
        } else if (field[nextRow][nextCol] == 'B') {

        }
        field[row][col] = '-';
        field[nextRow][nextCol] = 'M';
        row = nextRow;
        col = nextCol;
    }
}
