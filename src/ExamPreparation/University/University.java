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
        return String.format("Added student %s %s", student.getFirstName(), student.getLastName());
    }

    public String dismissStudent(Student student) {
        if (!students.contains(student)) {
            return "Student not found";
        }
        String removedStudent = String.format("Removed student %s %s", student.getFirstName(), student.getLastName());
        students.remove(student);
        return removedStudent;
    }

    public String getStudent(String firstName, String lastName) {
        int indexStudent = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstName().equals(firstName) && students.get(i).getLastName().equals(lastName)){
                indexStudent = i;
            }
        }
        return String.format("Student: %s %s, %s", students.get(indexStudent).getFirstName(), students.get(indexStudent).getLastName(), students.get(indexStudent).getBestSubject());
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
