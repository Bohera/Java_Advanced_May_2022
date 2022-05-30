package StreamsFilesAndDirectoriesExercises;

import java.io.File;

public class GetFolderSize_08 {
    public static void main(String[] args) {
        File folder = new File("Resources/Exercises Resources");
        File[] arr = folder.listFiles();
        System.out.println();

    }
}
