package SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> guests = new TreeSet<>();

        String reservationNumber = scanner.nextLine();

        while (!reservationNumber.equals("PARTY")) {
            guests.add(reservationNumber);

            reservationNumber = scanner.nextLine();
        }

        reservationNumber = scanner.nextLine();

        while (!reservationNumber.equals("END")) {
            guests.remove(reservationNumber);
            reservationNumber = scanner.nextLine();
        }

        System.out.println(guests.size());

        System.out.println(String.join(System.lineSeparator(), guests));

    }
}
