package MultidimensionalArrays;

import java.util.Scanner;

public class test_011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[][] matrix = new int[4][5];

        int start = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = start;
                start++;
            }
        }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
