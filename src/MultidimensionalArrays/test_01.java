package MultidimensionalArrays;

import java.util.Scanner;

public class test_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[][] matrix = new int[4][];

        int start = 1;

        for (int i = 0; i < 4; i++) {
            int[] arr = new int[5];

            for (int j = 0; j < arr.length; j++) {
                arr[j] = start;
                start++;
            }
            matrix[i] = arr;

        }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
