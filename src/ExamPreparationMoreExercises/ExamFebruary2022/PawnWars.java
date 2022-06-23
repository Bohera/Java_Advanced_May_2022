package ExamPreparationMoreExercises.ExamFebruary2022;


import java.util.Scanner;

public class PawnWars {
    public static int whiteRow = -1;
    public static int whiteCol = -1;
    public static int blackRow = -1;
    public static int blackCol = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] board = new char[8][8];

        for (int i = 0; i < 8; i++) {
            String line = scanner.nextLine();
            char[] tempRow = line.toCharArray();
            if (line.contains("w")) {
                whiteRow = i;
                whiteCol = line.indexOf("w");
            }
            if (line.contains("b")) {
                blackRow = i;
                blackCol = line.indexOf("b");
            }
            board[i] = tempRow;
        }
        String[][] positions = new String[8][8];
        int counter = 8;
        for (int row = 0; row < 8 ; row++) {
            for (int col = 0; col < 8; col++) {
                char temp = (char)('a' + col);
                positions[row][col] = temp + "" + counter;
            }
            counter--;
        }


        while (whiteRow > 0 && blackRow < 7) {
//            if (whiteRow == 0 || blackRow == 7) {
//                break;
//            }
            //white
            if (board[whiteRow - 1][whiteCol - 1] != 'b' && board[whiteRow - 1][whiteCol + 1] != 'b') {
                board[whiteRow][whiteCol] = '-';
                whiteRow--;
                board[whiteRow][whiteCol] = 'w';
            } else {
                board[whiteRow][whiteCol] = '-';
                whiteRow = blackRow;
                whiteCol = blackCol;
                blackRow = -1;
                board[whiteRow][whiteCol] = 'w';
                break;
            }
            if (whiteRow == 0) {
                break;
            }
            //black
            if (board[blackRow + 1][blackCol - 1] != 'w' && board[blackRow + 1][blackCol + 1] != 'w') {
                board[blackRow][blackCol] = '-';
                blackRow++;
                board[blackRow][blackCol] = 'b';
            } else {
                board[blackRow][blackCol] = '-';
                blackRow = whiteRow;
                blackCol = whiteCol;
                whiteRow = -1;
                board[blackRow][blackCol] = 'b';
                break;
            }
            if (blackRow == 0) {
                break;
            }
        }
        String winner = "";
        if(blackRow == -1){
            winner = "White";
            System.out.printf("Game over! %s capture on %s.", winner, positions[whiteRow][whiteCol]);
        } else if (whiteRow == -1) {
            winner = "Black";
            System.out.printf("Game over! %s capture on %s.", winner, positions[blackRow][blackCol]);
        } else if (whiteRow == 0){
            winner = "White";
            System.out.printf("Game over! %s pawn is promoted to a queen at %s.", winner, positions[whiteRow][whiteCol]);
        } else {
            winner = "Black";
            System.out.printf("Game over! %s pawn is promoted to a queen at %s.", winner, positions[blackRow][blackCol]);
        }

    }

}
