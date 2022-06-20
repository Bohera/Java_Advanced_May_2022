package ExamPreparationExercises.Bomb;

import java.util.Scanner;

public class Bomb {
    private static int currentRow = 0;
    private static int currentCol = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dimension = Integer.parseInt(scanner.nextLine());
        String[] directions = scanner.nextLine().split(",");

        String[][] field = new String[dimension][dimension];

        int bombsCount = 0;


        for (int i = 0; i < dimension; i++) {
            String[] tempRow = scanner.nextLine().split(" ");

            for (int j = 0; j < tempRow.length; j++) {
                if (tempRow[j].equals("B")) {
                    bombsCount++;
                }
                if (tempRow[j].equals("s")) {
                    currentRow = i;
                    currentCol = j;
                }
            }
            field[i] = tempRow;
        }

        boolean reachedEnd = false;

        for (int i = 0; i < directions.length; i++) {
            switch (directions[i]) {
                //up - (-1,0)
                //down - (+1,0)
                //left - (0,-1)
                //right - (0,+1)
                case "up":
                    if (reachedEnd){
                        break;
                    }
                    if (isInBounds(field,currentRow - 1, currentCol)) {
                        if (field[currentRow - 1][currentCol].equals("e")) {
                            move(field, -1, 0);
                            reachedEnd = true;
                            break;
                        }
                        if (field[currentRow - 1][currentCol].equals("B")) {
                            bombsCount--;
                            System.out.println("You found a bomb!");
                        }
                        move(field, -1, 0);
                    }
                    break;
                case "down":
                    if (reachedEnd){
                        break;
                    }
                    if (isInBounds(field,currentRow + 1, currentCol)) {
                        if (field[currentRow + 1][currentCol].equals("e")) {
                            move(field, +1, 0);
                            reachedEnd = true;
                            break;
                        }
                        if (field[currentRow + 1][currentCol].equals("B")) {
                            bombsCount--;
                            System.out.println("You found a bomb!");
                        }
                        move(field, +1, 0);
                    }
                    break;
                case "left":
                    if (reachedEnd){
                        break;
                    }
                    if (isInBounds(field,currentRow, currentCol - 1)) {
                    if (field[currentRow][currentCol - 1].equals("e")) {
                        move(field, 0, -1);
                        reachedEnd = true;
                        break;
                    }
                    if (field[currentRow][currentCol - 1].equals("B")) {
                        bombsCount--;
                        System.out.println("You found a bomb!");
                    }
                        move(field, 0, -1);
                }
                    break;
                case "right":
                    if (reachedEnd){
                        break;
                    }
                    if (isInBounds(field,currentRow, currentCol + 1)) {
                        if (field[currentRow][currentCol + 1].equals("e")) {
                            move(field, 0, +1);
                            reachedEnd = true;
                            break;
                        }
                        if (field[currentRow][currentCol + 1].equals("B")) {
                            bombsCount--;
                            System.out.println("You found a bomb!");
                        }
                        move(field, 0, +1);
                    }
                    break;
            }
        }

        if (bombsCount != 0 && !reachedEnd) {
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)",bombsCount ,currentRow , currentCol);
        } else if (bombsCount == 0) {
            System.out.println("Congratulations! You found all bombs!");
        } else {
            System.out.printf("END! %d bombs left on the field", bombsCount);
        }
    }

    private static void move(String[][] field, int mutatorRow, int mutatorCol) {
        field[currentRow + mutatorRow][currentCol + mutatorCol] = "s";
        field[currentRow][currentCol] = "+";
        currentRow += mutatorRow;
        currentCol += mutatorCol;
    }

    private static boolean isInBounds(String[][] field, int r, int c) {
        return r >= 0 && r < field.length && c >= 0 && c < field[r].length;
    }

}
