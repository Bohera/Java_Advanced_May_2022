package StacksAndQueues;

import java.util.Scanner;

public class test_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[]{73, 42, 69, 13}; // N = Integer.MAX_VALUE

        int element = Integer.parseInt(scanner.nextLine());
        int index = -1;

        //Constant operation time - O(1)
        //          arr[2]
        //          arr[1_000]
        //Logarithmic operation time - O(log(N))
        //          TreeMap<>
        //          BinarySearch
        //Linear operation time - O(N)
        //          fori

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }



        int memoryIntUse = Integer.BYTES * arr.length;

        System.out.println(memoryIntUse);

        System.out.println(index);
    }
}
