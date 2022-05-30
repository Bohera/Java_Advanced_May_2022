package StreamsFilesAndDirectoriesExercises;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class GetFolderSize_08 {
    public static void main(String[] args) {
        File folder = new File("Resources/Exercises Resources");
        File[] arr = folder.listFiles();

        Deque<File> files = new ArrayDeque<>();
        files.offer(folder);
        int totalSize = 0;
        while (!files.isEmpty()) {
            File currentFile = files.poll();
            File[] nestedFiles = currentFile.listFiles();
            for (File nestedFile : nestedFiles) {
                if (nestedFile.isDirectory()) {
                    files.offer(nestedFile);
                } else {
                    totalSize += nestedFile.length(); //golemina na failove v byte
                }
            }
        }
        System.out.println("Folder size: " + totalSize);

    }
}
