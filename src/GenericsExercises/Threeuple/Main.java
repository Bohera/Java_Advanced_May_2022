package GenericsExercises.Threeuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        String firstName = input[0];
        String secondName = input[1];
        String neighbor = input[2];
        String city = input[3];
        Tuple<String, String, String> tuple = new Tuple<>(firstName + " " + secondName, neighbor, city);
        System.out.println(tuple);

        input = scanner.nextLine().split("\\s+");
        String name = input[0];
        int beerLiters = Integer.parseInt(input[1]);
        String condition = input[2];
        String drunkOrNot = "";
        if (condition.equals("drunk")) {
            condition = "true";
        } else {
            condition = "false";
        }

        Tuple<String, Integer, String> secondTuple = new Tuple<>(name, beerLiters, condition);
        System.out.println(secondTuple);

        input = scanner.nextLine().split("\\s+");
        String name2 = input[0];
        double doubleNumber = Double.parseDouble(input[1]);
        String bank = input[2];
        Tuple<String, Double, String> thirdTuple = new Tuple<>(name2, doubleNumber, bank);
        System.out.println(thirdTuple);
    }
}
