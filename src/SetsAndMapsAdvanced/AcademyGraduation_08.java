package SetsAndMapsAdvanced;

import java.util.*;

public class AcademyGraduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, Double>> students = new LinkedHashMap<>();

        for (int student = 0; student < studentsCount; student++) {
            String studentName = scanner.nextLine();
            String[] grades = scanner.nextLine().split("\\s+");

            for (String grade : grades) {
                students.putIfAbsent(studentName, new LinkedHashMap<>());
                students.get(studentName).put(grade, Double.parseDouble(grade));
            }
        }

        students.forEach((k,v) -> {
            System.out.printf("%s is graduated with ", k);

            Double[] sum = new Double[1];
            v.forEach((i,d) -> sum[0] = sum[0] + d);

            //double average = sum[0] / students.get(k.length());

        });


    }
}
