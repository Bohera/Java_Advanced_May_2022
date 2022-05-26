package SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, LinkedHashMap<String, Integer>> usersMap = new TreeMap<>();

        while (!input.equals("end")) {
            String[] inputPards = input.split("\\s+");
            String ipParts = inputPards[0];
            String usernameParts = inputPards[2];
            String userName = usernameParts.substring(5);
            String ipAddress = ipParts.substring(3);

            usersMap.putIfAbsent(userName, new LinkedHashMap<>());

            usersMap.get(userName).putIfAbsent(ipAddress, 0);
            usersMap.get(userName).put(ipAddress, usersMap.get(userName).get(ipAddress) + 1);

            input = scanner.nextLine();
        }

        usersMap.forEach((k,v) -> {
            System.out.println(k + ":");
            StringBuilder sb = new StringBuilder();
            v.forEach((i,c) -> {
                String formattedAttack = String.format("%s => %d, ", i , c);
                sb.append(formattedAttack);
            });
            String finalOutput = sb.substring(0, sb.length() - 2);
            finalOutput = finalOutput + ".";
            System.out.println(finalOutput);
        });

    }
}
