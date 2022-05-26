package SetsAndMapsAdvanced;

import java.util.*;

public class AverageStudentsGrades_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entriesCount = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsGrades = new TreeMap<>();

        for (int i = 0; i < entriesCount; i++) {
            String[] student = scanner.nextLine().split("\\s+");

            String name = student[0];
            double grade = Double.parseDouble(student[1]);

            studentsGrades.putIfAbsent(name, new ArrayList<>());
            studentsGrades.get(name).add(grade);
        }

        studentsGrades.forEach( (s, g) -> {
            System.out.print(s + " -> ");
            int gradeCount = 0;
            double gradeSum = 0.0;

            for (Double aDouble : g) {
                gradeCount++;
                gradeSum += aDouble;
                System.out.printf("%.2f ", aDouble);
            }
            System.out.printf("(avg: %.2f)", gradeSum / gradeCount);
            System.out.println();
        });

    }
}
