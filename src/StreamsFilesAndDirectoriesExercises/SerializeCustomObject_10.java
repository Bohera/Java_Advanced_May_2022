package StreamsFilesAndDirectoriesExercises;

import java.io.*;

public class SerializeCustomObject_10 {
    public static void main(String[] args) {

        Course course = new Course();
        course.name = "Java Advanced";
        course.numberOfStudents = 250;

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Resources/course.ser"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Resources/course.ser"))) {
            oos.writeObject(course);

            Course courseFromFile = (Course) ois.readObject();
            System.out.println(courseFromFile.name);
            System.out.println(courseFromFile.numberOfStudents);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ;

    }

    public static class Course implements Serializable {
        String name;
        int numberOfStudents;

    }
}
