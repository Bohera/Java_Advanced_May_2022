package MultidimensionalArraysExercises;

import java.util.Scanner;

public class TheHeiganDance_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playerHealth = 18500;
        double heiganHealth = 3_000_000;

        int playerRow = 7;
        int playerCol = 7;

        int plagueCloudDamage = 3500;
        int eruptionDamage = 6000;
        double damageToHeigan = Double.parseDouble(scanner.nextLine());


        String spell = "";
        boolean isPlagueActive = false;

        while (playerHealth > 0 && heiganHealth > 0) {
            int[][] danceFloor = new int[15][15];

            for (int row = 0; row < 15; row++) {
                for (int col = 0; col < 15; col++) {
                    danceFloor[row][col] = 0;
                }
            }

            heiganHealth -= damageToHeigan;
            if (isPlagueActive) {
                playerHealth -= plagueCloudDamage;
            }
            isPlagueActive = false;

            if (playerHealth <= 0 || heiganHealth <= 0) break;

            String[] spellCommand = scanner.nextLine().split("\\s+");

            spell = spellCommand[0];
            int spellRow = Integer.parseInt(spellCommand[1]);
            int spellCol = Integer.parseInt(spellCommand[2]);

            for (int row = Math.max(0, spellRow - 1); row <= Math.min(14, spellRow + 1); row++) {
                for (int col = Math.max(0, spellCol - 1); col <= Math.min(14, spellCol + 1); col++) {
                    danceFloor[row][col] = -1;
                }
            }
            if (danceFloor[playerRow][playerCol] == -1) {
                if (playerRow - 1 >= 0 && danceFloor[playerRow - 1][playerCol] != -1) {
                    playerRow--;
                } else if (playerCol + 1 <= 14 && danceFloor[playerRow][playerCol + 1] != -1) {
                    playerCol++;
                } else if (playerRow + 1 <= 14 && danceFloor[playerRow + 1][playerCol] != -1) {
                    playerRow++;
                } else if (playerCol - 1 >= 0 && danceFloor[playerRow][playerCol - 1] != -1) {
                    playerCol--;
                } else if (heiganHealth > 0) {
                    switch (spell) {
                        case "Cloud":
                            playerHealth -= plagueCloudDamage;
                            isPlagueActive = true;
                            spell = "Plague Cloud";
                            break;
                        case "Eruption":
                            playerHealth -= eruptionDamage;
                            break;


                    }
                }
            }
        }
        if (heiganHealth <= 0) {
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.printf("Heigan: %.2f%n", heiganHealth);
        }

        if (playerHealth <= 0) {
            System.out.printf("Player: Killed by %s%n", spell);
        } else {
            System.out.printf("Player: %d%n", playerHealth);
        }
        System.out.printf("Final position: %d, %d", playerRow, playerCol);
    }

}

