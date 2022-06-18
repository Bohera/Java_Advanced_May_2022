package ExamPreparation.University;

import java.util.ArrayList;
import java.util.List;

public class University {
    public int capacity;
    public List<Student> students;

    public University(int capacity) {
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getStudentCount() {
        return students.size();
    }

    public String registerStudent(Student student) {
        if (students.contains(student)) {
            return "Student is already in the university";
        } else if (students.size() >= capacity) {
            return "No seats in the university";
        }
        students.add(student);
        return String.format("Added student %s %s%n", student.getFirstName(), student.getLastName());
    }

    public String dismissStudent(Student student) {
        if (!students.contains(student)) {
            return "Student not found";
        }
        students.remove(student);
        return String.format("Removed student %s %s%n", student.getFirstName(), student.getLastName());
    }

    public String getStudent(String firstName, String lastName) {
        int index = students.lastIndexOf(firstName);
        Student student = students.get(index);
        return String.format("Student: %s %s, %s", student.getFirstName(), student.getLastName(), student.getBestSubject());
    }

    public String getStatistics() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            string.append(String.format("==Student: First Name = %s, Last Name = %s, Best Subject = %s%n",
                    student.getFirstName(), student.getLastName(), student.getBestSubject()));
        }
        return string.toString();
    }
}
