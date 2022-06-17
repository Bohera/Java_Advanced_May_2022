package ExamPreparation.MouseAndCheese;

import java.util.Scanner;

public class MouseAndCheese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[][] territory = new String[n][n];

        int[] mousePosition = new int[2];

        for (int row = 0; row < n; row++) {
            String[] inputLine = scanner.nextLine().split("");
            territory[row] = inputLine;
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (territory[row][col].equals("M")) {
                    mousePosition[0] = row;
                    mousePosition[1] = col;
                }
            }
        }

        String command = scanner.nextLine();

        int cheeseEaten = 0;
        boolean ifMouseMissing = false;
        boolean isBonus = false;

        while (!command.equals("end") && mousePosition[0] != -1) {
            switch (command) {
                case "up":
                    isBonus = false;
                    if (mousePosition[0] - 1 < 0) {
                        territory[mousePosition[0]][mousePosition[1]] = "-";
                        mousePosition[0] = -1;
                        ifMouseMissing = true;
                        continue;
                    } else if (territory[mousePosition[0] - 1][mousePosition[1]].equals("c")) {
                        cheeseEaten++;
                    } else if (territory[mousePosition[0] - 1][mousePosition[1]].equals("B")) {
                        isBonus = true;
                    }
                    moveUp(territory, mousePosition);

                    break;
                case "down":
                    isBonus = false;
                    if (mousePosition[0] + 1 > n - 1) {
                        territory[mousePosition[0]][mousePosition[1]] = "-";
                        mousePosition[0] = -1;
                        ifMouseMissing = true;
                        continue;
                    } else if (territory[mousePosition[0] + 1][mousePosition[1]].equals("c")) {
                        cheeseEaten++;
                    } else if (territory[mousePosition[0] + 1][mousePosition[1]].equals("B")) {
                        isBonus = true;
                    }
                    moveDown(territory, mousePosition);

                    break;
                case "left":
                    isBonus = false;
                    if (mousePosition[1] - 1 < 0) {
                        territory[mousePosition[0]][mousePosition[1]] = "-";
                        mousePosition[0] = -1;
                        ifMouseMissing = true;
                        continue;
                    } else if (territory[mousePosition[0]][mousePosition[1] - 1].equals("c")) {
                        cheeseEaten++;
                        moveLeft(territory, mousePosition);
                    } else if (territory[mousePosition[0]][mousePosition[1] - 1].equals("B")) {
                        moveLeft(territory, mousePosition);
                        isBonus = true;
                    } else {
                        moveLeft(territory, mousePosition);
                    }
                    break;
                case "right":
                    isBonus = false;
                    if (mousePosition[1] + 1 > n - 1) {
                        territory[mousePosition[0]][mousePosition[1]] = "-";
                        mousePosition[0] = -1;
                        ifMouseMissing = true;
                        continue;
                    } else if (territory[mousePosition[0]][mousePosition[1] + 1].equals("c")) {
                        cheeseEaten++;
                        moveRight(territory, mousePosition);
                    } else if (territory[mousePosition[0]][mousePosition[1] + 1].equals("B")) {
                        moveRight(territory, mousePosition);
                        isBonus = true;
                    } else {
                        moveRight(territory, mousePosition);
                    }
                    break;
            }


            if (!isBonus) {
                command = scanner.nextLine();
            }
        }

        if (ifMouseMissing) {
            System.out.println("Where is the mouse?");
        }

        if (cheeseEaten >= 5) {
            System.out.printf("Great job, the mouse is fed %d cheeses!%n", cheeseEaten);
        } else {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n", 5 - cheeseEaten);
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(territory[row][col]);
            }
            System.out.println();
        }
    }

    private static void moveRight(String[][] territory, int[] mousePosition) {
        mousePosition[1] += 1;
        territory[mousePosition[0]][mousePosition[1]] = "M";
        territory[mousePosition[0]][mousePosition[1] - 1] = "-";
    }

    private static void moveLeft(String[][] territory, int[] mousePosition) {
        mousePosition[1] -= 1;
        territory[mousePosition[0]][mousePosition[1]] = "M";
        territory[mousePosition[0]][mousePosition[1] + 1] = "-";
    }

    private static void moveDown(String[][] territory, int[] mousePosition) {
        mousePosition[0] += 1;
        territory[mousePosition[0]][mousePosition[1]] = "M";
        territory[mousePosition[0] - 1][mousePosition[1]] = "-";
    }

    private static void moveUp(String[][] territory, int[] mousePosition) {
        mousePosition[0] -= 1;
        territory[mousePosition[0]][mousePosition[1]] = "M";
        territory[mousePosition[0] + 1][mousePosition[1]] = "-";
    }
}
