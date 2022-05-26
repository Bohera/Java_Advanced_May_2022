package SetsAndMapsAdvancedExercises;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfUsernames = Integer.parseInt(scanner.nextLine());

        LinkedHashSet<String> usernames = new LinkedHashSet<>();
        for (int i = 0; i < numberOfUsernames; i++) {
            String input = scanner.nextLine();
            usernames.add(input);
        }

        for (String username : usernames) {
            System.out.println(username);
        }

    }
}
