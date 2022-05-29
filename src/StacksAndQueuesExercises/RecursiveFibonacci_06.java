package StacksAndQueuesExercises;

import java.util.Scanner;

public class RecursiveFibonacci_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        long result = fib(n);
        System.out.println(result);

    }

    private static long fib(int n) {
        if (n < 2 ) {
            return 1;
        }
        return fib(n -1) + fib(n -2);
    }
}
