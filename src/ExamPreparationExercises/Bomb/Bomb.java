package ExamPreparationExercises.Bomb;

import java.util.Scanner;

public class Bomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dimension = Integer.parseInt(scanner.nextLine());
        String[] directions = scanner.nextLine().split(",");

        String[][] field = new String[dimension][dimension];

        int bombsCount = 0;
        int currentRow = 0;
        int currentCol = 0;

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
                case "up":
                    if (isInBounds(field,currentRow - 1, currentCol)) {
                        if (field[currentRow - 1][currentCol].equals("e")) {
                            field[currentRow - 1][currentCol] = "s";
                            field[currentRow][currentCol] = "+";
                            currentRow -= 1;
                            reachedEnd = true;
                            break;
                        }
                        if (field[currentRow - 1][currentCol].equals("B")) {
                            bombsCount--;
                            System.out.println("You found a bomb!");
                        }
                        field[currentRow - 1][currentCol] = "s";
                        field[currentRow][currentCol] = "+";
                        currentRow -= 1;
                    }
                    break;
                case "down":
                    if (isInBounds(field,currentRow + 1, currentCol)) {
                        if (field[currentRow + 1][currentCol].equals("e")) {
                            field[currentRow + 1][currentCol] = "s";
                            field[currentRow][currentCol] = "+";
                            currentRow += 1;
                            reachedEnd = true;
                            break;
                        }
                        if (field[currentRow + 1][currentCol].equals("B")) {
                            bombsCount--;
                            System.out.println("You found a bomb!");
                        }
                        field[currentRow + 1][currentCol] = "s";
                        field[currentRow][currentCol] = "+";
                        currentRow += 1;
                    }
                    break;
                case "left":
                    if (isInBounds(field,currentRow, currentCol - 1)) {
                    if (field[currentRow][currentCol - 1].equals("e")) {
                        field[currentRow][currentCol - 1] = "s";
                        field[currentRow][currentCol] = "+";
                        currentCol -= 1;
                        reachedEnd = true;
                        break;
                    }
                    if (field[currentRow][currentCol - 1].equals("B")) {
                        bombsCount--;
                        System.out.println("You found a bomb!");
                    }
                    field[currentRow][currentCol - 1] = "s";
                    field[currentRow][currentCol] = "+";
                    currentCol -= 1;
                }
                    break;
                case "right":
                    if (isInBounds(field,currentRow, currentCol + 1)) {
                        if (field[currentRow][currentCol + 1].equals("e")) {
                            field[currentRow][currentCol + 1] = "s";
                            field[currentRow][currentCol] = "+";
                            currentCol += 1;
                            reachedEnd = true;
                            break;
                        }
                        if (field[currentRow][currentCol + 1].equals("B")) {
                            bombsCount--;
                            System.out.println("You found a bomb!");
                        }
                        field[currentRow][currentCol + 1] = "s";
                        field[currentRow][currentCol] = "+";
                        currentCol += 1;
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
    private static boolean isInBounds(String[][] field, int r, int c) {
        return r >= 0 && r < field.length && c >= 0 && c < field[r].length;
    }

}
