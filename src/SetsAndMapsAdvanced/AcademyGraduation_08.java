package SetsAndMapsAdvanced;

import java.text.DecimalFormat;
import java.util.*;

public class AcademyGraduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());
        Map<String, double[]> students = new TreeMap<>();
        for (int student = 0; student < studentsCount; student++) {
            String studentName = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            students.put(studentName, grades);
        }
        DecimalFormat format = new DecimalFormat("#.###############");
        students.forEach((k,v) -> {
            double sum = 0;
            for (Double d: v) {
                sum += d;
            }
            System.out.printf("%s is graduated with %s%n",k , sum / v.length);
        });
    }
}
