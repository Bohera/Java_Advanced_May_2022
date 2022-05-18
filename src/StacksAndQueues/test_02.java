package StacksAndQueues;

import java.util.Scanner;

public class test_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    }
    int getSumEven(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) sum += array[i];
            return sum;
        }
        return sum;
    }
}
