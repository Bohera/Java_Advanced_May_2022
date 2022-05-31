package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class test_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Method;
        //return type -> double;
        //parameters list -> (int x, int pow)
        //signature -> getPowerOf(int, int)
        //body -> { return Math.pow(x, pow)}

        //read numbers arr[] from console on one line
        //read number int pow
        //Raise and print all numbers from arr[] to pow


        int[] arr = {13, 42, 69, 73};
        int pow = 2;
        Arrays.stream(arr)
                .mapToDouble((n) -> Math.pow(n, pow))
                .forEach(System.out::println);



        for (int number : arr) {
            double powerOf = getPowerOf(number, pow);
            System.out.println(powerOf);

        }


    }

    public static double getPowerOf(int x, int pow) {
        return Math.pow(x, pow);
    }
}
